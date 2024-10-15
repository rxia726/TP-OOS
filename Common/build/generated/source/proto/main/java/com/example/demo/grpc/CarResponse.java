// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: car_service.proto

package com.example.demo.grpc;

/**
 * Protobuf type {@code com.example.demo.grpc.CarResponse}
 */
public final class CarResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.demo.grpc.CarResponse)
    CarResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CarResponse.newBuilder() to construct.
  private CarResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CarResponse() {
    plateNumber_ = "";
    brand_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CarResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.demo.grpc.CarServiceProto.internal_static_com_example_demo_grpc_CarResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.demo.grpc.CarServiceProto.internal_static_com_example_demo_grpc_CarResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.demo.grpc.CarResponse.class, com.example.demo.grpc.CarResponse.Builder.class);
  }

  public static final int PLATENUMBER_FIELD_NUMBER = 1;
  private volatile java.lang.Object plateNumber_;
  /**
   * <code>string plateNumber = 1;</code>
   * @return The plateNumber.
   */
  @java.lang.Override
  public java.lang.String getPlateNumber() {
    java.lang.Object ref = plateNumber_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      plateNumber_ = s;
      return s;
    }
  }
  /**
   * <code>string plateNumber = 1;</code>
   * @return The bytes for plateNumber.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPlateNumberBytes() {
    java.lang.Object ref = plateNumber_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      plateNumber_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BRAND_FIELD_NUMBER = 2;
  private volatile java.lang.Object brand_;
  /**
   * <code>string brand = 2;</code>
   * @return The brand.
   */
  @java.lang.Override
  public java.lang.String getBrand() {
    java.lang.Object ref = brand_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      brand_ = s;
      return s;
    }
  }
  /**
   * <code>string brand = 2;</code>
   * @return The bytes for brand.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBrandBytes() {
    java.lang.Object ref = brand_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      brand_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRICE_FIELD_NUMBER = 3;
  private int price_;
  /**
   * <code>int32 price = 3;</code>
   * @return The price.
   */
  @java.lang.Override
  public int getPrice() {
    return price_;
  }

  public static final int ISRENTED_FIELD_NUMBER = 4;
  private boolean isRented_;
  /**
   * <code>bool isRented = 4;</code>
   * @return The isRented.
   */
  @java.lang.Override
  public boolean getIsRented() {
    return isRented_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(plateNumber_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, plateNumber_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(brand_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, brand_);
    }
    if (price_ != 0) {
      output.writeInt32(3, price_);
    }
    if (isRented_ != false) {
      output.writeBool(4, isRented_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(plateNumber_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, plateNumber_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(brand_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, brand_);
    }
    if (price_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, price_);
    }
    if (isRented_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, isRented_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.demo.grpc.CarResponse)) {
      return super.equals(obj);
    }
    com.example.demo.grpc.CarResponse other = (com.example.demo.grpc.CarResponse) obj;

    if (!getPlateNumber()
        .equals(other.getPlateNumber())) return false;
    if (!getBrand()
        .equals(other.getBrand())) return false;
    if (getPrice()
        != other.getPrice()) return false;
    if (getIsRented()
        != other.getIsRented()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PLATENUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getPlateNumber().hashCode();
    hash = (37 * hash) + BRAND_FIELD_NUMBER;
    hash = (53 * hash) + getBrand().hashCode();
    hash = (37 * hash) + PRICE_FIELD_NUMBER;
    hash = (53 * hash) + getPrice();
    hash = (37 * hash) + ISRENTED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsRented());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.demo.grpc.CarResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.demo.grpc.CarResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.demo.grpc.CarResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.demo.grpc.CarResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.demo.grpc.CarResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.demo.grpc.CarResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.demo.grpc.CarResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.demo.grpc.CarResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.demo.grpc.CarResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.demo.grpc.CarResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.demo.grpc.CarResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.demo.grpc.CarResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.demo.grpc.CarResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.example.demo.grpc.CarResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.demo.grpc.CarResponse)
      com.example.demo.grpc.CarResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.demo.grpc.CarServiceProto.internal_static_com_example_demo_grpc_CarResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.demo.grpc.CarServiceProto.internal_static_com_example_demo_grpc_CarResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.demo.grpc.CarResponse.class, com.example.demo.grpc.CarResponse.Builder.class);
    }

    // Construct using com.example.demo.grpc.CarResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      plateNumber_ = "";

      brand_ = "";

      price_ = 0;

      isRented_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.demo.grpc.CarServiceProto.internal_static_com_example_demo_grpc_CarResponse_descriptor;
    }

    @java.lang.Override
    public com.example.demo.grpc.CarResponse getDefaultInstanceForType() {
      return com.example.demo.grpc.CarResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.demo.grpc.CarResponse build() {
      com.example.demo.grpc.CarResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.demo.grpc.CarResponse buildPartial() {
      com.example.demo.grpc.CarResponse result = new com.example.demo.grpc.CarResponse(this);
      result.plateNumber_ = plateNumber_;
      result.brand_ = brand_;
      result.price_ = price_;
      result.isRented_ = isRented_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.demo.grpc.CarResponse) {
        return mergeFrom((com.example.demo.grpc.CarResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.demo.grpc.CarResponse other) {
      if (other == com.example.demo.grpc.CarResponse.getDefaultInstance()) return this;
      if (!other.getPlateNumber().isEmpty()) {
        plateNumber_ = other.plateNumber_;
        onChanged();
      }
      if (!other.getBrand().isEmpty()) {
        brand_ = other.brand_;
        onChanged();
      }
      if (other.getPrice() != 0) {
        setPrice(other.getPrice());
      }
      if (other.getIsRented() != false) {
        setIsRented(other.getIsRented());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              plateNumber_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              brand_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 24: {
              price_ = input.readInt32();

              break;
            } // case 24
            case 32: {
              isRented_ = input.readBool();

              break;
            } // case 32
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private java.lang.Object plateNumber_ = "";
    /**
     * <code>string plateNumber = 1;</code>
     * @return The plateNumber.
     */
    public java.lang.String getPlateNumber() {
      java.lang.Object ref = plateNumber_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        plateNumber_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string plateNumber = 1;</code>
     * @return The bytes for plateNumber.
     */
    public com.google.protobuf.ByteString
        getPlateNumberBytes() {
      java.lang.Object ref = plateNumber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        plateNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string plateNumber = 1;</code>
     * @param value The plateNumber to set.
     * @return This builder for chaining.
     */
    public Builder setPlateNumber(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      plateNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string plateNumber = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlateNumber() {
      
      plateNumber_ = getDefaultInstance().getPlateNumber();
      onChanged();
      return this;
    }
    /**
     * <code>string plateNumber = 1;</code>
     * @param value The bytes for plateNumber to set.
     * @return This builder for chaining.
     */
    public Builder setPlateNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      plateNumber_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object brand_ = "";
    /**
     * <code>string brand = 2;</code>
     * @return The brand.
     */
    public java.lang.String getBrand() {
      java.lang.Object ref = brand_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        brand_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string brand = 2;</code>
     * @return The bytes for brand.
     */
    public com.google.protobuf.ByteString
        getBrandBytes() {
      java.lang.Object ref = brand_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        brand_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string brand = 2;</code>
     * @param value The brand to set.
     * @return This builder for chaining.
     */
    public Builder setBrand(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      brand_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string brand = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBrand() {
      
      brand_ = getDefaultInstance().getBrand();
      onChanged();
      return this;
    }
    /**
     * <code>string brand = 2;</code>
     * @param value The bytes for brand to set.
     * @return This builder for chaining.
     */
    public Builder setBrandBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      brand_ = value;
      onChanged();
      return this;
    }

    private int price_ ;
    /**
     * <code>int32 price = 3;</code>
     * @return The price.
     */
    @java.lang.Override
    public int getPrice() {
      return price_;
    }
    /**
     * <code>int32 price = 3;</code>
     * @param value The price to set.
     * @return This builder for chaining.
     */
    public Builder setPrice(int value) {
      
      price_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 price = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrice() {
      
      price_ = 0;
      onChanged();
      return this;
    }

    private boolean isRented_ ;
    /**
     * <code>bool isRented = 4;</code>
     * @return The isRented.
     */
    @java.lang.Override
    public boolean getIsRented() {
      return isRented_;
    }
    /**
     * <code>bool isRented = 4;</code>
     * @param value The isRented to set.
     * @return This builder for chaining.
     */
    public Builder setIsRented(boolean value) {
      
      isRented_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool isRented = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsRented() {
      
      isRented_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.example.demo.grpc.CarResponse)
  }

  // @@protoc_insertion_point(class_scope:com.example.demo.grpc.CarResponse)
  private static final com.example.demo.grpc.CarResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.demo.grpc.CarResponse();
  }

  public static com.example.demo.grpc.CarResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CarResponse>
      PARSER = new com.google.protobuf.AbstractParser<CarResponse>() {
    @java.lang.Override
    public CarResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<CarResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CarResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.demo.grpc.CarResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

