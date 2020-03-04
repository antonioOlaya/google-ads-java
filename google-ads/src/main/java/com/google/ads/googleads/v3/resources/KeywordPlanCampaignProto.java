// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/keyword_plan_campaign.proto

package com.google.ads.googleads.v3.resources;

public final class KeywordPlanCampaignProto {
  private KeywordPlanCampaignProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_KeywordPlanCampaign_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_KeywordPlanCampaign_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_KeywordPlanGeoTarget_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_KeywordPlanGeoTarget_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v3/resources/keyw" +
      "ord_plan_campaign.proto\022!google.ads.goog" +
      "leads.v3.resources\0328google/ads/googleads" +
      "/v3/enums/keyword_plan_network.proto\032\031go" +
      "ogle/api/resource.proto\032\036google/protobuf" +
      "/wrappers.proto\032\034google/api/annotations." +
      "proto\"\320\004\n\023KeywordPlanCampaign\022\025\n\rresourc" +
      "e_name\030\001 \001(\t\0222\n\014keyword_plan\030\002 \001(\0132\034.goo" +
      "gle.protobuf.StringValue\022\'\n\002id\030\003 \001(\0132\033.g" +
      "oogle.protobuf.Int64Value\022*\n\004name\030\004 \001(\0132" +
      "\034.google.protobuf.StringValue\0228\n\022languag" +
      "e_constants\030\005 \003(\0132\034.google.protobuf.Stri" +
      "ngValue\022f\n\024keyword_plan_network\030\006 \001(\0162H." +
      "google.ads.googleads.v3.enums.KeywordPla" +
      "nNetworkEnum.KeywordPlanNetwork\0223\n\016cpc_b" +
      "id_micros\030\007 \001(\0132\033.google.protobuf.Int64V" +
      "alue\022L\n\013geo_targets\030\010 \003(\01327.google.ads.g" +
      "oogleads.v3.resources.KeywordPlanGeoTarg" +
      "et:t\352Aq\n,googleads.googleapis.com/Keywor" +
      "dPlanCampaign\022Acustomers/{customer}/keyw" +
      "ordPlanCampaigns/{keyword_plan_campaign}" +
      "\"Q\n\024KeywordPlanGeoTarget\0229\n\023geo_target_c" +
      "onstant\030\001 \001(\0132\034.google.protobuf.StringVa" +
      "lueB\205\002\n%com.google.ads.googleads.v3.reso" +
      "urcesB\030KeywordPlanCampaignProtoP\001ZJgoogl" +
      "e.golang.org/genproto/googleapis/ads/goo" +
      "gleads/v3/resources;resources\242\002\003GAA\252\002!Go" +
      "ogle.Ads.GoogleAds.V3.Resources\312\002!Google" +
      "\\Ads\\GoogleAds\\V3\\Resources\352\002%Google::Ad" +
      "s::GoogleAds::V3::Resourcesb\006proto3"
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
          com.google.ads.googleads.v3.enums.KeywordPlanNetworkProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_resources_KeywordPlanCampaign_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_KeywordPlanCampaign_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_KeywordPlanCampaign_descriptor,
        new java.lang.String[] { "ResourceName", "KeywordPlan", "Id", "Name", "LanguageConstants", "KeywordPlanNetwork", "CpcBidMicros", "GeoTargets", });
    internal_static_google_ads_googleads_v3_resources_KeywordPlanGeoTarget_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v3_resources_KeywordPlanGeoTarget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_KeywordPlanGeoTarget_descriptor,
        new java.lang.String[] { "GeoTargetConstant", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.enums.KeywordPlanNetworkProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
