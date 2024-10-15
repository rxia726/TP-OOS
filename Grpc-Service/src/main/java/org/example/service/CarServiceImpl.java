package org.example.service;

import com.example.demo.grpc.*;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;


@GrpcService
public class CarServiceImpl extends CarServiceGrpc.CarServiceImplBase {

    @Override
    public void listCars(EmptyRequest request, StreamObserver<CarListResponse> responseObserver) {

        responseObserver.onNext(CarListResponse.newBuilder().setResponse("Proceeded successfully").build());
        responseObserver.onCompleted();
    }
}
