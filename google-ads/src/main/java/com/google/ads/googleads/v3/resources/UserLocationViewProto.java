// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/user_location_view.proto

package com.google.ads.googleads.v3.resources;

public final class UserLocationViewProto {
  private UserLocationViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_UserLocationView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_UserLocationView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v3/resources/user" +
      "_location_view.proto\022!google.ads.googlea" +
      "ds.v3.resources\032\031google/api/resource.pro" +
      "to\032\036google/protobuf/wrappers.proto\032\034goog" +
      "le/api/annotations.proto\"\211\002\n\020UserLocatio" +
      "nView\022\025\n\rresource_name\030\001 \001(\t\0229\n\024country_" +
      "criterion_id\030\002 \001(\0132\033.google.protobuf.Int" +
      "64Value\0226\n\022targeting_location\030\003 \001(\0132\032.go" +
      "ogle.protobuf.BoolValue:k\352Ah\n)googleads." +
      "googleapis.com/UserLocationView\022;custome" +
      "rs/{customer}/userLocationViews/{user_lo" +
      "cation_view}B\202\002\n%com.google.ads.googlead" +
      "s.v3.resourcesB\025UserLocationViewProtoP\001Z" +
      "Jgoogle.golang.org/genproto/googleapis/a" +
      "ds/googleads/v3/resources;resources\242\002\003GA" +
      "A\252\002!Google.Ads.GoogleAds.V3.Resources\312\002!" +
      "Google\\Ads\\GoogleAds\\V3\\Resources\352\002%Goog" +
      "le::Ads::GoogleAds::V3::Resourcesb\006proto" +
      "3"
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
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_resources_UserLocationView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_UserLocationView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_UserLocationView_descriptor,
        new java.lang.String[] { "ResourceName", "CountryCriterionId", "TargetingLocation", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}