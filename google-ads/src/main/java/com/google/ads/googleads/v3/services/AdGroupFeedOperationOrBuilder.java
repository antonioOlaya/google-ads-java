// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/ad_group_feed_service.proto

package com.google.ads.googleads.v3.services;

public interface AdGroupFeedOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.services.AdGroupFeedOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Create operation: No resource name is expected for the new ad group feed.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.AdGroupFeed create = 1;</code>
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new ad group feed.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.AdGroupFeed create = 1;</code>
   */
  com.google.ads.googleads.v3.resources.AdGroupFeed getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new ad group feed.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.AdGroupFeed create = 1;</code>
   */
  com.google.ads.googleads.v3.resources.AdGroupFeedOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Update operation: The ad group feed is expected to have a valid resource
   * name.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.AdGroupFeed update = 2;</code>
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The ad group feed is expected to have a valid resource
   * name.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.AdGroupFeed update = 2;</code>
   */
  com.google.ads.googleads.v3.resources.AdGroupFeed getUpdate();
  /**
   * <pre>
   * Update operation: The ad group feed is expected to have a valid resource
   * name.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.AdGroupFeed update = 2;</code>
   */
  com.google.ads.googleads.v3.resources.AdGroupFeedOrBuilder getUpdateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed ad group feed is
   * expected, in this format:
   * `customers/{customer_id}/adGroupFeeds/{ad_group_id}~{feed_id}`
   * </pre>
   *
   * <code>string remove = 3;</code>
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed ad group feed is
   * expected, in this format:
   * `customers/{customer_id}/adGroupFeeds/{ad_group_id}~{feed_id}`
   * </pre>
   *
   * <code>string remove = 3;</code>
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  public com.google.ads.googleads.v3.services.AdGroupFeedOperation.OperationCase getOperationCase();
}
