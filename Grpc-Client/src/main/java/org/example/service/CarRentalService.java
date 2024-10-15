package org.example.service;


import org.example.model.Car;
import org.example.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarRentalService {
    @Autowired
    private CarRepository carRepository;

    public void addCar(Car car) {
        carRepository.save(car);
    }

    public Iterable<Car> getAllCars() {
        return carRepository.findAll();
    }
}

