// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/common/keyword_plan_common.proto

package com.google.ads.googleads.v0.common;

public final class KeywordPlanCommonProto {
  private KeywordPlanCommonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_KeywordPlanHistoricalMetrics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_KeywordPlanHistoricalMetrics_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v0/common/keyword" +
      "_plan_common.proto\022\036google.ads.googleads" +
      ".v0.common\032Bgoogle/ads/googleads/v0/enum" +
      "s/keyword_plan_competition_level.proto\032\036" +
      "google/protobuf/wrappers.proto\"\312\001\n\034Keywo" +
      "rdPlanHistoricalMetrics\0229\n\024avg_monthly_s" +
      "earches\030\001 \001(\0132\033.google.protobuf.Int64Val" +
      "ue\022o\n\013competition\030\002 \001(\0162Z.google.ads.goo" +
      "gleads.v0.enums.KeywordPlanCompetitionLe" +
      "velEnum.KeywordPlanCompetitionLevelB\314\001\n\"" +
      "com.google.ads.googleads.v0.commonB\026Keyw" +
      "ordPlanCommonProtoP\001ZDgoogle.golang.org/" +
      "genproto/googleapis/ads/googleads/v0/com" +
      "mon;common\242\002\003GAA\252\002\036Google.Ads.GoogleAds." +
      "V0.Common\312\002\036Google\\Ads\\GoogleAds\\V0\\Comm" +
      "onb\006proto3"
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
          com.google.ads.googleads.v0.enums.KeywordPlanCompetitionLevelProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_common_KeywordPlanHistoricalMetrics_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_common_KeywordPlanHistoricalMetrics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_KeywordPlanHistoricalMetrics_descriptor,
        new java.lang.String[] { "AvgMonthlySearches", "Competition", });
    com.google.ads.googleads.v0.enums.KeywordPlanCompetitionLevelProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
