// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/services/shared_criterion_service.proto

package com.google.ads.googleads.v0.services;

public final class SharedCriterionServiceProto {
  private SharedCriterionServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_GetSharedCriterionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_GetSharedCriterionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_MutateSharedCriteriaRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_MutateSharedCriteriaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_SharedCriterionOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_SharedCriterionOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_MutateSharedCriteriaResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_MutateSharedCriteriaResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_MutateSharedCriterionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_MutateSharedCriterionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/ads/googleads/v0/services/share" +
      "d_criterion_service.proto\022 google.ads.go" +
      "ogleads.v0.services\0328google/ads/googlead" +
      "s/v0/resources/shared_criterion.proto\032\034g" +
      "oogle/api/annotations.proto\"2\n\031GetShared" +
      "CriterionRequest\022\025\n\rresource_name\030\001 \001(\t\"" +
      "\202\001\n\033MutateSharedCriteriaRequest\022\023\n\013custo" +
      "mer_id\030\001 \001(\t\022N\n\noperations\030\002 \003(\0132:.googl" +
      "e.ads.googleads.v0.services.SharedCriter" +
      "ionOperation\"\177\n\030SharedCriterionOperation" +
      "\022D\n\006create\030\001 \001(\01322.google.ads.googleads." +
      "v0.resources.SharedCriterionH\000\022\020\n\006remove" +
      "\030\003 \001(\tH\000B\013\n\toperation\"n\n\034MutateSharedCri" +
      "teriaResponse\022N\n\007results\030\002 \003(\0132=.google." +
      "ads.googleads.v0.services.MutateSharedCr" +
      "iterionResult\"4\n\033MutateSharedCriterionRe" +
      "sult\022\025\n\rresource_name\030\001 \001(\t2\262\003\n\026SharedCr" +
      "iterionService\022\277\001\n\022GetSharedCriterion\022;." +
      "google.ads.googleads.v0.services.GetShar" +
      "edCriterionRequest\0322.google.ads.googlead" +
      "s.v0.resources.SharedCriterion\"8\202\323\344\223\0022\0220" +
      "/v0/{resource_name=customers/*/sharedCri" +
      "teria/*}\022\325\001\n\024MutateSharedCriteria\022=.goog" +
      "le.ads.googleads.v0.services.MutateShare" +
      "dCriteriaRequest\032>.google.ads.googleads." +
      "v0.services.MutateSharedCriteriaResponse" +
      "\">\202\323\344\223\0028\"3/v0/customers/{customer_id=*}/" +
      "sharedCriteria:mutate:\001*B\333\001\n$com.google." +
      "ads.googleads.v0.servicesB\033SharedCriteri" +
      "onServiceProtoP\001ZHgoogle.golang.org/genp" +
      "roto/googleapis/ads/googleads/v0/service" +
      "s;services\242\002\003GAA\252\002 Google.Ads.GoogleAds." +
      "V0.Services\312\002 Google\\Ads\\GoogleAds\\V0\\Se" +
      "rvicesb\006proto3"
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
          com.google.ads.googleads.v0.resources.SharedCriterionProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_services_GetSharedCriterionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_services_GetSharedCriterionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_GetSharedCriterionRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v0_services_MutateSharedCriteriaRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v0_services_MutateSharedCriteriaRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_MutateSharedCriteriaRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", });
    internal_static_google_ads_googleads_v0_services_SharedCriterionOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v0_services_SharedCriterionOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_SharedCriterionOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v0_services_MutateSharedCriteriaResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v0_services_MutateSharedCriteriaResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_MutateSharedCriteriaResponse_descriptor,
        new java.lang.String[] { "Results", });
    internal_static_google_ads_googleads_v0_services_MutateSharedCriterionResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v0_services_MutateSharedCriterionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_MutateSharedCriterionResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v0.resources.SharedCriterionProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
