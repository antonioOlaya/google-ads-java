// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/services/keyword_plan_idea_service.proto

package com.google.ads.googleads.v0.services;

/**
 * <pre>
 * Url Seed
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v0.services.UrlSeed}
 */
public  final class UrlSeed extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v0.services.UrlSeed)
    UrlSeedOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UrlSeed.newBuilder() to construct.
  private UrlSeed(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UrlSeed() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UrlSeed(
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
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (url_ != null) {
              subBuilder = url_.toBuilder();
            }
            url_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(url_);
              url_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v0.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v0_services_UrlSeed_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v0.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v0_services_UrlSeed_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v0.services.UrlSeed.class, com.google.ads.googleads.v0.services.UrlSeed.Builder.class);
  }

  public static final int URL_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue url_;
  /**
   * <pre>
   * The URL to crawl in order to generate keyword ideas.
   * </pre>
   *
   * <code>.google.protobuf.StringValue url = 1;</code>
   */
  public boolean hasUrl() {
    return url_ != null;
  }
  /**
   * <pre>
   * The URL to crawl in order to generate keyword ideas.
   * </pre>
   *
   * <code>.google.protobuf.StringValue url = 1;</code>
   */
  public com.google.protobuf.StringValue getUrl() {
    return url_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : url_;
  }
  /**
   * <pre>
   * The URL to crawl in order to generate keyword ideas.
   * </pre>
   *
   * <code>.google.protobuf.StringValue url = 1;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getUrlOrBuilder() {
    return getUrl();
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
    if (url_ != null) {
      output.writeMessage(1, getUrl());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (url_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUrl());
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
    if (!(obj instanceof com.google.ads.googleads.v0.services.UrlSeed)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v0.services.UrlSeed other = (com.google.ads.googleads.v0.services.UrlSeed) obj;

    boolean result = true;
    result = result && (hasUrl() == other.hasUrl());
    if (hasUrl()) {
      result = result && getUrl()
          .equals(other.getUrl());
    }
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
    if (hasUrl()) {
      hash = (37 * hash) + URL_FIELD_NUMBER;
      hash = (53 * hash) + getUrl().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v0.services.UrlSeed parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.services.UrlSeed parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.services.UrlSeed parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.services.UrlSeed parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.services.UrlSeed parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.services.UrlSeed parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.services.UrlSeed parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.services.UrlSeed parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.services.UrlSeed parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.services.UrlSeed parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.services.UrlSeed parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.services.UrlSeed parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v0.services.UrlSeed prototype) {
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
   * Url Seed
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v0.services.UrlSeed}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v0.services.UrlSeed)
      com.google.ads.googleads.v0.services.UrlSeedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v0.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v0_services_UrlSeed_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v0.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v0_services_UrlSeed_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v0.services.UrlSeed.class, com.google.ads.googleads.v0.services.UrlSeed.Builder.class);
    }

    // Construct using com.google.ads.googleads.v0.services.UrlSeed.newBuilder()
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
      if (urlBuilder_ == null) {
        url_ = null;
      } else {
        url_ = null;
        urlBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v0.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v0_services_UrlSeed_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v0.services.UrlSeed getDefaultInstanceForType() {
      return com.google.ads.googleads.v0.services.UrlSeed.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v0.services.UrlSeed build() {
      com.google.ads.googleads.v0.services.UrlSeed result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v0.services.UrlSeed buildPartial() {
      com.google.ads.googleads.v0.services.UrlSeed result = new com.google.ads.googleads.v0.services.UrlSeed(this);
      if (urlBuilder_ == null) {
        result.url_ = url_;
      } else {
        result.url_ = urlBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v0.services.UrlSeed) {
        return mergeFrom((com.google.ads.googleads.v0.services.UrlSeed)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v0.services.UrlSeed other) {
      if (other == com.google.ads.googleads.v0.services.UrlSeed.getDefaultInstance()) return this;
      if (other.hasUrl()) {
        mergeUrl(other.getUrl());
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
      com.google.ads.googleads.v0.services.UrlSeed parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v0.services.UrlSeed) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue url_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> urlBuilder_;
    /**
     * <pre>
     * The URL to crawl in order to generate keyword ideas.
     * </pre>
     *
     * <code>.google.protobuf.StringValue url = 1;</code>
     */
    public boolean hasUrl() {
      return urlBuilder_ != null || url_ != null;
    }
    /**
     * <pre>
     * The URL to crawl in order to generate keyword ideas.
     * </pre>
     *
     * <code>.google.protobuf.StringValue url = 1;</code>
     */
    public com.google.protobuf.StringValue getUrl() {
      if (urlBuilder_ == null) {
        return url_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : url_;
      } else {
        return urlBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The URL to crawl in order to generate keyword ideas.
     * </pre>
     *
     * <code>.google.protobuf.StringValue url = 1;</code>
     */
    public Builder setUrl(com.google.protobuf.StringValue value) {
      if (urlBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        url_ = value;
        onChanged();
      } else {
        urlBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The URL to crawl in order to generate keyword ideas.
     * </pre>
     *
     * <code>.google.protobuf.StringValue url = 1;</code>
     */
    public Builder setUrl(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (urlBuilder_ == null) {
        url_ = builderForValue.build();
        onChanged();
      } else {
        urlBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The URL to crawl in order to generate keyword ideas.
     * </pre>
     *
     * <code>.google.protobuf.StringValue url = 1;</code>
     */
    public Builder mergeUrl(com.google.protobuf.StringValue value) {
      if (urlBuilder_ == null) {
        if (url_ != null) {
          url_ =
            com.google.protobuf.StringValue.newBuilder(url_).mergeFrom(value).buildPartial();
        } else {
          url_ = value;
        }
        onChanged();
      } else {
        urlBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The URL to crawl in order to generate keyword ideas.
     * </pre>
     *
     * <code>.google.protobuf.StringValue url = 1;</code>
     */
    public Builder clearUrl() {
      if (urlBuilder_ == null) {
        url_ = null;
        onChanged();
      } else {
        url_ = null;
        urlBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The URL to crawl in order to generate keyword ideas.
     * </pre>
     *
     * <code>.google.protobuf.StringValue url = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getUrlBuilder() {
      
      onChanged();
      return getUrlFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The URL to crawl in order to generate keyword ideas.
     * </pre>
     *
     * <code>.google.protobuf.StringValue url = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getUrlOrBuilder() {
      if (urlBuilder_ != null) {
        return urlBuilder_.getMessageOrBuilder();
      } else {
        return url_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : url_;
      }
    }
    /**
     * <pre>
     * The URL to crawl in order to generate keyword ideas.
     * </pre>
     *
     * <code>.google.protobuf.StringValue url = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getUrlFieldBuilder() {
      if (urlBuilder_ == null) {
        urlBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getUrl(),
                getParentForChildren(),
                isClean());
        url_ = null;
      }
      return urlBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v0.services.UrlSeed)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v0.services.UrlSeed)
  private static final com.google.ads.googleads.v0.services.UrlSeed DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v0.services.UrlSeed();
  }

  public static com.google.ads.googleads.v0.services.UrlSeed getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UrlSeed>
      PARSER = new com.google.protobuf.AbstractParser<UrlSeed>() {
    @java.lang.Override
    public UrlSeed parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UrlSeed(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UrlSeed> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UrlSeed> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v0.services.UrlSeed getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

