// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/services/campaign_budget_service.proto

package com.google.ads.googleads.v0.services;

public interface CampaignBudgetOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v0.services.CampaignBudgetOperation)
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
   * Create operation: No resource name is expected for the new budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.resources.CampaignBudget create = 1;</code>
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.resources.CampaignBudget create = 1;</code>
   */
  com.google.ads.googleads.v0.resources.CampaignBudget getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.resources.CampaignBudget create = 1;</code>
   */
  com.google.ads.googleads.v0.resources.CampaignBudgetOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Update operation: The campaign budget is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.resources.CampaignBudget update = 2;</code>
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The campaign budget is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.resources.CampaignBudget update = 2;</code>
   */
  com.google.ads.googleads.v0.resources.CampaignBudget getUpdate();
  /**
   * <pre>
   * Update operation: The campaign budget is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.resources.CampaignBudget update = 2;</code>
   */
  com.google.ads.googleads.v0.resources.CampaignBudgetOrBuilder getUpdateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed budget is expected, in
   * this format:
   * `customers/{customer_id}/campaignBudgets/{budget_id}`
   * </pre>
   *
   * <code>string remove = 3;</code>
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed budget is expected, in
   * this format:
   * `customers/{customer_id}/campaignBudgets/{budget_id}`
   * </pre>
   *
   * <code>string remove = 3;</code>
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  public com.google.ads.googleads.v0.services.CampaignBudgetOperation.OperationCase getOperationCase();
}