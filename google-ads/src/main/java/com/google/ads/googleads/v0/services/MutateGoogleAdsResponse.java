// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/services/google_ads_service.proto

package com.google.ads.googleads.v0.services;

/**
 * <pre>
 * Response message for [GoogleAdsService.Mutate][google.ads.googleads.v0.services.GoogleAdsService.Mutate].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v0.services.MutateGoogleAdsResponse}
 */
public  final class MutateGoogleAdsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v0.services.MutateGoogleAdsResponse)
    MutateGoogleAdsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateGoogleAdsResponse.newBuilder() to construct.
  private MutateGoogleAdsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateGoogleAdsResponse() {
    mutateOperationResponses_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MutateGoogleAdsResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              mutateOperationResponses_ = new java.util.ArrayList<com.google.ads.googleads.v0.services.MutateOperationResponse>();
              mutable_bitField0_ |= 0x00000001;
            }
            mutateOperationResponses_.add(
                input.readMessage(com.google.ads.googleads.v0.services.MutateOperationResponse.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        mutateOperationResponses_ = java.util.Collections.unmodifiableList(mutateOperationResponses_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v0.services.GoogleAdsServiceProto.internal_static_google_ads_googleads_v0_services_MutateGoogleAdsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v0.services.GoogleAdsServiceProto.internal_static_google_ads_googleads_v0_services_MutateGoogleAdsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v0.services.MutateGoogleAdsResponse.class, com.google.ads.googleads.v0.services.MutateGoogleAdsResponse.Builder.class);
  }

  public static final int MUTATE_OPERATION_RESPONSES_FIELD_NUMBER = 1;
  private java.util.List<com.google.ads.googleads.v0.services.MutateOperationResponse> mutateOperationResponses_;
  /**
   * <pre>
   * All responses for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.services.MutateOperationResponse mutate_operation_responses = 1;</code>
   */
  public java.util.List<com.google.ads.googleads.v0.services.MutateOperationResponse> getMutateOperationResponsesList() {
    return mutateOperationResponses_;
  }
  /**
   * <pre>
   * All responses for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.services.MutateOperationResponse mutate_operation_responses = 1;</code>
   */
  public java.util.List<? extends com.google.ads.googleads.v0.services.MutateOperationResponseOrBuilder> 
      getMutateOperationResponsesOrBuilderList() {
    return mutateOperationResponses_;
  }
  /**
   * <pre>
   * All responses for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.services.MutateOperationResponse mutate_operation_responses = 1;</code>
   */
  public int getMutateOperationResponsesCount() {
    return mutateOperationResponses_.size();
  }
  /**
   * <pre>
   * All responses for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.services.MutateOperationResponse mutate_operation_responses = 1;</code>
   */
  public com.google.ads.googleads.v0.services.MutateOperationResponse getMutateOperationResponses(int index) {
    return mutateOperationResponses_.get(index);
  }
  /**
   * <pre>
   * All responses for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.services.MutateOperationResponse mutate_operation_responses = 1;</code>
   */
  public com.google.ads.googleads.v0.services.MutateOperationResponseOrBuilder getMutateOperationResponsesOrBuilder(
      int index) {
    return mutateOperationResponses_.get(index);
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
    for (int i = 0; i < mutateOperationResponses_.size(); i++) {
      output.writeMessage(1, mutateOperationResponses_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < mutateOperationResponses_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, mutateOperationResponses_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v0.services.MutateGoogleAdsResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v0.services.MutateGoogleAdsResponse other = (com.google.ads.googleads.v0.services.MutateGoogleAdsResponse) obj;

    boolean result = true;
    result = result && getMutateOperationResponsesList()
        .equals(other.getMutateOperationResponsesList());
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
    if (getMutateOperationResponsesCount() > 0) {
      hash = (37 * hash) + MUTATE_OPERATION_RESPONSES_FIELD_NUMBER;
      hash = (53 * hash) + getMutateOperationResponsesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v0.services.MutateGoogleAdsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.services.MutateGoogleAdsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.services.MutateGoogleAdsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.services.MutateGoogleAdsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.services.MutateGoogleAdsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.services.MutateGoogleAdsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.services.MutateGoogleAdsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.services.MutateGoogleAdsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.services.MutateGoogleAdsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.services.MutateGoogleAdsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.services.MutateGoogleAdsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.services.MutateGoogleAdsResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v0.services.MutateGoogleAdsResponse prototype) {
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
   * Response message for [GoogleAdsService.Mutate][google.ads.googleads.v0.services.GoogleAdsService.Mutate].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v0.services.MutateGoogleAdsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v0.services.MutateGoogleAdsResponse)
      com.google.ads.googleads.v0.services.MutateGoogleAdsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v0.services.GoogleAdsServiceProto.internal_static_google_ads_googleads_v0_services_MutateGoogleAdsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v0.services.GoogleAdsServiceProto.internal_static_google_ads_googleads_v0_services_MutateGoogleAdsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v0.services.MutateGoogleAdsResponse.class, com.google.ads.googleads.v0.services.MutateGoogleAdsResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v0.services.MutateGoogleAdsResponse.newBuilder()
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
        getMutateOperationResponsesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (mutateOperationResponsesBuilder_ == null) {
        mutateOperationResponses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        mutateOperationResponsesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v0.services.GoogleAdsServiceProto.internal_static_google_ads_googleads_v0_services_MutateGoogleAdsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v0.services.MutateGoogleAdsResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v0.services.MutateGoogleAdsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v0.services.MutateGoogleAdsResponse build() {
      com.google.ads.googleads.v0.services.MutateGoogleAdsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v0.services.MutateGoogleAdsResponse buildPartial() {
      com.google.ads.googleads.v0.services.MutateGoogleAdsResponse result = new com.google.ads.googleads.v0.services.MutateGoogleAdsResponse(this);
      int from_bitField0_ = bitField0_;
      if (mutateOperationResponsesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          mutateOperationResponses_ = java.util.Collections.unmodifiableList(mutateOperationResponses_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.mutateOperationResponses_ = mutateOperationResponses_;
      } else {
        result.mutateOperationResponses_ = mutateOperationResponsesBuilder_.build();
      }
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
      if (other instanceof com.google.ads.googleads.v0.services.MutateGoogleAdsResponse) {
        return mergeFrom((com.google.ads.googleads.v0.services.MutateGoogleAdsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v0.services.MutateGoogleAdsResponse other) {
      if (other == com.google.ads.googleads.v0.services.MutateGoogleAdsResponse.getDefaultInstance()) return this;
      if (mutateOperationResponsesBuilder_ == null) {
        if (!other.mutateOperationResponses_.isEmpty()) {
          if (mutateOperationResponses_.isEmpty()) {
            mutateOperationResponses_ = other.mutateOperationResponses_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMutateOperationResponsesIsMutable();
            mutateOperationResponses_.addAll(other.mutateOperationResponses_);
          }
          onChanged();
        }
      } else {
        if (!other.mutateOperationResponses_.isEmpty()) {
          if (mutateOperationResponsesBuilder_.isEmpty()) {
            mutateOperationResponsesBuilder_.dispose();
            mutateOperationResponsesBuilder_ = null;
            mutateOperationResponses_ = other.mutateOperationResponses_;
            bitField0_ = (bitField0_ & ~0x00000001);
            mutateOperationResponsesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMutateOperationResponsesFieldBuilder() : null;
          } else {
            mutateOperationResponsesBuilder_.addAllMessages(other.mutateOperationResponses_);
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
      com.google.ads.googleads.v0.services.MutateGoogleAdsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v0.services.MutateGoogleAdsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.ads.googleads.v0.services.MutateOperationResponse> mutateOperationResponses_ =
      java.util.Collections.emptyList();
    private void ensureMutateOperationResponsesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        mutateOperationResponses_ = new java.util.ArrayList<com.google.ads.googleads.v0.services.MutateOperationResponse>(mutateOperationResponses_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v0.services.MutateOperationResponse, com.google.ads.googleads.v0.services.MutateOperationResponse.Builder, com.google.ads.googleads.v0.services.MutateOperationResponseOrBuilder> mutateOperationResponsesBuilder_;

    /**
     * <pre>
     * All responses for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.MutateOperationResponse mutate_operation_responses = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v0.services.MutateOperationResponse> getMutateOperationResponsesList() {
      if (mutateOperationResponsesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(mutateOperationResponses_);
      } else {
        return mutateOperationResponsesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * All responses for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.MutateOperationResponse mutate_operation_responses = 1;</code>
     */
    public int getMutateOperationResponsesCount() {
      if (mutateOperationResponsesBuilder_ == null) {
        return mutateOperationResponses_.size();
      } else {
        return mutateOperationResponsesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * All responses for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.MutateOperationResponse mutate_operation_responses = 1;</code>
     */
    public com.google.ads.googleads.v0.services.MutateOperationResponse getMutateOperationResponses(int index) {
      if (mutateOperationResponsesBuilder_ == null) {
        return mutateOperationResponses_.get(index);
      } else {
        return mutateOperationResponsesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * All responses for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.MutateOperationResponse mutate_operation_responses = 1;</code>
     */
    public Builder setMutateOperationResponses(
        int index, com.google.ads.googleads.v0.services.MutateOperationResponse value) {
      if (mutateOperationResponsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMutateOperationResponsesIsMutable();
        mutateOperationResponses_.set(index, value);
        onChanged();
      } else {
        mutateOperationResponsesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * All responses for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.MutateOperationResponse mutate_operation_responses = 1;</code>
     */
    public Builder setMutateOperationResponses(
        int index, com.google.ads.googleads.v0.services.MutateOperationResponse.Builder builderForValue) {
      if (mutateOperationResponsesBuilder_ == null) {
        ensureMutateOperationResponsesIsMutable();
        mutateOperationResponses_.set(index, builderForValue.build());
        onChanged();
      } else {
        mutateOperationResponsesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All responses for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.MutateOperationResponse mutate_operation_responses = 1;</code>
     */
    public Builder addMutateOperationResponses(com.google.ads.googleads.v0.services.MutateOperationResponse value) {
      if (mutateOperationResponsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMutateOperationResponsesIsMutable();
        mutateOperationResponses_.add(value);
        onChanged();
      } else {
        mutateOperationResponsesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * All responses for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.MutateOperationResponse mutate_operation_responses = 1;</code>
     */
    public Builder addMutateOperationResponses(
        int index, com.google.ads.googleads.v0.services.MutateOperationResponse value) {
      if (mutateOperationResponsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMutateOperationResponsesIsMutable();
        mutateOperationResponses_.add(index, value);
        onChanged();
      } else {
        mutateOperationResponsesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * All responses for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.MutateOperationResponse mutate_operation_responses = 1;</code>
     */
    public Builder addMutateOperationResponses(
        com.google.ads.googleads.v0.services.MutateOperationResponse.Builder builderForValue) {
      if (mutateOperationResponsesBuilder_ == null) {
        ensureMutateOperationResponsesIsMutable();
        mutateOperationResponses_.add(builderForValue.build());
        onChanged();
      } else {
        mutateOperationResponsesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All responses for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.MutateOperationResponse mutate_operation_responses = 1;</code>
     */
    public Builder addMutateOperationResponses(
        int index, com.google.ads.googleads.v0.services.MutateOperationResponse.Builder builderForValue) {
      if (mutateOperationResponsesBuilder_ == null) {
        ensureMutateOperationResponsesIsMutable();
        mutateOperationResponses_.add(index, builderForValue.build());
        onChanged();
      } else {
        mutateOperationResponsesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All responses for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.MutateOperationResponse mutate_operation_responses = 1;</code>
     */
    public Builder addAllMutateOperationResponses(
        java.lang.Iterable<? extends com.google.ads.googleads.v0.services.MutateOperationResponse> values) {
      if (mutateOperationResponsesBuilder_ == null) {
        ensureMutateOperationResponsesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mutateOperationResponses_);
        onChanged();
      } else {
        mutateOperationResponsesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * All responses for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.MutateOperationResponse mutate_operation_responses = 1;</code>
     */
    public Builder clearMutateOperationResponses() {
      if (mutateOperationResponsesBuilder_ == null) {
        mutateOperationResponses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        mutateOperationResponsesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * All responses for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.MutateOperationResponse mutate_operation_responses = 1;</code>
     */
    public Builder removeMutateOperationResponses(int index) {
      if (mutateOperationResponsesBuilder_ == null) {
        ensureMutateOperationResponsesIsMutable();
        mutateOperationResponses_.remove(index);
        onChanged();
      } else {
        mutateOperationResponsesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * All responses for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.MutateOperationResponse mutate_operation_responses = 1;</code>
     */
    public com.google.ads.googleads.v0.services.MutateOperationResponse.Builder getMutateOperationResponsesBuilder(
        int index) {
      return getMutateOperationResponsesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * All responses for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.MutateOperationResponse mutate_operation_responses = 1;</code>
     */
    public com.google.ads.googleads.v0.services.MutateOperationResponseOrBuilder getMutateOperationResponsesOrBuilder(
        int index) {
      if (mutateOperationResponsesBuilder_ == null) {
        return mutateOperationResponses_.get(index);  } else {
        return mutateOperationResponsesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * All responses for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.MutateOperationResponse mutate_operation_responses = 1;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v0.services.MutateOperationResponseOrBuilder> 
         getMutateOperationResponsesOrBuilderList() {
      if (mutateOperationResponsesBuilder_ != null) {
        return mutateOperationResponsesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(mutateOperationResponses_);
      }
    }
    /**
     * <pre>
     * All responses for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.MutateOperationResponse mutate_operation_responses = 1;</code>
     */
    public com.google.ads.googleads.v0.services.MutateOperationResponse.Builder addMutateOperationResponsesBuilder() {
      return getMutateOperationResponsesFieldBuilder().addBuilder(
          com.google.ads.googleads.v0.services.MutateOperationResponse.getDefaultInstance());
    }
    /**
     * <pre>
     * All responses for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.MutateOperationResponse mutate_operation_responses = 1;</code>
     */
    public com.google.ads.googleads.v0.services.MutateOperationResponse.Builder addMutateOperationResponsesBuilder(
        int index) {
      return getMutateOperationResponsesFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v0.services.MutateOperationResponse.getDefaultInstance());
    }
    /**
     * <pre>
     * All responses for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.services.MutateOperationResponse mutate_operation_responses = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v0.services.MutateOperationResponse.Builder> 
         getMutateOperationResponsesBuilderList() {
      return getMutateOperationResponsesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v0.services.MutateOperationResponse, com.google.ads.googleads.v0.services.MutateOperationResponse.Builder, com.google.ads.googleads.v0.services.MutateOperationResponseOrBuilder> 
        getMutateOperationResponsesFieldBuilder() {
      if (mutateOperationResponsesBuilder_ == null) {
        mutateOperationResponsesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v0.services.MutateOperationResponse, com.google.ads.googleads.v0.services.MutateOperationResponse.Builder, com.google.ads.googleads.v0.services.MutateOperationResponseOrBuilder>(
                mutateOperationResponses_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        mutateOperationResponses_ = null;
      }
      return mutateOperationResponsesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v0.services.MutateGoogleAdsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v0.services.MutateGoogleAdsResponse)
  private static final com.google.ads.googleads.v0.services.MutateGoogleAdsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v0.services.MutateGoogleAdsResponse();
  }

  public static com.google.ads.googleads.v0.services.MutateGoogleAdsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateGoogleAdsResponse>
      PARSER = new com.google.protobuf.AbstractParser<MutateGoogleAdsResponse>() {
    @java.lang.Override
    public MutateGoogleAdsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MutateGoogleAdsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MutateGoogleAdsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateGoogleAdsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v0.services.MutateGoogleAdsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

