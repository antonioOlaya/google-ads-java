// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/billing_setup_service.proto

package com.google.ads.googleads.v3.services;

/**
 * <pre>
 * A single operation on a billing setup, which describes the cancellation of an
 * existing billing setup.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v3.services.BillingSetupOperation}
 */
public  final class BillingSetupOperation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v3.services.BillingSetupOperation)
    BillingSetupOperationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BillingSetupOperation.newBuilder() to construct.
  private BillingSetupOperation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BillingSetupOperation() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BillingSetupOperation(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();
            operationCase_ = 1;
            operation_ = s;
            break;
          }
          case 18: {
            com.google.ads.googleads.v3.resources.BillingSetup.Builder subBuilder = null;
            if (operationCase_ == 2) {
              subBuilder = ((com.google.ads.googleads.v3.resources.BillingSetup) operation_).toBuilder();
            }
            operation_ =
                input.readMessage(com.google.ads.googleads.v3.resources.BillingSetup.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.google.ads.googleads.v3.resources.BillingSetup) operation_);
              operation_ = subBuilder.buildPartial();
            }
            operationCase_ = 2;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v3.services.BillingSetupServiceProto.internal_static_google_ads_googleads_v3_services_BillingSetupOperation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v3.services.BillingSetupServiceProto.internal_static_google_ads_googleads_v3_services_BillingSetupOperation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v3.services.BillingSetupOperation.class, com.google.ads.googleads.v3.services.BillingSetupOperation.Builder.class);
  }

  private int operationCase_ = 0;
  private java.lang.Object operation_;
  public enum OperationCase
      implements com.google.protobuf.Internal.EnumLite {
    CREATE(2),
    REMOVE(1),
    OPERATION_NOT_SET(0);
    private final int value;
    private OperationCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OperationCase valueOf(int value) {
      return forNumber(value);
    }

    public static OperationCase forNumber(int value) {
      switch (value) {
        case 2: return CREATE;
        case 1: return REMOVE;
        case 0: return OPERATION_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public OperationCase
  getOperationCase() {
    return OperationCase.forNumber(
        operationCase_);
  }

  public static final int CREATE_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Creates a billing setup. No resource name is expected for the new billing
   * setup.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.BillingSetup create = 2;</code>
   */
  public boolean hasCreate() {
    return operationCase_ == 2;
  }
  /**
   * <pre>
   * Creates a billing setup. No resource name is expected for the new billing
   * setup.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.BillingSetup create = 2;</code>
   */
  public com.google.ads.googleads.v3.resources.BillingSetup getCreate() {
    if (operationCase_ == 2) {
       return (com.google.ads.googleads.v3.resources.BillingSetup) operation_;
    }
    return com.google.ads.googleads.v3.resources.BillingSetup.getDefaultInstance();
  }
  /**
   * <pre>
   * Creates a billing setup. No resource name is expected for the new billing
   * setup.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.BillingSetup create = 2;</code>
   */
  public com.google.ads.googleads.v3.resources.BillingSetupOrBuilder getCreateOrBuilder() {
    if (operationCase_ == 2) {
       return (com.google.ads.googleads.v3.resources.BillingSetup) operation_;
    }
    return com.google.ads.googleads.v3.resources.BillingSetup.getDefaultInstance();
  }

  public static final int REMOVE_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Resource name of the billing setup to remove. A setup cannot be
   * removed unless it is in a pending state or its scheduled start time is in
   * the future. The resource name looks like
   * `customers/{customer_id}/billingSetups/{billing_id}`.
   * </pre>
   *
   * <code>string remove = 1;</code>
   */
  public java.lang.String getRemove() {
    java.lang.Object ref = "";
    if (operationCase_ == 1) {
      ref = operation_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (operationCase_ == 1) {
        operation_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Resource name of the billing setup to remove. A setup cannot be
   * removed unless it is in a pending state or its scheduled start time is in
   * the future. The resource name looks like
   * `customers/{customer_id}/billingSetups/{billing_id}`.
   * </pre>
   *
   * <code>string remove = 1;</code>
   */
  public com.google.protobuf.ByteString
      getRemoveBytes() {
    java.lang.Object ref = "";
    if (operationCase_ == 1) {
      ref = operation_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (operationCase_ == 1) {
        operation_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (operationCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, operation_);
    }
    if (operationCase_ == 2) {
      output.writeMessage(2, (com.google.ads.googleads.v3.resources.BillingSetup) operation_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (operationCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, operation_);
    }
    if (operationCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.google.ads.googleads.v3.resources.BillingSetup) operation_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v3.services.BillingSetupOperation)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v3.services.BillingSetupOperation other = (com.google.ads.googleads.v3.services.BillingSetupOperation) obj;

    if (!getOperationCase().equals(other.getOperationCase())) return false;
    switch (operationCase_) {
      case 2:
        if (!getCreate()
            .equals(other.getCreate())) return false;
        break;
      case 1:
        if (!getRemove()
            .equals(other.getRemove())) return false;
        break;
      case 0:
      default:
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (operationCase_) {
      case 2:
        hash = (37 * hash) + CREATE_FIELD_NUMBER;
        hash = (53 * hash) + getCreate().hashCode();
        break;
      case 1:
        hash = (37 * hash) + REMOVE_FIELD_NUMBER;
        hash = (53 * hash) + getRemove().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v3.services.BillingSetupOperation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.services.BillingSetupOperation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.BillingSetupOperation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.services.BillingSetupOperation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.BillingSetupOperation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.services.BillingSetupOperation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.BillingSetupOperation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.services.BillingSetupOperation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.BillingSetupOperation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.services.BillingSetupOperation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.BillingSetupOperation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.services.BillingSetupOperation parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v3.services.BillingSetupOperation prototype) {
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
   * <pre>
   * A single operation on a billing setup, which describes the cancellation of an
   * existing billing setup.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v3.services.BillingSetupOperation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v3.services.BillingSetupOperation)
      com.google.ads.googleads.v3.services.BillingSetupOperationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v3.services.BillingSetupServiceProto.internal_static_google_ads_googleads_v3_services_BillingSetupOperation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v3.services.BillingSetupServiceProto.internal_static_google_ads_googleads_v3_services_BillingSetupOperation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v3.services.BillingSetupOperation.class, com.google.ads.googleads.v3.services.BillingSetupOperation.Builder.class);
    }

    // Construct using com.google.ads.googleads.v3.services.BillingSetupOperation.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      operationCase_ = 0;
      operation_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v3.services.BillingSetupServiceProto.internal_static_google_ads_googleads_v3_services_BillingSetupOperation_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.services.BillingSetupOperation getDefaultInstanceForType() {
      return com.google.ads.googleads.v3.services.BillingSetupOperation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.services.BillingSetupOperation build() {
      com.google.ads.googleads.v3.services.BillingSetupOperation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.services.BillingSetupOperation buildPartial() {
      com.google.ads.googleads.v3.services.BillingSetupOperation result = new com.google.ads.googleads.v3.services.BillingSetupOperation(this);
      if (operationCase_ == 2) {
        if (createBuilder_ == null) {
          result.operation_ = operation_;
        } else {
          result.operation_ = createBuilder_.build();
        }
      }
      if (operationCase_ == 1) {
        result.operation_ = operation_;
      }
      result.operationCase_ = operationCase_;
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
      if (other instanceof com.google.ads.googleads.v3.services.BillingSetupOperation) {
        return mergeFrom((com.google.ads.googleads.v3.services.BillingSetupOperation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v3.services.BillingSetupOperation other) {
      if (other == com.google.ads.googleads.v3.services.BillingSetupOperation.getDefaultInstance()) return this;
      switch (other.getOperationCase()) {
        case CREATE: {
          mergeCreate(other.getCreate());
          break;
        }
        case REMOVE: {
          operationCase_ = 1;
          operation_ = other.operation_;
          onChanged();
          break;
        }
        case OPERATION_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.ads.googleads.v3.services.BillingSetupOperation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v3.services.BillingSetupOperation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int operationCase_ = 0;
    private java.lang.Object operation_;
    public OperationCase
        getOperationCase() {
      return OperationCase.forNumber(
          operationCase_);
    }

    public Builder clearOperation() {
      operationCase_ = 0;
      operation_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v3.resources.BillingSetup, com.google.ads.googleads.v3.resources.BillingSetup.Builder, com.google.ads.googleads.v3.resources.BillingSetupOrBuilder> createBuilder_;
    /**
     * <pre>
     * Creates a billing setup. No resource name is expected for the new billing
     * setup.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.resources.BillingSetup create = 2;</code>
     */
    public boolean hasCreate() {
      return operationCase_ == 2;
    }
    /**
     * <pre>
     * Creates a billing setup. No resource name is expected for the new billing
     * setup.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.resources.BillingSetup create = 2;</code>
     */
    public com.google.ads.googleads.v3.resources.BillingSetup getCreate() {
      if (createBuilder_ == null) {
        if (operationCase_ == 2) {
          return (com.google.ads.googleads.v3.resources.BillingSetup) operation_;
        }
        return com.google.ads.googleads.v3.resources.BillingSetup.getDefaultInstance();
      } else {
        if (operationCase_ == 2) {
          return createBuilder_.getMessage();
        }
        return com.google.ads.googleads.v3.resources.BillingSetup.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Creates a billing setup. No resource name is expected for the new billing
     * setup.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.resources.BillingSetup create = 2;</code>
     */
    public Builder setCreate(com.google.ads.googleads.v3.resources.BillingSetup value) {
      if (createBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        operation_ = value;
        onChanged();
      } else {
        createBuilder_.setMessage(value);
      }
      operationCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Creates a billing setup. No resource name is expected for the new billing
     * setup.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.resources.BillingSetup create = 2;</code>
     */
    public Builder setCreate(
        com.google.ads.googleads.v3.resources.BillingSetup.Builder builderForValue) {
      if (createBuilder_ == null) {
        operation_ = builderForValue.build();
        onChanged();
      } else {
        createBuilder_.setMessage(builderForValue.build());
      }
      operationCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Creates a billing setup. No resource name is expected for the new billing
     * setup.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.resources.BillingSetup create = 2;</code>
     */
    public Builder mergeCreate(com.google.ads.googleads.v3.resources.BillingSetup value) {
      if (createBuilder_ == null) {
        if (operationCase_ == 2 &&
            operation_ != com.google.ads.googleads.v3.resources.BillingSetup.getDefaultInstance()) {
          operation_ = com.google.ads.googleads.v3.resources.BillingSetup.newBuilder((com.google.ads.googleads.v3.resources.BillingSetup) operation_)
              .mergeFrom(value).buildPartial();
        } else {
          operation_ = value;
        }
        onChanged();
      } else {
        if (operationCase_ == 2) {
          createBuilder_.mergeFrom(value);
        }
        createBuilder_.setMessage(value);
      }
      operationCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Creates a billing setup. No resource name is expected for the new billing
     * setup.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.resources.BillingSetup create = 2;</code>
     */
    public Builder clearCreate() {
      if (createBuilder_ == null) {
        if (operationCase_ == 2) {
          operationCase_ = 0;
          operation_ = null;
          onChanged();
        }
      } else {
        if (operationCase_ == 2) {
          operationCase_ = 0;
          operation_ = null;
        }
        createBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Creates a billing setup. No resource name is expected for the new billing
     * setup.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.resources.BillingSetup create = 2;</code>
     */
    public com.google.ads.googleads.v3.resources.BillingSetup.Builder getCreateBuilder() {
      return getCreateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Creates a billing setup. No resource name is expected for the new billing
     * setup.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.resources.BillingSetup create = 2;</code>
     */
    public com.google.ads.googleads.v3.resources.BillingSetupOrBuilder getCreateOrBuilder() {
      if ((operationCase_ == 2) && (createBuilder_ != null)) {
        return createBuilder_.getMessageOrBuilder();
      } else {
        if (operationCase_ == 2) {
          return (com.google.ads.googleads.v3.resources.BillingSetup) operation_;
        }
        return com.google.ads.googleads.v3.resources.BillingSetup.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Creates a billing setup. No resource name is expected for the new billing
     * setup.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.resources.BillingSetup create = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v3.resources.BillingSetup, com.google.ads.googleads.v3.resources.BillingSetup.Builder, com.google.ads.googleads.v3.resources.BillingSetupOrBuilder> 
        getCreateFieldBuilder() {
      if (createBuilder_ == null) {
        if (!(operationCase_ == 2)) {
          operation_ = com.google.ads.googleads.v3.resources.BillingSetup.getDefaultInstance();
        }
        createBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v3.resources.BillingSetup, com.google.ads.googleads.v3.resources.BillingSetup.Builder, com.google.ads.googleads.v3.resources.BillingSetupOrBuilder>(
                (com.google.ads.googleads.v3.resources.BillingSetup) operation_,
                getParentForChildren(),
                isClean());
        operation_ = null;
      }
      operationCase_ = 2;
      onChanged();;
      return createBuilder_;
    }

    /**
     * <pre>
     * Resource name of the billing setup to remove. A setup cannot be
     * removed unless it is in a pending state or its scheduled start time is in
     * the future. The resource name looks like
     * `customers/{customer_id}/billingSetups/{billing_id}`.
     * </pre>
     *
     * <code>string remove = 1;</code>
     */
    public java.lang.String getRemove() {
      java.lang.Object ref = "";
      if (operationCase_ == 1) {
        ref = operation_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (operationCase_ == 1) {
          operation_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Resource name of the billing setup to remove. A setup cannot be
     * removed unless it is in a pending state or its scheduled start time is in
     * the future. The resource name looks like
     * `customers/{customer_id}/billingSetups/{billing_id}`.
     * </pre>
     *
     * <code>string remove = 1;</code>
     */
    public com.google.protobuf.ByteString
        getRemoveBytes() {
      java.lang.Object ref = "";
      if (operationCase_ == 1) {
        ref = operation_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (operationCase_ == 1) {
          operation_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Resource name of the billing setup to remove. A setup cannot be
     * removed unless it is in a pending state or its scheduled start time is in
     * the future. The resource name looks like
     * `customers/{customer_id}/billingSetups/{billing_id}`.
     * </pre>
     *
     * <code>string remove = 1;</code>
     */
    public Builder setRemove(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  operationCase_ = 1;
      operation_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource name of the billing setup to remove. A setup cannot be
     * removed unless it is in a pending state or its scheduled start time is in
     * the future. The resource name looks like
     * `customers/{customer_id}/billingSetups/{billing_id}`.
     * </pre>
     *
     * <code>string remove = 1;</code>
     */
    public Builder clearRemove() {
      if (operationCase_ == 1) {
        operationCase_ = 0;
        operation_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Resource name of the billing setup to remove. A setup cannot be
     * removed unless it is in a pending state or its scheduled start time is in
     * the future. The resource name looks like
     * `customers/{customer_id}/billingSetups/{billing_id}`.
     * </pre>
     *
     * <code>string remove = 1;</code>
     */
    public Builder setRemoveBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      operationCase_ = 1;
      operation_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v3.services.BillingSetupOperation)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.BillingSetupOperation)
  private static final com.google.ads.googleads.v3.services.BillingSetupOperation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v3.services.BillingSetupOperation();
  }

  public static com.google.ads.googleads.v3.services.BillingSetupOperation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BillingSetupOperation>
      PARSER = new com.google.protobuf.AbstractParser<BillingSetupOperation>() {
    @java.lang.Override
    public BillingSetupOperation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BillingSetupOperation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BillingSetupOperation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BillingSetupOperation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v3.services.BillingSetupOperation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

