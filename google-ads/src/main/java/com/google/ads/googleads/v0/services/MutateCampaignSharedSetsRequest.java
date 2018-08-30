// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/services/campaign_shared_set_service.proto

package com.google.ads.googleads.v0.services;

/**
 * <pre>
 * Request message for [CampaignSharedSetService.MutateCampaignSharedSets][google.ads.googleads.v0.services.CampaignSharedSetService.MutateCampaignSharedSets].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest}
 */
public  final class MutateCampaignSharedSetsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest)
    MutateCampaignSharedSetsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateCampaignSharedSetsRequest.newBuilder() to construct.
  private MutateCampaignSharedSetsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateCampaignSharedSetsRequest() {
    customerId_ = "";
    operations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MutateCampaignSharedSetsRequest(
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

            customerId_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              operations_ = new java.util.ArrayList<com.google.ads.googleads.v0.services.CampaignSharedSetOperation>();
              mutable_bitField0_ |= 0x00000002;
            }
            operations_.add(
                input.readMessage(com.google.ads.googleads.v0.services.CampaignSharedSetOperation.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        operations_ = java.util.Collections.unmodifiableList(operations_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v0.services.CampaignSharedSetServiceProto.internal_static_google_ads_googleads_v0_services_MutateCampaignSharedSetsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v0.services.CampaignSharedSetServiceProto.internal_static_google_ads_googleads_v0_services_MutateCampaignSharedSetsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest.class, com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest.Builder.class);
  }

  private int bitField0_;
  public static final int CUSTOMER_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object customerId_;
  /**
   * <pre>
   * The ID of the customer whose campaign shared sets are being modified.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   */
  public java.lang.String getCustomerId() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customerId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The ID of the customer whose campaign shared sets are being modified.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getCustomerIdBytes() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OPERATIONS_FIELD_NUMBER = 2;
  private java.util.List<com.google.ads.googleads.v0.services.CampaignSharedSetOperation> operations_;
  /**
   * <pre>
   * The list of operations to perform on individual campaign shared sets.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.services.CampaignSharedSetOperation operations = 2;</code>
   */
  public java.util.List<com.google.ads.googleads.v0.services.CampaignSharedSetOperation> getOperationsList() {
    return operations_;
  }
  /**
   * <pre>
   * The list of operations to perform on individual campaign shared sets.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.services.CampaignSharedSetOperation operations = 2;</code>
   */
  public java.util.List<? extends com.google.ads.googleads.v0.services.CampaignSharedSetOperationOrBuilder> 
      getOperationsOrBuilderList() {
    return operations_;
  }
  /**
   * <pre>
   * The list of operations to perform on individual campaign shared sets.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.services.CampaignSharedSetOperation operations = 2;</code>
   */
  public int getOperationsCount() {
    return operations_.size();
  }
  /**
   * <pre>
   * The list of operations to perform on individual campaign shared sets.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.services.CampaignSharedSetOperation operations = 2;</code>
   */
  public com.google.ads.googleads.v0.services.CampaignSharedSetOperation getOperations(int index) {
    return operations_.get(index);
  }
  /**
   * <pre>
   * The list of operations to perform on individual campaign shared sets.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.services.CampaignSharedSetOperation operations = 2;</code>
   */
  public com.google.ads.googleads.v0.services.CampaignSharedSetOperationOrBuilder getOperationsOrBuilder(
      int index) {
    return operations_.get(index);
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
    if (!getCustomerIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, customerId_);
    }
    for (int i = 0; i < operations_.size(); i++) {
      output.writeMessage(2, operations_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCustomerIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, customerId_);
    }
    for (int i = 0; i < operations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, operations_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest other = (com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest) obj;

    boolean result = true;
    result = result && getCustomerId()
        .equals(other.getCustomerId());
    result = result && getOperationsList()
        .equals(other.getOperationsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CUSTOMER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCustomerId().hashCode();
    if (getOperationsCount() > 0) {
      hash = (37 * hash) + OPERATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getOperationsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest prototype) {
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
   * Request message for [CampaignSharedSetService.MutateCampaignSharedSets][google.ads.googleads.v0.services.CampaignSharedSetService.MutateCampaignSharedSets].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest)
      com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v0.services.CampaignSharedSetServiceProto.internal_static_google_ads_googleads_v0_services_MutateCampaignSharedSetsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v0.services.CampaignSharedSetServiceProto.internal_static_google_ads_googleads_v0_services_MutateCampaignSharedSetsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest.class, com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest.Builder.class);
    }

    // Construct using com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest.newBuilder()
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
        getOperationsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      customerId_ = "";

      if (operationsBuilder_ == null) {
        operations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        operationsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v0.services.CampaignSharedSetServiceProto.internal_static_google_ads_googleads_v0_services_MutateCampaignSharedSetsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest getDefaultInstanceForType() {
      return com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest build() {
      com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest buildPartial() {
      com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest result = new com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.customerId_ = customerId_;
      if (operationsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          operations_ = java.util.Collections.unmodifiableList(operations_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.operations_ = operations_;
      } else {
        result.operations_ = operationsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest) {
        return mergeFrom((com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest other) {
      if (other == com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest.getDefaultInstance()) return this;
      if (!other.getCustomerId().isEmpty()) {
        customerId_ = other.customerId_;
        onChanged();
      }
      if (operationsBuilder_ == null) {
        if (!other.operations_.isEmpty()) {
          if (operations_.isEmpty()) {
            operations_ = other.operations_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureOperationsIsMutable();
            operations_.addAll(other.operations_);
          }
          onChanged();
        }
      } else {
        if (!other.operations_.isEmpty()) {
          if (operationsBuilder_.isEmpty()) {
            operationsBuilder_.dispose();
            operationsBuilder_ = null;
            operations_ = other.operations_;
            bitField0_ = (bitField0_ & ~0x00000002);
            operationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOperationsFieldBuilder() : null;
          } else {
            operationsBuilder_.addAllMessages(other.operations_);
          }
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
      com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object customerId_ = "";
    /**
     * <pre>
     * The ID of the customer whose campaign shared sets are being modified.
     * </pre>
     *
     * <code>string customer_id = 1;</code>
     */
    public java.lang.String getCustomerId() {
      java.lang.Object ref = customerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The ID of the customer whose campaign shared sets are being modified.
     * </pre>
     *
     * <code>string customer_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getCustomerIdBytes() {
      java.lang.Object ref = customerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The ID of the customer whose campaign shared sets are being modified.
     * </pre>
     *
     * <code>string customer_id = 1;</code>
     */
    public Builder setCustomerId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      customerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the customer whose campaign shared sets are being modified.
     * </pre>
     *
     * <code>string customer_id = 1;</code>
     */
    public Builder clearCustomerId() {
      
      customerId_ = getDefaultInstance().getCustomerId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the customer whose campaign shared sets are being modified.
     * </pre>
     *
     * <code>string customer_id = 1;</code>
     */
    public Builder setCustomerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      customerId_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.google.ads.googleads.v0.services.CampaignSharedSetOperation> operations_ =
      java.util.Collections.emptyList();
    private void ensureOperationsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        operations_ = new java.util.ArrayList<com.google.ads.googleads.v0.services.CampaignSharedSetOperation>(operations_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v0.services.CampaignSharedSetOperation, com.google.ads.googleads.v0.services.CampaignSharedSetOperation.Builder, com.google.ads.googleads.v0.services.CampaignSharedSetOperationOrBuilder> operationsBuilder_;

    /**
     * <pre>
     * The list of operations to perform on individual campaign shared sets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.CampaignSharedSetOperation operations = 2;</code>
     */
    public java.util.List<com.google.ads.googleads.v0.services.CampaignSharedSetOperation> getOperationsList() {
      if (operationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(operations_);
      } else {
        return operationsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of operations to perform on individual campaign shared sets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.CampaignSharedSetOperation operations = 2;</code>
     */
    public int getOperationsCount() {
      if (operationsBuilder_ == null) {
        return operations_.size();
      } else {
        return operationsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of operations to perform on individual campaign shared sets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.CampaignSharedSetOperation operations = 2;</code>
     */
    public com.google.ads.googleads.v0.services.CampaignSharedSetOperation getOperations(int index) {
      if (operationsBuilder_ == null) {
        return operations_.get(index);
      } else {
        return operationsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of operations to perform on individual campaign shared sets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.CampaignSharedSetOperation operations = 2;</code>
     */
    public Builder setOperations(
        int index, com.google.ads.googleads.v0.services.CampaignSharedSetOperation value) {
      if (operationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOperationsIsMutable();
        operations_.set(index, value);
        onChanged();
      } else {
        operationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of operations to perform on individual campaign shared sets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.CampaignSharedSetOperation operations = 2;</code>
     */
    public Builder setOperations(
        int index, com.google.ads.googleads.v0.services.CampaignSharedSetOperation.Builder builderForValue) {
      if (operationsBuilder_ == null) {
        ensureOperationsIsMutable();
        operations_.set(index, builderForValue.build());
        onChanged();
      } else {
        operationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of operations to perform on individual campaign shared sets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.CampaignSharedSetOperation operations = 2;</code>
     */
    public Builder addOperations(com.google.ads.googleads.v0.services.CampaignSharedSetOperation value) {
      if (operationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOperationsIsMutable();
        operations_.add(value);
        onChanged();
      } else {
        operationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of operations to perform on individual campaign shared sets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.CampaignSharedSetOperation operations = 2;</code>
     */
    public Builder addOperations(
        int index, com.google.ads.googleads.v0.services.CampaignSharedSetOperation value) {
      if (operationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOperationsIsMutable();
        operations_.add(index, value);
        onChanged();
      } else {
        operationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of operations to perform on individual campaign shared sets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.CampaignSharedSetOperation operations = 2;</code>
     */
    public Builder addOperations(
        com.google.ads.googleads.v0.services.CampaignSharedSetOperation.Builder builderForValue) {
      if (operationsBuilder_ == null) {
        ensureOperationsIsMutable();
        operations_.add(builderForValue.build());
        onChanged();
      } else {
        operationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of operations to perform on individual campaign shared sets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.CampaignSharedSetOperation operations = 2;</code>
     */
    public Builder addOperations(
        int index, com.google.ads.googleads.v0.services.CampaignSharedSetOperation.Builder builderForValue) {
      if (operationsBuilder_ == null) {
        ensureOperationsIsMutable();
        operations_.add(index, builderForValue.build());
        onChanged();
      } else {
        operationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of operations to perform on individual campaign shared sets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.CampaignSharedSetOperation operations = 2;</code>
     */
    public Builder addAllOperations(
        java.lang.Iterable<? extends com.google.ads.googleads.v0.services.CampaignSharedSetOperation> values) {
      if (operationsBuilder_ == null) {
        ensureOperationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, operations_);
        onChanged();
      } else {
        operationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of operations to perform on individual campaign shared sets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.CampaignSharedSetOperation operations = 2;</code>
     */
    public Builder clearOperations() {
      if (operationsBuilder_ == null) {
        operations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        operationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of operations to perform on individual campaign shared sets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.CampaignSharedSetOperation operations = 2;</code>
     */
    public Builder removeOperations(int index) {
      if (operationsBuilder_ == null) {
        ensureOperationsIsMutable();
        operations_.remove(index);
        onChanged();
      } else {
        operationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of operations to perform on individual campaign shared sets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.CampaignSharedSetOperation operations = 2;</code>
     */
    public com.google.ads.googleads.v0.services.CampaignSharedSetOperation.Builder getOperationsBuilder(
        int index) {
      return getOperationsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of operations to perform on individual campaign shared sets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.CampaignSharedSetOperation operations = 2;</code>
     */
    public com.google.ads.googleads.v0.services.CampaignSharedSetOperationOrBuilder getOperationsOrBuilder(
        int index) {
      if (operationsBuilder_ == null) {
        return operations_.get(index);  } else {
        return operationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of operations to perform on individual campaign shared sets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.CampaignSharedSetOperation operations = 2;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v0.services.CampaignSharedSetOperationOrBuilder> 
         getOperationsOrBuilderList() {
      if (operationsBuilder_ != null) {
        return operationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(operations_);
      }
    }
    /**
     * <pre>
     * The list of operations to perform on individual campaign shared sets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.CampaignSharedSetOperation operations = 2;</code>
     */
    public com.google.ads.googleads.v0.services.CampaignSharedSetOperation.Builder addOperationsBuilder() {
      return getOperationsFieldBuilder().addBuilder(
          com.google.ads.googleads.v0.services.CampaignSharedSetOperation.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of operations to perform on individual campaign shared sets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.CampaignSharedSetOperation operations = 2;</code>
     */
    public com.google.ads.googleads.v0.services.CampaignSharedSetOperation.Builder addOperationsBuilder(
        int index) {
      return getOperationsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v0.services.CampaignSharedSetOperation.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of operations to perform on individual campaign shared sets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.CampaignSharedSetOperation operations = 2;</code>
     */
    public java.util.List<com.google.ads.googleads.v0.services.CampaignSharedSetOperation.Builder> 
         getOperationsBuilderList() {
      return getOperationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v0.services.CampaignSharedSetOperation, com.google.ads.googleads.v0.services.CampaignSharedSetOperation.Builder, com.google.ads.googleads.v0.services.CampaignSharedSetOperationOrBuilder> 
        getOperationsFieldBuilder() {
      if (operationsBuilder_ == null) {
        operationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v0.services.CampaignSharedSetOperation, com.google.ads.googleads.v0.services.CampaignSharedSetOperation.Builder, com.google.ads.googleads.v0.services.CampaignSharedSetOperationOrBuilder>(
                operations_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        operations_ = null;
      }
      return operationsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest)
  private static final com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest();
  }

  public static com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateCampaignSharedSetsRequest>
      PARSER = new com.google.protobuf.AbstractParser<MutateCampaignSharedSetsRequest>() {
    @java.lang.Override
    public MutateCampaignSharedSetsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MutateCampaignSharedSetsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MutateCampaignSharedSetsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateCampaignSharedSetsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v0.services.MutateCampaignSharedSetsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

