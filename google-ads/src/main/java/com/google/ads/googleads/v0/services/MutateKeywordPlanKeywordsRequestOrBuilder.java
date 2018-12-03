// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/services/keyword_plan_keyword_service.proto

package com.google.ads.googleads.v0.services;

public interface MutateKeywordPlanKeywordsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v0.services.MutateKeywordPlanKeywordsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the customer whose Keyword Plan keywords are being modified.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * The ID of the customer whose Keyword Plan keywords are being modified.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * The list of operations to perform on individual Keyword Plan keywords.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.services.KeywordPlanKeywordOperation operations = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v0.services.KeywordPlanKeywordOperation> 
      getOperationsList();
  /**
   * <pre>
   * The list of operations to perform on individual Keyword Plan keywords.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.services.KeywordPlanKeywordOperation operations = 2;</code>
   */
  com.google.ads.googleads.v0.services.KeywordPlanKeywordOperation getOperations(int index);
  /**
   * <pre>
   * The list of operations to perform on individual Keyword Plan keywords.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.services.KeywordPlanKeywordOperation operations = 2;</code>
   */
  int getOperationsCount();
  /**
   * <pre>
   * The list of operations to perform on individual Keyword Plan keywords.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.services.KeywordPlanKeywordOperation operations = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v0.services.KeywordPlanKeywordOperationOrBuilder> 
      getOperationsOrBuilderList();
  /**
   * <pre>
   * The list of operations to perform on individual Keyword Plan keywords.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.services.KeywordPlanKeywordOperation operations = 2;</code>
   */
  com.google.ads.googleads.v0.services.KeywordPlanKeywordOperationOrBuilder getOperationsOrBuilder(
      int index);
}
