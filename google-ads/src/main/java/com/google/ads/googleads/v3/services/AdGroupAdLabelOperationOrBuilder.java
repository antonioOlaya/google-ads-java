// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/ad_group_ad_label_service.proto

package com.google.ads.googleads.v3.services;

public interface AdGroupAdLabelOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.services.AdGroupAdLabelOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Create operation: No resource name is expected for the new ad group ad
   * label.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.AdGroupAdLabel create = 1;</code>
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new ad group ad
   * label.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.AdGroupAdLabel create = 1;</code>
   */
  com.google.ads.googleads.v3.resources.AdGroupAdLabel getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new ad group ad
   * label.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.AdGroupAdLabel create = 1;</code>
   */
  com.google.ads.googleads.v3.resources.AdGroupAdLabelOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the ad group ad label
   * being removed, in this format:
   * `customers/{customer_id}/adGroupAdLabels/{ad_group_id}~{ad_id}
   * _{label_id}`
   * </pre>
   *
   * <code>string remove = 2;</code>
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the ad group ad label
   * being removed, in this format:
   * `customers/{customer_id}/adGroupAdLabels/{ad_group_id}~{ad_id}
   * _{label_id}`
   * </pre>
   *
   * <code>string remove = 2;</code>
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  public com.google.ads.googleads.v3.services.AdGroupAdLabelOperation.OperationCase getOperationCase();
}
