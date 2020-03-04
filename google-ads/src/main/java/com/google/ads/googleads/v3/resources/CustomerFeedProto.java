// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/customer_feed.proto

package com.google.ads.googleads.v3.resources;

public final class CustomerFeedProto {
  private CustomerFeedProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_CustomerFeed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_CustomerFeed_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v3/resources/cust" +
      "omer_feed.proto\022!google.ads.googleads.v3" +
      ".resources\0326google/ads/googleads/v3/comm" +
      "on/matching_function.proto\0324google/ads/g" +
      "oogleads/v3/enums/feed_link_status.proto" +
      "\0324google/ads/googleads/v3/enums/placehol" +
      "der_type.proto\032\031google/api/resource.prot" +
      "o\032\036google/protobuf/wrappers.proto\032\034googl" +
      "e/api/annotations.proto\"\257\003\n\014CustomerFeed" +
      "\022\025\n\rresource_name\030\001 \001(\t\022*\n\004feed\030\002 \001(\0132\034." +
      "google.protobuf.StringValue\022]\n\021placehold" +
      "er_types\030\003 \003(\0162B.google.ads.googleads.v3" +
      ".enums.PlaceholderTypeEnum.PlaceholderTy" +
      "pe\022K\n\021matching_function\030\004 \001(\01320.google.a" +
      "ds.googleads.v3.common.MatchingFunction\022" +
      "P\n\006status\030\005 \001(\0162@.google.ads.googleads.v" +
      "3.enums.FeedLinkStatusEnum.FeedLinkStatu" +
      "s:^\352A[\n%googleads.googleapis.com/Custome" +
      "rFeed\0222customers/{customer}/customerFeed" +
      "s/{customer_feed}B\376\001\n%com.google.ads.goo" +
      "gleads.v3.resourcesB\021CustomerFeedProtoP\001" +
      "ZJgoogle.golang.org/genproto/googleapis/" +
      "ads/googleads/v3/resources;resources\242\002\003G" +
      "AA\252\002!Google.Ads.GoogleAds.V3.Resources\312\002" +
      "!Google\\Ads\\GoogleAds\\V3\\Resources\352\002%Goo" +
      "gle::Ads::GoogleAds::V3::Resourcesb\006prot" +
      "o3"
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
          com.google.ads.googleads.v3.common.MatchingFunctionProto.getDescriptor(),
          com.google.ads.googleads.v3.enums.FeedLinkStatusProto.getDescriptor(),
          com.google.ads.googleads.v3.enums.PlaceholderTypeProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_resources_CustomerFeed_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_CustomerFeed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_CustomerFeed_descriptor,
        new java.lang.String[] { "ResourceName", "Feed", "PlaceholderTypes", "MatchingFunction", "Status", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.common.MatchingFunctionProto.getDescriptor();
    com.google.ads.googleads.v3.enums.FeedLinkStatusProto.getDescriptor();
    com.google.ads.googleads.v3.enums.PlaceholderTypeProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
