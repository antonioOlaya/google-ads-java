// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/resources/ad_group_criterion.proto

package com.google.ads.googleads.v5.resources;

public final class AdGroupCriterionProto {
  private AdGroupCriterionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_resources_AdGroupCriterion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_resources_AdGroupCriterion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_resources_AdGroupCriterion_QualityInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_resources_AdGroupCriterion_QualityInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_resources_AdGroupCriterion_PositionEstimates_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_resources_AdGroupCriterion_PositionEstimates_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v5/resources/ad_g" +
      "roup_criterion.proto\022!google.ads.googlea" +
      "ds.v5.resources\032-google/ads/googleads/v5" +
      "/common/criteria.proto\0325google/ads/googl" +
      "eads/v5/common/custom_parameter.proto\032Fg" +
      "oogle/ads/googleads/v5/enums/ad_group_cr" +
      "iterion_approval_status.proto\032=google/ad" +
      "s/googleads/v5/enums/ad_group_criterion_" +
      "status.proto\0322google/ads/googleads/v5/en" +
      "ums/bidding_source.proto\032Cgoogle/ads/goo" +
      "gleads/v5/enums/criterion_system_serving" +
      "_status.proto\0322google/ads/googleads/v5/e" +
      "nums/criterion_type.proto\0328google/ads/go" +
      "ogleads/v5/enums/quality_score_bucket.pr" +
      "oto\032\037google/api/field_behavior.proto\032\031go" +
      "ogle/api/resource.proto\032\034google/api/anno" +
      "tations.proto\"\253#\n\020AdGroupCriterion\022H\n\rre" +
      "source_name\030\001 \001(\tB1\340A\005\372A+\n)googleads.goo" +
      "gleapis.com/AdGroupCriterion\022\036\n\014criterio" +
      "n_id\0308 \001(\003B\003\340A\003H\001\210\001\001\022`\n\006status\030\003 \001(\0162P.g" +
      "oogle.ads.googleads.v5.enums.AdGroupCrit" +
      "erionStatusEnum.AdGroupCriterionStatus\022Z" +
      "\n\014quality_info\030\004 \001(\0132?.google.ads.google" +
      "ads.v5.resources.AdGroupCriterion.Qualit" +
      "yInfoB\003\340A\003\022?\n\010ad_group\0309 \001(\tB(\340A\005\372A\"\n go" +
      "ogleads.googleapis.com/AdGroupH\002\210\001\001\022Q\n\004t" +
      "ype\030\031 \001(\0162>.google.ads.googleads.v5.enum" +
      "s.CriterionTypeEnum.CriterionTypeB\003\340A\003\022\032" +
      "\n\010negative\030: \001(\010B\003\340A\005H\003\210\001\001\022\200\001\n\025system_se" +
      "rving_status\0304 \001(\0162\\.google.ads.googlead" +
      "s.v5.enums.CriterionSystemServingStatusE" +
      "num.CriterionSystemServingStatusB\003\340A\003\022~\n" +
      "\017approval_status\0305 \001(\0162`.google.ads.goog" +
      "leads.v5.enums.AdGroupCriterionApprovalS" +
      "tatusEnum.AdGroupCriterionApprovalStatus" +
      "B\003\340A\003\022 \n\023disapproval_reasons\030; \003(\tB\003\340A\003\022" +
      "\031\n\014bid_modifier\030= \001(\001H\004\210\001\001\022\033\n\016cpc_bid_mi" +
      "cros\030> \001(\003H\005\210\001\001\022\033\n\016cpm_bid_micros\030? \001(\003H" +
      "\006\210\001\001\022\033\n\016cpv_bid_micros\030@ \001(\003H\007\210\001\001\022#\n\026per" +
      "cent_cpc_bid_micros\030A \001(\003H\010\210\001\001\022*\n\030effect" +
      "ive_cpc_bid_micros\030B \001(\003B\003\340A\003H\t\210\001\001\022*\n\030ef" +
      "fective_cpm_bid_micros\030C \001(\003B\003\340A\003H\n\210\001\001\022*" +
      "\n\030effective_cpv_bid_micros\030D \001(\003B\003\340A\003H\013\210" +
      "\001\001\0222\n effective_percent_cpc_bid_micros\030E" +
      " \001(\003B\003\340A\003H\014\210\001\001\022e\n\030effective_cpc_bid_sour" +
      "ce\030\025 \001(\0162>.google.ads.googleads.v5.enums" +
      ".BiddingSourceEnum.BiddingSourceB\003\340A\003\022e\n" +
      "\030effective_cpm_bid_source\030\026 \001(\0162>.google" +
      ".ads.googleads.v5.enums.BiddingSourceEnu" +
      "m.BiddingSourceB\003\340A\003\022e\n\030effective_cpv_bi" +
      "d_source\030\027 \001(\0162>.google.ads.googleads.v5" +
      ".enums.BiddingSourceEnum.BiddingSourceB\003" +
      "\340A\003\022m\n effective_percent_cpc_bid_source\030" +
      "# \001(\0162>.google.ads.googleads.v5.enums.Bi" +
      "ddingSourceEnum.BiddingSourceB\003\340A\003\022f\n\022po" +
      "sition_estimates\030\n \001(\0132E.google.ads.goog" +
      "leads.v5.resources.AdGroupCriterion.Posi" +
      "tionEstimatesB\003\340A\003\022\022\n\nfinal_urls\030F \003(\t\022\031" +
      "\n\021final_mobile_urls\030G \003(\t\022\035\n\020final_url_s" +
      "uffix\030H \001(\tH\r\210\001\001\022\"\n\025tracking_url_templat" +
      "e\030I \001(\tH\016\210\001\001\022N\n\025url_custom_parameters\030\016 " +
      "\003(\0132/.google.ads.googleads.v5.common.Cus" +
      "tomParameter\022C\n\007keyword\030\033 \001(\0132+.google.a" +
      "ds.googleads.v5.common.KeywordInfoB\003\340A\005H" +
      "\000\022G\n\tplacement\030\034 \001(\0132-.google.ads.google" +
      "ads.v5.common.PlacementInfoB\003\340A\005H\000\022Y\n\023mo" +
      "bile_app_category\030\035 \001(\01325.google.ads.goo" +
      "gleads.v5.common.MobileAppCategoryInfoB\003" +
      "\340A\005H\000\022X\n\022mobile_application\030\036 \001(\01325.goog" +
      "le.ads.googleads.v5.common.MobileApplica" +
      "tionInfoB\003\340A\005H\000\022N\n\rlisting_group\030  \001(\01320" +
      ".google.ads.googleads.v5.common.ListingG" +
      "roupInfoB\003\340A\005H\000\022F\n\tage_range\030$ \001(\0132,.goo" +
      "gle.ads.googleads.v5.common.AgeRangeInfo" +
      "B\003\340A\005H\000\022A\n\006gender\030% \001(\0132*.google.ads.goo" +
      "gleads.v5.common.GenderInfoB\003\340A\005H\000\022L\n\014in" +
      "come_range\030& \001(\0132/.google.ads.googleads." +
      "v5.common.IncomeRangeInfoB\003\340A\005H\000\022R\n\017pare" +
      "ntal_status\030\' \001(\01322.google.ads.googleads" +
      ".v5.common.ParentalStatusInfoB\003\340A\005H\000\022F\n\t" +
      "user_list\030* \001(\0132,.google.ads.googleads.v" +
      "5.common.UserListInfoB\003\340A\005H\000\022N\n\ryoutube_" +
      "video\030( \001(\01320.google.ads.googleads.v5.co" +
      "mmon.YouTubeVideoInfoB\003\340A\005H\000\022R\n\017youtube_" +
      "channel\030) \001(\01322.google.ads.googleads.v5." +
      "common.YouTubeChannelInfoB\003\340A\005H\000\022?\n\005topi" +
      "c\030+ \001(\0132).google.ads.googleads.v5.common" +
      ".TopicInfoB\003\340A\005H\000\022N\n\ruser_interest\030- \001(\013" +
      "20.google.ads.googleads.v5.common.UserIn" +
      "terestInfoB\003\340A\005H\000\022C\n\007webpage\030. \001(\0132+.goo" +
      "gle.ads.googleads.v5.common.WebpageInfoB" +
      "\003\340A\005H\000\022U\n\021app_payment_model\030/ \001(\01323.goog" +
      "le.ads.googleads.v5.common.AppPaymentMod" +
      "elInfoB\003\340A\005H\000\022R\n\017custom_affinity\0300 \001(\01322" +
      ".google.ads.googleads.v5.common.CustomAf" +
      "finityInfoB\003\340A\005H\000\022N\n\rcustom_intent\0301 \001(\013" +
      "20.google.ads.googleads.v5.common.Custom" +
      "IntentInfoB\003\340A\005H\000\032\215\003\n\013QualityInfo\022\037\n\rqua" +
      "lity_score\030\005 \001(\005B\003\340A\003H\000\210\001\001\022m\n\026creative_q" +
      "uality_score\030\002 \001(\0162H.google.ads.googlead" +
      "s.v5.enums.QualityScoreBucketEnum.Qualit" +
      "yScoreBucketB\003\340A\003\022o\n\030post_click_quality_" +
      "score\030\003 \001(\0162H.google.ads.googleads.v5.en" +
      "ums.QualityScoreBucketEnum.QualityScoreB" +
      "ucketB\003\340A\003\022k\n\024search_predicted_ctr\030\004 \001(\016" +
      "2H.google.ads.googleads.v5.enums.Quality" +
      "ScoreBucketEnum.QualityScoreBucketB\003\340A\003B" +
      "\020\n\016_quality_score\032\274\003\n\021PositionEstimates\022" +
      "\'\n\025first_page_cpc_micros\030\006 \001(\003B\003\340A\003H\000\210\001\001" +
      "\022+\n\031first_position_cpc_micros\030\007 \001(\003B\003\340A\003" +
      "H\001\210\001\001\022(\n\026top_of_page_cpc_micros\030\010 \001(\003B\003\340" +
      "A\003H\002\210\001\001\022<\n*estimated_add_clicks_at_first" +
      "_position_cpc\030\t \001(\003B\003\340A\003H\003\210\001\001\022:\n(estimat" +
      "ed_add_cost_at_first_position_cpc\030\n \001(\003B" +
      "\003\340A\003H\004\210\001\001B\030\n\026_first_page_cpc_microsB\034\n\032_" +
      "first_position_cpc_microsB\031\n\027_top_of_pag" +
      "e_cpc_microsB-\n+_estimated_add_clicks_at" +
      "_first_position_cpcB+\n)_estimated_add_co" +
      "st_at_first_position_cpc:i\352Af\n)googleads" +
      ".googleapis.com/AdGroupCriterion\0229custom" +
      "ers/{customer}/adGroupCriteria/{ad_group" +
      "_criterion}B\013\n\tcriterionB\017\n\r_criterion_i" +
      "dB\013\n\t_ad_groupB\013\n\t_negativeB\017\n\r_bid_modi" +
      "fierB\021\n\017_cpc_bid_microsB\021\n\017_cpm_bid_micr" +
      "osB\021\n\017_cpv_bid_microsB\031\n\027_percent_cpc_bi" +
      "d_microsB\033\n\031_effective_cpc_bid_microsB\033\n" +
      "\031_effective_cpm_bid_microsB\033\n\031_effective" +
      "_cpv_bid_microsB#\n!_effective_percent_cp" +
      "c_bid_microsB\023\n\021_final_url_suffixB\030\n\026_tr" +
      "acking_url_templateB\202\002\n%com.google.ads.g" +
      "oogleads.v5.resourcesB\025AdGroupCriterionP" +
      "rotoP\001ZJgoogle.golang.org/genproto/googl" +
      "eapis/ads/googleads/v5/resources;resourc" +
      "es\242\002\003GAA\252\002!Google.Ads.GoogleAds.V5.Resou" +
      "rces\312\002!Google\\Ads\\GoogleAds\\V5\\Resources" +
      "\352\002%Google::Ads::GoogleAds::V5::Resources" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v5.common.CriteriaProto.getDescriptor(),
          com.google.ads.googleads.v5.common.CustomParameterProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.AdGroupCriterionApprovalStatusProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.AdGroupCriterionStatusProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.BiddingSourceProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.CriterionSystemServingStatusProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.CriterionTypeProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.QualityScoreBucketProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v5_resources_AdGroupCriterion_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v5_resources_AdGroupCriterion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_resources_AdGroupCriterion_descriptor,
        new java.lang.String[] { "ResourceName", "CriterionId", "Status", "QualityInfo", "AdGroup", "Type", "Negative", "SystemServingStatus", "ApprovalStatus", "DisapprovalReasons", "BidModifier", "CpcBidMicros", "CpmBidMicros", "CpvBidMicros", "PercentCpcBidMicros", "EffectiveCpcBidMicros", "EffectiveCpmBidMicros", "EffectiveCpvBidMicros", "EffectivePercentCpcBidMicros", "EffectiveCpcBidSource", "EffectiveCpmBidSource", "EffectiveCpvBidSource", "EffectivePercentCpcBidSource", "PositionEstimates", "FinalUrls", "FinalMobileUrls", "FinalUrlSuffix", "TrackingUrlTemplate", "UrlCustomParameters", "Keyword", "Placement", "MobileAppCategory", "MobileApplication", "ListingGroup", "AgeRange", "Gender", "IncomeRange", "ParentalStatus", "UserList", "YoutubeVideo", "YoutubeChannel", "Topic", "UserInterest", "Webpage", "AppPaymentModel", "CustomAffinity", "CustomIntent", "Criterion", "CriterionId", "AdGroup", "Negative", "BidModifier", "CpcBidMicros", "CpmBidMicros", "CpvBidMicros", "PercentCpcBidMicros", "EffectiveCpcBidMicros", "EffectiveCpmBidMicros", "EffectiveCpvBidMicros", "EffectivePercentCpcBidMicros", "FinalUrlSuffix", "TrackingUrlTemplate", });
    internal_static_google_ads_googleads_v5_resources_AdGroupCriterion_QualityInfo_descriptor =
      internal_static_google_ads_googleads_v5_resources_AdGroupCriterion_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v5_resources_AdGroupCriterion_QualityInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_resources_AdGroupCriterion_QualityInfo_descriptor,
        new java.lang.String[] { "QualityScore", "CreativeQualityScore", "PostClickQualityScore", "SearchPredictedCtr", "QualityScore", });
    internal_static_google_ads_googleads_v5_resources_AdGroupCriterion_PositionEstimates_descriptor =
      internal_static_google_ads_googleads_v5_resources_AdGroupCriterion_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v5_resources_AdGroupCriterion_PositionEstimates_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_resources_AdGroupCriterion_PositionEstimates_descriptor,
        new java.lang.String[] { "FirstPageCpcMicros", "FirstPositionCpcMicros", "TopOfPageCpcMicros", "EstimatedAddClicksAtFirstPositionCpc", "EstimatedAddCostAtFirstPositionCpc", "FirstPageCpcMicros", "FirstPositionCpcMicros", "TopOfPageCpcMicros", "EstimatedAddClicksAtFirstPositionCpc", "EstimatedAddCostAtFirstPositionCpc", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v5.common.CriteriaProto.getDescriptor();
    com.google.ads.googleads.v5.common.CustomParameterProto.getDescriptor();
    com.google.ads.googleads.v5.enums.AdGroupCriterionApprovalStatusProto.getDescriptor();
    com.google.ads.googleads.v5.enums.AdGroupCriterionStatusProto.getDescriptor();
    com.google.ads.googleads.v5.enums.BiddingSourceProto.getDescriptor();
    com.google.ads.googleads.v5.enums.CriterionSystemServingStatusProto.getDescriptor();
    com.google.ads.googleads.v5.enums.CriterionTypeProto.getDescriptor();
    com.google.ads.googleads.v5.enums.QualityScoreBucketProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}