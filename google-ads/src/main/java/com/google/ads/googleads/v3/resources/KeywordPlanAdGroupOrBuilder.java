// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/keyword_plan_ad_group.proto

package com.google.ads.googleads.v3.resources;

public interface KeywordPlanAdGroupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.resources.KeywordPlanAdGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the Keyword Planner ad group.
   * KeywordPlanAdGroup resource names have the form:
   * `customers/{customer_id}/keywordPlanAdGroups/{kp_ad_group_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the Keyword Planner ad group.
   * KeywordPlanAdGroup resource names have the form:
   * `customers/{customer_id}/keywordPlanAdGroups/{kp_ad_group_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The keyword plan campaign to which this ad group belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue keyword_plan_campaign = 2;</code>
   */
  boolean hasKeywordPlanCampaign();
  /**
   * <pre>
   * The keyword plan campaign to which this ad group belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue keyword_plan_campaign = 2;</code>
   */
  com.google.protobuf.StringValue getKeywordPlanCampaign();
  /**
   * <pre>
   * The keyword plan campaign to which this ad group belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue keyword_plan_campaign = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getKeywordPlanCampaignOrBuilder();

  /**
   * <pre>
   * The ID of the keyword plan ad group.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3;</code>
   */
  boolean hasId();
  /**
   * <pre>
   * The ID of the keyword plan ad group.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3;</code>
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * The ID of the keyword plan ad group.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * The name of the keyword plan ad group.
   * This field is required and should not be empty when creating keyword plan
   * ad group.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   */
  boolean hasName();
  /**
   * <pre>
   * The name of the keyword plan ad group.
   * This field is required and should not be empty when creating keyword plan
   * ad group.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   */
  com.google.protobuf.StringValue getName();
  /**
   * <pre>
   * The name of the keyword plan ad group.
   * This field is required and should not be empty when creating keyword plan
   * ad group.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * A default ad group max cpc bid in micros in account currency for all
   * biddable keywords under the keyword plan ad group.
   * If not set, will inherit from parent campaign.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_micros = 5;</code>
   */
  boolean hasCpcBidMicros();
  /**
   * <pre>
   * A default ad group max cpc bid in micros in account currency for all
   * biddable keywords under the keyword plan ad group.
   * If not set, will inherit from parent campaign.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_micros = 5;</code>
   */
  com.google.protobuf.Int64Value getCpcBidMicros();
  /**
   * <pre>
   * A default ad group max cpc bid in micros in account currency for all
   * biddable keywords under the keyword plan ad group.
   * If not set, will inherit from parent campaign.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_micros = 5;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCpcBidMicrosOrBuilder();
}
