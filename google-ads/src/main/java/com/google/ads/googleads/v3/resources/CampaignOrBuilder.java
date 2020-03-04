// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/campaign.proto

package com.google.ads.googleads.v3.resources;

public interface CampaignOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.resources.Campaign)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the campaign.
   * Campaign resource names have the form:
   * `customers/{customer_id}/campaigns/{campaign_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the campaign.
   * Campaign resource names have the form:
   * `customers/{customer_id}/campaigns/{campaign_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The ID of the campaign.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3;</code>
   */
  boolean hasId();
  /**
   * <pre>
   * The ID of the campaign.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3;</code>
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * The ID of the campaign.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * The name of the campaign.
   * This field is required and should not be empty when creating new
   * campaigns.
   * It must not contain any null (code point 0x0), NL line feed
   * (code point 0xA) or carriage return (code point 0xD) characters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   */
  boolean hasName();
  /**
   * <pre>
   * The name of the campaign.
   * This field is required and should not be empty when creating new
   * campaigns.
   * It must not contain any null (code point 0x0), NL line feed
   * (code point 0xA) or carriage return (code point 0xD) characters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   */
  com.google.protobuf.StringValue getName();
  /**
   * <pre>
   * The name of the campaign.
   * This field is required and should not be empty when creating new
   * campaigns.
   * It must not contain any null (code point 0x0), NL line feed
   * (code point 0xA) or carriage return (code point 0xD) characters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * The status of the campaign.
   * When a new campaign is added, the status defaults to ENABLED.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.CampaignStatusEnum.CampaignStatus status = 5;</code>
   */
  int getStatusValue();
  /**
   * <pre>
   * The status of the campaign.
   * When a new campaign is added, the status defaults to ENABLED.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.CampaignStatusEnum.CampaignStatus status = 5;</code>
   */
  com.google.ads.googleads.v3.enums.CampaignStatusEnum.CampaignStatus getStatus();

  /**
   * <pre>
   * The ad serving status of the campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.CampaignServingStatusEnum.CampaignServingStatus serving_status = 21;</code>
   */
  int getServingStatusValue();
  /**
   * <pre>
   * The ad serving status of the campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.CampaignServingStatusEnum.CampaignServingStatus serving_status = 21;</code>
   */
  com.google.ads.googleads.v3.enums.CampaignServingStatusEnum.CampaignServingStatus getServingStatus();

  /**
   * <pre>
   * The ad serving optimization status of the campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.AdServingOptimizationStatusEnum.AdServingOptimizationStatus ad_serving_optimization_status = 8;</code>
   */
  int getAdServingOptimizationStatusValue();
  /**
   * <pre>
   * The ad serving optimization status of the campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.AdServingOptimizationStatusEnum.AdServingOptimizationStatus ad_serving_optimization_status = 8;</code>
   */
  com.google.ads.googleads.v3.enums.AdServingOptimizationStatusEnum.AdServingOptimizationStatus getAdServingOptimizationStatus();

  /**
   * <pre>
   * The primary serving target for ads within the campaign.
   * The targeting options can be refined in `network_settings`.
   * This field is required and should not be empty when creating new
   * campaigns.
   * Can be set only when creating campaigns.
   * After the campaign is created, the field can not be changed.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType advertising_channel_type = 9;</code>
   */
  int getAdvertisingChannelTypeValue();
  /**
   * <pre>
   * The primary serving target for ads within the campaign.
   * The targeting options can be refined in `network_settings`.
   * This field is required and should not be empty when creating new
   * campaigns.
   * Can be set only when creating campaigns.
   * After the campaign is created, the field can not be changed.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType advertising_channel_type = 9;</code>
   */
  com.google.ads.googleads.v3.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType getAdvertisingChannelType();

  /**
   * <pre>
   * Optional refinement to `advertising_channel_type`.
   * Must be a valid sub-type of the parent channel type.
   * Can be set only when creating campaigns.
   * After campaign is created, the field can not be changed.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.AdvertisingChannelSubTypeEnum.AdvertisingChannelSubType advertising_channel_sub_type = 10;</code>
   */
  int getAdvertisingChannelSubTypeValue();
  /**
   * <pre>
   * Optional refinement to `advertising_channel_type`.
   * Must be a valid sub-type of the parent channel type.
   * Can be set only when creating campaigns.
   * After campaign is created, the field can not be changed.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.AdvertisingChannelSubTypeEnum.AdvertisingChannelSubType advertising_channel_sub_type = 10;</code>
   */
  com.google.ads.googleads.v3.enums.AdvertisingChannelSubTypeEnum.AdvertisingChannelSubType getAdvertisingChannelSubType();

  /**
   * <pre>
   * The URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 11;</code>
   */
  boolean hasTrackingUrlTemplate();
  /**
   * <pre>
   * The URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 11;</code>
   */
  com.google.protobuf.StringValue getTrackingUrlTemplate();
  /**
   * <pre>
   * The URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 11;</code>
   */
  com.google.protobuf.StringValueOrBuilder getTrackingUrlTemplateOrBuilder();

  /**
   * <pre>
   * The list of mappings used to substitute custom parameter tags in a
   * `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.common.CustomParameter url_custom_parameters = 12;</code>
   */
  java.util.List<com.google.ads.googleads.v3.common.CustomParameter> 
      getUrlCustomParametersList();
  /**
   * <pre>
   * The list of mappings used to substitute custom parameter tags in a
   * `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.common.CustomParameter url_custom_parameters = 12;</code>
   */
  com.google.ads.googleads.v3.common.CustomParameter getUrlCustomParameters(int index);
  /**
   * <pre>
   * The list of mappings used to substitute custom parameter tags in a
   * `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.common.CustomParameter url_custom_parameters = 12;</code>
   */
  int getUrlCustomParametersCount();
  /**
   * <pre>
   * The list of mappings used to substitute custom parameter tags in a
   * `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.common.CustomParameter url_custom_parameters = 12;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v3.common.CustomParameterOrBuilder> 
      getUrlCustomParametersOrBuilderList();
  /**
   * <pre>
   * The list of mappings used to substitute custom parameter tags in a
   * `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.common.CustomParameter url_custom_parameters = 12;</code>
   */
  com.google.ads.googleads.v3.common.CustomParameterOrBuilder getUrlCustomParametersOrBuilder(
      int index);

  /**
   * <pre>
   * Settings for Real-Time Bidding, a feature only available for campaigns
   * targeting the Ad Exchange network.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.RealTimeBiddingSetting real_time_bidding_setting = 39;</code>
   */
  boolean hasRealTimeBiddingSetting();
  /**
   * <pre>
   * Settings for Real-Time Bidding, a feature only available for campaigns
   * targeting the Ad Exchange network.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.RealTimeBiddingSetting real_time_bidding_setting = 39;</code>
   */
  com.google.ads.googleads.v3.common.RealTimeBiddingSetting getRealTimeBiddingSetting();
  /**
   * <pre>
   * Settings for Real-Time Bidding, a feature only available for campaigns
   * targeting the Ad Exchange network.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.RealTimeBiddingSetting real_time_bidding_setting = 39;</code>
   */
  com.google.ads.googleads.v3.common.RealTimeBiddingSettingOrBuilder getRealTimeBiddingSettingOrBuilder();

  /**
   * <pre>
   * The network settings for the campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Campaign.NetworkSettings network_settings = 14;</code>
   */
  boolean hasNetworkSettings();
  /**
   * <pre>
   * The network settings for the campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Campaign.NetworkSettings network_settings = 14;</code>
   */
  com.google.ads.googleads.v3.resources.Campaign.NetworkSettings getNetworkSettings();
  /**
   * <pre>
   * The network settings for the campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Campaign.NetworkSettings network_settings = 14;</code>
   */
  com.google.ads.googleads.v3.resources.Campaign.NetworkSettingsOrBuilder getNetworkSettingsOrBuilder();

  /**
   * <pre>
   * The hotel setting for the campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Campaign.HotelSettingInfo hotel_setting = 32;</code>
   */
  boolean hasHotelSetting();
  /**
   * <pre>
   * The hotel setting for the campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Campaign.HotelSettingInfo hotel_setting = 32;</code>
   */
  com.google.ads.googleads.v3.resources.Campaign.HotelSettingInfo getHotelSetting();
  /**
   * <pre>
   * The hotel setting for the campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Campaign.HotelSettingInfo hotel_setting = 32;</code>
   */
  com.google.ads.googleads.v3.resources.Campaign.HotelSettingInfoOrBuilder getHotelSettingOrBuilder();

  /**
   * <pre>
   * The setting for controlling Dynamic Search Ads (DSA).
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Campaign.DynamicSearchAdsSetting dynamic_search_ads_setting = 33;</code>
   */
  boolean hasDynamicSearchAdsSetting();
  /**
   * <pre>
   * The setting for controlling Dynamic Search Ads (DSA).
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Campaign.DynamicSearchAdsSetting dynamic_search_ads_setting = 33;</code>
   */
  com.google.ads.googleads.v3.resources.Campaign.DynamicSearchAdsSetting getDynamicSearchAdsSetting();
  /**
   * <pre>
   * The setting for controlling Dynamic Search Ads (DSA).
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Campaign.DynamicSearchAdsSetting dynamic_search_ads_setting = 33;</code>
   */
  com.google.ads.googleads.v3.resources.Campaign.DynamicSearchAdsSettingOrBuilder getDynamicSearchAdsSettingOrBuilder();

  /**
   * <pre>
   * The setting for controlling Shopping campaigns.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Campaign.ShoppingSetting shopping_setting = 36;</code>
   */
  boolean hasShoppingSetting();
  /**
   * <pre>
   * The setting for controlling Shopping campaigns.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Campaign.ShoppingSetting shopping_setting = 36;</code>
   */
  com.google.ads.googleads.v3.resources.Campaign.ShoppingSetting getShoppingSetting();
  /**
   * <pre>
   * The setting for controlling Shopping campaigns.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Campaign.ShoppingSetting shopping_setting = 36;</code>
   */
  com.google.ads.googleads.v3.resources.Campaign.ShoppingSettingOrBuilder getShoppingSettingOrBuilder();

  /**
   * <pre>
   * Setting for targeting related features.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetingSetting targeting_setting = 43;</code>
   */
  boolean hasTargetingSetting();
  /**
   * <pre>
   * Setting for targeting related features.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetingSetting targeting_setting = 43;</code>
   */
  com.google.ads.googleads.v3.common.TargetingSetting getTargetingSetting();
  /**
   * <pre>
   * Setting for targeting related features.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetingSetting targeting_setting = 43;</code>
   */
  com.google.ads.googleads.v3.common.TargetingSettingOrBuilder getTargetingSettingOrBuilder();

  /**
   * <pre>
   * The setting for ads geotargeting.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Campaign.GeoTargetTypeSetting geo_target_type_setting = 47;</code>
   */
  boolean hasGeoTargetTypeSetting();
  /**
   * <pre>
   * The setting for ads geotargeting.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Campaign.GeoTargetTypeSetting geo_target_type_setting = 47;</code>
   */
  com.google.ads.googleads.v3.resources.Campaign.GeoTargetTypeSetting getGeoTargetTypeSetting();
  /**
   * <pre>
   * The setting for ads geotargeting.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Campaign.GeoTargetTypeSetting geo_target_type_setting = 47;</code>
   */
  com.google.ads.googleads.v3.resources.Campaign.GeoTargetTypeSettingOrBuilder getGeoTargetTypeSettingOrBuilder();

  /**
   * <pre>
   * The setting related to App Campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Campaign.AppCampaignSetting app_campaign_setting = 51;</code>
   */
  boolean hasAppCampaignSetting();
  /**
   * <pre>
   * The setting related to App Campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Campaign.AppCampaignSetting app_campaign_setting = 51;</code>
   */
  com.google.ads.googleads.v3.resources.Campaign.AppCampaignSetting getAppCampaignSetting();
  /**
   * <pre>
   * The setting related to App Campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Campaign.AppCampaignSetting app_campaign_setting = 51;</code>
   */
  com.google.ads.googleads.v3.resources.Campaign.AppCampaignSettingOrBuilder getAppCampaignSettingOrBuilder();

  /**
   * <pre>
   * The resource names of labels attached to this campaign.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue labels = 53;</code>
   */
  java.util.List<com.google.protobuf.StringValue> 
      getLabelsList();
  /**
   * <pre>
   * The resource names of labels attached to this campaign.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue labels = 53;</code>
   */
  com.google.protobuf.StringValue getLabels(int index);
  /**
   * <pre>
   * The resource names of labels attached to this campaign.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue labels = 53;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * The resource names of labels attached to this campaign.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue labels = 53;</code>
   */
  java.util.List<? extends com.google.protobuf.StringValueOrBuilder> 
      getLabelsOrBuilderList();
  /**
   * <pre>
   * The resource names of labels attached to this campaign.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue labels = 53;</code>
   */
  com.google.protobuf.StringValueOrBuilder getLabelsOrBuilder(
      int index);

  /**
   * <pre>
   * The type of campaign: normal, draft, or experiment.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.CampaignExperimentTypeEnum.CampaignExperimentType experiment_type = 17;</code>
   */
  int getExperimentTypeValue();
  /**
   * <pre>
   * The type of campaign: normal, draft, or experiment.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.CampaignExperimentTypeEnum.CampaignExperimentType experiment_type = 17;</code>
   */
  com.google.ads.googleads.v3.enums.CampaignExperimentTypeEnum.CampaignExperimentType getExperimentType();

  /**
   * <pre>
   * The resource name of the base campaign of a draft or experiment campaign.
   * For base campaigns, this is equal to `resource_name`.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue base_campaign = 28;</code>
   */
  boolean hasBaseCampaign();
  /**
   * <pre>
   * The resource name of the base campaign of a draft or experiment campaign.
   * For base campaigns, this is equal to `resource_name`.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue base_campaign = 28;</code>
   */
  com.google.protobuf.StringValue getBaseCampaign();
  /**
   * <pre>
   * The resource name of the base campaign of a draft or experiment campaign.
   * For base campaigns, this is equal to `resource_name`.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue base_campaign = 28;</code>
   */
  com.google.protobuf.StringValueOrBuilder getBaseCampaignOrBuilder();

  /**
   * <pre>
   * The budget of the campaign.
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign_budget = 6;</code>
   */
  boolean hasCampaignBudget();
  /**
   * <pre>
   * The budget of the campaign.
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign_budget = 6;</code>
   */
  com.google.protobuf.StringValue getCampaignBudget();
  /**
   * <pre>
   * The budget of the campaign.
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign_budget = 6;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCampaignBudgetOrBuilder();

  /**
   * <pre>
   * The type of bidding strategy.
   * A bidding strategy can be created by setting either the bidding scheme to
   * create a standard bidding strategy or the `bidding_strategy` field to
   * create a portfolio bidding strategy.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.BiddingStrategyTypeEnum.BiddingStrategyType bidding_strategy_type = 22;</code>
   */
  int getBiddingStrategyTypeValue();
  /**
   * <pre>
   * The type of bidding strategy.
   * A bidding strategy can be created by setting either the bidding scheme to
   * create a standard bidding strategy or the `bidding_strategy` field to
   * create a portfolio bidding strategy.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.BiddingStrategyTypeEnum.BiddingStrategyType bidding_strategy_type = 22;</code>
   */
  com.google.ads.googleads.v3.enums.BiddingStrategyTypeEnum.BiddingStrategyType getBiddingStrategyType();

  /**
   * <pre>
   * The date when campaign started.
   * This field must not be used in WHERE clauses.
   * </pre>
   *
   * <code>.google.protobuf.StringValue start_date = 19;</code>
   */
  boolean hasStartDate();
  /**
   * <pre>
   * The date when campaign started.
   * This field must not be used in WHERE clauses.
   * </pre>
   *
   * <code>.google.protobuf.StringValue start_date = 19;</code>
   */
  com.google.protobuf.StringValue getStartDate();
  /**
   * <pre>
   * The date when campaign started.
   * This field must not be used in WHERE clauses.
   * </pre>
   *
   * <code>.google.protobuf.StringValue start_date = 19;</code>
   */
  com.google.protobuf.StringValueOrBuilder getStartDateOrBuilder();

  /**
   * <pre>
   * The date when campaign ended.
   * This field must not be used in WHERE clauses.
   * </pre>
   *
   * <code>.google.protobuf.StringValue end_date = 20;</code>
   */
  boolean hasEndDate();
  /**
   * <pre>
   * The date when campaign ended.
   * This field must not be used in WHERE clauses.
   * </pre>
   *
   * <code>.google.protobuf.StringValue end_date = 20;</code>
   */
  com.google.protobuf.StringValue getEndDate();
  /**
   * <pre>
   * The date when campaign ended.
   * This field must not be used in WHERE clauses.
   * </pre>
   *
   * <code>.google.protobuf.StringValue end_date = 20;</code>
   */
  com.google.protobuf.StringValueOrBuilder getEndDateOrBuilder();

  /**
   * <pre>
   * Suffix used to append query parameters to landing pages that are served
   * with parallel tracking.
   * </pre>
   *
   * <code>.google.protobuf.StringValue final_url_suffix = 38;</code>
   */
  boolean hasFinalUrlSuffix();
  /**
   * <pre>
   * Suffix used to append query parameters to landing pages that are served
   * with parallel tracking.
   * </pre>
   *
   * <code>.google.protobuf.StringValue final_url_suffix = 38;</code>
   */
  com.google.protobuf.StringValue getFinalUrlSuffix();
  /**
   * <pre>
   * Suffix used to append query parameters to landing pages that are served
   * with parallel tracking.
   * </pre>
   *
   * <code>.google.protobuf.StringValue final_url_suffix = 38;</code>
   */
  com.google.protobuf.StringValueOrBuilder getFinalUrlSuffixOrBuilder();

  /**
   * <pre>
   * A list that limits how often each user will see this campaign's ads.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.common.FrequencyCapEntry frequency_caps = 40;</code>
   */
  java.util.List<com.google.ads.googleads.v3.common.FrequencyCapEntry> 
      getFrequencyCapsList();
  /**
   * <pre>
   * A list that limits how often each user will see this campaign's ads.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.common.FrequencyCapEntry frequency_caps = 40;</code>
   */
  com.google.ads.googleads.v3.common.FrequencyCapEntry getFrequencyCaps(int index);
  /**
   * <pre>
   * A list that limits how often each user will see this campaign's ads.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.common.FrequencyCapEntry frequency_caps = 40;</code>
   */
  int getFrequencyCapsCount();
  /**
   * <pre>
   * A list that limits how often each user will see this campaign's ads.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.common.FrequencyCapEntry frequency_caps = 40;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v3.common.FrequencyCapEntryOrBuilder> 
      getFrequencyCapsOrBuilderList();
  /**
   * <pre>
   * A list that limits how often each user will see this campaign's ads.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.common.FrequencyCapEntry frequency_caps = 40;</code>
   */
  com.google.ads.googleads.v3.common.FrequencyCapEntryOrBuilder getFrequencyCapsOrBuilder(
      int index);

  /**
   * <pre>
   * 3-Tier Brand Safety setting for the campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.BrandSafetySuitabilityEnum.BrandSafetySuitability video_brand_safety_suitability = 42;</code>
   */
  int getVideoBrandSafetySuitabilityValue();
  /**
   * <pre>
   * 3-Tier Brand Safety setting for the campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.BrandSafetySuitabilityEnum.BrandSafetySuitability video_brand_safety_suitability = 42;</code>
   */
  com.google.ads.googleads.v3.enums.BrandSafetySuitabilityEnum.BrandSafetySuitability getVideoBrandSafetySuitability();

  /**
   * <pre>
   * Describes how unbranded pharma ads will be displayed.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Campaign.VanityPharma vanity_pharma = 44;</code>
   */
  boolean hasVanityPharma();
  /**
   * <pre>
   * Describes how unbranded pharma ads will be displayed.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Campaign.VanityPharma vanity_pharma = 44;</code>
   */
  com.google.ads.googleads.v3.resources.Campaign.VanityPharma getVanityPharma();
  /**
   * <pre>
   * Describes how unbranded pharma ads will be displayed.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Campaign.VanityPharma vanity_pharma = 44;</code>
   */
  com.google.ads.googleads.v3.resources.Campaign.VanityPharmaOrBuilder getVanityPharmaOrBuilder();

  /**
   * <pre>
   * Selective optimization setting for this campaign, which includes a set of
   * conversion actions to optimize this campaign towards.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Campaign.SelectiveOptimization selective_optimization = 45;</code>
   */
  boolean hasSelectiveOptimization();
  /**
   * <pre>
   * Selective optimization setting for this campaign, which includes a set of
   * conversion actions to optimize this campaign towards.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Campaign.SelectiveOptimization selective_optimization = 45;</code>
   */
  com.google.ads.googleads.v3.resources.Campaign.SelectiveOptimization getSelectiveOptimization();
  /**
   * <pre>
   * Selective optimization setting for this campaign, which includes a set of
   * conversion actions to optimize this campaign towards.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Campaign.SelectiveOptimization selective_optimization = 45;</code>
   */
  com.google.ads.googleads.v3.resources.Campaign.SelectiveOptimizationOrBuilder getSelectiveOptimizationOrBuilder();

  /**
   * <pre>
   * Campaign-level settings for tracking information.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Campaign.TrackingSetting tracking_setting = 46;</code>
   */
  boolean hasTrackingSetting();
  /**
   * <pre>
   * Campaign-level settings for tracking information.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Campaign.TrackingSetting tracking_setting = 46;</code>
   */
  com.google.ads.googleads.v3.resources.Campaign.TrackingSetting getTrackingSetting();
  /**
   * <pre>
   * Campaign-level settings for tracking information.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Campaign.TrackingSetting tracking_setting = 46;</code>
   */
  com.google.ads.googleads.v3.resources.Campaign.TrackingSettingOrBuilder getTrackingSettingOrBuilder();

  /**
   * <pre>
   * Payment mode for the campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.PaymentModeEnum.PaymentMode payment_mode = 52;</code>
   */
  int getPaymentModeValue();
  /**
   * <pre>
   * Payment mode for the campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.PaymentModeEnum.PaymentMode payment_mode = 52;</code>
   */
  com.google.ads.googleads.v3.enums.PaymentModeEnum.PaymentMode getPaymentMode();

  /**
   * <pre>
   * Portfolio bidding strategy used by campaign.
   * </pre>
   *
   * <code>.google.protobuf.StringValue bidding_strategy = 23;</code>
   */
  boolean hasBiddingStrategy();
  /**
   * <pre>
   * Portfolio bidding strategy used by campaign.
   * </pre>
   *
   * <code>.google.protobuf.StringValue bidding_strategy = 23;</code>
   */
  com.google.protobuf.StringValue getBiddingStrategy();
  /**
   * <pre>
   * Portfolio bidding strategy used by campaign.
   * </pre>
   *
   * <code>.google.protobuf.StringValue bidding_strategy = 23;</code>
   */
  com.google.protobuf.StringValueOrBuilder getBiddingStrategyOrBuilder();

  /**
   * <pre>
   * Commission is an automatic bidding strategy in which the advertiser pays
   * a certain portion of the conversion value.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.Commission commission = 49;</code>
   */
  boolean hasCommission();
  /**
   * <pre>
   * Commission is an automatic bidding strategy in which the advertiser pays
   * a certain portion of the conversion value.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.Commission commission = 49;</code>
   */
  com.google.ads.googleads.v3.common.Commission getCommission();
  /**
   * <pre>
   * Commission is an automatic bidding strategy in which the advertiser pays
   * a certain portion of the conversion value.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.Commission commission = 49;</code>
   */
  com.google.ads.googleads.v3.common.CommissionOrBuilder getCommissionOrBuilder();

  /**
   * <pre>
   * Standard Manual CPC bidding strategy.
   * Manual click-based bidding where user pays per click.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ManualCpc manual_cpc = 24;</code>
   */
  boolean hasManualCpc();
  /**
   * <pre>
   * Standard Manual CPC bidding strategy.
   * Manual click-based bidding where user pays per click.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ManualCpc manual_cpc = 24;</code>
   */
  com.google.ads.googleads.v3.common.ManualCpc getManualCpc();
  /**
   * <pre>
   * Standard Manual CPC bidding strategy.
   * Manual click-based bidding where user pays per click.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ManualCpc manual_cpc = 24;</code>
   */
  com.google.ads.googleads.v3.common.ManualCpcOrBuilder getManualCpcOrBuilder();

  /**
   * <pre>
   * Standard Manual CPM bidding strategy.
   * Manual impression-based bidding where user pays per thousand
   * impressions.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ManualCpm manual_cpm = 25;</code>
   */
  boolean hasManualCpm();
  /**
   * <pre>
   * Standard Manual CPM bidding strategy.
   * Manual impression-based bidding where user pays per thousand
   * impressions.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ManualCpm manual_cpm = 25;</code>
   */
  com.google.ads.googleads.v3.common.ManualCpm getManualCpm();
  /**
   * <pre>
   * Standard Manual CPM bidding strategy.
   * Manual impression-based bidding where user pays per thousand
   * impressions.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ManualCpm manual_cpm = 25;</code>
   */
  com.google.ads.googleads.v3.common.ManualCpmOrBuilder getManualCpmOrBuilder();

  /**
   * <pre>
   * A bidding strategy that pays a configurable amount per video view.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ManualCpv manual_cpv = 37;</code>
   */
  boolean hasManualCpv();
  /**
   * <pre>
   * A bidding strategy that pays a configurable amount per video view.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ManualCpv manual_cpv = 37;</code>
   */
  com.google.ads.googleads.v3.common.ManualCpv getManualCpv();
  /**
   * <pre>
   * A bidding strategy that pays a configurable amount per video view.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ManualCpv manual_cpv = 37;</code>
   */
  com.google.ads.googleads.v3.common.ManualCpvOrBuilder getManualCpvOrBuilder();

  /**
   * <pre>
   * Standard Maximize Conversions bidding strategy that automatically
   * maximizes number of conversions given a daily budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.MaximizeConversions maximize_conversions = 30;</code>
   */
  boolean hasMaximizeConversions();
  /**
   * <pre>
   * Standard Maximize Conversions bidding strategy that automatically
   * maximizes number of conversions given a daily budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.MaximizeConversions maximize_conversions = 30;</code>
   */
  com.google.ads.googleads.v3.common.MaximizeConversions getMaximizeConversions();
  /**
   * <pre>
   * Standard Maximize Conversions bidding strategy that automatically
   * maximizes number of conversions given a daily budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.MaximizeConversions maximize_conversions = 30;</code>
   */
  com.google.ads.googleads.v3.common.MaximizeConversionsOrBuilder getMaximizeConversionsOrBuilder();

  /**
   * <pre>
   * Standard Maximize Conversion Value bidding strategy that automatically
   * sets bids to maximize revenue while spending your budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.MaximizeConversionValue maximize_conversion_value = 31;</code>
   */
  boolean hasMaximizeConversionValue();
  /**
   * <pre>
   * Standard Maximize Conversion Value bidding strategy that automatically
   * sets bids to maximize revenue while spending your budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.MaximizeConversionValue maximize_conversion_value = 31;</code>
   */
  com.google.ads.googleads.v3.common.MaximizeConversionValue getMaximizeConversionValue();
  /**
   * <pre>
   * Standard Maximize Conversion Value bidding strategy that automatically
   * sets bids to maximize revenue while spending your budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.MaximizeConversionValue maximize_conversion_value = 31;</code>
   */
  com.google.ads.googleads.v3.common.MaximizeConversionValueOrBuilder getMaximizeConversionValueOrBuilder();

  /**
   * <pre>
   * Standard Target CPA bidding strategy that automatically sets bids to
   * help get as many conversions as possible at the target
   * cost-per-acquisition (CPA) you set.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetCpa target_cpa = 26;</code>
   */
  boolean hasTargetCpa();
  /**
   * <pre>
   * Standard Target CPA bidding strategy that automatically sets bids to
   * help get as many conversions as possible at the target
   * cost-per-acquisition (CPA) you set.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetCpa target_cpa = 26;</code>
   */
  com.google.ads.googleads.v3.common.TargetCpa getTargetCpa();
  /**
   * <pre>
   * Standard Target CPA bidding strategy that automatically sets bids to
   * help get as many conversions as possible at the target
   * cost-per-acquisition (CPA) you set.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetCpa target_cpa = 26;</code>
   */
  com.google.ads.googleads.v3.common.TargetCpaOrBuilder getTargetCpaOrBuilder();

  /**
   * <pre>
   * Target Impression Share bidding strategy. An automated bidding strategy
   * that sets bids to achieve a desired percentage of impressions.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetImpressionShare target_impression_share = 48;</code>
   */
  boolean hasTargetImpressionShare();
  /**
   * <pre>
   * Target Impression Share bidding strategy. An automated bidding strategy
   * that sets bids to achieve a desired percentage of impressions.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetImpressionShare target_impression_share = 48;</code>
   */
  com.google.ads.googleads.v3.common.TargetImpressionShare getTargetImpressionShare();
  /**
   * <pre>
   * Target Impression Share bidding strategy. An automated bidding strategy
   * that sets bids to achieve a desired percentage of impressions.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetImpressionShare target_impression_share = 48;</code>
   */
  com.google.ads.googleads.v3.common.TargetImpressionShareOrBuilder getTargetImpressionShareOrBuilder();

  /**
   * <pre>
   * Standard Target ROAS bidding strategy that automatically maximizes
   * revenue while averaging a specific target return on ad spend (ROAS).
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetRoas target_roas = 29;</code>
   */
  boolean hasTargetRoas();
  /**
   * <pre>
   * Standard Target ROAS bidding strategy that automatically maximizes
   * revenue while averaging a specific target return on ad spend (ROAS).
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetRoas target_roas = 29;</code>
   */
  com.google.ads.googleads.v3.common.TargetRoas getTargetRoas();
  /**
   * <pre>
   * Standard Target ROAS bidding strategy that automatically maximizes
   * revenue while averaging a specific target return on ad spend (ROAS).
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetRoas target_roas = 29;</code>
   */
  com.google.ads.googleads.v3.common.TargetRoasOrBuilder getTargetRoasOrBuilder();

  /**
   * <pre>
   * Standard Target Spend bidding strategy that automatically sets your bids
   * to help get as many clicks as possible within your budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetSpend target_spend = 27;</code>
   */
  boolean hasTargetSpend();
  /**
   * <pre>
   * Standard Target Spend bidding strategy that automatically sets your bids
   * to help get as many clicks as possible within your budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetSpend target_spend = 27;</code>
   */
  com.google.ads.googleads.v3.common.TargetSpend getTargetSpend();
  /**
   * <pre>
   * Standard Target Spend bidding strategy that automatically sets your bids
   * to help get as many clicks as possible within your budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetSpend target_spend = 27;</code>
   */
  com.google.ads.googleads.v3.common.TargetSpendOrBuilder getTargetSpendOrBuilder();

  /**
   * <pre>
   * Standard Percent Cpc bidding strategy where bids are a fraction of the
   * advertised price for some good or service.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.PercentCpc percent_cpc = 34;</code>
   */
  boolean hasPercentCpc();
  /**
   * <pre>
   * Standard Percent Cpc bidding strategy where bids are a fraction of the
   * advertised price for some good or service.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.PercentCpc percent_cpc = 34;</code>
   */
  com.google.ads.googleads.v3.common.PercentCpc getPercentCpc();
  /**
   * <pre>
   * Standard Percent Cpc bidding strategy where bids are a fraction of the
   * advertised price for some good or service.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.PercentCpc percent_cpc = 34;</code>
   */
  com.google.ads.googleads.v3.common.PercentCpcOrBuilder getPercentCpcOrBuilder();

  /**
   * <pre>
   * A bidding strategy that automatically optimizes cost per thousand
   * impressions.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetCpm target_cpm = 41;</code>
   */
  boolean hasTargetCpm();
  /**
   * <pre>
   * A bidding strategy that automatically optimizes cost per thousand
   * impressions.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetCpm target_cpm = 41;</code>
   */
  com.google.ads.googleads.v3.common.TargetCpm getTargetCpm();
  /**
   * <pre>
   * A bidding strategy that automatically optimizes cost per thousand
   * impressions.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetCpm target_cpm = 41;</code>
   */
  com.google.ads.googleads.v3.common.TargetCpmOrBuilder getTargetCpmOrBuilder();

  public com.google.ads.googleads.v3.resources.Campaign.CampaignBiddingStrategyCase getCampaignBiddingStrategyCase();
}
