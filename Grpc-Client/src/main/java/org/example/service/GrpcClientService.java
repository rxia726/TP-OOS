package org.example.service;

import com.example.demo.grpc.*;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class GrpcClientService {

    @GrpcClient(value = "CarService")
    private CarServiceGrpc.CarServiceBlockingStub carServiceBlockingStub;

    public CarResponse getCarByPlateNumber(String plateNumber) {
        CarRequest request = CarRequest.newBuilder().setPlateNumber(plateNumber).build();
        return carServiceBlockingStub.getCarByPlateNumber(request);
    }

    public CarListResponse getServiceResponse(){
        System.out.println("Check: " + carServiceBlockingStub);
        return carServiceBlockingStub.listCars(EmptyRequest.newBuilder().build());
    }
}