// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/campaign_label_service.proto

package com.google.ads.googleads.v3.services;

public interface MutateCampaignLabelsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.services.MutateCampaignLabelsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. ID of the customer whose campaign-label relationships are being modified.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. ID of the customer whose campaign-label relationships are being modified.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The list of operations to perform on campaign-label relationships.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.services.CampaignLabelOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.ads.googleads.v3.services.CampaignLabelOperation> 
      getOperationsList();
  /**
   * <pre>
   * Required. The list of operations to perform on campaign-label relationships.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.services.CampaignLabelOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v3.services.CampaignLabelOperation getOperations(int index);
  /**
   * <pre>
   * Required. The list of operations to perform on campaign-label relationships.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.services.CampaignLabelOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getOperationsCount();
  /**
   * <pre>
   * Required. The list of operations to perform on campaign-label relationships.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.services.CampaignLabelOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v3.services.CampaignLabelOperationOrBuilder> 
      getOperationsOrBuilderList();
  /**
   * <pre>
   * Required. The list of operations to perform on campaign-label relationships.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.services.CampaignLabelOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v3.services.CampaignLabelOperationOrBuilder getOperationsOrBuilder(
      int index);

  /**
   * <pre>
   * If true, successful operations will be carried out and invalid
   * operations will return errors. If false, all operations will be carried
   * out in one transaction if and only if they are all valid.
   * Default is false.
   * </pre>
   *
   * <code>bool partial_failure = 3;</code>
   */
  boolean getPartialFailure();

  /**
   * <pre>
   * If true, the request is validated but not executed. Only errors are
   * returned, not results.
   * </pre>
   *
   * <code>bool validate_only = 4;</code>
   */
  boolean getValidateOnly();
}
