// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/enums/product_custom_attribute_index.proto

package com.google.ads.googleads.v3.enums;

/**
 * <pre>
 * Container for enum describing the index of the product custom attribute.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum}
 */
public  final class ProductCustomAttributeIndexEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum)
    ProductCustomAttributeIndexEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProductCustomAttributeIndexEnum.newBuilder() to construct.
  private ProductCustomAttributeIndexEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductCustomAttributeIndexEnum() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProductCustomAttributeIndexEnum(
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
    return com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexProto.internal_static_google_ads_googleads_v3_enums_ProductCustomAttributeIndexEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexProto.internal_static_google_ads_googleads_v3_enums_ProductCustomAttributeIndexEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum.class, com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum.Builder.class);
  }

  /**
   * <pre>
   * The index of the product custom attribute.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum.ProductCustomAttributeIndex}
   */
  public enum ProductCustomAttributeIndex
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * First product custom attribute.
     * </pre>
     *
     * <code>INDEX0 = 7;</code>
     */
    INDEX0(7),
    /**
     * <pre>
     * Second product custom attribute.
     * </pre>
     *
     * <code>INDEX1 = 8;</code>
     */
    INDEX1(8),
    /**
     * <pre>
     * Third product custom attribute.
     * </pre>
     *
     * <code>INDEX2 = 9;</code>
     */
    INDEX2(9),
    /**
     * <pre>
     * Fourth product custom attribute.
     * </pre>
     *
     * <code>INDEX3 = 10;</code>
     */
    INDEX3(10),
    /**
     * <pre>
     * Fifth product custom attribute.
     * </pre>
     *
     * <code>INDEX4 = 11;</code>
     */
    INDEX4(11),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * First product custom attribute.
     * </pre>
     *
     * <code>INDEX0 = 7;</code>
     */
    public static final int INDEX0_VALUE = 7;
    /**
     * <pre>
     * Second product custom attribute.
     * </pre>
     *
     * <code>INDEX1 = 8;</code>
     */
    public static final int INDEX1_VALUE = 8;
    /**
     * <pre>
     * Third product custom attribute.
     * </pre>
     *
     * <code>INDEX2 = 9;</code>
     */
    public static final int INDEX2_VALUE = 9;
    /**
     * <pre>
     * Fourth product custom attribute.
     * </pre>
     *
     * <code>INDEX3 = 10;</code>
     */
    public static final int INDEX3_VALUE = 10;
    /**
     * <pre>
     * Fifth product custom attribute.
     * </pre>
     *
     * <code>INDEX4 = 11;</code>
     */
    public static final int INDEX4_VALUE = 11;


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
    public static ProductCustomAttributeIndex valueOf(int value) {
      return forNumber(value);
    }

    public static ProductCustomAttributeIndex forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 7: return INDEX0;
        case 8: return INDEX1;
        case 9: return INDEX2;
        case 10: return INDEX3;
        case 11: return INDEX4;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ProductCustomAttributeIndex>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ProductCustomAttributeIndex> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ProductCustomAttributeIndex>() {
            public ProductCustomAttributeIndex findValueByNumber(int number) {
              return ProductCustomAttributeIndex.forNumber(number);
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
      return com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final ProductCustomAttributeIndex[] VALUES = values();

    public static ProductCustomAttributeIndex valueOf(
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

    private ProductCustomAttributeIndex(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum.ProductCustomAttributeIndex)
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
    if (!(obj instanceof com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum other = (com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum) obj;

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

  public static com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum prototype) {
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
   * Container for enum describing the index of the product custom attribute.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum)
      com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexProto.internal_static_google_ads_googleads_v3_enums_ProductCustomAttributeIndexEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexProto.internal_static_google_ads_googleads_v3_enums_ProductCustomAttributeIndexEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum.class, com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum.newBuilder()
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
      return com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexProto.internal_static_google_ads_googleads_v3_enums_ProductCustomAttributeIndexEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum build() {
      com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum buildPartial() {
      com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum result = new com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum(this);
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
      if (other instanceof com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum) {
        return mergeFrom((com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum other) {
      if (other == com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum)
  private static final com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum();
  }

  public static com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductCustomAttributeIndexEnum>
      PARSER = new com.google.protobuf.AbstractParser<ProductCustomAttributeIndexEnum>() {
    @java.lang.Override
    public ProductCustomAttributeIndexEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProductCustomAttributeIndexEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProductCustomAttributeIndexEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductCustomAttributeIndexEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

