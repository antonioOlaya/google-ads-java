// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/services/payments_account_service.proto

package com.google.ads.googleads.v0.services;

/**
 * <pre>
 * Response message for [PaymentsAccountService.ListPaymentsAccounts][google.ads.googleads.v0.services.PaymentsAccountService.ListPaymentsAccounts].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v0.services.ListPaymentsAccountsResponse}
 */
public  final class ListPaymentsAccountsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v0.services.ListPaymentsAccountsResponse)
    ListPaymentsAccountsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListPaymentsAccountsResponse.newBuilder() to construct.
  private ListPaymentsAccountsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListPaymentsAccountsResponse() {
    paymentsAccounts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListPaymentsAccountsResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              paymentsAccounts_ = new java.util.ArrayList<com.google.ads.googleads.v0.resources.PaymentsAccount>();
              mutable_bitField0_ |= 0x00000001;
            }
            paymentsAccounts_.add(
                input.readMessage(com.google.ads.googleads.v0.resources.PaymentsAccount.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        paymentsAccounts_ = java.util.Collections.unmodifiableList(paymentsAccounts_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v0.services.PaymentsAccountServiceProto.internal_static_google_ads_googleads_v0_services_ListPaymentsAccountsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v0.services.PaymentsAccountServiceProto.internal_static_google_ads_googleads_v0_services_ListPaymentsAccountsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse.class, com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse.Builder.class);
  }

  public static final int PAYMENTS_ACCOUNTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.ads.googleads.v0.resources.PaymentsAccount> paymentsAccounts_;
  /**
   * <pre>
   * The list of accessible Payments accounts.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.resources.PaymentsAccount payments_accounts = 1;</code>
   */
  public java.util.List<com.google.ads.googleads.v0.resources.PaymentsAccount> getPaymentsAccountsList() {
    return paymentsAccounts_;
  }
  /**
   * <pre>
   * The list of accessible Payments accounts.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.resources.PaymentsAccount payments_accounts = 1;</code>
   */
  public java.util.List<? extends com.google.ads.googleads.v0.resources.PaymentsAccountOrBuilder> 
      getPaymentsAccountsOrBuilderList() {
    return paymentsAccounts_;
  }
  /**
   * <pre>
   * The list of accessible Payments accounts.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.resources.PaymentsAccount payments_accounts = 1;</code>
   */
  public int getPaymentsAccountsCount() {
    return paymentsAccounts_.size();
  }
  /**
   * <pre>
   * The list of accessible Payments accounts.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.resources.PaymentsAccount payments_accounts = 1;</code>
   */
  public com.google.ads.googleads.v0.resources.PaymentsAccount getPaymentsAccounts(int index) {
    return paymentsAccounts_.get(index);
  }
  /**
   * <pre>
   * The list of accessible Payments accounts.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.resources.PaymentsAccount payments_accounts = 1;</code>
   */
  public com.google.ads.googleads.v0.resources.PaymentsAccountOrBuilder getPaymentsAccountsOrBuilder(
      int index) {
    return paymentsAccounts_.get(index);
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
    for (int i = 0; i < paymentsAccounts_.size(); i++) {
      output.writeMessage(1, paymentsAccounts_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < paymentsAccounts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, paymentsAccounts_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse other = (com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse) obj;

    boolean result = true;
    result = result && getPaymentsAccountsList()
        .equals(other.getPaymentsAccountsList());
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
    if (getPaymentsAccountsCount() > 0) {
      hash = (37 * hash) + PAYMENTS_ACCOUNTS_FIELD_NUMBER;
      hash = (53 * hash) + getPaymentsAccountsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse prototype) {
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
   * Response message for [PaymentsAccountService.ListPaymentsAccounts][google.ads.googleads.v0.services.PaymentsAccountService.ListPaymentsAccounts].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v0.services.ListPaymentsAccountsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v0.services.ListPaymentsAccountsResponse)
      com.google.ads.googleads.v0.services.ListPaymentsAccountsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v0.services.PaymentsAccountServiceProto.internal_static_google_ads_googleads_v0_services_ListPaymentsAccountsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v0.services.PaymentsAccountServiceProto.internal_static_google_ads_googleads_v0_services_ListPaymentsAccountsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse.class, com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse.newBuilder()
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
        getPaymentsAccountsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (paymentsAccountsBuilder_ == null) {
        paymentsAccounts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        paymentsAccountsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v0.services.PaymentsAccountServiceProto.internal_static_google_ads_googleads_v0_services_ListPaymentsAccountsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse build() {
      com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse buildPartial() {
      com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse result = new com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse(this);
      int from_bitField0_ = bitField0_;
      if (paymentsAccountsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          paymentsAccounts_ = java.util.Collections.unmodifiableList(paymentsAccounts_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.paymentsAccounts_ = paymentsAccounts_;
      } else {
        result.paymentsAccounts_ = paymentsAccountsBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse) {
        return mergeFrom((com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse other) {
      if (other == com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse.getDefaultInstance()) return this;
      if (paymentsAccountsBuilder_ == null) {
        if (!other.paymentsAccounts_.isEmpty()) {
          if (paymentsAccounts_.isEmpty()) {
            paymentsAccounts_ = other.paymentsAccounts_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePaymentsAccountsIsMutable();
            paymentsAccounts_.addAll(other.paymentsAccounts_);
          }
          onChanged();
        }
      } else {
        if (!other.paymentsAccounts_.isEmpty()) {
          if (paymentsAccountsBuilder_.isEmpty()) {
            paymentsAccountsBuilder_.dispose();
            paymentsAccountsBuilder_ = null;
            paymentsAccounts_ = other.paymentsAccounts_;
            bitField0_ = (bitField0_ & ~0x00000001);
            paymentsAccountsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPaymentsAccountsFieldBuilder() : null;
          } else {
            paymentsAccountsBuilder_.addAllMessages(other.paymentsAccounts_);
          }
        }
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
      com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.ads.googleads.v0.resources.PaymentsAccount> paymentsAccounts_ =
      java.util.Collections.emptyList();
    private void ensurePaymentsAccountsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        paymentsAccounts_ = new java.util.ArrayList<com.google.ads.googleads.v0.resources.PaymentsAccount>(paymentsAccounts_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v0.resources.PaymentsAccount, com.google.ads.googleads.v0.resources.PaymentsAccount.Builder, com.google.ads.googleads.v0.resources.PaymentsAccountOrBuilder> paymentsAccountsBuilder_;

    /**
     * <pre>
     * The list of accessible Payments accounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.resources.PaymentsAccount payments_accounts = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v0.resources.PaymentsAccount> getPaymentsAccountsList() {
      if (paymentsAccountsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(paymentsAccounts_);
      } else {
        return paymentsAccountsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of accessible Payments accounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.resources.PaymentsAccount payments_accounts = 1;</code>
     */
    public int getPaymentsAccountsCount() {
      if (paymentsAccountsBuilder_ == null) {
        return paymentsAccounts_.size();
      } else {
        return paymentsAccountsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of accessible Payments accounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.resources.PaymentsAccount payments_accounts = 1;</code>
     */
    public com.google.ads.googleads.v0.resources.PaymentsAccount getPaymentsAccounts(int index) {
      if (paymentsAccountsBuilder_ == null) {
        return paymentsAccounts_.get(index);
      } else {
        return paymentsAccountsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of accessible Payments accounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.resources.PaymentsAccount payments_accounts = 1;</code>
     */
    public Builder setPaymentsAccounts(
        int index, com.google.ads.googleads.v0.resources.PaymentsAccount value) {
      if (paymentsAccountsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePaymentsAccountsIsMutable();
        paymentsAccounts_.set(index, value);
        onChanged();
      } else {
        paymentsAccountsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of accessible Payments accounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.resources.PaymentsAccount payments_accounts = 1;</code>
     */
    public Builder setPaymentsAccounts(
        int index, com.google.ads.googleads.v0.resources.PaymentsAccount.Builder builderForValue) {
      if (paymentsAccountsBuilder_ == null) {
        ensurePaymentsAccountsIsMutable();
        paymentsAccounts_.set(index, builderForValue.build());
        onChanged();
      } else {
        paymentsAccountsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of accessible Payments accounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.resources.PaymentsAccount payments_accounts = 1;</code>
     */
    public Builder addPaymentsAccounts(com.google.ads.googleads.v0.resources.PaymentsAccount value) {
      if (paymentsAccountsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePaymentsAccountsIsMutable();
        paymentsAccounts_.add(value);
        onChanged();
      } else {
        paymentsAccountsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of accessible Payments accounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.resources.PaymentsAccount payments_accounts = 1;</code>
     */
    public Builder addPaymentsAccounts(
        int index, com.google.ads.googleads.v0.resources.PaymentsAccount value) {
      if (paymentsAccountsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePaymentsAccountsIsMutable();
        paymentsAccounts_.add(index, value);
        onChanged();
      } else {
        paymentsAccountsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of accessible Payments accounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.resources.PaymentsAccount payments_accounts = 1;</code>
     */
    public Builder addPaymentsAccounts(
        com.google.ads.googleads.v0.resources.PaymentsAccount.Builder builderForValue) {
      if (paymentsAccountsBuilder_ == null) {
        ensurePaymentsAccountsIsMutable();
        paymentsAccounts_.add(builderForValue.build());
        onChanged();
      } else {
        paymentsAccountsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of accessible Payments accounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.resources.PaymentsAccount payments_accounts = 1;</code>
     */
    public Builder addPaymentsAccounts(
        int index, com.google.ads.googleads.v0.resources.PaymentsAccount.Builder builderForValue) {
      if (paymentsAccountsBuilder_ == null) {
        ensurePaymentsAccountsIsMutable();
        paymentsAccounts_.add(index, builderForValue.build());
        onChanged();
      } else {
        paymentsAccountsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of accessible Payments accounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.resources.PaymentsAccount payments_accounts = 1;</code>
     */
    public Builder addAllPaymentsAccounts(
        java.lang.Iterable<? extends com.google.ads.googleads.v0.resources.PaymentsAccount> values) {
      if (paymentsAccountsBuilder_ == null) {
        ensurePaymentsAccountsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, paymentsAccounts_);
        onChanged();
      } else {
        paymentsAccountsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of accessible Payments accounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.resources.PaymentsAccount payments_accounts = 1;</code>
     */
    public Builder clearPaymentsAccounts() {
      if (paymentsAccountsBuilder_ == null) {
        paymentsAccounts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        paymentsAccountsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of accessible Payments accounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.resources.PaymentsAccount payments_accounts = 1;</code>
     */
    public Builder removePaymentsAccounts(int index) {
      if (paymentsAccountsBuilder_ == null) {
        ensurePaymentsAccountsIsMutable();
        paymentsAccounts_.remove(index);
        onChanged();
      } else {
        paymentsAccountsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of accessible Payments accounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.resources.PaymentsAccount payments_accounts = 1;</code>
     */
    public com.google.ads.googleads.v0.resources.PaymentsAccount.Builder getPaymentsAccountsBuilder(
        int index) {
      return getPaymentsAccountsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of accessible Payments accounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.resources.PaymentsAccount payments_accounts = 1;</code>
     */
    public com.google.ads.googleads.v0.resources.PaymentsAccountOrBuilder getPaymentsAccountsOrBuilder(
        int index) {
      if (paymentsAccountsBuilder_ == null) {
        return paymentsAccounts_.get(index);  } else {
        return paymentsAccountsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of accessible Payments accounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.resources.PaymentsAccount payments_accounts = 1;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v0.resources.PaymentsAccountOrBuilder> 
         getPaymentsAccountsOrBuilderList() {
      if (paymentsAccountsBuilder_ != null) {
        return paymentsAccountsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(paymentsAccounts_);
      }
    }
    /**
     * <pre>
     * The list of accessible Payments accounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.resources.PaymentsAccount payments_accounts = 1;</code>
     */
    public com.google.ads.googleads.v0.resources.PaymentsAccount.Builder addPaymentsAccountsBuilder() {
      return getPaymentsAccountsFieldBuilder().addBuilder(
          com.google.ads.googleads.v0.resources.PaymentsAccount.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of accessible Payments accounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.resources.PaymentsAccount payments_accounts = 1;</code>
     */
    public com.google.ads.googleads.v0.resources.PaymentsAccount.Builder addPaymentsAccountsBuilder(
        int index) {
      return getPaymentsAccountsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v0.resources.PaymentsAccount.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of accessible Payments accounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.resources.PaymentsAccount payments_accounts = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v0.resources.PaymentsAccount.Builder> 
         getPaymentsAccountsBuilderList() {
      return getPaymentsAccountsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v0.resources.PaymentsAccount, com.google.ads.googleads.v0.resources.PaymentsAccount.Builder, com.google.ads.googleads.v0.resources.PaymentsAccountOrBuilder> 
        getPaymentsAccountsFieldBuilder() {
      if (paymentsAccountsBuilder_ == null) {
        paymentsAccountsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v0.resources.PaymentsAccount, com.google.ads.googleads.v0.resources.PaymentsAccount.Builder, com.google.ads.googleads.v0.resources.PaymentsAccountOrBuilder>(
                paymentsAccounts_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        paymentsAccounts_ = null;
      }
      return paymentsAccountsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v0.services.ListPaymentsAccountsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v0.services.ListPaymentsAccountsResponse)
  private static final com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse();
  }

  public static com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListPaymentsAccountsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListPaymentsAccountsResponse>() {
    @java.lang.Override
    public ListPaymentsAccountsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListPaymentsAccountsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListPaymentsAccountsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListPaymentsAccountsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v0.services.ListPaymentsAccountsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

