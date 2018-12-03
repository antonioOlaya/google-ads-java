// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/services/ad_group_feed_service.proto

package com.google.ads.googleads.v0.services;

public final class AdGroupFeedServiceProto {
  private AdGroupFeedServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_GetAdGroupFeedRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_GetAdGroupFeedRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_MutateAdGroupFeedsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_MutateAdGroupFeedsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_AdGroupFeedOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_AdGroupFeedOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_MutateAdGroupFeedsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_MutateAdGroupFeedsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_MutateAdGroupFeedResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_MutateAdGroupFeedResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v0/services/ad_gr" +
      "oup_feed_service.proto\022 google.ads.googl" +
      "eads.v0.services\0325google/ads/googleads/v" +
      "0/resources/ad_group_feed.proto\032\034google/" +
      "api/annotations.proto\032 google/protobuf/f" +
      "ield_mask.proto\".\n\025GetAdGroupFeedRequest" +
      "\022\025\n\rresource_name\030\001 \001(\t\"|\n\031MutateAdGroup" +
      "FeedsRequest\022\023\n\013customer_id\030\001 \001(\t\022J\n\nope" +
      "rations\030\002 \003(\01326.google.ads.googleads.v0." +
      "services.AdGroupFeedOperation\"\352\001\n\024AdGrou" +
      "pFeedOperation\022/\n\013update_mask\030\004 \001(\0132\032.go" +
      "ogle.protobuf.FieldMask\022@\n\006create\030\001 \001(\0132" +
      "..google.ads.googleads.v0.resources.AdGr" +
      "oupFeedH\000\022@\n\006update\030\002 \001(\0132..google.ads.g" +
      "oogleads.v0.resources.AdGroupFeedH\000\022\020\n\006r" +
      "emove\030\003 \001(\tH\000B\013\n\toperation\"h\n\032MutateAdGr" +
      "oupFeedsResponse\022J\n\007results\030\002 \003(\01329.goog" +
      "le.ads.googleads.v0.services.MutateAdGro" +
      "upFeedResult\"0\n\027MutateAdGroupFeedResult\022" +
      "\025\n\rresource_name\030\001 \001(\t2\230\003\n\022AdGroupFeedSe" +
      "rvice\022\261\001\n\016GetAdGroupFeed\0227.google.ads.go" +
      "ogleads.v0.services.GetAdGroupFeedReques" +
      "t\032..google.ads.googleads.v0.resources.Ad" +
      "GroupFeed\"6\202\323\344\223\0020\022./v0/{resource_name=cu" +
      "stomers/*/adGroupFeeds/*}\022\315\001\n\022MutateAdGr" +
      "oupFeeds\022;.google.ads.googleads.v0.servi" +
      "ces.MutateAdGroupFeedsRequest\032<.google.a" +
      "ds.googleads.v0.services.MutateAdGroupFe" +
      "edsResponse\"<\202\323\344\223\0026\"1/v0/customers/{cust" +
      "omer_id=*}/adGroupFeeds:mutate:\001*B\327\001\n$co" +
      "m.google.ads.googleads.v0.servicesB\027AdGr" +
      "oupFeedServiceProtoP\001ZHgoogle.golang.org" +
      "/genproto/googleapis/ads/googleads/v0/se" +
      "rvices;services\242\002\003GAA\252\002 Google.Ads.Googl" +
      "eAds.V0.Services\312\002 Google\\Ads\\GoogleAds\\" +
      "V0\\Servicesb\006proto3"
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
          com.google.ads.googleads.v0.resources.AdGroupFeedProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_services_GetAdGroupFeedRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_services_GetAdGroupFeedRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_GetAdGroupFeedRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v0_services_MutateAdGroupFeedsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v0_services_MutateAdGroupFeedsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_MutateAdGroupFeedsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", });
    internal_static_google_ads_googleads_v0_services_AdGroupFeedOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v0_services_AdGroupFeedOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_AdGroupFeedOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v0_services_MutateAdGroupFeedsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v0_services_MutateAdGroupFeedsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_MutateAdGroupFeedsResponse_descriptor,
        new java.lang.String[] { "Results", });
    internal_static_google_ads_googleads_v0_services_MutateAdGroupFeedResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v0_services_MutateAdGroupFeedResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_MutateAdGroupFeedResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v0.resources.AdGroupFeedProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
