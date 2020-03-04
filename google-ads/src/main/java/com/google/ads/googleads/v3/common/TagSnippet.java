// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/common/tag_snippet.proto

package com.google.ads.googleads.v3.common;

/**
 * <pre>
 * The site tag and event snippet pair for a TrackingCodeType.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v3.common.TagSnippet}
 */
public  final class TagSnippet extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v3.common.TagSnippet)
    TagSnippetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TagSnippet.newBuilder() to construct.
  private TagSnippet(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TagSnippet() {
    type_ = 0;
    pageFormat_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TagSnippet(
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
          case 8: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            pageFormat_ = rawValue;
            break;
          }
          case 26: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (globalSiteTag_ != null) {
              subBuilder = globalSiteTag_.toBuilder();
            }
            globalSiteTag_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(globalSiteTag_);
              globalSiteTag_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (eventSnippet_ != null) {
              subBuilder = eventSnippet_.toBuilder();
            }
            eventSnippet_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(eventSnippet_);
              eventSnippet_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v3.common.TagSnippetProto.internal_static_google_ads_googleads_v3_common_TagSnippet_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v3.common.TagSnippetProto.internal_static_google_ads_googleads_v3_common_TagSnippet_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v3.common.TagSnippet.class, com.google.ads.googleads.v3.common.TagSnippet.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <pre>
   * The type of the generated tag snippets for tracking conversions.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.TrackingCodeTypeEnum.TrackingCodeType type = 1;</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * The type of the generated tag snippets for tracking conversions.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.TrackingCodeTypeEnum.TrackingCodeType type = 1;</code>
   */
  public com.google.ads.googleads.v3.enums.TrackingCodeTypeEnum.TrackingCodeType getType() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v3.enums.TrackingCodeTypeEnum.TrackingCodeType result = com.google.ads.googleads.v3.enums.TrackingCodeTypeEnum.TrackingCodeType.valueOf(type_);
    return result == null ? com.google.ads.googleads.v3.enums.TrackingCodeTypeEnum.TrackingCodeType.UNRECOGNIZED : result;
  }

  public static final int PAGE_FORMAT_FIELD_NUMBER = 2;
  private int pageFormat_;
  /**
   * <pre>
   * The format of the web page where the tracking tag and snippet will be
   * installed, e.g. HTML.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat page_format = 2;</code>
   */
  public int getPageFormatValue() {
    return pageFormat_;
  }
  /**
   * <pre>
   * The format of the web page where the tracking tag and snippet will be
   * installed, e.g. HTML.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat page_format = 2;</code>
   */
  public com.google.ads.googleads.v3.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat getPageFormat() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v3.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat result = com.google.ads.googleads.v3.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat.valueOf(pageFormat_);
    return result == null ? com.google.ads.googleads.v3.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat.UNRECOGNIZED : result;
  }

  public static final int GLOBAL_SITE_TAG_FIELD_NUMBER = 3;
  private com.google.protobuf.StringValue globalSiteTag_;
  /**
   * <pre>
   * The site tag that adds visitors to your basic remarketing lists and sets
   * new cookies on your domain.
   * </pre>
   *
   * <code>.google.protobuf.StringValue global_site_tag = 3;</code>
   */
  public boolean hasGlobalSiteTag() {
    return globalSiteTag_ != null;
  }
  /**
   * <pre>
   * The site tag that adds visitors to your basic remarketing lists and sets
   * new cookies on your domain.
   * </pre>
   *
   * <code>.google.protobuf.StringValue global_site_tag = 3;</code>
   */
  public com.google.protobuf.StringValue getGlobalSiteTag() {
    return globalSiteTag_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : globalSiteTag_;
  }
  /**
   * <pre>
   * The site tag that adds visitors to your basic remarketing lists and sets
   * new cookies on your domain.
   * </pre>
   *
   * <code>.google.protobuf.StringValue global_site_tag = 3;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getGlobalSiteTagOrBuilder() {
    return getGlobalSiteTag();
  }

  public static final int EVENT_SNIPPET_FIELD_NUMBER = 4;
  private com.google.protobuf.StringValue eventSnippet_;
  /**
   * <pre>
   * The event snippet that works with the site tag to track actions that
   * should be counted as conversions.
   * </pre>
   *
   * <code>.google.protobuf.StringValue event_snippet = 4;</code>
   */
  public boolean hasEventSnippet() {
    return eventSnippet_ != null;
  }
  /**
   * <pre>
   * The event snippet that works with the site tag to track actions that
   * should be counted as conversions.
   * </pre>
   *
   * <code>.google.protobuf.StringValue event_snippet = 4;</code>
   */
  public com.google.protobuf.StringValue getEventSnippet() {
    return eventSnippet_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : eventSnippet_;
  }
  /**
   * <pre>
   * The event snippet that works with the site tag to track actions that
   * should be counted as conversions.
   * </pre>
   *
   * <code>.google.protobuf.StringValue event_snippet = 4;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getEventSnippetOrBuilder() {
    return getEventSnippet();
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
    if (type_ != com.google.ads.googleads.v3.enums.TrackingCodeTypeEnum.TrackingCodeType.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (pageFormat_ != com.google.ads.googleads.v3.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat.UNSPECIFIED.getNumber()) {
      output.writeEnum(2, pageFormat_);
    }
    if (globalSiteTag_ != null) {
      output.writeMessage(3, getGlobalSiteTag());
    }
    if (eventSnippet_ != null) {
      output.writeMessage(4, getEventSnippet());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != com.google.ads.googleads.v3.enums.TrackingCodeTypeEnum.TrackingCodeType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (pageFormat_ != com.google.ads.googleads.v3.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, pageFormat_);
    }
    if (globalSiteTag_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getGlobalSiteTag());
    }
    if (eventSnippet_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getEventSnippet());
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
    if (!(obj instanceof com.google.ads.googleads.v3.common.TagSnippet)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v3.common.TagSnippet other = (com.google.ads.googleads.v3.common.TagSnippet) obj;

    if (type_ != other.type_) return false;
    if (pageFormat_ != other.pageFormat_) return false;
    if (hasGlobalSiteTag() != other.hasGlobalSiteTag()) return false;
    if (hasGlobalSiteTag()) {
      if (!getGlobalSiteTag()
          .equals(other.getGlobalSiteTag())) return false;
    }
    if (hasEventSnippet() != other.hasEventSnippet()) return false;
    if (hasEventSnippet()) {
      if (!getEventSnippet()
          .equals(other.getEventSnippet())) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + PAGE_FORMAT_FIELD_NUMBER;
    hash = (53 * hash) + pageFormat_;
    if (hasGlobalSiteTag()) {
      hash = (37 * hash) + GLOBAL_SITE_TAG_FIELD_NUMBER;
      hash = (53 * hash) + getGlobalSiteTag().hashCode();
    }
    if (hasEventSnippet()) {
      hash = (37 * hash) + EVENT_SNIPPET_FIELD_NUMBER;
      hash = (53 * hash) + getEventSnippet().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v3.common.TagSnippet parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.common.TagSnippet parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.common.TagSnippet parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.common.TagSnippet parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.common.TagSnippet parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.common.TagSnippet parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.common.TagSnippet parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.common.TagSnippet parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.common.TagSnippet parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.common.TagSnippet parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.common.TagSnippet parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.common.TagSnippet parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v3.common.TagSnippet prototype) {
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
   * The site tag and event snippet pair for a TrackingCodeType.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v3.common.TagSnippet}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v3.common.TagSnippet)
      com.google.ads.googleads.v3.common.TagSnippetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v3.common.TagSnippetProto.internal_static_google_ads_googleads_v3_common_TagSnippet_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v3.common.TagSnippetProto.internal_static_google_ads_googleads_v3_common_TagSnippet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v3.common.TagSnippet.class, com.google.ads.googleads.v3.common.TagSnippet.Builder.class);
    }

    // Construct using com.google.ads.googleads.v3.common.TagSnippet.newBuilder()
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
      type_ = 0;

      pageFormat_ = 0;

      if (globalSiteTagBuilder_ == null) {
        globalSiteTag_ = null;
      } else {
        globalSiteTag_ = null;
        globalSiteTagBuilder_ = null;
      }
      if (eventSnippetBuilder_ == null) {
        eventSnippet_ = null;
      } else {
        eventSnippet_ = null;
        eventSnippetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v3.common.TagSnippetProto.internal_static_google_ads_googleads_v3_common_TagSnippet_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.common.TagSnippet getDefaultInstanceForType() {
      return com.google.ads.googleads.v3.common.TagSnippet.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.common.TagSnippet build() {
      com.google.ads.googleads.v3.common.TagSnippet result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.common.TagSnippet buildPartial() {
      com.google.ads.googleads.v3.common.TagSnippet result = new com.google.ads.googleads.v3.common.TagSnippet(this);
      result.type_ = type_;
      result.pageFormat_ = pageFormat_;
      if (globalSiteTagBuilder_ == null) {
        result.globalSiteTag_ = globalSiteTag_;
      } else {
        result.globalSiteTag_ = globalSiteTagBuilder_.build();
      }
      if (eventSnippetBuilder_ == null) {
        result.eventSnippet_ = eventSnippet_;
      } else {
        result.eventSnippet_ = eventSnippetBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v3.common.TagSnippet) {
        return mergeFrom((com.google.ads.googleads.v3.common.TagSnippet)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v3.common.TagSnippet other) {
      if (other == com.google.ads.googleads.v3.common.TagSnippet.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.pageFormat_ != 0) {
        setPageFormatValue(other.getPageFormatValue());
      }
      if (other.hasGlobalSiteTag()) {
        mergeGlobalSiteTag(other.getGlobalSiteTag());
      }
      if (other.hasEventSnippet()) {
        mergeEventSnippet(other.getEventSnippet());
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
      com.google.ads.googleads.v3.common.TagSnippet parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v3.common.TagSnippet) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int type_ = 0;
    /**
     * <pre>
     * The type of the generated tag snippets for tracking conversions.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.enums.TrackingCodeTypeEnum.TrackingCodeType type = 1;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * The type of the generated tag snippets for tracking conversions.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.enums.TrackingCodeTypeEnum.TrackingCodeType type = 1;</code>
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of the generated tag snippets for tracking conversions.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.enums.TrackingCodeTypeEnum.TrackingCodeType type = 1;</code>
     */
    public com.google.ads.googleads.v3.enums.TrackingCodeTypeEnum.TrackingCodeType getType() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v3.enums.TrackingCodeTypeEnum.TrackingCodeType result = com.google.ads.googleads.v3.enums.TrackingCodeTypeEnum.TrackingCodeType.valueOf(type_);
      return result == null ? com.google.ads.googleads.v3.enums.TrackingCodeTypeEnum.TrackingCodeType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The type of the generated tag snippets for tracking conversions.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.enums.TrackingCodeTypeEnum.TrackingCodeType type = 1;</code>
     */
    public Builder setType(com.google.ads.googleads.v3.enums.TrackingCodeTypeEnum.TrackingCodeType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of the generated tag snippets for tracking conversions.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.enums.TrackingCodeTypeEnum.TrackingCodeType type = 1;</code>
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private int pageFormat_ = 0;
    /**
     * <pre>
     * The format of the web page where the tracking tag and snippet will be
     * installed, e.g. HTML.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat page_format = 2;</code>
     */
    public int getPageFormatValue() {
      return pageFormat_;
    }
    /**
     * <pre>
     * The format of the web page where the tracking tag and snippet will be
     * installed, e.g. HTML.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat page_format = 2;</code>
     */
    public Builder setPageFormatValue(int value) {
      pageFormat_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The format of the web page where the tracking tag and snippet will be
     * installed, e.g. HTML.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat page_format = 2;</code>
     */
    public com.google.ads.googleads.v3.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat getPageFormat() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v3.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat result = com.google.ads.googleads.v3.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat.valueOf(pageFormat_);
      return result == null ? com.google.ads.googleads.v3.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The format of the web page where the tracking tag and snippet will be
     * installed, e.g. HTML.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat page_format = 2;</code>
     */
    public Builder setPageFormat(com.google.ads.googleads.v3.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      pageFormat_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The format of the web page where the tracking tag and snippet will be
     * installed, e.g. HTML.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat page_format = 2;</code>
     */
    public Builder clearPageFormat() {
      
      pageFormat_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.StringValue globalSiteTag_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> globalSiteTagBuilder_;
    /**
     * <pre>
     * The site tag that adds visitors to your basic remarketing lists and sets
     * new cookies on your domain.
     * </pre>
     *
     * <code>.google.protobuf.StringValue global_site_tag = 3;</code>
     */
    public boolean hasGlobalSiteTag() {
      return globalSiteTagBuilder_ != null || globalSiteTag_ != null;
    }
    /**
     * <pre>
     * The site tag that adds visitors to your basic remarketing lists and sets
     * new cookies on your domain.
     * </pre>
     *
     * <code>.google.protobuf.StringValue global_site_tag = 3;</code>
     */
    public com.google.protobuf.StringValue getGlobalSiteTag() {
      if (globalSiteTagBuilder_ == null) {
        return globalSiteTag_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : globalSiteTag_;
      } else {
        return globalSiteTagBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The site tag that adds visitors to your basic remarketing lists and sets
     * new cookies on your domain.
     * </pre>
     *
     * <code>.google.protobuf.StringValue global_site_tag = 3;</code>
     */
    public Builder setGlobalSiteTag(com.google.protobuf.StringValue value) {
      if (globalSiteTagBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        globalSiteTag_ = value;
        onChanged();
      } else {
        globalSiteTagBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The site tag that adds visitors to your basic remarketing lists and sets
     * new cookies on your domain.
     * </pre>
     *
     * <code>.google.protobuf.StringValue global_site_tag = 3;</code>
     */
    public Builder setGlobalSiteTag(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (globalSiteTagBuilder_ == null) {
        globalSiteTag_ = builderForValue.build();
        onChanged();
      } else {
        globalSiteTagBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The site tag that adds visitors to your basic remarketing lists and sets
     * new cookies on your domain.
     * </pre>
     *
     * <code>.google.protobuf.StringValue global_site_tag = 3;</code>
     */
    public Builder mergeGlobalSiteTag(com.google.protobuf.StringValue value) {
      if (globalSiteTagBuilder_ == null) {
        if (globalSiteTag_ != null) {
          globalSiteTag_ =
            com.google.protobuf.StringValue.newBuilder(globalSiteTag_).mergeFrom(value).buildPartial();
        } else {
          globalSiteTag_ = value;
        }
        onChanged();
      } else {
        globalSiteTagBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The site tag that adds visitors to your basic remarketing lists and sets
     * new cookies on your domain.
     * </pre>
     *
     * <code>.google.protobuf.StringValue global_site_tag = 3;</code>
     */
    public Builder clearGlobalSiteTag() {
      if (globalSiteTagBuilder_ == null) {
        globalSiteTag_ = null;
        onChanged();
      } else {
        globalSiteTag_ = null;
        globalSiteTagBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The site tag that adds visitors to your basic remarketing lists and sets
     * new cookies on your domain.
     * </pre>
     *
     * <code>.google.protobuf.StringValue global_site_tag = 3;</code>
     */
    public com.google.protobuf.StringValue.Builder getGlobalSiteTagBuilder() {
      
      onChanged();
      return getGlobalSiteTagFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The site tag that adds visitors to your basic remarketing lists and sets
     * new cookies on your domain.
     * </pre>
     *
     * <code>.google.protobuf.StringValue global_site_tag = 3;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getGlobalSiteTagOrBuilder() {
      if (globalSiteTagBuilder_ != null) {
        return globalSiteTagBuilder_.getMessageOrBuilder();
      } else {
        return globalSiteTag_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : globalSiteTag_;
      }
    }
    /**
     * <pre>
     * The site tag that adds visitors to your basic remarketing lists and sets
     * new cookies on your domain.
     * </pre>
     *
     * <code>.google.protobuf.StringValue global_site_tag = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getGlobalSiteTagFieldBuilder() {
      if (globalSiteTagBuilder_ == null) {
        globalSiteTagBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getGlobalSiteTag(),
                getParentForChildren(),
                isClean());
        globalSiteTag_ = null;
      }
      return globalSiteTagBuilder_;
    }

    private com.google.protobuf.StringValue eventSnippet_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> eventSnippetBuilder_;
    /**
     * <pre>
     * The event snippet that works with the site tag to track actions that
     * should be counted as conversions.
     * </pre>
     *
     * <code>.google.protobuf.StringValue event_snippet = 4;</code>
     */
    public boolean hasEventSnippet() {
      return eventSnippetBuilder_ != null || eventSnippet_ != null;
    }
    /**
     * <pre>
     * The event snippet that works with the site tag to track actions that
     * should be counted as conversions.
     * </pre>
     *
     * <code>.google.protobuf.StringValue event_snippet = 4;</code>
     */
    public com.google.protobuf.StringValue getEventSnippet() {
      if (eventSnippetBuilder_ == null) {
        return eventSnippet_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : eventSnippet_;
      } else {
        return eventSnippetBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The event snippet that works with the site tag to track actions that
     * should be counted as conversions.
     * </pre>
     *
     * <code>.google.protobuf.StringValue event_snippet = 4;</code>
     */
    public Builder setEventSnippet(com.google.protobuf.StringValue value) {
      if (eventSnippetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        eventSnippet_ = value;
        onChanged();
      } else {
        eventSnippetBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The event snippet that works with the site tag to track actions that
     * should be counted as conversions.
     * </pre>
     *
     * <code>.google.protobuf.StringValue event_snippet = 4;</code>
     */
    public Builder setEventSnippet(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (eventSnippetBuilder_ == null) {
        eventSnippet_ = builderForValue.build();
        onChanged();
      } else {
        eventSnippetBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The event snippet that works with the site tag to track actions that
     * should be counted as conversions.
     * </pre>
     *
     * <code>.google.protobuf.StringValue event_snippet = 4;</code>
     */
    public Builder mergeEventSnippet(com.google.protobuf.StringValue value) {
      if (eventSnippetBuilder_ == null) {
        if (eventSnippet_ != null) {
          eventSnippet_ =
            com.google.protobuf.StringValue.newBuilder(eventSnippet_).mergeFrom(value).buildPartial();
        } else {
          eventSnippet_ = value;
        }
        onChanged();
      } else {
        eventSnippetBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The event snippet that works with the site tag to track actions that
     * should be counted as conversions.
     * </pre>
     *
     * <code>.google.protobuf.StringValue event_snippet = 4;</code>
     */
    public Builder clearEventSnippet() {
      if (eventSnippetBuilder_ == null) {
        eventSnippet_ = null;
        onChanged();
      } else {
        eventSnippet_ = null;
        eventSnippetBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The event snippet that works with the site tag to track actions that
     * should be counted as conversions.
     * </pre>
     *
     * <code>.google.protobuf.StringValue event_snippet = 4;</code>
     */
    public com.google.protobuf.StringValue.Builder getEventSnippetBuilder() {
      
      onChanged();
      return getEventSnippetFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The event snippet that works with the site tag to track actions that
     * should be counted as conversions.
     * </pre>
     *
     * <code>.google.protobuf.StringValue event_snippet = 4;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getEventSnippetOrBuilder() {
      if (eventSnippetBuilder_ != null) {
        return eventSnippetBuilder_.getMessageOrBuilder();
      } else {
        return eventSnippet_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : eventSnippet_;
      }
    }
    /**
     * <pre>
     * The event snippet that works with the site tag to track actions that
     * should be counted as conversions.
     * </pre>
     *
     * <code>.google.protobuf.StringValue event_snippet = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getEventSnippetFieldBuilder() {
      if (eventSnippetBuilder_ == null) {
        eventSnippetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getEventSnippet(),
                getParentForChildren(),
                isClean());
        eventSnippet_ = null;
      }
      return eventSnippetBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v3.common.TagSnippet)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v3.common.TagSnippet)
  private static final com.google.ads.googleads.v3.common.TagSnippet DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v3.common.TagSnippet();
  }

  public static com.google.ads.googleads.v3.common.TagSnippet getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TagSnippet>
      PARSER = new com.google.protobuf.AbstractParser<TagSnippet>() {
    @java.lang.Override
    public TagSnippet parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TagSnippet(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TagSnippet> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TagSnippet> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v3.common.TagSnippet getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

