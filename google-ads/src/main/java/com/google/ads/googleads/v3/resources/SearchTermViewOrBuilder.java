// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/search_term_view.proto

package com.google.ads.googleads.v3.resources;

public interface SearchTermViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.resources.SearchTermView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the search term view.
   * Search term view resource names have the form:
   * `customers/{customer_id}/searchTermViews/{campaign_id}~{ad_group_id}~{URL-base64_search_term}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the search term view.
   * Search term view resource names have the form:
   * `customers/{customer_id}/searchTermViews/{campaign_id}~{ad_group_id}~{URL-base64_search_term}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The search term.
   * </pre>
   *
   * <code>.google.protobuf.StringValue search_term = 2;</code>
   */
  boolean hasSearchTerm();
  /**
   * <pre>
   * The search term.
   * </pre>
   *
   * <code>.google.protobuf.StringValue search_term = 2;</code>
   */
  com.google.protobuf.StringValue getSearchTerm();
  /**
   * <pre>
   * The search term.
   * </pre>
   *
   * <code>.google.protobuf.StringValue search_term = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getSearchTermOrBuilder();

  /**
   * <pre>
   * The ad group the search term served in.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 3;</code>
   */
  boolean hasAdGroup();
  /**
   * <pre>
   * The ad group the search term served in.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 3;</code>
   */
  com.google.protobuf.StringValue getAdGroup();
  /**
   * <pre>
   * The ad group the search term served in.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getAdGroupOrBuilder();

  /**
   * <pre>
   * Indicates whether the search term is currently one of your
   * targeted or excluded keywords.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.SearchTermTargetingStatusEnum.SearchTermTargetingStatus status = 4;</code>
   */
  int getStatusValue();
  /**
   * <pre>
   * Indicates whether the search term is currently one of your
   * targeted or excluded keywords.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.SearchTermTargetingStatusEnum.SearchTermTargetingStatus status = 4;</code>
   */
  com.google.ads.googleads.v3.enums.SearchTermTargetingStatusEnum.SearchTermTargetingStatus getStatus();
}