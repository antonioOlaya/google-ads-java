// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/ad_schedule_view_service.proto

package com.google.ads.googleads.v3.services;

public final class AdScheduleViewServiceProto {
  private AdScheduleViewServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_GetAdScheduleViewRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_GetAdScheduleViewRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/ads/googleads/v3/services/ad_sc" +
      "hedule_view_service.proto\022 google.ads.go" +
      "ogleads.v3.services\0328google/ads/googlead" +
      "s/v3/resources/ad_schedule_view.proto\032\034g" +
      "oogle/api/annotations.proto\032\027google/api/" +
      "client.proto\032\037google/api/field_behavior." +
      "proto\"6\n\030GetAdScheduleViewRequest\022\032\n\rres" +
      "ource_name\030\001 \001(\tB\003\340A\0022\204\002\n\025AdScheduleView" +
      "Service\022\315\001\n\021GetAdScheduleView\022:.google.a" +
      "ds.googleads.v3.services.GetAdScheduleVi" +
      "ewRequest\0321.google.ads.googleads.v3.reso" +
      "urces.AdScheduleView\"I\202\323\344\223\0023\0221/v3/{resou" +
      "rce_name=customers/*/adScheduleViews/*}\332" +
      "A\rresource_name\032\033\312A\030googleads.googleapis" +
      ".comB\201\002\n$com.google.ads.googleads.v3.ser" +
      "vicesB\032AdScheduleViewServiceProtoP\001ZHgoo" +
      "gle.golang.org/genproto/googleapis/ads/g" +
      "oogleads/v3/services;services\242\002\003GAA\252\002 Go" +
      "ogle.Ads.GoogleAds.V3.Services\312\002 Google\\" +
      "Ads\\GoogleAds\\V3\\Services\352\002$Google::Ads:" +
      ":GoogleAds::V3::Servicesb\006proto3"
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
          com.google.ads.googleads.v3.resources.AdScheduleViewProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_services_GetAdScheduleViewRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_services_GetAdScheduleViewRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_GetAdScheduleViewRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.resources.AdScheduleViewProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}