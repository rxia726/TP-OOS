package org.example.controller;


import com.example.demo.grpc.CarListResponse;
import org.example.model.Car;
import org.example.service.CarRentalService;
import org.example.service.GrpcClientService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    private List<Car> cars = new ArrayList<>();

    @Resource
    GrpcClientService grpcClientService;

    public CarController() {
        cars.add(new Car("11AA22", "Ferrari", 100));
        cars.add(new Car("22BB33", "Lamborghini", 200));
    }

    // Get list of all cars
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Car> listOfCars() {
        return cars;
    }

    // Get the features of a specific car by plate number
    @GetMapping("/{plateNumber}")
    @ResponseStatus(HttpStatus.OK)
    public Car getCarByPlateNumber(@PathVariable String plateNumber) {
        return cars.stream()
                .filter(car -> car.getPlateNumber().equals(plateNumber))
                .findFirst()
                .orElse(null);
    }

    // Rent or return a car
    @PutMapping("/{plateNumber}")
    @ResponseStatus(HttpStatus.OK)
    public String rentOrReturnCar(@PathVariable String plateNumber,
            @RequestParam("rent") boolean rent,
            @RequestBody(required = false) RentDates dates) {
        Car car = cars.stream()
                .filter(c -> c.getPlateNumber().equals(plateNumber))
                .findFirst()
                .orElse(null);

        CarListResponse res = grpcClientService.getServiceResponse();

        if (car == null) {
            return "Car not found";
        }

        if (rent) {
            if (car.isRented()) {

                System.out.println(res.getResponse());

                return "Car is already rented";
            }
            car.setRented(true);
            return "Car rented from: " + dates.getBegin() + " to " + dates.getEnd();
        } else {
            if (!car.isRented()) {
                return "Car is not currently rented";
            }
            car.setRented(false);
            return "Car returned successfully";
        }
    }
}

// Helper class to hold rent dates for rental period
class RentDates {

    private String begin;
    private String end;

    public String getBegin() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}
