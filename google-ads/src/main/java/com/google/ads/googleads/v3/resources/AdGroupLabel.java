// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/ad_group_label.proto

package com.google.ads.googleads.v3.resources;

/**
 * <pre>
 * A relationship between an ad group and a label.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v3.resources.AdGroupLabel}
 */
public  final class AdGroupLabel extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v3.resources.AdGroupLabel)
    AdGroupLabelOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdGroupLabel.newBuilder() to construct.
  private AdGroupLabel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdGroupLabel() {
    resourceName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AdGroupLabel(
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
          case 18: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (adGroup_ != null) {
              subBuilder = adGroup_.toBuilder();
            }
            adGroup_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(adGroup_);
              adGroup_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (label_ != null) {
              subBuilder = label_.toBuilder();
            }
            label_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(label_);
              label_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v3.resources.AdGroupLabelProto.internal_static_google_ads_googleads_v3_resources_AdGroupLabel_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v3.resources.AdGroupLabelProto.internal_static_google_ads_googleads_v3_resources_AdGroupLabel_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v3.resources.AdGroupLabel.class, com.google.ads.googleads.v3.resources.AdGroupLabel.Builder.class);
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceName_;
  /**
   * <pre>
   * The resource name of the ad group label.
   * Ad group label resource names have the form:
   * `customers/{customer_id}/adGroupLabels/{ad_group_id}~{label_id}`
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
   * The resource name of the ad group label.
   * Ad group label resource names have the form:
   * `customers/{customer_id}/adGroupLabels/{ad_group_id}~{label_id}`
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

  public static final int AD_GROUP_FIELD_NUMBER = 2;
  private com.google.protobuf.StringValue adGroup_;
  /**
   * <pre>
   * The ad group to which the label is attached.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 2;</code>
   */
  public boolean hasAdGroup() {
    return adGroup_ != null;
  }
  /**
   * <pre>
   * The ad group to which the label is attached.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 2;</code>
   */
  public com.google.protobuf.StringValue getAdGroup() {
    return adGroup_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : adGroup_;
  }
  /**
   * <pre>
   * The ad group to which the label is attached.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 2;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getAdGroupOrBuilder() {
    return getAdGroup();
  }

  public static final int LABEL_FIELD_NUMBER = 3;
  private com.google.protobuf.StringValue label_;
  /**
   * <pre>
   * The label assigned to the ad group.
   * </pre>
   *
   * <code>.google.protobuf.StringValue label = 3;</code>
   */
  public boolean hasLabel() {
    return label_ != null;
  }
  /**
   * <pre>
   * The label assigned to the ad group.
   * </pre>
   *
   * <code>.google.protobuf.StringValue label = 3;</code>
   */
  public com.google.protobuf.StringValue getLabel() {
    return label_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : label_;
  }
  /**
   * <pre>
   * The label assigned to the ad group.
   * </pre>
   *
   * <code>.google.protobuf.StringValue label = 3;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getLabelOrBuilder() {
    return getLabel();
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
    if (adGroup_ != null) {
      output.writeMessage(2, getAdGroup());
    }
    if (label_ != null) {
      output.writeMessage(3, getLabel());
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
    if (adGroup_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAdGroup());
    }
    if (label_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getLabel());
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
    if (!(obj instanceof com.google.ads.googleads.v3.resources.AdGroupLabel)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v3.resources.AdGroupLabel other = (com.google.ads.googleads.v3.resources.AdGroupLabel) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasAdGroup() != other.hasAdGroup()) return false;
    if (hasAdGroup()) {
      if (!getAdGroup()
          .equals(other.getAdGroup())) return false;
    }
    if (hasLabel() != other.hasLabel()) return false;
    if (hasLabel()) {
      if (!getLabel()
          .equals(other.getLabel())) return false;
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
    if (hasAdGroup()) {
      hash = (37 * hash) + AD_GROUP_FIELD_NUMBER;
      hash = (53 * hash) + getAdGroup().hashCode();
    }
    if (hasLabel()) {
      hash = (37 * hash) + LABEL_FIELD_NUMBER;
      hash = (53 * hash) + getLabel().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v3.resources.AdGroupLabel parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.resources.AdGroupLabel parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.resources.AdGroupLabel parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.resources.AdGroupLabel parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.resources.AdGroupLabel parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.resources.AdGroupLabel parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.resources.AdGroupLabel parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.resources.AdGroupLabel parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.resources.AdGroupLabel parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.resources.AdGroupLabel parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.resources.AdGroupLabel parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.resources.AdGroupLabel parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v3.resources.AdGroupLabel prototype) {
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
   * A relationship between an ad group and a label.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v3.resources.AdGroupLabel}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v3.resources.AdGroupLabel)
      com.google.ads.googleads.v3.resources.AdGroupLabelOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v3.resources.AdGroupLabelProto.internal_static_google_ads_googleads_v3_resources_AdGroupLabel_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v3.resources.AdGroupLabelProto.internal_static_google_ads_googleads_v3_resources_AdGroupLabel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v3.resources.AdGroupLabel.class, com.google.ads.googleads.v3.resources.AdGroupLabel.Builder.class);
    }

    // Construct using com.google.ads.googleads.v3.resources.AdGroupLabel.newBuilder()
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

      if (adGroupBuilder_ == null) {
        adGroup_ = null;
      } else {
        adGroup_ = null;
        adGroupBuilder_ = null;
      }
      if (labelBuilder_ == null) {
        label_ = null;
      } else {
        label_ = null;
        labelBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v3.resources.AdGroupLabelProto.internal_static_google_ads_googleads_v3_resources_AdGroupLabel_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.resources.AdGroupLabel getDefaultInstanceForType() {
      return com.google.ads.googleads.v3.resources.AdGroupLabel.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.resources.AdGroupLabel build() {
      com.google.ads.googleads.v3.resources.AdGroupLabel result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.resources.AdGroupLabel buildPartial() {
      com.google.ads.googleads.v3.resources.AdGroupLabel result = new com.google.ads.googleads.v3.resources.AdGroupLabel(this);
      result.resourceName_ = resourceName_;
      if (adGroupBuilder_ == null) {
        result.adGroup_ = adGroup_;
      } else {
        result.adGroup_ = adGroupBuilder_.build();
      }
      if (labelBuilder_ == null) {
        result.label_ = label_;
      } else {
        result.label_ = labelBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v3.resources.AdGroupLabel) {
        return mergeFrom((com.google.ads.googleads.v3.resources.AdGroupLabel)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v3.resources.AdGroupLabel other) {
      if (other == com.google.ads.googleads.v3.resources.AdGroupLabel.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (other.hasAdGroup()) {
        mergeAdGroup(other.getAdGroup());
      }
      if (other.hasLabel()) {
        mergeLabel(other.getLabel());
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
      com.google.ads.googleads.v3.resources.AdGroupLabel parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v3.resources.AdGroupLabel) e.getUnfinishedMessage();
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
     * The resource name of the ad group label.
     * Ad group label resource names have the form:
     * `customers/{customer_id}/adGroupLabels/{ad_group_id}~{label_id}`
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
     * The resource name of the ad group label.
     * Ad group label resource names have the form:
     * `customers/{customer_id}/adGroupLabels/{ad_group_id}~{label_id}`
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
     * The resource name of the ad group label.
     * Ad group label resource names have the form:
     * `customers/{customer_id}/adGroupLabels/{ad_group_id}~{label_id}`
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
     * The resource name of the ad group label.
     * Ad group label resource names have the form:
     * `customers/{customer_id}/adGroupLabels/{ad_group_id}~{label_id}`
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
     * The resource name of the ad group label.
     * Ad group label resource names have the form:
     * `customers/{customer_id}/adGroupLabels/{ad_group_id}~{label_id}`
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

    private com.google.protobuf.StringValue adGroup_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> adGroupBuilder_;
    /**
     * <pre>
     * The ad group to which the label is attached.
     * </pre>
     *
     * <code>.google.protobuf.StringValue ad_group = 2;</code>
     */
    public boolean hasAdGroup() {
      return adGroupBuilder_ != null || adGroup_ != null;
    }
    /**
     * <pre>
     * The ad group to which the label is attached.
     * </pre>
     *
     * <code>.google.protobuf.StringValue ad_group = 2;</code>
     */
    public com.google.protobuf.StringValue getAdGroup() {
      if (adGroupBuilder_ == null) {
        return adGroup_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : adGroup_;
      } else {
        return adGroupBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The ad group to which the label is attached.
     * </pre>
     *
     * <code>.google.protobuf.StringValue ad_group = 2;</code>
     */
    public Builder setAdGroup(com.google.protobuf.StringValue value) {
      if (adGroupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        adGroup_ = value;
        onChanged();
      } else {
        adGroupBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The ad group to which the label is attached.
     * </pre>
     *
     * <code>.google.protobuf.StringValue ad_group = 2;</code>
     */
    public Builder setAdGroup(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (adGroupBuilder_ == null) {
        adGroup_ = builderForValue.build();
        onChanged();
      } else {
        adGroupBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The ad group to which the label is attached.
     * </pre>
     *
     * <code>.google.protobuf.StringValue ad_group = 2;</code>
     */
    public Builder mergeAdGroup(com.google.protobuf.StringValue value) {
      if (adGroupBuilder_ == null) {
        if (adGroup_ != null) {
          adGroup_ =
            com.google.protobuf.StringValue.newBuilder(adGroup_).mergeFrom(value).buildPartial();
        } else {
          adGroup_ = value;
        }
        onChanged();
      } else {
        adGroupBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The ad group to which the label is attached.
     * </pre>
     *
     * <code>.google.protobuf.StringValue ad_group = 2;</code>
     */
    public Builder clearAdGroup() {
      if (adGroupBuilder_ == null) {
        adGroup_ = null;
        onChanged();
      } else {
        adGroup_ = null;
        adGroupBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The ad group to which the label is attached.
     * </pre>
     *
     * <code>.google.protobuf.StringValue ad_group = 2;</code>
     */
    public com.google.protobuf.StringValue.Builder getAdGroupBuilder() {
      
      onChanged();
      return getAdGroupFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The ad group to which the label is attached.
     * </pre>
     *
     * <code>.google.protobuf.StringValue ad_group = 2;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getAdGroupOrBuilder() {
      if (adGroupBuilder_ != null) {
        return adGroupBuilder_.getMessageOrBuilder();
      } else {
        return adGroup_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : adGroup_;
      }
    }
    /**
     * <pre>
     * The ad group to which the label is attached.
     * </pre>
     *
     * <code>.google.protobuf.StringValue ad_group = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getAdGroupFieldBuilder() {
      if (adGroupBuilder_ == null) {
        adGroupBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getAdGroup(),
                getParentForChildren(),
                isClean());
        adGroup_ = null;
      }
      return adGroupBuilder_;
    }

    private com.google.protobuf.StringValue label_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> labelBuilder_;
    /**
     * <pre>
     * The label assigned to the ad group.
     * </pre>
     *
     * <code>.google.protobuf.StringValue label = 3;</code>
     */
    public boolean hasLabel() {
      return labelBuilder_ != null || label_ != null;
    }
    /**
     * <pre>
     * The label assigned to the ad group.
     * </pre>
     *
     * <code>.google.protobuf.StringValue label = 3;</code>
     */
    public com.google.protobuf.StringValue getLabel() {
      if (labelBuilder_ == null) {
        return label_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : label_;
      } else {
        return labelBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The label assigned to the ad group.
     * </pre>
     *
     * <code>.google.protobuf.StringValue label = 3;</code>
     */
    public Builder setLabel(com.google.protobuf.StringValue value) {
      if (labelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        label_ = value;
        onChanged();
      } else {
        labelBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The label assigned to the ad group.
     * </pre>
     *
     * <code>.google.protobuf.StringValue label = 3;</code>
     */
    public Builder setLabel(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (labelBuilder_ == null) {
        label_ = builderForValue.build();
        onChanged();
      } else {
        labelBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The label assigned to the ad group.
     * </pre>
     *
     * <code>.google.protobuf.StringValue label = 3;</code>
     */
    public Builder mergeLabel(com.google.protobuf.StringValue value) {
      if (labelBuilder_ == null) {
        if (label_ != null) {
          label_ =
            com.google.protobuf.StringValue.newBuilder(label_).mergeFrom(value).buildPartial();
        } else {
          label_ = value;
        }
        onChanged();
      } else {
        labelBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The label assigned to the ad group.
     * </pre>
     *
     * <code>.google.protobuf.StringValue label = 3;</code>
     */
    public Builder clearLabel() {
      if (labelBuilder_ == null) {
        label_ = null;
        onChanged();
      } else {
        label_ = null;
        labelBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The label assigned to the ad group.
     * </pre>
     *
     * <code>.google.protobuf.StringValue label = 3;</code>
     */
    public com.google.protobuf.StringValue.Builder getLabelBuilder() {
      
      onChanged();
      return getLabelFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The label assigned to the ad group.
     * </pre>
     *
     * <code>.google.protobuf.StringValue label = 3;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getLabelOrBuilder() {
      if (labelBuilder_ != null) {
        return labelBuilder_.getMessageOrBuilder();
      } else {
        return label_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : label_;
      }
    }
    /**
     * <pre>
     * The label assigned to the ad group.
     * </pre>
     *
     * <code>.google.protobuf.StringValue label = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getLabelFieldBuilder() {
      if (labelBuilder_ == null) {
        labelBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getLabel(),
                getParentForChildren(),
                isClean());
        label_ = null;
      }
      return labelBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v3.resources.AdGroupLabel)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v3.resources.AdGroupLabel)
  private static final com.google.ads.googleads.v3.resources.AdGroupLabel DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v3.resources.AdGroupLabel();
  }

  public static com.google.ads.googleads.v3.resources.AdGroupLabel getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdGroupLabel>
      PARSER = new com.google.protobuf.AbstractParser<AdGroupLabel>() {
    @java.lang.Override
    public AdGroupLabel parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AdGroupLabel(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AdGroupLabel> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdGroupLabel> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v3.resources.AdGroupLabel getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

