// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/errors/authentication_error.proto

package com.google.ads.googleads.v3.errors;

/**
 * <pre>
 * Container for enum describing possible authentication errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v3.errors.AuthenticationErrorEnum}
 */
public  final class AuthenticationErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v3.errors.AuthenticationErrorEnum)
    AuthenticationErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AuthenticationErrorEnum.newBuilder() to construct.
  private AuthenticationErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AuthenticationErrorEnum() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AuthenticationErrorEnum(
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
    return com.google.ads.googleads.v3.errors.AuthenticationErrorProto.internal_static_google_ads_googleads_v3_errors_AuthenticationErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v3.errors.AuthenticationErrorProto.internal_static_google_ads_googleads_v3_errors_AuthenticationErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v3.errors.AuthenticationErrorEnum.class, com.google.ads.googleads.v3.errors.AuthenticationErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible authentication errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v3.errors.AuthenticationErrorEnum.AuthenticationError}
   */
  public enum AuthenticationError
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
     * Authentication of the request failed.
     * </pre>
     *
     * <code>AUTHENTICATION_ERROR = 2;</code>
     */
    AUTHENTICATION_ERROR(2),
    /**
     * <pre>
     * Client Customer Id is not a number.
     * </pre>
     *
     * <code>CLIENT_CUSTOMER_ID_INVALID = 5;</code>
     */
    CLIENT_CUSTOMER_ID_INVALID(5),
    /**
     * <pre>
     * No customer found for the provided customer id.
     * </pre>
     *
     * <code>CUSTOMER_NOT_FOUND = 8;</code>
     */
    CUSTOMER_NOT_FOUND(8),
    /**
     * <pre>
     * Client's Google Account is deleted.
     * </pre>
     *
     * <code>GOOGLE_ACCOUNT_DELETED = 9;</code>
     */
    GOOGLE_ACCOUNT_DELETED(9),
    /**
     * <pre>
     * Google account login token in the cookie is invalid.
     * </pre>
     *
     * <code>GOOGLE_ACCOUNT_COOKIE_INVALID = 10;</code>
     */
    GOOGLE_ACCOUNT_COOKIE_INVALID(10),
    /**
     * <pre>
     * A problem occurred during Google account authentication.
     * </pre>
     *
     * <code>GOOGLE_ACCOUNT_AUTHENTICATION_FAILED = 25;</code>
     */
    GOOGLE_ACCOUNT_AUTHENTICATION_FAILED(25),
    /**
     * <pre>
     * The user in the google account login token does not match the UserId in
     * the cookie.
     * </pre>
     *
     * <code>GOOGLE_ACCOUNT_USER_AND_ADS_USER_MISMATCH = 12;</code>
     */
    GOOGLE_ACCOUNT_USER_AND_ADS_USER_MISMATCH(12),
    /**
     * <pre>
     * Login cookie is required for authentication.
     * </pre>
     *
     * <code>LOGIN_COOKIE_REQUIRED = 13;</code>
     */
    LOGIN_COOKIE_REQUIRED(13),
    /**
     * <pre>
     * User in the cookie is not a valid Ads user.
     * </pre>
     *
     * <code>NOT_ADS_USER = 14;</code>
     */
    NOT_ADS_USER(14),
    /**
     * <pre>
     * Oauth token in the header is not valid.
     * </pre>
     *
     * <code>OAUTH_TOKEN_INVALID = 15;</code>
     */
    OAUTH_TOKEN_INVALID(15),
    /**
     * <pre>
     * Oauth token in the header has expired.
     * </pre>
     *
     * <code>OAUTH_TOKEN_EXPIRED = 16;</code>
     */
    OAUTH_TOKEN_EXPIRED(16),
    /**
     * <pre>
     * Oauth token in the header has been disabled.
     * </pre>
     *
     * <code>OAUTH_TOKEN_DISABLED = 17;</code>
     */
    OAUTH_TOKEN_DISABLED(17),
    /**
     * <pre>
     * Oauth token in the header has been revoked.
     * </pre>
     *
     * <code>OAUTH_TOKEN_REVOKED = 18;</code>
     */
    OAUTH_TOKEN_REVOKED(18),
    /**
     * <pre>
     * Oauth token HTTP header is malformed.
     * </pre>
     *
     * <code>OAUTH_TOKEN_HEADER_INVALID = 19;</code>
     */
    OAUTH_TOKEN_HEADER_INVALID(19),
    /**
     * <pre>
     * Login cookie is not valid.
     * </pre>
     *
     * <code>LOGIN_COOKIE_INVALID = 20;</code>
     */
    LOGIN_COOKIE_INVALID(20),
    /**
     * <pre>
     * User Id in the header is not a valid id.
     * </pre>
     *
     * <code>USER_ID_INVALID = 22;</code>
     */
    USER_ID_INVALID(22),
    /**
     * <pre>
     * An account administrator changed this account's authentication settings.
     * To access this Google Ads account, enable 2-Step Verification in your
     * Google account at https://www.google.com/landing/2step.
     * </pre>
     *
     * <code>TWO_STEP_VERIFICATION_NOT_ENROLLED = 23;</code>
     */
    TWO_STEP_VERIFICATION_NOT_ENROLLED(23),
    /**
     * <pre>
     * An account administrator changed this account's authentication settings.
     * To access this Google Ads account, enable Advanced Protection in your
     * Google account at https://landing.google.com/advancedprotection.
     * </pre>
     *
     * <code>ADVANCED_PROTECTION_NOT_ENROLLED = 24;</code>
     */
    ADVANCED_PROTECTION_NOT_ENROLLED(24),
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
     * Authentication of the request failed.
     * </pre>
     *
     * <code>AUTHENTICATION_ERROR = 2;</code>
     */
    public static final int AUTHENTICATION_ERROR_VALUE = 2;
    /**
     * <pre>
     * Client Customer Id is not a number.
     * </pre>
     *
     * <code>CLIENT_CUSTOMER_ID_INVALID = 5;</code>
     */
    public static final int CLIENT_CUSTOMER_ID_INVALID_VALUE = 5;
    /**
     * <pre>
     * No customer found for the provided customer id.
     * </pre>
     *
     * <code>CUSTOMER_NOT_FOUND = 8;</code>
     */
    public static final int CUSTOMER_NOT_FOUND_VALUE = 8;
    /**
     * <pre>
     * Client's Google Account is deleted.
     * </pre>
     *
     * <code>GOOGLE_ACCOUNT_DELETED = 9;</code>
     */
    public static final int GOOGLE_ACCOUNT_DELETED_VALUE = 9;
    /**
     * <pre>
     * Google account login token in the cookie is invalid.
     * </pre>
     *
     * <code>GOOGLE_ACCOUNT_COOKIE_INVALID = 10;</code>
     */
    public static final int GOOGLE_ACCOUNT_COOKIE_INVALID_VALUE = 10;
    /**
     * <pre>
     * A problem occurred during Google account authentication.
     * </pre>
     *
     * <code>GOOGLE_ACCOUNT_AUTHENTICATION_FAILED = 25;</code>
     */
    public static final int GOOGLE_ACCOUNT_AUTHENTICATION_FAILED_VALUE = 25;
    /**
     * <pre>
     * The user in the google account login token does not match the UserId in
     * the cookie.
     * </pre>
     *
     * <code>GOOGLE_ACCOUNT_USER_AND_ADS_USER_MISMATCH = 12;</code>
     */
    public static final int GOOGLE_ACCOUNT_USER_AND_ADS_USER_MISMATCH_VALUE = 12;
    /**
     * <pre>
     * Login cookie is required for authentication.
     * </pre>
     *
     * <code>LOGIN_COOKIE_REQUIRED = 13;</code>
     */
    public static final int LOGIN_COOKIE_REQUIRED_VALUE = 13;
    /**
     * <pre>
     * User in the cookie is not a valid Ads user.
     * </pre>
     *
     * <code>NOT_ADS_USER = 14;</code>
     */
    public static final int NOT_ADS_USER_VALUE = 14;
    /**
     * <pre>
     * Oauth token in the header is not valid.
     * </pre>
     *
     * <code>OAUTH_TOKEN_INVALID = 15;</code>
     */
    public static final int OAUTH_TOKEN_INVALID_VALUE = 15;
    /**
     * <pre>
     * Oauth token in the header has expired.
     * </pre>
     *
     * <code>OAUTH_TOKEN_EXPIRED = 16;</code>
     */
    public static final int OAUTH_TOKEN_EXPIRED_VALUE = 16;
    /**
     * <pre>
     * Oauth token in the header has been disabled.
     * </pre>
     *
     * <code>OAUTH_TOKEN_DISABLED = 17;</code>
     */
    public static final int OAUTH_TOKEN_DISABLED_VALUE = 17;
    /**
     * <pre>
     * Oauth token in the header has been revoked.
     * </pre>
     *
     * <code>OAUTH_TOKEN_REVOKED = 18;</code>
     */
    public static final int OAUTH_TOKEN_REVOKED_VALUE = 18;
    /**
     * <pre>
     * Oauth token HTTP header is malformed.
     * </pre>
     *
     * <code>OAUTH_TOKEN_HEADER_INVALID = 19;</code>
     */
    public static final int OAUTH_TOKEN_HEADER_INVALID_VALUE = 19;
    /**
     * <pre>
     * Login cookie is not valid.
     * </pre>
     *
     * <code>LOGIN_COOKIE_INVALID = 20;</code>
     */
    public static final int LOGIN_COOKIE_INVALID_VALUE = 20;
    /**
     * <pre>
     * User Id in the header is not a valid id.
     * </pre>
     *
     * <code>USER_ID_INVALID = 22;</code>
     */
    public static final int USER_ID_INVALID_VALUE = 22;
    /**
     * <pre>
     * An account administrator changed this account's authentication settings.
     * To access this Google Ads account, enable 2-Step Verification in your
     * Google account at https://www.google.com/landing/2step.
     * </pre>
     *
     * <code>TWO_STEP_VERIFICATION_NOT_ENROLLED = 23;</code>
     */
    public static final int TWO_STEP_VERIFICATION_NOT_ENROLLED_VALUE = 23;
    /**
     * <pre>
     * An account administrator changed this account's authentication settings.
     * To access this Google Ads account, enable Advanced Protection in your
     * Google account at https://landing.google.com/advancedprotection.
     * </pre>
     *
     * <code>ADVANCED_PROTECTION_NOT_ENROLLED = 24;</code>
     */
    public static final int ADVANCED_PROTECTION_NOT_ENROLLED_VALUE = 24;


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
    public static AuthenticationError valueOf(int value) {
      return forNumber(value);
    }

    public static AuthenticationError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return AUTHENTICATION_ERROR;
        case 5: return CLIENT_CUSTOMER_ID_INVALID;
        case 8: return CUSTOMER_NOT_FOUND;
        case 9: return GOOGLE_ACCOUNT_DELETED;
        case 10: return GOOGLE_ACCOUNT_COOKIE_INVALID;
        case 25: return GOOGLE_ACCOUNT_AUTHENTICATION_FAILED;
        case 12: return GOOGLE_ACCOUNT_USER_AND_ADS_USER_MISMATCH;
        case 13: return LOGIN_COOKIE_REQUIRED;
        case 14: return NOT_ADS_USER;
        case 15: return OAUTH_TOKEN_INVALID;
        case 16: return OAUTH_TOKEN_EXPIRED;
        case 17: return OAUTH_TOKEN_DISABLED;
        case 18: return OAUTH_TOKEN_REVOKED;
        case 19: return OAUTH_TOKEN_HEADER_INVALID;
        case 20: return LOGIN_COOKIE_INVALID;
        case 22: return USER_ID_INVALID;
        case 23: return TWO_STEP_VERIFICATION_NOT_ENROLLED;
        case 24: return ADVANCED_PROTECTION_NOT_ENROLLED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AuthenticationError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AuthenticationError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AuthenticationError>() {
            public AuthenticationError findValueByNumber(int number) {
              return AuthenticationError.forNumber(number);
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
      return com.google.ads.googleads.v3.errors.AuthenticationErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AuthenticationError[] VALUES = values();

    public static AuthenticationError valueOf(
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

    private AuthenticationError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v3.errors.AuthenticationErrorEnum.AuthenticationError)
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
    if (!(obj instanceof com.google.ads.googleads.v3.errors.AuthenticationErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v3.errors.AuthenticationErrorEnum other = (com.google.ads.googleads.v3.errors.AuthenticationErrorEnum) obj;

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

  public static com.google.ads.googleads.v3.errors.AuthenticationErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.errors.AuthenticationErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.errors.AuthenticationErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.errors.AuthenticationErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.errors.AuthenticationErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.errors.AuthenticationErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.errors.AuthenticationErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.errors.AuthenticationErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.errors.AuthenticationErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.errors.AuthenticationErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.errors.AuthenticationErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.errors.AuthenticationErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v3.errors.AuthenticationErrorEnum prototype) {
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
   * Container for enum describing possible authentication errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v3.errors.AuthenticationErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v3.errors.AuthenticationErrorEnum)
      com.google.ads.googleads.v3.errors.AuthenticationErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v3.errors.AuthenticationErrorProto.internal_static_google_ads_googleads_v3_errors_AuthenticationErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v3.errors.AuthenticationErrorProto.internal_static_google_ads_googleads_v3_errors_AuthenticationErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v3.errors.AuthenticationErrorEnum.class, com.google.ads.googleads.v3.errors.AuthenticationErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v3.errors.AuthenticationErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v3.errors.AuthenticationErrorProto.internal_static_google_ads_googleads_v3_errors_AuthenticationErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.errors.AuthenticationErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v3.errors.AuthenticationErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.errors.AuthenticationErrorEnum build() {
      com.google.ads.googleads.v3.errors.AuthenticationErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.errors.AuthenticationErrorEnum buildPartial() {
      com.google.ads.googleads.v3.errors.AuthenticationErrorEnum result = new com.google.ads.googleads.v3.errors.AuthenticationErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v3.errors.AuthenticationErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v3.errors.AuthenticationErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v3.errors.AuthenticationErrorEnum other) {
      if (other == com.google.ads.googleads.v3.errors.AuthenticationErrorEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v3.errors.AuthenticationErrorEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v3.errors.AuthenticationErrorEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v3.errors.AuthenticationErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v3.errors.AuthenticationErrorEnum)
  private static final com.google.ads.googleads.v3.errors.AuthenticationErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v3.errors.AuthenticationErrorEnum();
  }

  public static com.google.ads.googleads.v3.errors.AuthenticationErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AuthenticationErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<AuthenticationErrorEnum>() {
    @java.lang.Override
    public AuthenticationErrorEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AuthenticationErrorEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AuthenticationErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AuthenticationErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v3.errors.AuthenticationErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

