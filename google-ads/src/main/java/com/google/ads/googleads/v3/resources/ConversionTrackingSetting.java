// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/customer.proto

package com.google.ads.googleads.v3.resources;

/**
 * <pre>
 * A collection of customer-wide settings related to Google Ads Conversion
 * Tracking.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v3.resources.ConversionTrackingSetting}
 */
public  final class ConversionTrackingSetting extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v3.resources.ConversionTrackingSetting)
    ConversionTrackingSettingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConversionTrackingSetting.newBuilder() to construct.
  private ConversionTrackingSetting(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConversionTrackingSetting() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ConversionTrackingSetting(
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
            com.google.protobuf.Int64Value.Builder subBuilder = null;
            if (conversionTrackingId_ != null) {
              subBuilder = conversionTrackingId_.toBuilder();
            }
            conversionTrackingId_ = input.readMessage(com.google.protobuf.Int64Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(conversionTrackingId_);
              conversionTrackingId_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.Int64Value.Builder subBuilder = null;
            if (crossAccountConversionTrackingId_ != null) {
              subBuilder = crossAccountConversionTrackingId_.toBuilder();
            }
            crossAccountConversionTrackingId_ = input.readMessage(com.google.protobuf.Int64Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(crossAccountConversionTrackingId_);
              crossAccountConversionTrackingId_ = subBuilder.buildPartial();
            }

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
    return com.google.ads.googleads.v3.resources.CustomerProto.internal_static_google_ads_googleads_v3_resources_ConversionTrackingSetting_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v3.resources.CustomerProto.internal_static_google_ads_googleads_v3_resources_ConversionTrackingSetting_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v3.resources.ConversionTrackingSetting.class, com.google.ads.googleads.v3.resources.ConversionTrackingSetting.Builder.class);
  }

  public static final int CONVERSION_TRACKING_ID_FIELD_NUMBER = 1;
  private com.google.protobuf.Int64Value conversionTrackingId_;
  /**
   * <pre>
   * The conversion tracking id used for this account. This id is automatically
   * assigned after any conversion tracking feature is used. If the customer
   * doesn't use conversion tracking, this is 0. This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value conversion_tracking_id = 1;</code>
   */
  public boolean hasConversionTrackingId() {
    return conversionTrackingId_ != null;
  }
  /**
   * <pre>
   * The conversion tracking id used for this account. This id is automatically
   * assigned after any conversion tracking feature is used. If the customer
   * doesn't use conversion tracking, this is 0. This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value conversion_tracking_id = 1;</code>
   */
  public com.google.protobuf.Int64Value getConversionTrackingId() {
    return conversionTrackingId_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : conversionTrackingId_;
  }
  /**
   * <pre>
   * The conversion tracking id used for this account. This id is automatically
   * assigned after any conversion tracking feature is used. If the customer
   * doesn't use conversion tracking, this is 0. This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value conversion_tracking_id = 1;</code>
   */
  public com.google.protobuf.Int64ValueOrBuilder getConversionTrackingIdOrBuilder() {
    return getConversionTrackingId();
  }

  public static final int CROSS_ACCOUNT_CONVERSION_TRACKING_ID_FIELD_NUMBER = 2;
  private com.google.protobuf.Int64Value crossAccountConversionTrackingId_;
  /**
   * <pre>
   * The conversion tracking id of the customer's manager. This is set when the
   * customer is opted into cross account conversion tracking, and it overrides
   * conversion_tracking_id. This field can only be managed through the Google
   * Ads UI. This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cross_account_conversion_tracking_id = 2;</code>
   */
  public boolean hasCrossAccountConversionTrackingId() {
    return crossAccountConversionTrackingId_ != null;
  }
  /**
   * <pre>
   * The conversion tracking id of the customer's manager. This is set when the
   * customer is opted into cross account conversion tracking, and it overrides
   * conversion_tracking_id. This field can only be managed through the Google
   * Ads UI. This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cross_account_conversion_tracking_id = 2;</code>
   */
  public com.google.protobuf.Int64Value getCrossAccountConversionTrackingId() {
    return crossAccountConversionTrackingId_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : crossAccountConversionTrackingId_;
  }
  /**
   * <pre>
   * The conversion tracking id of the customer's manager. This is set when the
   * customer is opted into cross account conversion tracking, and it overrides
   * conversion_tracking_id. This field can only be managed through the Google
   * Ads UI. This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cross_account_conversion_tracking_id = 2;</code>
   */
  public com.google.protobuf.Int64ValueOrBuilder getCrossAccountConversionTrackingIdOrBuilder() {
    return getCrossAccountConversionTrackingId();
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
    if (conversionTrackingId_ != null) {
      output.writeMessage(1, getConversionTrackingId());
    }
    if (crossAccountConversionTrackingId_ != null) {
      output.writeMessage(2, getCrossAccountConversionTrackingId());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (conversionTrackingId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getConversionTrackingId());
    }
    if (crossAccountConversionTrackingId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCrossAccountConversionTrackingId());
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
    if (!(obj instanceof com.google.ads.googleads.v3.resources.ConversionTrackingSetting)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v3.resources.ConversionTrackingSetting other = (com.google.ads.googleads.v3.resources.ConversionTrackingSetting) obj;

    if (hasConversionTrackingId() != other.hasConversionTrackingId()) return false;
    if (hasConversionTrackingId()) {
      if (!getConversionTrackingId()
          .equals(other.getConversionTrackingId())) return false;
    }
    if (hasCrossAccountConversionTrackingId() != other.hasCrossAccountConversionTrackingId()) return false;
    if (hasCrossAccountConversionTrackingId()) {
      if (!getCrossAccountConversionTrackingId()
          .equals(other.getCrossAccountConversionTrackingId())) return false;
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
    if (hasConversionTrackingId()) {
      hash = (37 * hash) + CONVERSION_TRACKING_ID_FIELD_NUMBER;
      hash = (53 * hash) + getConversionTrackingId().hashCode();
    }
    if (hasCrossAccountConversionTrackingId()) {
      hash = (37 * hash) + CROSS_ACCOUNT_CONVERSION_TRACKING_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCrossAccountConversionTrackingId().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v3.resources.ConversionTrackingSetting parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.resources.ConversionTrackingSetting parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.resources.ConversionTrackingSetting parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.resources.ConversionTrackingSetting parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.resources.ConversionTrackingSetting parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.resources.ConversionTrackingSetting parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.resources.ConversionTrackingSetting parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.resources.ConversionTrackingSetting parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.resources.ConversionTrackingSetting parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.resources.ConversionTrackingSetting parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.resources.ConversionTrackingSetting parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.resources.ConversionTrackingSetting parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v3.resources.ConversionTrackingSetting prototype) {
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
   * A collection of customer-wide settings related to Google Ads Conversion
   * Tracking.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v3.resources.ConversionTrackingSetting}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v3.resources.ConversionTrackingSetting)
      com.google.ads.googleads.v3.resources.ConversionTrackingSettingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v3.resources.CustomerProto.internal_static_google_ads_googleads_v3_resources_ConversionTrackingSetting_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v3.resources.CustomerProto.internal_static_google_ads_googleads_v3_resources_ConversionTrackingSetting_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v3.resources.ConversionTrackingSetting.class, com.google.ads.googleads.v3.resources.ConversionTrackingSetting.Builder.class);
    }

    // Construct using com.google.ads.googleads.v3.resources.ConversionTrackingSetting.newBuilder()
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
      if (conversionTrackingIdBuilder_ == null) {
        conversionTrackingId_ = null;
      } else {
        conversionTrackingId_ = null;
        conversionTrackingIdBuilder_ = null;
      }
      if (crossAccountConversionTrackingIdBuilder_ == null) {
        crossAccountConversionTrackingId_ = null;
      } else {
        crossAccountConversionTrackingId_ = null;
        crossAccountConversionTrackingIdBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v3.resources.CustomerProto.internal_static_google_ads_googleads_v3_resources_ConversionTrackingSetting_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.resources.ConversionTrackingSetting getDefaultInstanceForType() {
      return com.google.ads.googleads.v3.resources.ConversionTrackingSetting.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.resources.ConversionTrackingSetting build() {
      com.google.ads.googleads.v3.resources.ConversionTrackingSetting result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.resources.ConversionTrackingSetting buildPartial() {
      com.google.ads.googleads.v3.resources.ConversionTrackingSetting result = new com.google.ads.googleads.v3.resources.ConversionTrackingSetting(this);
      if (conversionTrackingIdBuilder_ == null) {
        result.conversionTrackingId_ = conversionTrackingId_;
      } else {
        result.conversionTrackingId_ = conversionTrackingIdBuilder_.build();
      }
      if (crossAccountConversionTrackingIdBuilder_ == null) {
        result.crossAccountConversionTrackingId_ = crossAccountConversionTrackingId_;
      } else {
        result.crossAccountConversionTrackingId_ = crossAccountConversionTrackingIdBuilder_.build();
      }
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
      if (other instanceof com.google.ads.googleads.v3.resources.ConversionTrackingSetting) {
        return mergeFrom((com.google.ads.googleads.v3.resources.ConversionTrackingSetting)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v3.resources.ConversionTrackingSetting other) {
      if (other == com.google.ads.googleads.v3.resources.ConversionTrackingSetting.getDefaultInstance()) return this;
      if (other.hasConversionTrackingId()) {
        mergeConversionTrackingId(other.getConversionTrackingId());
      }
      if (other.hasCrossAccountConversionTrackingId()) {
        mergeCrossAccountConversionTrackingId(other.getCrossAccountConversionTrackingId());
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
      com.google.ads.googleads.v3.resources.ConversionTrackingSetting parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v3.resources.ConversionTrackingSetting) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Int64Value conversionTrackingId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> conversionTrackingIdBuilder_;
    /**
     * <pre>
     * The conversion tracking id used for this account. This id is automatically
     * assigned after any conversion tracking feature is used. If the customer
     * doesn't use conversion tracking, this is 0. This field is read-only.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value conversion_tracking_id = 1;</code>
     */
    public boolean hasConversionTrackingId() {
      return conversionTrackingIdBuilder_ != null || conversionTrackingId_ != null;
    }
    /**
     * <pre>
     * The conversion tracking id used for this account. This id is automatically
     * assigned after any conversion tracking feature is used. If the customer
     * doesn't use conversion tracking, this is 0. This field is read-only.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value conversion_tracking_id = 1;</code>
     */
    public com.google.protobuf.Int64Value getConversionTrackingId() {
      if (conversionTrackingIdBuilder_ == null) {
        return conversionTrackingId_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : conversionTrackingId_;
      } else {
        return conversionTrackingIdBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The conversion tracking id used for this account. This id is automatically
     * assigned after any conversion tracking feature is used. If the customer
     * doesn't use conversion tracking, this is 0. This field is read-only.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value conversion_tracking_id = 1;</code>
     */
    public Builder setConversionTrackingId(com.google.protobuf.Int64Value value) {
      if (conversionTrackingIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        conversionTrackingId_ = value;
        onChanged();
      } else {
        conversionTrackingIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The conversion tracking id used for this account. This id is automatically
     * assigned after any conversion tracking feature is used. If the customer
     * doesn't use conversion tracking, this is 0. This field is read-only.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value conversion_tracking_id = 1;</code>
     */
    public Builder setConversionTrackingId(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (conversionTrackingIdBuilder_ == null) {
        conversionTrackingId_ = builderForValue.build();
        onChanged();
      } else {
        conversionTrackingIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The conversion tracking id used for this account. This id is automatically
     * assigned after any conversion tracking feature is used. If the customer
     * doesn't use conversion tracking, this is 0. This field is read-only.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value conversion_tracking_id = 1;</code>
     */
    public Builder mergeConversionTrackingId(com.google.protobuf.Int64Value value) {
      if (conversionTrackingIdBuilder_ == null) {
        if (conversionTrackingId_ != null) {
          conversionTrackingId_ =
            com.google.protobuf.Int64Value.newBuilder(conversionTrackingId_).mergeFrom(value).buildPartial();
        } else {
          conversionTrackingId_ = value;
        }
        onChanged();
      } else {
        conversionTrackingIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The conversion tracking id used for this account. This id is automatically
     * assigned after any conversion tracking feature is used. If the customer
     * doesn't use conversion tracking, this is 0. This field is read-only.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value conversion_tracking_id = 1;</code>
     */
    public Builder clearConversionTrackingId() {
      if (conversionTrackingIdBuilder_ == null) {
        conversionTrackingId_ = null;
        onChanged();
      } else {
        conversionTrackingId_ = null;
        conversionTrackingIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The conversion tracking id used for this account. This id is automatically
     * assigned after any conversion tracking feature is used. If the customer
     * doesn't use conversion tracking, this is 0. This field is read-only.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value conversion_tracking_id = 1;</code>
     */
    public com.google.protobuf.Int64Value.Builder getConversionTrackingIdBuilder() {
      
      onChanged();
      return getConversionTrackingIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The conversion tracking id used for this account. This id is automatically
     * assigned after any conversion tracking feature is used. If the customer
     * doesn't use conversion tracking, this is 0. This field is read-only.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value conversion_tracking_id = 1;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getConversionTrackingIdOrBuilder() {
      if (conversionTrackingIdBuilder_ != null) {
        return conversionTrackingIdBuilder_.getMessageOrBuilder();
      } else {
        return conversionTrackingId_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : conversionTrackingId_;
      }
    }
    /**
     * <pre>
     * The conversion tracking id used for this account. This id is automatically
     * assigned after any conversion tracking feature is used. If the customer
     * doesn't use conversion tracking, this is 0. This field is read-only.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value conversion_tracking_id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> 
        getConversionTrackingIdFieldBuilder() {
      if (conversionTrackingIdBuilder_ == null) {
        conversionTrackingIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getConversionTrackingId(),
                getParentForChildren(),
                isClean());
        conversionTrackingId_ = null;
      }
      return conversionTrackingIdBuilder_;
    }

    private com.google.protobuf.Int64Value crossAccountConversionTrackingId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> crossAccountConversionTrackingIdBuilder_;
    /**
     * <pre>
     * The conversion tracking id of the customer's manager. This is set when the
     * customer is opted into cross account conversion tracking, and it overrides
     * conversion_tracking_id. This field can only be managed through the Google
     * Ads UI. This field is read-only.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cross_account_conversion_tracking_id = 2;</code>
     */
    public boolean hasCrossAccountConversionTrackingId() {
      return crossAccountConversionTrackingIdBuilder_ != null || crossAccountConversionTrackingId_ != null;
    }
    /**
     * <pre>
     * The conversion tracking id of the customer's manager. This is set when the
     * customer is opted into cross account conversion tracking, and it overrides
     * conversion_tracking_id. This field can only be managed through the Google
     * Ads UI. This field is read-only.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cross_account_conversion_tracking_id = 2;</code>
     */
    public com.google.protobuf.Int64Value getCrossAccountConversionTrackingId() {
      if (crossAccountConversionTrackingIdBuilder_ == null) {
        return crossAccountConversionTrackingId_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : crossAccountConversionTrackingId_;
      } else {
        return crossAccountConversionTrackingIdBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The conversion tracking id of the customer's manager. This is set when the
     * customer is opted into cross account conversion tracking, and it overrides
     * conversion_tracking_id. This field can only be managed through the Google
     * Ads UI. This field is read-only.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cross_account_conversion_tracking_id = 2;</code>
     */
    public Builder setCrossAccountConversionTrackingId(com.google.protobuf.Int64Value value) {
      if (crossAccountConversionTrackingIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        crossAccountConversionTrackingId_ = value;
        onChanged();
      } else {
        crossAccountConversionTrackingIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The conversion tracking id of the customer's manager. This is set when the
     * customer is opted into cross account conversion tracking, and it overrides
     * conversion_tracking_id. This field can only be managed through the Google
     * Ads UI. This field is read-only.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cross_account_conversion_tracking_id = 2;</code>
     */
    public Builder setCrossAccountConversionTrackingId(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (crossAccountConversionTrackingIdBuilder_ == null) {
        crossAccountConversionTrackingId_ = builderForValue.build();
        onChanged();
      } else {
        crossAccountConversionTrackingIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The conversion tracking id of the customer's manager. This is set when the
     * customer is opted into cross account conversion tracking, and it overrides
     * conversion_tracking_id. This field can only be managed through the Google
     * Ads UI. This field is read-only.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cross_account_conversion_tracking_id = 2;</code>
     */
    public Builder mergeCrossAccountConversionTrackingId(com.google.protobuf.Int64Value value) {
      if (crossAccountConversionTrackingIdBuilder_ == null) {
        if (crossAccountConversionTrackingId_ != null) {
          crossAccountConversionTrackingId_ =
            com.google.protobuf.Int64Value.newBuilder(crossAccountConversionTrackingId_).mergeFrom(value).buildPartial();
        } else {
          crossAccountConversionTrackingId_ = value;
        }
        onChanged();
      } else {
        crossAccountConversionTrackingIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The conversion tracking id of the customer's manager. This is set when the
     * customer is opted into cross account conversion tracking, and it overrides
     * conversion_tracking_id. This field can only be managed through the Google
     * Ads UI. This field is read-only.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cross_account_conversion_tracking_id = 2;</code>
     */
    public Builder clearCrossAccountConversionTrackingId() {
      if (crossAccountConversionTrackingIdBuilder_ == null) {
        crossAccountConversionTrackingId_ = null;
        onChanged();
      } else {
        crossAccountConversionTrackingId_ = null;
        crossAccountConversionTrackingIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The conversion tracking id of the customer's manager. This is set when the
     * customer is opted into cross account conversion tracking, and it overrides
     * conversion_tracking_id. This field can only be managed through the Google
     * Ads UI. This field is read-only.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cross_account_conversion_tracking_id = 2;</code>
     */
    public com.google.protobuf.Int64Value.Builder getCrossAccountConversionTrackingIdBuilder() {
      
      onChanged();
      return getCrossAccountConversionTrackingIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The conversion tracking id of the customer's manager. This is set when the
     * customer is opted into cross account conversion tracking, and it overrides
     * conversion_tracking_id. This field can only be managed through the Google
     * Ads UI. This field is read-only.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cross_account_conversion_tracking_id = 2;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getCrossAccountConversionTrackingIdOrBuilder() {
      if (crossAccountConversionTrackingIdBuilder_ != null) {
        return crossAccountConversionTrackingIdBuilder_.getMessageOrBuilder();
      } else {
        return crossAccountConversionTrackingId_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : crossAccountConversionTrackingId_;
      }
    }
    /**
     * <pre>
     * The conversion tracking id of the customer's manager. This is set when the
     * customer is opted into cross account conversion tracking, and it overrides
     * conversion_tracking_id. This field can only be managed through the Google
     * Ads UI. This field is read-only.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cross_account_conversion_tracking_id = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> 
        getCrossAccountConversionTrackingIdFieldBuilder() {
      if (crossAccountConversionTrackingIdBuilder_ == null) {
        crossAccountConversionTrackingIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getCrossAccountConversionTrackingId(),
                getParentForChildren(),
                isClean());
        crossAccountConversionTrackingId_ = null;
      }
      return crossAccountConversionTrackingIdBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v3.resources.ConversionTrackingSetting)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v3.resources.ConversionTrackingSetting)
  private static final com.google.ads.googleads.v3.resources.ConversionTrackingSetting DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v3.resources.ConversionTrackingSetting();
  }

  public static com.google.ads.googleads.v3.resources.ConversionTrackingSetting getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConversionTrackingSetting>
      PARSER = new com.google.protobuf.AbstractParser<ConversionTrackingSetting>() {
    @java.lang.Override
    public ConversionTrackingSetting parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ConversionTrackingSetting(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ConversionTrackingSetting> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConversionTrackingSetting> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v3.resources.ConversionTrackingSetting getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

