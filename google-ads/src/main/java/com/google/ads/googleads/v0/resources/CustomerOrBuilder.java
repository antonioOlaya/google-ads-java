// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/resources/customer.proto

package com.google.ads.googleads.v0.resources;

public interface CustomerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v0.resources.Customer)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the customer.
   * Customer resource names have the form:
   * `customers/{customer_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the customer.
   * Customer resource names have the form:
   * `customers/{customer_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The ID of the customer.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3;</code>
   */
  boolean hasId();
  /**
   * <pre>
   * The ID of the customer.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3;</code>
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * The ID of the customer.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Optional, non-unique descriptive name of the customer.
   * </pre>
   *
   * <code>.google.protobuf.StringValue descriptive_name = 4;</code>
   */
  boolean hasDescriptiveName();
  /**
   * <pre>
   * Optional, non-unique descriptive name of the customer.
   * </pre>
   *
   * <code>.google.protobuf.StringValue descriptive_name = 4;</code>
   */
  com.google.protobuf.StringValue getDescriptiveName();
  /**
   * <pre>
   * Optional, non-unique descriptive name of the customer.
   * </pre>
   *
   * <code>.google.protobuf.StringValue descriptive_name = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getDescriptiveNameOrBuilder();

  /**
   * <pre>
   * The currency in which the account operates.
   * A subset of the currency codes from the ISO 4217 standard is
   * supported.
   * </pre>
   *
   * <code>.google.protobuf.StringValue currency_code = 5;</code>
   */
  boolean hasCurrencyCode();
  /**
   * <pre>
   * The currency in which the account operates.
   * A subset of the currency codes from the ISO 4217 standard is
   * supported.
   * </pre>
   *
   * <code>.google.protobuf.StringValue currency_code = 5;</code>
   */
  com.google.protobuf.StringValue getCurrencyCode();
  /**
   * <pre>
   * The currency in which the account operates.
   * A subset of the currency codes from the ISO 4217 standard is
   * supported.
   * </pre>
   *
   * <code>.google.protobuf.StringValue currency_code = 5;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCurrencyCodeOrBuilder();

  /**
   * <pre>
   * The local timezone ID of the customer.
   * </pre>
   *
   * <code>.google.protobuf.StringValue time_zone = 6;</code>
   */
  boolean hasTimeZone();
  /**
   * <pre>
   * The local timezone ID of the customer.
   * </pre>
   *
   * <code>.google.protobuf.StringValue time_zone = 6;</code>
   */
  com.google.protobuf.StringValue getTimeZone();
  /**
   * <pre>
   * The local timezone ID of the customer.
   * </pre>
   *
   * <code>.google.protobuf.StringValue time_zone = 6;</code>
   */
  com.google.protobuf.StringValueOrBuilder getTimeZoneOrBuilder();

  /**
   * <pre>
   * The URL template for constructing a tracking URL out of parameters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 7;</code>
   */
  boolean hasTrackingUrlTemplate();
  /**
   * <pre>
   * The URL template for constructing a tracking URL out of parameters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 7;</code>
   */
  com.google.protobuf.StringValue getTrackingUrlTemplate();
  /**
   * <pre>
   * The URL template for constructing a tracking URL out of parameters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 7;</code>
   */
  com.google.protobuf.StringValueOrBuilder getTrackingUrlTemplateOrBuilder();

  /**
   * <pre>
   * The URL template for appending params to the final URL
   * </pre>
   *
   * <code>.google.protobuf.StringValue final_url_suffix = 11;</code>
   */
  boolean hasFinalUrlSuffix();
  /**
   * <pre>
   * The URL template for appending params to the final URL
   * </pre>
   *
   * <code>.google.protobuf.StringValue final_url_suffix = 11;</code>
   */
  com.google.protobuf.StringValue getFinalUrlSuffix();
  /**
   * <pre>
   * The URL template for appending params to the final URL
   * </pre>
   *
   * <code>.google.protobuf.StringValue final_url_suffix = 11;</code>
   */
  com.google.protobuf.StringValueOrBuilder getFinalUrlSuffixOrBuilder();

  /**
   * <pre>
   * Whether auto-tagging is enabled for the customer.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue auto_tagging_enabled = 8;</code>
   */
  boolean hasAutoTaggingEnabled();
  /**
   * <pre>
   * Whether auto-tagging is enabled for the customer.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue auto_tagging_enabled = 8;</code>
   */
  com.google.protobuf.BoolValue getAutoTaggingEnabled();
  /**
   * <pre>
   * Whether auto-tagging is enabled for the customer.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue auto_tagging_enabled = 8;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getAutoTaggingEnabledOrBuilder();

  /**
   * <pre>
   * Whether the Customer has a Partners program badge. If the Customer is not
   * associated with the Partners program, this will be false. For more
   * information, see https://support.google.com/partners/answer/3125774.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_partners_badge = 9;</code>
   */
  boolean hasHasPartnersBadge();
  /**
   * <pre>
   * Whether the Customer has a Partners program badge. If the Customer is not
   * associated with the Partners program, this will be false. For more
   * information, see https://support.google.com/partners/answer/3125774.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_partners_badge = 9;</code>
   */
  com.google.protobuf.BoolValue getHasPartnersBadge();
  /**
   * <pre>
   * Whether the Customer has a Partners program badge. If the Customer is not
   * associated with the Partners program, this will be false. For more
   * information, see https://support.google.com/partners/answer/3125774.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_partners_badge = 9;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getHasPartnersBadgeOrBuilder();

  /**
   * <pre>
   * Call reporting setting for a customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.resources.CallReportingSetting call_reporting_setting = 10;</code>
   */
  boolean hasCallReportingSetting();
  /**
   * <pre>
   * Call reporting setting for a customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.resources.CallReportingSetting call_reporting_setting = 10;</code>
   */
  com.google.ads.googleads.v0.resources.CallReportingSetting getCallReportingSetting();
  /**
   * <pre>
   * Call reporting setting for a customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.resources.CallReportingSetting call_reporting_setting = 10;</code>
   */
  com.google.ads.googleads.v0.resources.CallReportingSettingOrBuilder getCallReportingSettingOrBuilder();
}
