// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/feed_item.proto

package com.google.ads.googleads.v3.resources;

public interface FeedItemPlaceholderPolicyInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.resources.FeedItemPlaceholderPolicyInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The placeholder type.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.PlaceholderTypeEnum.PlaceholderType placeholder_type_enum = 10;</code>
   */
  int getPlaceholderTypeEnumValue();
  /**
   * <pre>
   * The placeholder type.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.PlaceholderTypeEnum.PlaceholderType placeholder_type_enum = 10;</code>
   */
  com.google.ads.googleads.v3.enums.PlaceholderTypeEnum.PlaceholderType getPlaceholderTypeEnum();

  /**
   * <pre>
   * The FeedMapping that contains the placeholder type.
   * </pre>
   *
   * <code>.google.protobuf.StringValue feed_mapping_resource_name = 2;</code>
   */
  boolean hasFeedMappingResourceName();
  /**
   * <pre>
   * The FeedMapping that contains the placeholder type.
   * </pre>
   *
   * <code>.google.protobuf.StringValue feed_mapping_resource_name = 2;</code>
   */
  com.google.protobuf.StringValue getFeedMappingResourceName();
  /**
   * <pre>
   * The FeedMapping that contains the placeholder type.
   * </pre>
   *
   * <code>.google.protobuf.StringValue feed_mapping_resource_name = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getFeedMappingResourceNameOrBuilder();

  /**
   * <pre>
   * Where the placeholder type is in the review process.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.PolicyReviewStatusEnum.PolicyReviewStatus review_status = 3;</code>
   */
  int getReviewStatusValue();
  /**
   * <pre>
   * Where the placeholder type is in the review process.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.PolicyReviewStatusEnum.PolicyReviewStatus review_status = 3;</code>
   */
  com.google.ads.googleads.v3.enums.PolicyReviewStatusEnum.PolicyReviewStatus getReviewStatus();

  /**
   * <pre>
   * The overall approval status of the placeholder type, calculated based on
   * the status of its individual policy topic entries.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.PolicyApprovalStatusEnum.PolicyApprovalStatus approval_status = 4;</code>
   */
  int getApprovalStatusValue();
  /**
   * <pre>
   * The overall approval status of the placeholder type, calculated based on
   * the status of its individual policy topic entries.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.PolicyApprovalStatusEnum.PolicyApprovalStatus approval_status = 4;</code>
   */
  com.google.ads.googleads.v3.enums.PolicyApprovalStatusEnum.PolicyApprovalStatus getApprovalStatus();

  /**
   * <pre>
   * The list of policy findings for the placeholder type.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.common.PolicyTopicEntry policy_topic_entries = 5;</code>
   */
  java.util.List<com.google.ads.googleads.v3.common.PolicyTopicEntry> 
      getPolicyTopicEntriesList();
  /**
   * <pre>
   * The list of policy findings for the placeholder type.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.common.PolicyTopicEntry policy_topic_entries = 5;</code>
   */
  com.google.ads.googleads.v3.common.PolicyTopicEntry getPolicyTopicEntries(int index);
  /**
   * <pre>
   * The list of policy findings for the placeholder type.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.common.PolicyTopicEntry policy_topic_entries = 5;</code>
   */
  int getPolicyTopicEntriesCount();
  /**
   * <pre>
   * The list of policy findings for the placeholder type.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.common.PolicyTopicEntry policy_topic_entries = 5;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v3.common.PolicyTopicEntryOrBuilder> 
      getPolicyTopicEntriesOrBuilderList();
  /**
   * <pre>
   * The list of policy findings for the placeholder type.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.common.PolicyTopicEntry policy_topic_entries = 5;</code>
   */
  com.google.ads.googleads.v3.common.PolicyTopicEntryOrBuilder getPolicyTopicEntriesOrBuilder(
      int index);

  /**
   * <pre>
   * The validation status of the palceholder type.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.FeedItemValidationStatusEnum.FeedItemValidationStatus validation_status = 6;</code>
   */
  int getValidationStatusValue();
  /**
   * <pre>
   * The validation status of the palceholder type.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.FeedItemValidationStatusEnum.FeedItemValidationStatus validation_status = 6;</code>
   */
  com.google.ads.googleads.v3.enums.FeedItemValidationStatusEnum.FeedItemValidationStatus getValidationStatus();

  /**
   * <pre>
   * List of placeholder type validation errors.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.resources.FeedItemValidationError validation_errors = 7;</code>
   */
  java.util.List<com.google.ads.googleads.v3.resources.FeedItemValidationError> 
      getValidationErrorsList();
  /**
   * <pre>
   * List of placeholder type validation errors.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.resources.FeedItemValidationError validation_errors = 7;</code>
   */
  com.google.ads.googleads.v3.resources.FeedItemValidationError getValidationErrors(int index);
  /**
   * <pre>
   * List of placeholder type validation errors.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.resources.FeedItemValidationError validation_errors = 7;</code>
   */
  int getValidationErrorsCount();
  /**
   * <pre>
   * List of placeholder type validation errors.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.resources.FeedItemValidationError validation_errors = 7;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v3.resources.FeedItemValidationErrorOrBuilder> 
      getValidationErrorsOrBuilderList();
  /**
   * <pre>
   * List of placeholder type validation errors.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.resources.FeedItemValidationError validation_errors = 7;</code>
   */
  com.google.ads.googleads.v3.resources.FeedItemValidationErrorOrBuilder getValidationErrorsOrBuilder(
      int index);

  /**
   * <pre>
   * Placeholder type quality evaluation approval status.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.FeedItemQualityApprovalStatusEnum.FeedItemQualityApprovalStatus quality_approval_status = 8;</code>
   */
  int getQualityApprovalStatusValue();
  /**
   * <pre>
   * Placeholder type quality evaluation approval status.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.FeedItemQualityApprovalStatusEnum.FeedItemQualityApprovalStatus quality_approval_status = 8;</code>
   */
  com.google.ads.googleads.v3.enums.FeedItemQualityApprovalStatusEnum.FeedItemQualityApprovalStatus getQualityApprovalStatus();

  /**
   * <pre>
   * List of placeholder type quality evaluation disapproval reasons.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.enums.FeedItemQualityDisapprovalReasonEnum.FeedItemQualityDisapprovalReason quality_disapproval_reasons = 9;</code>
   */
  java.util.List<com.google.ads.googleads.v3.enums.FeedItemQualityDisapprovalReasonEnum.FeedItemQualityDisapprovalReason> getQualityDisapprovalReasonsList();
  /**
   * <pre>
   * List of placeholder type quality evaluation disapproval reasons.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.enums.FeedItemQualityDisapprovalReasonEnum.FeedItemQualityDisapprovalReason quality_disapproval_reasons = 9;</code>
   */
  int getQualityDisapprovalReasonsCount();
  /**
   * <pre>
   * List of placeholder type quality evaluation disapproval reasons.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.enums.FeedItemQualityDisapprovalReasonEnum.FeedItemQualityDisapprovalReason quality_disapproval_reasons = 9;</code>
   */
  com.google.ads.googleads.v3.enums.FeedItemQualityDisapprovalReasonEnum.FeedItemQualityDisapprovalReason getQualityDisapprovalReasons(int index);
  /**
   * <pre>
   * List of placeholder type quality evaluation disapproval reasons.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.enums.FeedItemQualityDisapprovalReasonEnum.FeedItemQualityDisapprovalReason quality_disapproval_reasons = 9;</code>
   */
  java.util.List<java.lang.Integer>
  getQualityDisapprovalReasonsValueList();
  /**
   * <pre>
   * List of placeholder type quality evaluation disapproval reasons.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.enums.FeedItemQualityDisapprovalReasonEnum.FeedItemQualityDisapprovalReason quality_disapproval_reasons = 9;</code>
   */
  int getQualityDisapprovalReasonsValue(int index);
}
