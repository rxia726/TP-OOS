// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: car_service.proto

package com.example.demo.grpc;

public interface CarResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.example.demo.grpc.CarResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string plateNumber = 1;</code>
   * @return The plateNumber.
   */
  java.lang.String getPlateNumber();
  /**
   * <code>string plateNumber = 1;</code>
   * @return The bytes for plateNumber.
   */
  com.google.protobuf.ByteString
      getPlateNumberBytes();

  /**
   * <code>string brand = 2;</code>
   * @return The brand.
   */
  java.lang.String getBrand();
  /**
   * <code>string brand = 2;</code>
   * @return The bytes for brand.
   */
  com.google.protobuf.ByteString
      getBrandBytes();

  /**
   * <code>int32 price = 3;</code>
   * @return The price.
   */
  int getPrice();

  /**
   * <code>bool isRented = 4;</code>
   * @return The isRented.
   */
  boolean getIsRented();
}
