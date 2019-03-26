// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/user_lists.proto

package com.google.ads.googleads.v1.common;

/**
 * <pre>
 * User lists defined by combining two rules, left operand and right operand.
 * There are two operators: AND where left operand and right operand have to be
 * true; AND_NOT where left operand is true but right operand is false.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.common.CombinedRuleUserListInfo}
 */
public  final class CombinedRuleUserListInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.common.CombinedRuleUserListInfo)
    CombinedRuleUserListInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CombinedRuleUserListInfo.newBuilder() to construct.
  private CombinedRuleUserListInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CombinedRuleUserListInfo() {
    ruleOperator_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CombinedRuleUserListInfo(
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
            com.google.ads.googleads.v1.common.UserListRuleInfo.Builder subBuilder = null;
            if (leftOperand_ != null) {
              subBuilder = leftOperand_.toBuilder();
            }
            leftOperand_ = input.readMessage(com.google.ads.googleads.v1.common.UserListRuleInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(leftOperand_);
              leftOperand_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.ads.googleads.v1.common.UserListRuleInfo.Builder subBuilder = null;
            if (rightOperand_ != null) {
              subBuilder = rightOperand_.toBuilder();
            }
            rightOperand_ = input.readMessage(com.google.ads.googleads.v1.common.UserListRuleInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(rightOperand_);
              rightOperand_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            ruleOperator_ = rawValue;
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
    return com.google.ads.googleads.v1.common.UserListsProto.internal_static_google_ads_googleads_v1_common_CombinedRuleUserListInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.common.UserListsProto.internal_static_google_ads_googleads_v1_common_CombinedRuleUserListInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.common.CombinedRuleUserListInfo.class, com.google.ads.googleads.v1.common.CombinedRuleUserListInfo.Builder.class);
  }

  public static final int LEFT_OPERAND_FIELD_NUMBER = 1;
  private com.google.ads.googleads.v1.common.UserListRuleInfo leftOperand_;
  /**
   * <pre>
   * Left operand of the combined rule.
   * This field is required and must be populated when creating new combined
   * rule based user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.UserListRuleInfo left_operand = 1;</code>
   */
  public boolean hasLeftOperand() {
    return leftOperand_ != null;
  }
  /**
   * <pre>
   * Left operand of the combined rule.
   * This field is required and must be populated when creating new combined
   * rule based user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.UserListRuleInfo left_operand = 1;</code>
   */
  public com.google.ads.googleads.v1.common.UserListRuleInfo getLeftOperand() {
    return leftOperand_ == null ? com.google.ads.googleads.v1.common.UserListRuleInfo.getDefaultInstance() : leftOperand_;
  }
  /**
   * <pre>
   * Left operand of the combined rule.
   * This field is required and must be populated when creating new combined
   * rule based user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.UserListRuleInfo left_operand = 1;</code>
   */
  public com.google.ads.googleads.v1.common.UserListRuleInfoOrBuilder getLeftOperandOrBuilder() {
    return getLeftOperand();
  }

  public static final int RIGHT_OPERAND_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v1.common.UserListRuleInfo rightOperand_;
  /**
   * <pre>
   * Right operand of the combined rule.
   * This field is required and must be populated when creating new combined
   * rule based user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.UserListRuleInfo right_operand = 2;</code>
   */
  public boolean hasRightOperand() {
    return rightOperand_ != null;
  }
  /**
   * <pre>
   * Right operand of the combined rule.
   * This field is required and must be populated when creating new combined
   * rule based user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.UserListRuleInfo right_operand = 2;</code>
   */
  public com.google.ads.googleads.v1.common.UserListRuleInfo getRightOperand() {
    return rightOperand_ == null ? com.google.ads.googleads.v1.common.UserListRuleInfo.getDefaultInstance() : rightOperand_;
  }
  /**
   * <pre>
   * Right operand of the combined rule.
   * This field is required and must be populated when creating new combined
   * rule based user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.UserListRuleInfo right_operand = 2;</code>
   */
  public com.google.ads.googleads.v1.common.UserListRuleInfoOrBuilder getRightOperandOrBuilder() {
    return getRightOperand();
  }

  public static final int RULE_OPERATOR_FIELD_NUMBER = 3;
  private int ruleOperator_;
  /**
   * <pre>
   * Operator to connect the two operands.
   * Required for creating a combined rule user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.UserListCombinedRuleOperatorEnum.UserListCombinedRuleOperator rule_operator = 3;</code>
   */
  public int getRuleOperatorValue() {
    return ruleOperator_;
  }
  /**
   * <pre>
   * Operator to connect the two operands.
   * Required for creating a combined rule user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.UserListCombinedRuleOperatorEnum.UserListCombinedRuleOperator rule_operator = 3;</code>
   */
  public com.google.ads.googleads.v1.enums.UserListCombinedRuleOperatorEnum.UserListCombinedRuleOperator getRuleOperator() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v1.enums.UserListCombinedRuleOperatorEnum.UserListCombinedRuleOperator result = com.google.ads.googleads.v1.enums.UserListCombinedRuleOperatorEnum.UserListCombinedRuleOperator.valueOf(ruleOperator_);
    return result == null ? com.google.ads.googleads.v1.enums.UserListCombinedRuleOperatorEnum.UserListCombinedRuleOperator.UNRECOGNIZED : result;
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
    if (leftOperand_ != null) {
      output.writeMessage(1, getLeftOperand());
    }
    if (rightOperand_ != null) {
      output.writeMessage(2, getRightOperand());
    }
    if (ruleOperator_ != com.google.ads.googleads.v1.enums.UserListCombinedRuleOperatorEnum.UserListCombinedRuleOperator.UNSPECIFIED.getNumber()) {
      output.writeEnum(3, ruleOperator_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (leftOperand_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLeftOperand());
    }
    if (rightOperand_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRightOperand());
    }
    if (ruleOperator_ != com.google.ads.googleads.v1.enums.UserListCombinedRuleOperatorEnum.UserListCombinedRuleOperator.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, ruleOperator_);
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
    if (!(obj instanceof com.google.ads.googleads.v1.common.CombinedRuleUserListInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.common.CombinedRuleUserListInfo other = (com.google.ads.googleads.v1.common.CombinedRuleUserListInfo) obj;

    boolean result = true;
    result = result && (hasLeftOperand() == other.hasLeftOperand());
    if (hasLeftOperand()) {
      result = result && getLeftOperand()
          .equals(other.getLeftOperand());
    }
    result = result && (hasRightOperand() == other.hasRightOperand());
    if (hasRightOperand()) {
      result = result && getRightOperand()
          .equals(other.getRightOperand());
    }
    result = result && ruleOperator_ == other.ruleOperator_;
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
    if (hasLeftOperand()) {
      hash = (37 * hash) + LEFT_OPERAND_FIELD_NUMBER;
      hash = (53 * hash) + getLeftOperand().hashCode();
    }
    if (hasRightOperand()) {
      hash = (37 * hash) + RIGHT_OPERAND_FIELD_NUMBER;
      hash = (53 * hash) + getRightOperand().hashCode();
    }
    hash = (37 * hash) + RULE_OPERATOR_FIELD_NUMBER;
    hash = (53 * hash) + ruleOperator_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v1.common.CombinedRuleUserListInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.CombinedRuleUserListInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.CombinedRuleUserListInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.CombinedRuleUserListInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.CombinedRuleUserListInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.CombinedRuleUserListInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.CombinedRuleUserListInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.CombinedRuleUserListInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.CombinedRuleUserListInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.CombinedRuleUserListInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.CombinedRuleUserListInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.CombinedRuleUserListInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v1.common.CombinedRuleUserListInfo prototype) {
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
   * User lists defined by combining two rules, left operand and right operand.
   * There are two operators: AND where left operand and right operand have to be
   * true; AND_NOT where left operand is true but right operand is false.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.common.CombinedRuleUserListInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.common.CombinedRuleUserListInfo)
      com.google.ads.googleads.v1.common.CombinedRuleUserListInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.common.UserListsProto.internal_static_google_ads_googleads_v1_common_CombinedRuleUserListInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.common.UserListsProto.internal_static_google_ads_googleads_v1_common_CombinedRuleUserListInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.common.CombinedRuleUserListInfo.class, com.google.ads.googleads.v1.common.CombinedRuleUserListInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.common.CombinedRuleUserListInfo.newBuilder()
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
      if (leftOperandBuilder_ == null) {
        leftOperand_ = null;
      } else {
        leftOperand_ = null;
        leftOperandBuilder_ = null;
      }
      if (rightOperandBuilder_ == null) {
        rightOperand_ = null;
      } else {
        rightOperand_ = null;
        rightOperandBuilder_ = null;
      }
      ruleOperator_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v1.common.UserListsProto.internal_static_google_ads_googleads_v1_common_CombinedRuleUserListInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.CombinedRuleUserListInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.common.CombinedRuleUserListInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.CombinedRuleUserListInfo build() {
      com.google.ads.googleads.v1.common.CombinedRuleUserListInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.CombinedRuleUserListInfo buildPartial() {
      com.google.ads.googleads.v1.common.CombinedRuleUserListInfo result = new com.google.ads.googleads.v1.common.CombinedRuleUserListInfo(this);
      if (leftOperandBuilder_ == null) {
        result.leftOperand_ = leftOperand_;
      } else {
        result.leftOperand_ = leftOperandBuilder_.build();
      }
      if (rightOperandBuilder_ == null) {
        result.rightOperand_ = rightOperand_;
      } else {
        result.rightOperand_ = rightOperandBuilder_.build();
      }
      result.ruleOperator_ = ruleOperator_;
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
      if (other instanceof com.google.ads.googleads.v1.common.CombinedRuleUserListInfo) {
        return mergeFrom((com.google.ads.googleads.v1.common.CombinedRuleUserListInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.common.CombinedRuleUserListInfo other) {
      if (other == com.google.ads.googleads.v1.common.CombinedRuleUserListInfo.getDefaultInstance()) return this;
      if (other.hasLeftOperand()) {
        mergeLeftOperand(other.getLeftOperand());
      }
      if (other.hasRightOperand()) {
        mergeRightOperand(other.getRightOperand());
      }
      if (other.ruleOperator_ != 0) {
        setRuleOperatorValue(other.getRuleOperatorValue());
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
      com.google.ads.googleads.v1.common.CombinedRuleUserListInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.common.CombinedRuleUserListInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.ads.googleads.v1.common.UserListRuleInfo leftOperand_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v1.common.UserListRuleInfo, com.google.ads.googleads.v1.common.UserListRuleInfo.Builder, com.google.ads.googleads.v1.common.UserListRuleInfoOrBuilder> leftOperandBuilder_;
    /**
     * <pre>
     * Left operand of the combined rule.
     * This field is required and must be populated when creating new combined
     * rule based user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.common.UserListRuleInfo left_operand = 1;</code>
     */
    public boolean hasLeftOperand() {
      return leftOperandBuilder_ != null || leftOperand_ != null;
    }
    /**
     * <pre>
     * Left operand of the combined rule.
     * This field is required and must be populated when creating new combined
     * rule based user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.common.UserListRuleInfo left_operand = 1;</code>
     */
    public com.google.ads.googleads.v1.common.UserListRuleInfo getLeftOperand() {
      if (leftOperandBuilder_ == null) {
        return leftOperand_ == null ? com.google.ads.googleads.v1.common.UserListRuleInfo.getDefaultInstance() : leftOperand_;
      } else {
        return leftOperandBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Left operand of the combined rule.
     * This field is required and must be populated when creating new combined
     * rule based user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.common.UserListRuleInfo left_operand = 1;</code>
     */
    public Builder setLeftOperand(com.google.ads.googleads.v1.common.UserListRuleInfo value) {
      if (leftOperandBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        leftOperand_ = value;
        onChanged();
      } else {
        leftOperandBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Left operand of the combined rule.
     * This field is required and must be populated when creating new combined
     * rule based user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.common.UserListRuleInfo left_operand = 1;</code>
     */
    public Builder setLeftOperand(
        com.google.ads.googleads.v1.common.UserListRuleInfo.Builder builderForValue) {
      if (leftOperandBuilder_ == null) {
        leftOperand_ = builderForValue.build();
        onChanged();
      } else {
        leftOperandBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Left operand of the combined rule.
     * This field is required and must be populated when creating new combined
     * rule based user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.common.UserListRuleInfo left_operand = 1;</code>
     */
    public Builder mergeLeftOperand(com.google.ads.googleads.v1.common.UserListRuleInfo value) {
      if (leftOperandBuilder_ == null) {
        if (leftOperand_ != null) {
          leftOperand_ =
            com.google.ads.googleads.v1.common.UserListRuleInfo.newBuilder(leftOperand_).mergeFrom(value).buildPartial();
        } else {
          leftOperand_ = value;
        }
        onChanged();
      } else {
        leftOperandBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Left operand of the combined rule.
     * This field is required and must be populated when creating new combined
     * rule based user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.common.UserListRuleInfo left_operand = 1;</code>
     */
    public Builder clearLeftOperand() {
      if (leftOperandBuilder_ == null) {
        leftOperand_ = null;
        onChanged();
      } else {
        leftOperand_ = null;
        leftOperandBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Left operand of the combined rule.
     * This field is required and must be populated when creating new combined
     * rule based user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.common.UserListRuleInfo left_operand = 1;</code>
     */
    public com.google.ads.googleads.v1.common.UserListRuleInfo.Builder getLeftOperandBuilder() {
      
      onChanged();
      return getLeftOperandFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Left operand of the combined rule.
     * This field is required and must be populated when creating new combined
     * rule based user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.common.UserListRuleInfo left_operand = 1;</code>
     */
    public com.google.ads.googleads.v1.common.UserListRuleInfoOrBuilder getLeftOperandOrBuilder() {
      if (leftOperandBuilder_ != null) {
        return leftOperandBuilder_.getMessageOrBuilder();
      } else {
        return leftOperand_ == null ?
            com.google.ads.googleads.v1.common.UserListRuleInfo.getDefaultInstance() : leftOperand_;
      }
    }
    /**
     * <pre>
     * Left operand of the combined rule.
     * This field is required and must be populated when creating new combined
     * rule based user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.common.UserListRuleInfo left_operand = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v1.common.UserListRuleInfo, com.google.ads.googleads.v1.common.UserListRuleInfo.Builder, com.google.ads.googleads.v1.common.UserListRuleInfoOrBuilder> 
        getLeftOperandFieldBuilder() {
      if (leftOperandBuilder_ == null) {
        leftOperandBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v1.common.UserListRuleInfo, com.google.ads.googleads.v1.common.UserListRuleInfo.Builder, com.google.ads.googleads.v1.common.UserListRuleInfoOrBuilder>(
                getLeftOperand(),
                getParentForChildren(),
                isClean());
        leftOperand_ = null;
      }
      return leftOperandBuilder_;
    }

    private com.google.ads.googleads.v1.common.UserListRuleInfo rightOperand_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v1.common.UserListRuleInfo, com.google.ads.googleads.v1.common.UserListRuleInfo.Builder, com.google.ads.googleads.v1.common.UserListRuleInfoOrBuilder> rightOperandBuilder_;
    /**
     * <pre>
     * Right operand of the combined rule.
     * This field is required and must be populated when creating new combined
     * rule based user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.common.UserListRuleInfo right_operand = 2;</code>
     */
    public boolean hasRightOperand() {
      return rightOperandBuilder_ != null || rightOperand_ != null;
    }
    /**
     * <pre>
     * Right operand of the combined rule.
     * This field is required and must be populated when creating new combined
     * rule based user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.common.UserListRuleInfo right_operand = 2;</code>
     */
    public com.google.ads.googleads.v1.common.UserListRuleInfo getRightOperand() {
      if (rightOperandBuilder_ == null) {
        return rightOperand_ == null ? com.google.ads.googleads.v1.common.UserListRuleInfo.getDefaultInstance() : rightOperand_;
      } else {
        return rightOperandBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Right operand of the combined rule.
     * This field is required and must be populated when creating new combined
     * rule based user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.common.UserListRuleInfo right_operand = 2;</code>
     */
    public Builder setRightOperand(com.google.ads.googleads.v1.common.UserListRuleInfo value) {
      if (rightOperandBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rightOperand_ = value;
        onChanged();
      } else {
        rightOperandBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Right operand of the combined rule.
     * This field is required and must be populated when creating new combined
     * rule based user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.common.UserListRuleInfo right_operand = 2;</code>
     */
    public Builder setRightOperand(
        com.google.ads.googleads.v1.common.UserListRuleInfo.Builder builderForValue) {
      if (rightOperandBuilder_ == null) {
        rightOperand_ = builderForValue.build();
        onChanged();
      } else {
        rightOperandBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Right operand of the combined rule.
     * This field is required and must be populated when creating new combined
     * rule based user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.common.UserListRuleInfo right_operand = 2;</code>
     */
    public Builder mergeRightOperand(com.google.ads.googleads.v1.common.UserListRuleInfo value) {
      if (rightOperandBuilder_ == null) {
        if (rightOperand_ != null) {
          rightOperand_ =
            com.google.ads.googleads.v1.common.UserListRuleInfo.newBuilder(rightOperand_).mergeFrom(value).buildPartial();
        } else {
          rightOperand_ = value;
        }
        onChanged();
      } else {
        rightOperandBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Right operand of the combined rule.
     * This field is required and must be populated when creating new combined
     * rule based user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.common.UserListRuleInfo right_operand = 2;</code>
     */
    public Builder clearRightOperand() {
      if (rightOperandBuilder_ == null) {
        rightOperand_ = null;
        onChanged();
      } else {
        rightOperand_ = null;
        rightOperandBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Right operand of the combined rule.
     * This field is required and must be populated when creating new combined
     * rule based user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.common.UserListRuleInfo right_operand = 2;</code>
     */
    public com.google.ads.googleads.v1.common.UserListRuleInfo.Builder getRightOperandBuilder() {
      
      onChanged();
      return getRightOperandFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Right operand of the combined rule.
     * This field is required and must be populated when creating new combined
     * rule based user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.common.UserListRuleInfo right_operand = 2;</code>
     */
    public com.google.ads.googleads.v1.common.UserListRuleInfoOrBuilder getRightOperandOrBuilder() {
      if (rightOperandBuilder_ != null) {
        return rightOperandBuilder_.getMessageOrBuilder();
      } else {
        return rightOperand_ == null ?
            com.google.ads.googleads.v1.common.UserListRuleInfo.getDefaultInstance() : rightOperand_;
      }
    }
    /**
     * <pre>
     * Right operand of the combined rule.
     * This field is required and must be populated when creating new combined
     * rule based user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.common.UserListRuleInfo right_operand = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v1.common.UserListRuleInfo, com.google.ads.googleads.v1.common.UserListRuleInfo.Builder, com.google.ads.googleads.v1.common.UserListRuleInfoOrBuilder> 
        getRightOperandFieldBuilder() {
      if (rightOperandBuilder_ == null) {
        rightOperandBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v1.common.UserListRuleInfo, com.google.ads.googleads.v1.common.UserListRuleInfo.Builder, com.google.ads.googleads.v1.common.UserListRuleInfoOrBuilder>(
                getRightOperand(),
                getParentForChildren(),
                isClean());
        rightOperand_ = null;
      }
      return rightOperandBuilder_;
    }

    private int ruleOperator_ = 0;
    /**
     * <pre>
     * Operator to connect the two operands.
     * Required for creating a combined rule user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.enums.UserListCombinedRuleOperatorEnum.UserListCombinedRuleOperator rule_operator = 3;</code>
     */
    public int getRuleOperatorValue() {
      return ruleOperator_;
    }
    /**
     * <pre>
     * Operator to connect the two operands.
     * Required for creating a combined rule user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.enums.UserListCombinedRuleOperatorEnum.UserListCombinedRuleOperator rule_operator = 3;</code>
     */
    public Builder setRuleOperatorValue(int value) {
      ruleOperator_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Operator to connect the two operands.
     * Required for creating a combined rule user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.enums.UserListCombinedRuleOperatorEnum.UserListCombinedRuleOperator rule_operator = 3;</code>
     */
    public com.google.ads.googleads.v1.enums.UserListCombinedRuleOperatorEnum.UserListCombinedRuleOperator getRuleOperator() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v1.enums.UserListCombinedRuleOperatorEnum.UserListCombinedRuleOperator result = com.google.ads.googleads.v1.enums.UserListCombinedRuleOperatorEnum.UserListCombinedRuleOperator.valueOf(ruleOperator_);
      return result == null ? com.google.ads.googleads.v1.enums.UserListCombinedRuleOperatorEnum.UserListCombinedRuleOperator.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Operator to connect the two operands.
     * Required for creating a combined rule user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.enums.UserListCombinedRuleOperatorEnum.UserListCombinedRuleOperator rule_operator = 3;</code>
     */
    public Builder setRuleOperator(com.google.ads.googleads.v1.enums.UserListCombinedRuleOperatorEnum.UserListCombinedRuleOperator value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      ruleOperator_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Operator to connect the two operands.
     * Required for creating a combined rule user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.enums.UserListCombinedRuleOperatorEnum.UserListCombinedRuleOperator rule_operator = 3;</code>
     */
    public Builder clearRuleOperator() {
      
      ruleOperator_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.common.CombinedRuleUserListInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.common.CombinedRuleUserListInfo)
  private static final com.google.ads.googleads.v1.common.CombinedRuleUserListInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.common.CombinedRuleUserListInfo();
  }

  public static com.google.ads.googleads.v1.common.CombinedRuleUserListInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CombinedRuleUserListInfo>
      PARSER = new com.google.protobuf.AbstractParser<CombinedRuleUserListInfo>() {
    @java.lang.Override
    public CombinedRuleUserListInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CombinedRuleUserListInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CombinedRuleUserListInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CombinedRuleUserListInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.common.CombinedRuleUserListInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
