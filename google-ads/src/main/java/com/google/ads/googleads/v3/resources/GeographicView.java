// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/geographic_view.proto

package com.google.ads.googleads.v3.resources;

/**
 * <pre>
 * A geographic view.
 * Geographic View includes all metrics aggregated at the country level,
 * one row per country. It reports metrics at either actual physical location of
 * the user or an area of interest. If other segment fields are used, you may
 * get more than one row per country.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v3.resources.GeographicView}
 */
public  final class GeographicView extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v3.resources.GeographicView)
    GeographicViewOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GeographicView.newBuilder() to construct.
  private GeographicView(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GeographicView() {
    resourceName_ = "";
    locationType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GeographicView(
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

            resourceName_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            locationType_ = rawValue;
            break;
          }
          case 34: {
            com.google.protobuf.Int64Value.Builder subBuilder = null;
            if (countryCriterionId_ != null) {
              subBuilder = countryCriterionId_.toBuilder();
            }
            countryCriterionId_ = input.readMessage(com.google.protobuf.Int64Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(countryCriterionId_);
              countryCriterionId_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v3.resources.GeographicViewProto.internal_static_google_ads_googleads_v3_resources_GeographicView_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v3.resources.GeographicViewProto.internal_static_google_ads_googleads_v3_resources_GeographicView_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v3.resources.GeographicView.class, com.google.ads.googleads.v3.resources.GeographicView.Builder.class);
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceName_;
  /**
   * <pre>
   * The resource name of the geographic view.
   * Geographic view resource names have the form:
   * `customers/{customer_id}/geographicViews/{country_criterion_id}~{location_type}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  public java.lang.String getResourceName() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The resource name of the geographic view.
   * Geographic view resource names have the form:
   * `customers/{customer_id}/geographicViews/{country_criterion_id}~{location_type}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getResourceNameBytes() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOCATION_TYPE_FIELD_NUMBER = 3;
  private int locationType_;
  /**
   * <pre>
   * Type of the geo targeting of the campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.GeoTargetingTypeEnum.GeoTargetingType location_type = 3;</code>
   */
  public int getLocationTypeValue() {
    return locationType_;
  }
  /**
   * <pre>
   * Type of the geo targeting of the campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.GeoTargetingTypeEnum.GeoTargetingType location_type = 3;</code>
   */
  public com.google.ads.googleads.v3.enums.GeoTargetingTypeEnum.GeoTargetingType getLocationType() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v3.enums.GeoTargetingTypeEnum.GeoTargetingType result = com.google.ads.googleads.v3.enums.GeoTargetingTypeEnum.GeoTargetingType.valueOf(locationType_);
    return result == null ? com.google.ads.googleads.v3.enums.GeoTargetingTypeEnum.GeoTargetingType.UNRECOGNIZED : result;
  }

  public static final int COUNTRY_CRITERION_ID_FIELD_NUMBER = 4;
  private com.google.protobuf.Int64Value countryCriterionId_;
  /**
   * <pre>
   * Criterion Id for the country.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value country_criterion_id = 4;</code>
   */
  public boolean hasCountryCriterionId() {
    return countryCriterionId_ != null;
  }
  /**
   * <pre>
   * Criterion Id for the country.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value country_criterion_id = 4;</code>
   */
  public com.google.protobuf.Int64Value getCountryCriterionId() {
    return countryCriterionId_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : countryCriterionId_;
  }
  /**
   * <pre>
   * Criterion Id for the country.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value country_criterion_id = 4;</code>
   */
  public com.google.protobuf.Int64ValueOrBuilder getCountryCriterionIdOrBuilder() {
    return getCountryCriterionId();
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
    if (!getResourceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceName_);
    }
    if (locationType_ != com.google.ads.googleads.v3.enums.GeoTargetingTypeEnum.GeoTargetingType.UNSPECIFIED.getNumber()) {
      output.writeEnum(3, locationType_);
    }
    if (countryCriterionId_ != null) {
      output.writeMessage(4, getCountryCriterionId());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getResourceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceName_);
    }
    if (locationType_ != com.google.ads.googleads.v3.enums.GeoTargetingTypeEnum.GeoTargetingType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, locationType_);
    }
    if (countryCriterionId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getCountryCriterionId());
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
    if (!(obj instanceof com.google.ads.googleads.v3.resources.GeographicView)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v3.resources.GeographicView other = (com.google.ads.googleads.v3.resources.GeographicView) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (locationType_ != other.locationType_) return false;
    if (hasCountryCriterionId() != other.hasCountryCriterionId()) return false;
    if (hasCountryCriterionId()) {
      if (!getCountryCriterionId()
          .equals(other.getCountryCriterionId())) return false;
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
    hash = (37 * hash) + RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getResourceName().hashCode();
    hash = (37 * hash) + LOCATION_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + locationType_;
    if (hasCountryCriterionId()) {
      hash = (37 * hash) + COUNTRY_CRITERION_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCountryCriterionId().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v3.resources.GeographicView parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.resources.GeographicView parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.resources.GeographicView parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.resources.GeographicView parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.resources.GeographicView parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.resources.GeographicView parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.resources.GeographicView parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.resources.GeographicView parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.resources.GeographicView parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.resources.GeographicView parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.resources.GeographicView parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.resources.GeographicView parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v3.resources.GeographicView prototype) {
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
   * A geographic view.
   * Geographic View includes all metrics aggregated at the country level,
   * one row per country. It reports metrics at either actual physical location of
   * the user or an area of interest. If other segment fields are used, you may
   * get more than one row per country.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v3.resources.GeographicView}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v3.resources.GeographicView)
      com.google.ads.googleads.v3.resources.GeographicViewOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v3.resources.GeographicViewProto.internal_static_google_ads_googleads_v3_resources_GeographicView_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v3.resources.GeographicViewProto.internal_static_google_ads_googleads_v3_resources_GeographicView_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v3.resources.GeographicView.class, com.google.ads.googleads.v3.resources.GeographicView.Builder.class);
    }

    // Construct using com.google.ads.googleads.v3.resources.GeographicView.newBuilder()
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
      resourceName_ = "";

      locationType_ = 0;

      if (countryCriterionIdBuilder_ == null) {
        countryCriterionId_ = null;
      } else {
        countryCriterionId_ = null;
        countryCriterionIdBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v3.resources.GeographicViewProto.internal_static_google_ads_googleads_v3_resources_GeographicView_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.resources.GeographicView getDefaultInstanceForType() {
      return com.google.ads.googleads.v3.resources.GeographicView.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.resources.GeographicView build() {
      com.google.ads.googleads.v3.resources.GeographicView result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.resources.GeographicView buildPartial() {
      com.google.ads.googleads.v3.resources.GeographicView result = new com.google.ads.googleads.v3.resources.GeographicView(this);
      result.resourceName_ = resourceName_;
      result.locationType_ = locationType_;
      if (countryCriterionIdBuilder_ == null) {
        result.countryCriterionId_ = countryCriterionId_;
      } else {
        result.countryCriterionId_ = countryCriterionIdBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v3.resources.GeographicView) {
        return mergeFrom((com.google.ads.googleads.v3.resources.GeographicView)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v3.resources.GeographicView other) {
      if (other == com.google.ads.googleads.v3.resources.GeographicView.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (other.locationType_ != 0) {
        setLocationTypeValue(other.getLocationTypeValue());
      }
      if (other.hasCountryCriterionId()) {
        mergeCountryCriterionId(other.getCountryCriterionId());
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
      com.google.ads.googleads.v3.resources.GeographicView parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v3.resources.GeographicView) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * The resource name of the geographic view.
     * Geographic view resource names have the form:
     * `customers/{customer_id}/geographicViews/{country_criterion_id}~{location_type}`
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     */
    public java.lang.String getResourceName() {
      java.lang.Object ref = resourceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the geographic view.
     * Geographic view resource names have the form:
     * `customers/{customer_id}/geographicViews/{country_criterion_id}~{location_type}`
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getResourceNameBytes() {
      java.lang.Object ref = resourceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the geographic view.
     * Geographic view resource names have the form:
     * `customers/{customer_id}/geographicViews/{country_criterion_id}~{location_type}`
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     */
    public Builder setResourceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the geographic view.
     * Geographic view resource names have the form:
     * `customers/{customer_id}/geographicViews/{country_criterion_id}~{location_type}`
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     */
    public Builder clearResourceName() {
      
      resourceName_ = getDefaultInstance().getResourceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the geographic view.
     * Geographic view resource names have the form:
     * `customers/{customer_id}/geographicViews/{country_criterion_id}~{location_type}`
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     */
    public Builder setResourceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceName_ = value;
      onChanged();
      return this;
    }

    private int locationType_ = 0;
    /**
     * <pre>
     * Type of the geo targeting of the campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.enums.GeoTargetingTypeEnum.GeoTargetingType location_type = 3;</code>
     */
    public int getLocationTypeValue() {
      return locationType_;
    }
    /**
     * <pre>
     * Type of the geo targeting of the campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.enums.GeoTargetingTypeEnum.GeoTargetingType location_type = 3;</code>
     */
    public Builder setLocationTypeValue(int value) {
      locationType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of the geo targeting of the campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.enums.GeoTargetingTypeEnum.GeoTargetingType location_type = 3;</code>
     */
    public com.google.ads.googleads.v3.enums.GeoTargetingTypeEnum.GeoTargetingType getLocationType() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v3.enums.GeoTargetingTypeEnum.GeoTargetingType result = com.google.ads.googleads.v3.enums.GeoTargetingTypeEnum.GeoTargetingType.valueOf(locationType_);
      return result == null ? com.google.ads.googleads.v3.enums.GeoTargetingTypeEnum.GeoTargetingType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Type of the geo targeting of the campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.enums.GeoTargetingTypeEnum.GeoTargetingType location_type = 3;</code>
     */
    public Builder setLocationType(com.google.ads.googleads.v3.enums.GeoTargetingTypeEnum.GeoTargetingType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      locationType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of the geo targeting of the campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.enums.GeoTargetingTypeEnum.GeoTargetingType location_type = 3;</code>
     */
    public Builder clearLocationType() {
      
      locationType_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Int64Value countryCriterionId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> countryCriterionIdBuilder_;
    /**
     * <pre>
     * Criterion Id for the country.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value country_criterion_id = 4;</code>
     */
    public boolean hasCountryCriterionId() {
      return countryCriterionIdBuilder_ != null || countryCriterionId_ != null;
    }
    /**
     * <pre>
     * Criterion Id for the country.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value country_criterion_id = 4;</code>
     */
    public com.google.protobuf.Int64Value getCountryCriterionId() {
      if (countryCriterionIdBuilder_ == null) {
        return countryCriterionId_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : countryCriterionId_;
      } else {
        return countryCriterionIdBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Criterion Id for the country.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value country_criterion_id = 4;</code>
     */
    public Builder setCountryCriterionId(com.google.protobuf.Int64Value value) {
      if (countryCriterionIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        countryCriterionId_ = value;
        onChanged();
      } else {
        countryCriterionIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Criterion Id for the country.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value country_criterion_id = 4;</code>
     */
    public Builder setCountryCriterionId(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (countryCriterionIdBuilder_ == null) {
        countryCriterionId_ = builderForValue.build();
        onChanged();
      } else {
        countryCriterionIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Criterion Id for the country.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value country_criterion_id = 4;</code>
     */
    public Builder mergeCountryCriterionId(com.google.protobuf.Int64Value value) {
      if (countryCriterionIdBuilder_ == null) {
        if (countryCriterionId_ != null) {
          countryCriterionId_ =
            com.google.protobuf.Int64Value.newBuilder(countryCriterionId_).mergeFrom(value).buildPartial();
        } else {
          countryCriterionId_ = value;
        }
        onChanged();
      } else {
        countryCriterionIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Criterion Id for the country.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value country_criterion_id = 4;</code>
     */
    public Builder clearCountryCriterionId() {
      if (countryCriterionIdBuilder_ == null) {
        countryCriterionId_ = null;
        onChanged();
      } else {
        countryCriterionId_ = null;
        countryCriterionIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Criterion Id for the country.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value country_criterion_id = 4;</code>
     */
    public com.google.protobuf.Int64Value.Builder getCountryCriterionIdBuilder() {
      
      onChanged();
      return getCountryCriterionIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Criterion Id for the country.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value country_criterion_id = 4;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getCountryCriterionIdOrBuilder() {
      if (countryCriterionIdBuilder_ != null) {
        return countryCriterionIdBuilder_.getMessageOrBuilder();
      } else {
        return countryCriterionId_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : countryCriterionId_;
      }
    }
    /**
     * <pre>
     * Criterion Id for the country.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value country_criterion_id = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> 
        getCountryCriterionIdFieldBuilder() {
      if (countryCriterionIdBuilder_ == null) {
        countryCriterionIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getCountryCriterionId(),
                getParentForChildren(),
                isClean());
        countryCriterionId_ = null;
      }
      return countryCriterionIdBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v3.resources.GeographicView)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v3.resources.GeographicView)
  private static final com.google.ads.googleads.v3.resources.GeographicView DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v3.resources.GeographicView();
  }

  public static com.google.ads.googleads.v3.resources.GeographicView getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GeographicView>
      PARSER = new com.google.protobuf.AbstractParser<GeographicView>() {
    @java.lang.Override
    public GeographicView parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GeographicView(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GeographicView> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GeographicView> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v3.resources.GeographicView getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

