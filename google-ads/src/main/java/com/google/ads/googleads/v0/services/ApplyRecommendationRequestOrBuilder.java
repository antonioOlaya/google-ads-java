// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/services/recommendation_service.proto

package com.google.ads.googleads.v0.services;

public interface ApplyRecommendationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v0.services.ApplyRecommendationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the customer with the recommendation.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * The ID of the customer with the recommendation.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * If true, successful operations will be carried out and invalid
   * operations will return errors. If false, operations will be carried
   * out as a transaction if and only if they are all valid.
   * Default is false.
   * </pre>
   *
   * <code>bool partial_failure = 3;</code>
   */
  boolean getPartialFailure();

  /**
   * <pre>
   * The list of operations to apply recommendations.
   * If partial_failure=false all recommendations should be of the same type
   * There is a limit of 100 operations per request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.services.ApplyRecommendationOperation operations = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v0.services.ApplyRecommendationOperation> 
      getOperationsList();
  /**
   * <pre>
   * The list of operations to apply recommendations.
   * If partial_failure=false all recommendations should be of the same type
   * There is a limit of 100 operations per request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.services.ApplyRecommendationOperation operations = 2;</code>
   */
  com.google.ads.googleads.v0.services.ApplyRecommendationOperation getOperations(int index);
  /**
   * <pre>
   * The list of operations to apply recommendations.
   * If partial_failure=false all recommendations should be of the same type
   * There is a limit of 100 operations per request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.services.ApplyRecommendationOperation operations = 2;</code>
   */
  int getOperationsCount();
  /**
   * <pre>
   * The list of operations to apply recommendations.
   * If partial_failure=false all recommendations should be of the same type
   * There is a limit of 100 operations per request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.services.ApplyRecommendationOperation operations = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v0.services.ApplyRecommendationOperationOrBuilder> 
      getOperationsOrBuilderList();
  /**
   * <pre>
   * The list of operations to apply recommendations.
   * If partial_failure=false all recommendations should be of the same type
   * There is a limit of 100 operations per request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.services.ApplyRecommendationOperation operations = 2;</code>
   */
  com.google.ads.googleads.v0.services.ApplyRecommendationOperationOrBuilder getOperationsOrBuilder(
      int index);
}
