// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/common/metrics.proto

package com.google.ads.googleads.v0.common;

public final class MetricsProto {
  private MetricsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_Metrics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_Metrics_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,google/ads/googleads/v0/common/metrics" +
      ".proto\022\036google.ads.googleads.v0.common\032\036" +
      "google/protobuf/wrappers.proto\"\274\032\n\007Metri" +
      "cs\022L\n&all_conversions_from_interactions_" +
      "rate\030A \001(\0132\034.google.protobuf.DoubleValue" +
      "\022;\n\025all_conversions_value\030B \001(\0132\034.google" +
      ".protobuf.DoubleValue\0225\n\017all_conversions" +
      "\030\007 \001(\0132\034.google.protobuf.DoubleValue\022D\n\036" +
      "all_conversions_value_per_cost\030> \001(\0132\034.g" +
      "oogle.protobuf.DoubleValue\022]\n7all_conver" +
      "sions_from_interactions_value_per_intera" +
      "ction\030C \001(\0132\034.google.protobuf.DoubleValu" +
      "e\0222\n\014average_cost\030\010 \001(\0132\034.google.protobu" +
      "f.DoubleValue\0221\n\013average_cpc\030\t \001(\0132\034.goo" +
      "gle.protobuf.DoubleValue\0221\n\013average_cpm\030" +
      "\n \001(\0132\034.google.protobuf.DoubleValue\0221\n\013a" +
      "verage_cpv\030\013 \001(\0132\034.google.protobuf.Doubl" +
      "eValue\0226\n\020average_position\030\r \001(\0132\034.googl" +
      "e.protobuf.DoubleValue\0223\n\rbenchmark_ctr\030" +
      "M \001(\0132\034.google.protobuf.DoubleValue\0221\n\013b" +
      "ounce_rate\030\017 \001(\0132\034.google.protobuf.Doubl" +
      "eValue\022+\n\006clicks\030\023 \001(\0132\033.google.protobuf" +
      ".Int64Value\022J\n$content_budget_lost_impre" +
      "ssion_share\030\024 \001(\0132\034.google.protobuf.Doub" +
      "leValue\022>\n\030content_impression_share\030\025 \001(" +
      "\0132\034.google.protobuf.DoubleValue\022P\n*conve" +
      "rsion_last_received_request_date_time\030I " +
      "\001(\0132\034.google.protobuf.StringValue\022E\n\037con" +
      "version_last_conversion_date\030J \001(\0132\034.goo" +
      "gle.protobuf.StringValue\022H\n\"content_rank" +
      "_lost_impression_share\030\026 \001(\0132\034.google.pr" +
      "otobuf.DoubleValue\022H\n\"conversions_from_i" +
      "nteractions_rate\030E \001(\0132\034.google.protobuf" +
      ".DoubleValue\0227\n\021conversions_value\030F \001(\0132" +
      "\034.google.protobuf.DoubleValue\022@\n\032convers" +
      "ions_value_per_cost\030G \001(\0132\034.google.proto" +
      "buf.DoubleValue\022Y\n3conversions_from_inte" +
      "ractions_value_per_interaction\030H \001(\0132\034.g" +
      "oogle.protobuf.DoubleValue\0221\n\013conversion" +
      "s\030\031 \001(\0132\034.google.protobuf.DoubleValue\0220\n" +
      "\013cost_micros\030\032 \001(\0132\033.google.protobuf.Int" +
      "64Value\022>\n\030cost_per_all_conversions\030D \001(" +
      "\0132\034.google.protobuf.DoubleValue\0229\n\023cost_" +
      "per_conversion\030\034 \001(\0132\034.google.protobuf.D" +
      "oubleValue\022>\n\030cross_device_conversions\030\035" +
      " \001(\0132\034.google.protobuf.DoubleValue\022)\n\003ct" +
      "r\030\036 \001(\0132\034.google.protobuf.DoubleValue\0225\n" +
      "\017engagement_rate\030\037 \001(\0132\034.google.protobuf" +
      ".DoubleValue\0220\n\013engagements\030  \001(\0132\033.goog" +
      "le.protobuf.Int64Value\022E\n\037hotel_average_" +
      "lead_value_micros\030K \001(\0132\034.google.protobu" +
      "f.DoubleValue\0220\n\013impressions\030% \001(\0132\033.goo" +
      "gle.protobuf.Int64Value\0226\n\020interaction_r" +
      "ate\030& \001(\0132\034.google.protobuf.DoubleValue\022" +
      "1\n\014interactions\030\' \001(\0132\033.google.protobuf." +
      "Int64Value\0228\n\022invalid_click_rate\030( \001(\0132\034" +
      ".google.protobuf.DoubleValue\0223\n\016invalid_" +
      "clicks\030) \001(\0132\033.google.protobuf.Int64Valu" +
      "e\022:\n\024percent_new_visitors\030* \001(\0132\034.google" +
      ".protobuf.DoubleValue\0220\n\013phone_calls\030+ \001" +
      "(\0132\033.google.protobuf.Int64Value\0226\n\021phone" +
      "_impressions\030, \001(\0132\033.google.protobuf.Int" +
      "64Value\0228\n\022phone_through_rate\030- \001(\0132\034.go" +
      "ogle.protobuf.DoubleValue\0222\n\014relative_ct" +
      "r\030. \001(\0132\034.google.protobuf.DoubleValue\022J\n" +
      "$search_absolute_top_impression_share\030N " +
      "\001(\0132\034.google.protobuf.DoubleValue\022I\n#sea" +
      "rch_budget_lost_impression_share\030/ \001(\0132\034" +
      ".google.protobuf.DoubleValue\022I\n#search_e" +
      "xact_match_impression_share\0301 \001(\0132\034.goog" +
      "le.protobuf.DoubleValue\022=\n\027search_impres" +
      "sion_share\0302 \001(\0132\034.google.protobuf.Doubl" +
      "eValue\022G\n!search_rank_lost_impression_sh" +
      "are\0303 \001(\0132\034.google.protobuf.DoubleValue\022" +
      "?\n\031value_per_all_conversions\0304 \001(\0132\034.goo" +
      "gle.protobuf.DoubleValue\022:\n\024value_per_co" +
      "nversion\0305 \001(\0132\034.google.protobuf.DoubleV" +
      "alue\022=\n\027video_quartile_100_rate\0306 \001(\0132\034." +
      "google.protobuf.DoubleValue\022<\n\026video_qua" +
      "rtile_25_rate\0307 \001(\0132\034.google.protobuf.Do" +
      "ubleValue\022<\n\026video_quartile_50_rate\0308 \001(" +
      "\0132\034.google.protobuf.DoubleValue\022<\n\026video" +
      "_quartile_75_rate\0309 \001(\0132\034.google.protobu" +
      "f.DoubleValue\0225\n\017video_view_rate\030: \001(\0132\034" +
      ".google.protobuf.DoubleValue\0220\n\013video_vi" +
      "ews\030; \001(\0132\033.google.protobuf.Int64Value\022=" +
      "\n\030view_through_conversions\030< \001(\0132\033.googl" +
      "e.protobuf.Int64ValueB\302\001\n\"com.google.ads" +
      ".googleads.v0.commonB\014MetricsProtoP\001ZDgo" +
      "ogle.golang.org/genproto/googleapis/ads/" +
      "googleads/v0/common;common\242\002\003GAA\252\002\036Googl" +
      "e.Ads.GoogleAds.V0.Common\312\002\036Google\\Ads\\G" +
      "oogleAds\\V0\\Commonb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_common_Metrics_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_common_Metrics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_Metrics_descriptor,
        new java.lang.String[] { "AllConversionsFromInteractionsRate", "AllConversionsValue", "AllConversions", "AllConversionsValuePerCost", "AllConversionsFromInteractionsValuePerInteraction", "AverageCost", "AverageCpc", "AverageCpm", "AverageCpv", "AveragePosition", "BenchmarkCtr", "BounceRate", "Clicks", "ContentBudgetLostImpressionShare", "ContentImpressionShare", "ConversionLastReceivedRequestDateTime", "ConversionLastConversionDate", "ContentRankLostImpressionShare", "ConversionsFromInteractionsRate", "ConversionsValue", "ConversionsValuePerCost", "ConversionsFromInteractionsValuePerInteraction", "Conversions", "CostMicros", "CostPerAllConversions", "CostPerConversion", "CrossDeviceConversions", "Ctr", "EngagementRate", "Engagements", "HotelAverageLeadValueMicros", "Impressions", "InteractionRate", "Interactions", "InvalidClickRate", "InvalidClicks", "PercentNewVisitors", "PhoneCalls", "PhoneImpressions", "PhoneThroughRate", "RelativeCtr", "SearchAbsoluteTopImpressionShare", "SearchBudgetLostImpressionShare", "SearchExactMatchImpressionShare", "SearchImpressionShare", "SearchRankLostImpressionShare", "ValuePerAllConversions", "ValuePerConversion", "VideoQuartile100Rate", "VideoQuartile25Rate", "VideoQuartile50Rate", "VideoQuartile75Rate", "VideoViewRate", "VideoViews", "ViewThroughConversions", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
