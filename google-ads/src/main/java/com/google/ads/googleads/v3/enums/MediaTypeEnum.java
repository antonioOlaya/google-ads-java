// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/enums/media_type.proto

package com.google.ads.googleads.v3.enums;

/**
 * <pre>
 * Container for enum describing the types of media.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v3.enums.MediaTypeEnum}
 */
public  final class MediaTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v3.enums.MediaTypeEnum)
    MediaTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MediaTypeEnum.newBuilder() to construct.
  private MediaTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MediaTypeEnum() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MediaTypeEnum(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
    return com.google.ads.googleads.v3.enums.MediaTypeProto.internal_static_google_ads_googleads_v3_enums_MediaTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v3.enums.MediaTypeProto.internal_static_google_ads_googleads_v3_enums_MediaTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v3.enums.MediaTypeEnum.class, com.google.ads.googleads.v3.enums.MediaTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * The type of media.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v3.enums.MediaTypeEnum.MediaType}
   */
  public enum MediaType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * The media type has not been specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received value is not known in this version.
     * This is a response-only value.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Static image, used for image ad.
     * </pre>
     *
     * <code>IMAGE = 2;</code>
     */
    IMAGE(2),
    /**
     * <pre>
     * Small image, used for map ad.
     * </pre>
     *
     * <code>ICON = 3;</code>
     */
    ICON(3),
    /**
     * <pre>
     * ZIP file, used in fields of template ads.
     * </pre>
     *
     * <code>MEDIA_BUNDLE = 4;</code>
     */
    MEDIA_BUNDLE(4),
    /**
     * <pre>
     * Audio file.
     * </pre>
     *
     * <code>AUDIO = 5;</code>
     */
    AUDIO(5),
    /**
     * <pre>
     * Video file.
     * </pre>
     *
     * <code>VIDEO = 6;</code>
     */
    VIDEO(6),
    /**
     * <pre>
     * Animated image, such as animated GIF.
     * </pre>
     *
     * <code>DYNAMIC_IMAGE = 7;</code>
     */
    DYNAMIC_IMAGE(7),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * The media type has not been specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received value is not known in this version.
     * This is a response-only value.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Static image, used for image ad.
     * </pre>
     *
     * <code>IMAGE = 2;</code>
     */
    public static final int IMAGE_VALUE = 2;
    /**
     * <pre>
     * Small image, used for map ad.
     * </pre>
     *
     * <code>ICON = 3;</code>
     */
    public static final int ICON_VALUE = 3;
    /**
     * <pre>
     * ZIP file, used in fields of template ads.
     * </pre>
     *
     * <code>MEDIA_BUNDLE = 4;</code>
     */
    public static final int MEDIA_BUNDLE_VALUE = 4;
    /**
     * <pre>
     * Audio file.
     * </pre>
     *
     * <code>AUDIO = 5;</code>
     */
    public static final int AUDIO_VALUE = 5;
    /**
     * <pre>
     * Video file.
     * </pre>
     *
     * <code>VIDEO = 6;</code>
     */
    public static final int VIDEO_VALUE = 6;
    /**
     * <pre>
     * Animated image, such as animated GIF.
     * </pre>
     *
     * <code>DYNAMIC_IMAGE = 7;</code>
     */
    public static final int DYNAMIC_IMAGE_VALUE = 7;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MediaType valueOf(int value) {
      return forNumber(value);
    }

    public static MediaType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return IMAGE;
        case 3: return ICON;
        case 4: return MEDIA_BUNDLE;
        case 5: return AUDIO;
        case 6: return VIDEO;
        case 7: return DYNAMIC_IMAGE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MediaType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MediaType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MediaType>() {
            public MediaType findValueByNumber(int number) {
              return MediaType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v3.enums.MediaTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final MediaType[] VALUES = values();

    public static MediaType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private MediaType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v3.enums.MediaTypeEnum.MediaType)
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
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v3.enums.MediaTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v3.enums.MediaTypeEnum other = (com.google.ads.googleads.v3.enums.MediaTypeEnum) obj;

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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v3.enums.MediaTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.enums.MediaTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.enums.MediaTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.enums.MediaTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.enums.MediaTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.enums.MediaTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.enums.MediaTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.enums.MediaTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.enums.MediaTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.enums.MediaTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.enums.MediaTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.enums.MediaTypeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v3.enums.MediaTypeEnum prototype) {
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
   * Container for enum describing the types of media.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v3.enums.MediaTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v3.enums.MediaTypeEnum)
      com.google.ads.googleads.v3.enums.MediaTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v3.enums.MediaTypeProto.internal_static_google_ads_googleads_v3_enums_MediaTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v3.enums.MediaTypeProto.internal_static_google_ads_googleads_v3_enums_MediaTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v3.enums.MediaTypeEnum.class, com.google.ads.googleads.v3.enums.MediaTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v3.enums.MediaTypeEnum.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v3.enums.MediaTypeProto.internal_static_google_ads_googleads_v3_enums_MediaTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.enums.MediaTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v3.enums.MediaTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.enums.MediaTypeEnum build() {
      com.google.ads.googleads.v3.enums.MediaTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.enums.MediaTypeEnum buildPartial() {
      com.google.ads.googleads.v3.enums.MediaTypeEnum result = new com.google.ads.googleads.v3.enums.MediaTypeEnum(this);
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
      if (other instanceof com.google.ads.googleads.v3.enums.MediaTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v3.enums.MediaTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v3.enums.MediaTypeEnum other) {
      if (other == com.google.ads.googleads.v3.enums.MediaTypeEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v3.enums.MediaTypeEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v3.enums.MediaTypeEnum) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v3.enums.MediaTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v3.enums.MediaTypeEnum)
  private static final com.google.ads.googleads.v3.enums.MediaTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v3.enums.MediaTypeEnum();
  }

  public static com.google.ads.googleads.v3.enums.MediaTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MediaTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<MediaTypeEnum>() {
    @java.lang.Override
    public MediaTypeEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MediaTypeEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MediaTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MediaTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v3.enums.MediaTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

