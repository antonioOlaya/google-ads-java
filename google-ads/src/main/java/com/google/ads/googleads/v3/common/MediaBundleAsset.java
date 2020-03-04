// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/common/asset_types.proto

package com.google.ads.googleads.v3.common;

/**
 * <pre>
 * A MediaBundle asset.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v3.common.MediaBundleAsset}
 */
public  final class MediaBundleAsset extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v3.common.MediaBundleAsset)
    MediaBundleAssetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MediaBundleAsset.newBuilder() to construct.
  private MediaBundleAsset(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MediaBundleAsset() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MediaBundleAsset(
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
            com.google.protobuf.BytesValue.Builder subBuilder = null;
            if (data_ != null) {
              subBuilder = data_.toBuilder();
            }
            data_ = input.readMessage(com.google.protobuf.BytesValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(data_);
              data_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v3.common.AssetTypesProto.internal_static_google_ads_googleads_v3_common_MediaBundleAsset_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v3.common.AssetTypesProto.internal_static_google_ads_googleads_v3_common_MediaBundleAsset_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v3.common.MediaBundleAsset.class, com.google.ads.googleads.v3.common.MediaBundleAsset.Builder.class);
  }

  public static final int DATA_FIELD_NUMBER = 1;
  private com.google.protobuf.BytesValue data_;
  /**
   * <pre>
   * Media bundle (ZIP file) asset data. The format of the uploaded ZIP file
   * depends on the ad field where it will be used. For more information on the
   * format, see the documentation of the ad field where you plan on using the
   * MediaBundleAsset. This field is mutate only.
   * </pre>
   *
   * <code>.google.protobuf.BytesValue data = 1;</code>
   */
  public boolean hasData() {
    return data_ != null;
  }
  /**
   * <pre>
   * Media bundle (ZIP file) asset data. The format of the uploaded ZIP file
   * depends on the ad field where it will be used. For more information on the
   * format, see the documentation of the ad field where you plan on using the
   * MediaBundleAsset. This field is mutate only.
   * </pre>
   *
   * <code>.google.protobuf.BytesValue data = 1;</code>
   */
  public com.google.protobuf.BytesValue getData() {
    return data_ == null ? com.google.protobuf.BytesValue.getDefaultInstance() : data_;
  }
  /**
   * <pre>
   * Media bundle (ZIP file) asset data. The format of the uploaded ZIP file
   * depends on the ad field where it will be used. For more information on the
   * format, see the documentation of the ad field where you plan on using the
   * MediaBundleAsset. This field is mutate only.
   * </pre>
   *
   * <code>.google.protobuf.BytesValue data = 1;</code>
   */
  public com.google.protobuf.BytesValueOrBuilder getDataOrBuilder() {
    return getData();
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
    if (data_ != null) {
      output.writeMessage(1, getData());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (data_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getData());
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
    if (!(obj instanceof com.google.ads.googleads.v3.common.MediaBundleAsset)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v3.common.MediaBundleAsset other = (com.google.ads.googleads.v3.common.MediaBundleAsset) obj;

    if (hasData() != other.hasData()) return false;
    if (hasData()) {
      if (!getData()
          .equals(other.getData())) return false;
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
    if (hasData()) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v3.common.MediaBundleAsset parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.common.MediaBundleAsset parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.common.MediaBundleAsset parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.common.MediaBundleAsset parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.common.MediaBundleAsset parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.common.MediaBundleAsset parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.common.MediaBundleAsset parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.common.MediaBundleAsset parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.common.MediaBundleAsset parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.common.MediaBundleAsset parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.common.MediaBundleAsset parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.common.MediaBundleAsset parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v3.common.MediaBundleAsset prototype) {
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
   * A MediaBundle asset.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v3.common.MediaBundleAsset}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v3.common.MediaBundleAsset)
      com.google.ads.googleads.v3.common.MediaBundleAssetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v3.common.AssetTypesProto.internal_static_google_ads_googleads_v3_common_MediaBundleAsset_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v3.common.AssetTypesProto.internal_static_google_ads_googleads_v3_common_MediaBundleAsset_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v3.common.MediaBundleAsset.class, com.google.ads.googleads.v3.common.MediaBundleAsset.Builder.class);
    }

    // Construct using com.google.ads.googleads.v3.common.MediaBundleAsset.newBuilder()
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
      if (dataBuilder_ == null) {
        data_ = null;
      } else {
        data_ = null;
        dataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v3.common.AssetTypesProto.internal_static_google_ads_googleads_v3_common_MediaBundleAsset_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.common.MediaBundleAsset getDefaultInstanceForType() {
      return com.google.ads.googleads.v3.common.MediaBundleAsset.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.common.MediaBundleAsset build() {
      com.google.ads.googleads.v3.common.MediaBundleAsset result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.common.MediaBundleAsset buildPartial() {
      com.google.ads.googleads.v3.common.MediaBundleAsset result = new com.google.ads.googleads.v3.common.MediaBundleAsset(this);
      if (dataBuilder_ == null) {
        result.data_ = data_;
      } else {
        result.data_ = dataBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v3.common.MediaBundleAsset) {
        return mergeFrom((com.google.ads.googleads.v3.common.MediaBundleAsset)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v3.common.MediaBundleAsset other) {
      if (other == com.google.ads.googleads.v3.common.MediaBundleAsset.getDefaultInstance()) return this;
      if (other.hasData()) {
        mergeData(other.getData());
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
      com.google.ads.googleads.v3.common.MediaBundleAsset parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v3.common.MediaBundleAsset) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.BytesValue data_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.BytesValue, com.google.protobuf.BytesValue.Builder, com.google.protobuf.BytesValueOrBuilder> dataBuilder_;
    /**
     * <pre>
     * Media bundle (ZIP file) asset data. The format of the uploaded ZIP file
     * depends on the ad field where it will be used. For more information on the
     * format, see the documentation of the ad field where you plan on using the
     * MediaBundleAsset. This field is mutate only.
     * </pre>
     *
     * <code>.google.protobuf.BytesValue data = 1;</code>
     */
    public boolean hasData() {
      return dataBuilder_ != null || data_ != null;
    }
    /**
     * <pre>
     * Media bundle (ZIP file) asset data. The format of the uploaded ZIP file
     * depends on the ad field where it will be used. For more information on the
     * format, see the documentation of the ad field where you plan on using the
     * MediaBundleAsset. This field is mutate only.
     * </pre>
     *
     * <code>.google.protobuf.BytesValue data = 1;</code>
     */
    public com.google.protobuf.BytesValue getData() {
      if (dataBuilder_ == null) {
        return data_ == null ? com.google.protobuf.BytesValue.getDefaultInstance() : data_;
      } else {
        return dataBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Media bundle (ZIP file) asset data. The format of the uploaded ZIP file
     * depends on the ad field where it will be used. For more information on the
     * format, see the documentation of the ad field where you plan on using the
     * MediaBundleAsset. This field is mutate only.
     * </pre>
     *
     * <code>.google.protobuf.BytesValue data = 1;</code>
     */
    public Builder setData(com.google.protobuf.BytesValue value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        data_ = value;
        onChanged();
      } else {
        dataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Media bundle (ZIP file) asset data. The format of the uploaded ZIP file
     * depends on the ad field where it will be used. For more information on the
     * format, see the documentation of the ad field where you plan on using the
     * MediaBundleAsset. This field is mutate only.
     * </pre>
     *
     * <code>.google.protobuf.BytesValue data = 1;</code>
     */
    public Builder setData(
        com.google.protobuf.BytesValue.Builder builderForValue) {
      if (dataBuilder_ == null) {
        data_ = builderForValue.build();
        onChanged();
      } else {
        dataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Media bundle (ZIP file) asset data. The format of the uploaded ZIP file
     * depends on the ad field where it will be used. For more information on the
     * format, see the documentation of the ad field where you plan on using the
     * MediaBundleAsset. This field is mutate only.
     * </pre>
     *
     * <code>.google.protobuf.BytesValue data = 1;</code>
     */
    public Builder mergeData(com.google.protobuf.BytesValue value) {
      if (dataBuilder_ == null) {
        if (data_ != null) {
          data_ =
            com.google.protobuf.BytesValue.newBuilder(data_).mergeFrom(value).buildPartial();
        } else {
          data_ = value;
        }
        onChanged();
      } else {
        dataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Media bundle (ZIP file) asset data. The format of the uploaded ZIP file
     * depends on the ad field where it will be used. For more information on the
     * format, see the documentation of the ad field where you plan on using the
     * MediaBundleAsset. This field is mutate only.
     * </pre>
     *
     * <code>.google.protobuf.BytesValue data = 1;</code>
     */
    public Builder clearData() {
      if (dataBuilder_ == null) {
        data_ = null;
        onChanged();
      } else {
        data_ = null;
        dataBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Media bundle (ZIP file) asset data. The format of the uploaded ZIP file
     * depends on the ad field where it will be used. For more information on the
     * format, see the documentation of the ad field where you plan on using the
     * MediaBundleAsset. This field is mutate only.
     * </pre>
     *
     * <code>.google.protobuf.BytesValue data = 1;</code>
     */
    public com.google.protobuf.BytesValue.Builder getDataBuilder() {
      
      onChanged();
      return getDataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Media bundle (ZIP file) asset data. The format of the uploaded ZIP file
     * depends on the ad field where it will be used. For more information on the
     * format, see the documentation of the ad field where you plan on using the
     * MediaBundleAsset. This field is mutate only.
     * </pre>
     *
     * <code>.google.protobuf.BytesValue data = 1;</code>
     */
    public com.google.protobuf.BytesValueOrBuilder getDataOrBuilder() {
      if (dataBuilder_ != null) {
        return dataBuilder_.getMessageOrBuilder();
      } else {
        return data_ == null ?
            com.google.protobuf.BytesValue.getDefaultInstance() : data_;
      }
    }
    /**
     * <pre>
     * Media bundle (ZIP file) asset data. The format of the uploaded ZIP file
     * depends on the ad field where it will be used. For more information on the
     * format, see the documentation of the ad field where you plan on using the
     * MediaBundleAsset. This field is mutate only.
     * </pre>
     *
     * <code>.google.protobuf.BytesValue data = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.BytesValue, com.google.protobuf.BytesValue.Builder, com.google.protobuf.BytesValueOrBuilder> 
        getDataFieldBuilder() {
      if (dataBuilder_ == null) {
        dataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.BytesValue, com.google.protobuf.BytesValue.Builder, com.google.protobuf.BytesValueOrBuilder>(
                getData(),
                getParentForChildren(),
                isClean());
        data_ = null;
      }
      return dataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v3.common.MediaBundleAsset)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v3.common.MediaBundleAsset)
  private static final com.google.ads.googleads.v3.common.MediaBundleAsset DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v3.common.MediaBundleAsset();
  }

  public static com.google.ads.googleads.v3.common.MediaBundleAsset getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MediaBundleAsset>
      PARSER = new com.google.protobuf.AbstractParser<MediaBundleAsset>() {
    @java.lang.Override
    public MediaBundleAsset parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MediaBundleAsset(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MediaBundleAsset> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MediaBundleAsset> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v3.common.MediaBundleAsset getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

