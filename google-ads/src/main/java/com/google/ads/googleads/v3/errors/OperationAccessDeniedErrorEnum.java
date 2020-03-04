// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/errors/operation_access_denied_error.proto

package com.google.ads.googleads.v3.errors;

/**
 * <pre>
 * Container for enum describing possible operation access denied errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum}
 */
public  final class OperationAccessDeniedErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum)
    OperationAccessDeniedErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OperationAccessDeniedErrorEnum.newBuilder() to construct.
  private OperationAccessDeniedErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OperationAccessDeniedErrorEnum() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OperationAccessDeniedErrorEnum(
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
    return com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorProto.internal_static_google_ads_googleads_v3_errors_OperationAccessDeniedErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorProto.internal_static_google_ads_googleads_v3_errors_OperationAccessDeniedErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum.class, com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible operation access denied errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum.OperationAccessDeniedError}
   */
  public enum OperationAccessDeniedError
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Unauthorized invocation of a service's method (get, mutate, etc.)
     * </pre>
     *
     * <code>ACTION_NOT_PERMITTED = 2;</code>
     */
    ACTION_NOT_PERMITTED(2),
    /**
     * <pre>
     * Unauthorized CREATE operation in invoking a service's mutate method.
     * </pre>
     *
     * <code>CREATE_OPERATION_NOT_PERMITTED = 3;</code>
     */
    CREATE_OPERATION_NOT_PERMITTED(3),
    /**
     * <pre>
     * Unauthorized REMOVE operation in invoking a service's mutate method.
     * </pre>
     *
     * <code>REMOVE_OPERATION_NOT_PERMITTED = 4;</code>
     */
    REMOVE_OPERATION_NOT_PERMITTED(4),
    /**
     * <pre>
     * Unauthorized UPDATE operation in invoking a service's mutate method.
     * </pre>
     *
     * <code>UPDATE_OPERATION_NOT_PERMITTED = 5;</code>
     */
    UPDATE_OPERATION_NOT_PERMITTED(5),
    /**
     * <pre>
     * A mutate action is not allowed on this campaign, from this client.
     * </pre>
     *
     * <code>MUTATE_ACTION_NOT_PERMITTED_FOR_CLIENT = 6;</code>
     */
    MUTATE_ACTION_NOT_PERMITTED_FOR_CLIENT(6),
    /**
     * <pre>
     * This operation is not permitted on this campaign type
     * </pre>
     *
     * <code>OPERATION_NOT_PERMITTED_FOR_CAMPAIGN_TYPE = 7;</code>
     */
    OPERATION_NOT_PERMITTED_FOR_CAMPAIGN_TYPE(7),
    /**
     * <pre>
     * A CREATE operation may not set status to REMOVED.
     * </pre>
     *
     * <code>CREATE_AS_REMOVED_NOT_PERMITTED = 8;</code>
     */
    CREATE_AS_REMOVED_NOT_PERMITTED(8),
    /**
     * <pre>
     * This operation is not allowed because the campaign or adgroup is removed.
     * </pre>
     *
     * <code>OPERATION_NOT_PERMITTED_FOR_REMOVED_RESOURCE = 9;</code>
     */
    OPERATION_NOT_PERMITTED_FOR_REMOVED_RESOURCE(9),
    /**
     * <pre>
     * This operation is not permitted on this ad group type.
     * </pre>
     *
     * <code>OPERATION_NOT_PERMITTED_FOR_AD_GROUP_TYPE = 10;</code>
     */
    OPERATION_NOT_PERMITTED_FOR_AD_GROUP_TYPE(10),
    /**
     * <pre>
     * The mutate is not allowed for this customer.
     * </pre>
     *
     * <code>MUTATE_NOT_PERMITTED_FOR_CUSTOMER = 11;</code>
     */
    MUTATE_NOT_PERMITTED_FOR_CUSTOMER(11),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Unauthorized invocation of a service's method (get, mutate, etc.)
     * </pre>
     *
     * <code>ACTION_NOT_PERMITTED = 2;</code>
     */
    public static final int ACTION_NOT_PERMITTED_VALUE = 2;
    /**
     * <pre>
     * Unauthorized CREATE operation in invoking a service's mutate method.
     * </pre>
     *
     * <code>CREATE_OPERATION_NOT_PERMITTED = 3;</code>
     */
    public static final int CREATE_OPERATION_NOT_PERMITTED_VALUE = 3;
    /**
     * <pre>
     * Unauthorized REMOVE operation in invoking a service's mutate method.
     * </pre>
     *
     * <code>REMOVE_OPERATION_NOT_PERMITTED = 4;</code>
     */
    public static final int REMOVE_OPERATION_NOT_PERMITTED_VALUE = 4;
    /**
     * <pre>
     * Unauthorized UPDATE operation in invoking a service's mutate method.
     * </pre>
     *
     * <code>UPDATE_OPERATION_NOT_PERMITTED = 5;</code>
     */
    public static final int UPDATE_OPERATION_NOT_PERMITTED_VALUE = 5;
    /**
     * <pre>
     * A mutate action is not allowed on this campaign, from this client.
     * </pre>
     *
     * <code>MUTATE_ACTION_NOT_PERMITTED_FOR_CLIENT = 6;</code>
     */
    public static final int MUTATE_ACTION_NOT_PERMITTED_FOR_CLIENT_VALUE = 6;
    /**
     * <pre>
     * This operation is not permitted on this campaign type
     * </pre>
     *
     * <code>OPERATION_NOT_PERMITTED_FOR_CAMPAIGN_TYPE = 7;</code>
     */
    public static final int OPERATION_NOT_PERMITTED_FOR_CAMPAIGN_TYPE_VALUE = 7;
    /**
     * <pre>
     * A CREATE operation may not set status to REMOVED.
     * </pre>
     *
     * <code>CREATE_AS_REMOVED_NOT_PERMITTED = 8;</code>
     */
    public static final int CREATE_AS_REMOVED_NOT_PERMITTED_VALUE = 8;
    /**
     * <pre>
     * This operation is not allowed because the campaign or adgroup is removed.
     * </pre>
     *
     * <code>OPERATION_NOT_PERMITTED_FOR_REMOVED_RESOURCE = 9;</code>
     */
    public static final int OPERATION_NOT_PERMITTED_FOR_REMOVED_RESOURCE_VALUE = 9;
    /**
     * <pre>
     * This operation is not permitted on this ad group type.
     * </pre>
     *
     * <code>OPERATION_NOT_PERMITTED_FOR_AD_GROUP_TYPE = 10;</code>
     */
    public static final int OPERATION_NOT_PERMITTED_FOR_AD_GROUP_TYPE_VALUE = 10;
    /**
     * <pre>
     * The mutate is not allowed for this customer.
     * </pre>
     *
     * <code>MUTATE_NOT_PERMITTED_FOR_CUSTOMER = 11;</code>
     */
    public static final int MUTATE_NOT_PERMITTED_FOR_CUSTOMER_VALUE = 11;


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
    public static OperationAccessDeniedError valueOf(int value) {
      return forNumber(value);
    }

    public static OperationAccessDeniedError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return ACTION_NOT_PERMITTED;
        case 3: return CREATE_OPERATION_NOT_PERMITTED;
        case 4: return REMOVE_OPERATION_NOT_PERMITTED;
        case 5: return UPDATE_OPERATION_NOT_PERMITTED;
        case 6: return MUTATE_ACTION_NOT_PERMITTED_FOR_CLIENT;
        case 7: return OPERATION_NOT_PERMITTED_FOR_CAMPAIGN_TYPE;
        case 8: return CREATE_AS_REMOVED_NOT_PERMITTED;
        case 9: return OPERATION_NOT_PERMITTED_FOR_REMOVED_RESOURCE;
        case 10: return OPERATION_NOT_PERMITTED_FOR_AD_GROUP_TYPE;
        case 11: return MUTATE_NOT_PERMITTED_FOR_CUSTOMER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<OperationAccessDeniedError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        OperationAccessDeniedError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<OperationAccessDeniedError>() {
            public OperationAccessDeniedError findValueByNumber(int number) {
              return OperationAccessDeniedError.forNumber(number);
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
      return com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final OperationAccessDeniedError[] VALUES = values();

    public static OperationAccessDeniedError valueOf(
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

    private OperationAccessDeniedError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum.OperationAccessDeniedError)
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
    if (!(obj instanceof com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum other = (com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum) obj;

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

  public static com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum prototype) {
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
   * Container for enum describing possible operation access denied errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum)
      com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorProto.internal_static_google_ads_googleads_v3_errors_OperationAccessDeniedErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorProto.internal_static_google_ads_googleads_v3_errors_OperationAccessDeniedErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum.class, com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorProto.internal_static_google_ads_googleads_v3_errors_OperationAccessDeniedErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum build() {
      com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum buildPartial() {
      com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum result = new com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum other) {
      if (other == com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum)
  private static final com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum();
  }

  public static com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OperationAccessDeniedErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<OperationAccessDeniedErrorEnum>() {
    @java.lang.Override
    public OperationAccessDeniedErrorEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OperationAccessDeniedErrorEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OperationAccessDeniedErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OperationAccessDeniedErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v3.errors.OperationAccessDeniedErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

