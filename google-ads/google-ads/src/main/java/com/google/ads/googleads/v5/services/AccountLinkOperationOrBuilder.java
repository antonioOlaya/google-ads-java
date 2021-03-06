// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/services/account_link_service.proto

package com.google.ads.googleads.v5.services;

public interface AccountLinkOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v5.services.AccountLinkOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Remove operation: A resource name for the account link to remove is
   * expected, in this format:
   * `customers/{customer_id}/accountLinks/{account_link_id}`
   * </pre>
   *
   * <code>string remove = 3;</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the account link to remove is
   * expected, in this format:
   * `customers/{customer_id}/accountLinks/{account_link_id}`
   * </pre>
   *
   * <code>string remove = 3;</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  public com.google.ads.googleads.v5.services.AccountLinkOperation.OperationCase getOperationCase();
}
