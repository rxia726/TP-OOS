package com.example.demo.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: car_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CarServiceGrpc {

  private CarServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.demo.grpc.CarService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.demo.grpc.CarRequest,
      com.example.demo.grpc.CarResponse> getGetCarByPlateNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCarByPlateNumber",
      requestType = com.example.demo.grpc.CarRequest.class,
      responseType = com.example.demo.grpc.CarResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.grpc.CarRequest,
      com.example.demo.grpc.CarResponse> getGetCarByPlateNumberMethod() {
    io.grpc.MethodDescriptor<com.example.demo.grpc.CarRequest, com.example.demo.grpc.CarResponse> getGetCarByPlateNumberMethod;
    if ((getGetCarByPlateNumberMethod = CarServiceGrpc.getGetCarByPlateNumberMethod) == null) {
      synchronized (CarServiceGrpc.class) {
        if ((getGetCarByPlateNumberMethod = CarServiceGrpc.getGetCarByPlateNumberMethod) == null) {
          CarServiceGrpc.getGetCarByPlateNumberMethod = getGetCarByPlateNumberMethod =
              io.grpc.MethodDescriptor.<com.example.demo.grpc.CarRequest, com.example.demo.grpc.CarResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCarByPlateNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.grpc.CarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.grpc.CarResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CarServiceMethodDescriptorSupplier("GetCarByPlateNumber"))
              .build();
        }
      }
    }
    return getGetCarByPlateNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.demo.grpc.EmptyRequest,
      com.example.demo.grpc.CarListResponse> getListCarsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCars",
      requestType = com.example.demo.grpc.EmptyRequest.class,
      responseType = com.example.demo.grpc.CarListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.grpc.EmptyRequest,
      com.example.demo.grpc.CarListResponse> getListCarsMethod() {
    io.grpc.MethodDescriptor<com.example.demo.grpc.EmptyRequest, com.example.demo.grpc.CarListResponse> getListCarsMethod;
    if ((getListCarsMethod = CarServiceGrpc.getListCarsMethod) == null) {
      synchronized (CarServiceGrpc.class) {
        if ((getListCarsMethod = CarServiceGrpc.getListCarsMethod) == null) {
          CarServiceGrpc.getListCarsMethod = getListCarsMethod =
              io.grpc.MethodDescriptor.<com.example.demo.grpc.EmptyRequest, com.example.demo.grpc.CarListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCars"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.grpc.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.grpc.CarListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CarServiceMethodDescriptorSupplier("ListCars"))
              .build();
        }
      }
    }
    return getListCarsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CarServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CarServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CarServiceStub>() {
        @java.lang.Override
        public CarServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CarServiceStub(channel, callOptions);
        }
      };
    return CarServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CarServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CarServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CarServiceBlockingStub>() {
        @java.lang.Override
        public CarServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CarServiceBlockingStub(channel, callOptions);
        }
      };
    return CarServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CarServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CarServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CarServiceFutureStub>() {
        @java.lang.Override
        public CarServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CarServiceFutureStub(channel, callOptions);
        }
      };
    return CarServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CarServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Define the RPC methods here
     * </pre>
     */
    public void getCarByPlateNumber(com.example.demo.grpc.CarRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.grpc.CarResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCarByPlateNumberMethod(), responseObserver);
    }

    /**
     */
    public void listCars(com.example.demo.grpc.EmptyRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.grpc.CarListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCarsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCarByPlateNumberMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.demo.grpc.CarRequest,
                com.example.demo.grpc.CarResponse>(
                  this, METHODID_GET_CAR_BY_PLATE_NUMBER)))
          .addMethod(
            getListCarsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.demo.grpc.EmptyRequest,
                com.example.demo.grpc.CarListResponse>(
                  this, METHODID_LIST_CARS)))
          .build();
    }
  }

  /**
   */
  public static final class CarServiceStub extends io.grpc.stub.AbstractAsyncStub<CarServiceStub> {
    private CarServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CarServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Define the RPC methods here
     * </pre>
     */
    public void getCarByPlateNumber(com.example.demo.grpc.CarRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.grpc.CarResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCarByPlateNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listCars(com.example.demo.grpc.EmptyRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.grpc.CarListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCarsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CarServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CarServiceBlockingStub> {
    private CarServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CarServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Define the RPC methods here
     * </pre>
     */
    public com.example.demo.grpc.CarResponse getCarByPlateNumber(com.example.demo.grpc.CarRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCarByPlateNumberMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.demo.grpc.CarListResponse listCars(com.example.demo.grpc.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCarsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CarServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CarServiceFutureStub> {
    private CarServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CarServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Define the RPC methods here
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.demo.grpc.CarResponse> getCarByPlateNumber(
        com.example.demo.grpc.CarRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCarByPlateNumberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.demo.grpc.CarListResponse> listCars(
        com.example.demo.grpc.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCarsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CAR_BY_PLATE_NUMBER = 0;
  private static final int METHODID_LIST_CARS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CarServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CarServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CAR_BY_PLATE_NUMBER:
          serviceImpl.getCarByPlateNumber((com.example.demo.grpc.CarRequest) request,
              (io.grpc.stub.StreamObserver<com.example.demo.grpc.CarResponse>) responseObserver);
          break;
        case METHODID_LIST_CARS:
          serviceImpl.listCars((com.example.demo.grpc.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<com.example.demo.grpc.CarListResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CarServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CarServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.demo.grpc.CarServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CarService");
    }
  }

  private static final class CarServiceFileDescriptorSupplier
      extends CarServiceBaseDescriptorSupplier {
    CarServiceFileDescriptorSupplier() {}
  }

  private static final class CarServiceMethodDescriptorSupplier
      extends CarServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CarServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CarServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CarServiceFileDescriptorSupplier())
              .addMethod(getGetCarByPlateNumberMethod())
              .addMethod(getListCarsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
