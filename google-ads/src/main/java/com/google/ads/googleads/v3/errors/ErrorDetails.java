// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/errors/errors.proto

package com.google.ads.googleads.v3.errors;

/**
 * <pre>
 * Additional error details.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v3.errors.ErrorDetails}
 */
public  final class ErrorDetails extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v3.errors.ErrorDetails)
    ErrorDetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ErrorDetails.newBuilder() to construct.
  private ErrorDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ErrorDetails() {
    unpublishedErrorCode_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ErrorDetails(
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

            unpublishedErrorCode_ = s;
            break;
          }
          case 18: {
            com.google.ads.googleads.v3.errors.PolicyViolationDetails.Builder subBuilder = null;
            if (policyViolationDetails_ != null) {
              subBuilder = policyViolationDetails_.toBuilder();
            }
            policyViolationDetails_ = input.readMessage(com.google.ads.googleads.v3.errors.PolicyViolationDetails.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(policyViolationDetails_);
              policyViolationDetails_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.ads.googleads.v3.errors.PolicyFindingDetails.Builder subBuilder = null;
            if (policyFindingDetails_ != null) {
              subBuilder = policyFindingDetails_.toBuilder();
            }
            policyFindingDetails_ = input.readMessage(com.google.ads.googleads.v3.errors.PolicyFindingDetails.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(policyFindingDetails_);
              policyFindingDetails_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v3.errors.ErrorsProto.internal_static_google_ads_googleads_v3_errors_ErrorDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v3.errors.ErrorsProto.internal_static_google_ads_googleads_v3_errors_ErrorDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v3.errors.ErrorDetails.class, com.google.ads.googleads.v3.errors.ErrorDetails.Builder.class);
  }

  public static final int UNPUBLISHED_ERROR_CODE_FIELD_NUMBER = 1;
  private volatile java.lang.Object unpublishedErrorCode_;
  /**
   * <pre>
   * The error code that should have been returned, but wasn't. This is used
   * when the error code is InternalError.ERROR_CODE_NOT_PUBLISHED.
   * </pre>
   *
   * <code>string unpublished_error_code = 1;</code>
   */
  public java.lang.String getUnpublishedErrorCode() {
    java.lang.Object ref = unpublishedErrorCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      unpublishedErrorCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The error code that should have been returned, but wasn't. This is used
   * when the error code is InternalError.ERROR_CODE_NOT_PUBLISHED.
   * </pre>
   *
   * <code>string unpublished_error_code = 1;</code>
   */
  public com.google.protobuf.ByteString
      getUnpublishedErrorCodeBytes() {
    java.lang.Object ref = unpublishedErrorCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      unpublishedErrorCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POLICY_VIOLATION_DETAILS_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v3.errors.PolicyViolationDetails policyViolationDetails_;
  /**
   * <pre>
   * Describes an ad policy violation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.errors.PolicyViolationDetails policy_violation_details = 2;</code>
   */
  public boolean hasPolicyViolationDetails() {
    return policyViolationDetails_ != null;
  }
  /**
   * <pre>
   * Describes an ad policy violation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.errors.PolicyViolationDetails policy_violation_details = 2;</code>
   */
  public com.google.ads.googleads.v3.errors.PolicyViolationDetails getPolicyViolationDetails() {
    return policyViolationDetails_ == null ? com.google.ads.googleads.v3.errors.PolicyViolationDetails.getDefaultInstance() : policyViolationDetails_;
  }
  /**
   * <pre>
   * Describes an ad policy violation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.errors.PolicyViolationDetails policy_violation_details = 2;</code>
   */
  public com.google.ads.googleads.v3.errors.PolicyViolationDetailsOrBuilder getPolicyViolationDetailsOrBuilder() {
    return getPolicyViolationDetails();
  }

  public static final int POLICY_FINDING_DETAILS_FIELD_NUMBER = 3;
  private com.google.ads.googleads.v3.errors.PolicyFindingDetails policyFindingDetails_;
  /**
   * <pre>
   * Describes policy violation findings.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.errors.PolicyFindingDetails policy_finding_details = 3;</code>
   */
  public boolean hasPolicyFindingDetails() {
    return policyFindingDetails_ != null;
  }
  /**
   * <pre>
   * Describes policy violation findings.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.errors.PolicyFindingDetails policy_finding_details = 3;</code>
   */
  public com.google.ads.googleads.v3.errors.PolicyFindingDetails getPolicyFindingDetails() {
    return policyFindingDetails_ == null ? com.google.ads.googleads.v3.errors.PolicyFindingDetails.getDefaultInstance() : policyFindingDetails_;
  }
  /**
   * <pre>
   * Describes policy violation findings.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.errors.PolicyFindingDetails policy_finding_details = 3;</code>
   */
  public com.google.ads.googleads.v3.errors.PolicyFindingDetailsOrBuilder getPolicyFindingDetailsOrBuilder() {
    return getPolicyFindingDetails();
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
    if (!getUnpublishedErrorCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, unpublishedErrorCode_);
    }
    if (policyViolationDetails_ != null) {
      output.writeMessage(2, getPolicyViolationDetails());
    }
    if (policyFindingDetails_ != null) {
      output.writeMessage(3, getPolicyFindingDetails());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUnpublishedErrorCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, unpublishedErrorCode_);
    }
    if (policyViolationDetails_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPolicyViolationDetails());
    }
    if (policyFindingDetails_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPolicyFindingDetails());
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
    if (!(obj instanceof com.google.ads.googleads.v3.errors.ErrorDetails)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v3.errors.ErrorDetails other = (com.google.ads.googleads.v3.errors.ErrorDetails) obj;

    if (!getUnpublishedErrorCode()
        .equals(other.getUnpublishedErrorCode())) return false;
    if (hasPolicyViolationDetails() != other.hasPolicyViolationDetails()) return false;
    if (hasPolicyViolationDetails()) {
      if (!getPolicyViolationDetails()
          .equals(other.getPolicyViolationDetails())) return false;
    }
    if (hasPolicyFindingDetails() != other.hasPolicyFindingDetails()) return false;
    if (hasPolicyFindingDetails()) {
      if (!getPolicyFindingDetails()
          .equals(other.getPolicyFindingDetails())) return false;
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
    hash = (37 * hash) + UNPUBLISHED_ERROR_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getUnpublishedErrorCode().hashCode();
    if (hasPolicyViolationDetails()) {
      hash = (37 * hash) + POLICY_VIOLATION_DETAILS_FIELD_NUMBER;
      hash = (53 * hash) + getPolicyViolationDetails().hashCode();
    }
    if (hasPolicyFindingDetails()) {
      hash = (37 * hash) + POLICY_FINDING_DETAILS_FIELD_NUMBER;
      hash = (53 * hash) + getPolicyFindingDetails().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v3.errors.ErrorDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.errors.ErrorDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.errors.ErrorDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.errors.ErrorDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.errors.ErrorDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.errors.ErrorDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.errors.ErrorDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.errors.ErrorDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.errors.ErrorDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.errors.ErrorDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.errors.ErrorDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.errors.ErrorDetails parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v3.errors.ErrorDetails prototype) {
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
   * Additional error details.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v3.errors.ErrorDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v3.errors.ErrorDetails)
      com.google.ads.googleads.v3.errors.ErrorDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v3.errors.ErrorsProto.internal_static_google_ads_googleads_v3_errors_ErrorDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v3.errors.ErrorsProto.internal_static_google_ads_googleads_v3_errors_ErrorDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v3.errors.ErrorDetails.class, com.google.ads.googleads.v3.errors.ErrorDetails.Builder.class);
    }

    // Construct using com.google.ads.googleads.v3.errors.ErrorDetails.newBuilder()
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
      unpublishedErrorCode_ = "";

      if (policyViolationDetailsBuilder_ == null) {
        policyViolationDetails_ = null;
      } else {
        policyViolationDetails_ = null;
        policyViolationDetailsBuilder_ = null;
      }
      if (policyFindingDetailsBuilder_ == null) {
        policyFindingDetails_ = null;
      } else {
        policyFindingDetails_ = null;
        policyFindingDetailsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v3.errors.ErrorsProto.internal_static_google_ads_googleads_v3_errors_ErrorDetails_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.errors.ErrorDetails getDefaultInstanceForType() {
      return com.google.ads.googleads.v3.errors.ErrorDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.errors.ErrorDetails build() {
      com.google.ads.googleads.v3.errors.ErrorDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.errors.ErrorDetails buildPartial() {
      com.google.ads.googleads.v3.errors.ErrorDetails result = new com.google.ads.googleads.v3.errors.ErrorDetails(this);
      result.unpublishedErrorCode_ = unpublishedErrorCode_;
      if (policyViolationDetailsBuilder_ == null) {
        result.policyViolationDetails_ = policyViolationDetails_;
      } else {
        result.policyViolationDetails_ = policyViolationDetailsBuilder_.build();
      }
      if (policyFindingDetailsBuilder_ == null) {
        result.policyFindingDetails_ = policyFindingDetails_;
      } else {
        result.policyFindingDetails_ = policyFindingDetailsBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v3.errors.ErrorDetails) {
        return mergeFrom((com.google.ads.googleads.v3.errors.ErrorDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v3.errors.ErrorDetails other) {
      if (other == com.google.ads.googleads.v3.errors.ErrorDetails.getDefaultInstance()) return this;
      if (!other.getUnpublishedErrorCode().isEmpty()) {
        unpublishedErrorCode_ = other.unpublishedErrorCode_;
        onChanged();
      }
      if (other.hasPolicyViolationDetails()) {
        mergePolicyViolationDetails(other.getPolicyViolationDetails());
      }
      if (other.hasPolicyFindingDetails()) {
        mergePolicyFindingDetails(other.getPolicyFindingDetails());
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
      com.google.ads.googleads.v3.errors.ErrorDetails parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v3.errors.ErrorDetails) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object unpublishedErrorCode_ = "";
    /**
     * <pre>
     * The error code that should have been returned, but wasn't. This is used
     * when the error code is InternalError.ERROR_CODE_NOT_PUBLISHED.
     * </pre>
     *
     * <code>string unpublished_error_code = 1;</code>
     */
    public java.lang.String getUnpublishedErrorCode() {
      java.lang.Object ref = unpublishedErrorCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        unpublishedErrorCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The error code that should have been returned, but wasn't. This is used
     * when the error code is InternalError.ERROR_CODE_NOT_PUBLISHED.
     * </pre>
     *
     * <code>string unpublished_error_code = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUnpublishedErrorCodeBytes() {
      java.lang.Object ref = unpublishedErrorCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        unpublishedErrorCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The error code that should have been returned, but wasn't. This is used
     * when the error code is InternalError.ERROR_CODE_NOT_PUBLISHED.
     * </pre>
     *
     * <code>string unpublished_error_code = 1;</code>
     */
    public Builder setUnpublishedErrorCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      unpublishedErrorCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The error code that should have been returned, but wasn't. This is used
     * when the error code is InternalError.ERROR_CODE_NOT_PUBLISHED.
     * </pre>
     *
     * <code>string unpublished_error_code = 1;</code>
     */
    public Builder clearUnpublishedErrorCode() {
      
      unpublishedErrorCode_ = getDefaultInstance().getUnpublishedErrorCode();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The error code that should have been returned, but wasn't. This is used
     * when the error code is InternalError.ERROR_CODE_NOT_PUBLISHED.
     * </pre>
     *
     * <code>string unpublished_error_code = 1;</code>
     */
    public Builder setUnpublishedErrorCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      unpublishedErrorCode_ = value;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v3.errors.PolicyViolationDetails policyViolationDetails_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v3.errors.PolicyViolationDetails, com.google.ads.googleads.v3.errors.PolicyViolationDetails.Builder, com.google.ads.googleads.v3.errors.PolicyViolationDetailsOrBuilder> policyViolationDetailsBuilder_;
    /**
     * <pre>
     * Describes an ad policy violation.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.errors.PolicyViolationDetails policy_violation_details = 2;</code>
     */
    public boolean hasPolicyViolationDetails() {
      return policyViolationDetailsBuilder_ != null || policyViolationDetails_ != null;
    }
    /**
     * <pre>
     * Describes an ad policy violation.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.errors.PolicyViolationDetails policy_violation_details = 2;</code>
     */
    public com.google.ads.googleads.v3.errors.PolicyViolationDetails getPolicyViolationDetails() {
      if (policyViolationDetailsBuilder_ == null) {
        return policyViolationDetails_ == null ? com.google.ads.googleads.v3.errors.PolicyViolationDetails.getDefaultInstance() : policyViolationDetails_;
      } else {
        return policyViolationDetailsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Describes an ad policy violation.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.errors.PolicyViolationDetails policy_violation_details = 2;</code>
     */
    public Builder setPolicyViolationDetails(com.google.ads.googleads.v3.errors.PolicyViolationDetails value) {
      if (policyViolationDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        policyViolationDetails_ = value;
        onChanged();
      } else {
        policyViolationDetailsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Describes an ad policy violation.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.errors.PolicyViolationDetails policy_violation_details = 2;</code>
     */
    public Builder setPolicyViolationDetails(
        com.google.ads.googleads.v3.errors.PolicyViolationDetails.Builder builderForValue) {
      if (policyViolationDetailsBuilder_ == null) {
        policyViolationDetails_ = builderForValue.build();
        onChanged();
      } else {
        policyViolationDetailsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Describes an ad policy violation.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.errors.PolicyViolationDetails policy_violation_details = 2;</code>
     */
    public Builder mergePolicyViolationDetails(com.google.ads.googleads.v3.errors.PolicyViolationDetails value) {
      if (policyViolationDetailsBuilder_ == null) {
        if (policyViolationDetails_ != null) {
          policyViolationDetails_ =
            com.google.ads.googleads.v3.errors.PolicyViolationDetails.newBuilder(policyViolationDetails_).mergeFrom(value).buildPartial();
        } else {
          policyViolationDetails_ = value;
        }
        onChanged();
      } else {
        policyViolationDetailsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Describes an ad policy violation.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.errors.PolicyViolationDetails policy_violation_details = 2;</code>
     */
    public Builder clearPolicyViolationDetails() {
      if (policyViolationDetailsBuilder_ == null) {
        policyViolationDetails_ = null;
        onChanged();
      } else {
        policyViolationDetails_ = null;
        policyViolationDetailsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Describes an ad policy violation.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.errors.PolicyViolationDetails policy_violation_details = 2;</code>
     */
    public com.google.ads.googleads.v3.errors.PolicyViolationDetails.Builder getPolicyViolationDetailsBuilder() {
      
      onChanged();
      return getPolicyViolationDetailsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Describes an ad policy violation.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.errors.PolicyViolationDetails policy_violation_details = 2;</code>
     */
    public com.google.ads.googleads.v3.errors.PolicyViolationDetailsOrBuilder getPolicyViolationDetailsOrBuilder() {
      if (policyViolationDetailsBuilder_ != null) {
        return policyViolationDetailsBuilder_.getMessageOrBuilder();
      } else {
        return policyViolationDetails_ == null ?
            com.google.ads.googleads.v3.errors.PolicyViolationDetails.getDefaultInstance() : policyViolationDetails_;
      }
    }
    /**
     * <pre>
     * Describes an ad policy violation.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.errors.PolicyViolationDetails policy_violation_details = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v3.errors.PolicyViolationDetails, com.google.ads.googleads.v3.errors.PolicyViolationDetails.Builder, com.google.ads.googleads.v3.errors.PolicyViolationDetailsOrBuilder> 
        getPolicyViolationDetailsFieldBuilder() {
      if (policyViolationDetailsBuilder_ == null) {
        policyViolationDetailsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v3.errors.PolicyViolationDetails, com.google.ads.googleads.v3.errors.PolicyViolationDetails.Builder, com.google.ads.googleads.v3.errors.PolicyViolationDetailsOrBuilder>(
                getPolicyViolationDetails(),
                getParentForChildren(),
                isClean());
        policyViolationDetails_ = null;
      }
      return policyViolationDetailsBuilder_;
    }

    private com.google.ads.googleads.v3.errors.PolicyFindingDetails policyFindingDetails_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v3.errors.PolicyFindingDetails, com.google.ads.googleads.v3.errors.PolicyFindingDetails.Builder, com.google.ads.googleads.v3.errors.PolicyFindingDetailsOrBuilder> policyFindingDetailsBuilder_;
    /**
     * <pre>
     * Describes policy violation findings.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.errors.PolicyFindingDetails policy_finding_details = 3;</code>
     */
    public boolean hasPolicyFindingDetails() {
      return policyFindingDetailsBuilder_ != null || policyFindingDetails_ != null;
    }
    /**
     * <pre>
     * Describes policy violation findings.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.errors.PolicyFindingDetails policy_finding_details = 3;</code>
     */
    public com.google.ads.googleads.v3.errors.PolicyFindingDetails getPolicyFindingDetails() {
      if (policyFindingDetailsBuilder_ == null) {
        return policyFindingDetails_ == null ? com.google.ads.googleads.v3.errors.PolicyFindingDetails.getDefaultInstance() : policyFindingDetails_;
      } else {
        return policyFindingDetailsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Describes policy violation findings.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.errors.PolicyFindingDetails policy_finding_details = 3;</code>
     */
    public Builder setPolicyFindingDetails(com.google.ads.googleads.v3.errors.PolicyFindingDetails value) {
      if (policyFindingDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        policyFindingDetails_ = value;
        onChanged();
      } else {
        policyFindingDetailsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Describes policy violation findings.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.errors.PolicyFindingDetails policy_finding_details = 3;</code>
     */
    public Builder setPolicyFindingDetails(
        com.google.ads.googleads.v3.errors.PolicyFindingDetails.Builder builderForValue) {
      if (policyFindingDetailsBuilder_ == null) {
        policyFindingDetails_ = builderForValue.build();
        onChanged();
      } else {
        policyFindingDetailsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Describes policy violation findings.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.errors.PolicyFindingDetails policy_finding_details = 3;</code>
     */
    public Builder mergePolicyFindingDetails(com.google.ads.googleads.v3.errors.PolicyFindingDetails value) {
      if (policyFindingDetailsBuilder_ == null) {
        if (policyFindingDetails_ != null) {
          policyFindingDetails_ =
            com.google.ads.googleads.v3.errors.PolicyFindingDetails.newBuilder(policyFindingDetails_).mergeFrom(value).buildPartial();
        } else {
          policyFindingDetails_ = value;
        }
        onChanged();
      } else {
        policyFindingDetailsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Describes policy violation findings.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.errors.PolicyFindingDetails policy_finding_details = 3;</code>
     */
    public Builder clearPolicyFindingDetails() {
      if (policyFindingDetailsBuilder_ == null) {
        policyFindingDetails_ = null;
        onChanged();
      } else {
        policyFindingDetails_ = null;
        policyFindingDetailsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Describes policy violation findings.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.errors.PolicyFindingDetails policy_finding_details = 3;</code>
     */
    public com.google.ads.googleads.v3.errors.PolicyFindingDetails.Builder getPolicyFindingDetailsBuilder() {
      
      onChanged();
      return getPolicyFindingDetailsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Describes policy violation findings.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.errors.PolicyFindingDetails policy_finding_details = 3;</code>
     */
    public com.google.ads.googleads.v3.errors.PolicyFindingDetailsOrBuilder getPolicyFindingDetailsOrBuilder() {
      if (policyFindingDetailsBuilder_ != null) {
        return policyFindingDetailsBuilder_.getMessageOrBuilder();
      } else {
        return policyFindingDetails_ == null ?
            com.google.ads.googleads.v3.errors.PolicyFindingDetails.getDefaultInstance() : policyFindingDetails_;
      }
    }
    /**
     * <pre>
     * Describes policy violation findings.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.errors.PolicyFindingDetails policy_finding_details = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v3.errors.PolicyFindingDetails, com.google.ads.googleads.v3.errors.PolicyFindingDetails.Builder, com.google.ads.googleads.v3.errors.PolicyFindingDetailsOrBuilder> 
        getPolicyFindingDetailsFieldBuilder() {
      if (policyFindingDetailsBuilder_ == null) {
        policyFindingDetailsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v3.errors.PolicyFindingDetails, com.google.ads.googleads.v3.errors.PolicyFindingDetails.Builder, com.google.ads.googleads.v3.errors.PolicyFindingDetailsOrBuilder>(
                getPolicyFindingDetails(),
                getParentForChildren(),
                isClean());
        policyFindingDetails_ = null;
      }
      return policyFindingDetailsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v3.errors.ErrorDetails)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v3.errors.ErrorDetails)
  private static final com.google.ads.googleads.v3.errors.ErrorDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v3.errors.ErrorDetails();
  }

  public static com.google.ads.googleads.v3.errors.ErrorDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ErrorDetails>
      PARSER = new com.google.protobuf.AbstractParser<ErrorDetails>() {
    @java.lang.Override
    public ErrorDetails parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ErrorDetails(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ErrorDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ErrorDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v3.errors.ErrorDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

