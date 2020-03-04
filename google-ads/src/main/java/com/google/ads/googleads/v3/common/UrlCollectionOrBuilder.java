// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/common/url_collection.proto

package com.google.ads.googleads.v3.common;

public interface UrlCollectionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.common.UrlCollection)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Unique identifier for this UrlCollection instance.
   * </pre>
   *
   * <code>.google.protobuf.StringValue url_collection_id = 1;</code>
   */
  boolean hasUrlCollectionId();
  /**
   * <pre>
   * Unique identifier for this UrlCollection instance.
   * </pre>
   *
   * <code>.google.protobuf.StringValue url_collection_id = 1;</code>
   */
  com.google.protobuf.StringValue getUrlCollectionId();
  /**
   * <pre>
   * Unique identifier for this UrlCollection instance.
   * </pre>
   *
   * <code>.google.protobuf.StringValue url_collection_id = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getUrlCollectionIdOrBuilder();

  /**
   * <pre>
   * A list of possible final URLs.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_urls = 2;</code>
   */
  java.util.List<com.google.protobuf.StringValue> 
      getFinalUrlsList();
  /**
   * <pre>
   * A list of possible final URLs.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_urls = 2;</code>
   */
  com.google.protobuf.StringValue getFinalUrls(int index);
  /**
   * <pre>
   * A list of possible final URLs.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_urls = 2;</code>
   */
  int getFinalUrlsCount();
  /**
   * <pre>
   * A list of possible final URLs.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_urls = 2;</code>
   */
  java.util.List<? extends com.google.protobuf.StringValueOrBuilder> 
      getFinalUrlsOrBuilderList();
  /**
   * <pre>
   * A list of possible final URLs.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_urls = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getFinalUrlsOrBuilder(
      int index);

  /**
   * <pre>
   * A list of possible final mobile URLs.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_mobile_urls = 3;</code>
   */
  java.util.List<com.google.protobuf.StringValue> 
      getFinalMobileUrlsList();
  /**
   * <pre>
   * A list of possible final mobile URLs.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_mobile_urls = 3;</code>
   */
  com.google.protobuf.StringValue getFinalMobileUrls(int index);
  /**
   * <pre>
   * A list of possible final mobile URLs.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_mobile_urls = 3;</code>
   */
  int getFinalMobileUrlsCount();
  /**
   * <pre>
   * A list of possible final mobile URLs.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_mobile_urls = 3;</code>
   */
  java.util.List<? extends com.google.protobuf.StringValueOrBuilder> 
      getFinalMobileUrlsOrBuilderList();
  /**
   * <pre>
   * A list of possible final mobile URLs.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_mobile_urls = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getFinalMobileUrlsOrBuilder(
      int index);

  /**
   * <pre>
   * URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 4;</code>
   */
  boolean hasTrackingUrlTemplate();
  /**
   * <pre>
   * URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 4;</code>
   */
  com.google.protobuf.StringValue getTrackingUrlTemplate();
  /**
   * <pre>
   * URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getTrackingUrlTemplateOrBuilder();
}
