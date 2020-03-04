// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/ad_group_criterion_simulation.proto

package com.google.ads.googleads.v3.resources;

public final class AdGroupCriterionSimulationProto {
  private AdGroupCriterionSimulationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_AdGroupCriterionSimulation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_AdGroupCriterionSimulation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/ads/googleads/v3/resources/ad_g" +
      "roup_criterion_simulation.proto\022!google." +
      "ads.googleads.v3.resources\032/google/ads/g" +
      "oogleads/v3/common/simulation.proto\032Bgoo" +
      "gle/ads/googleads/v3/enums/simulation_mo" +
      "dification_method.proto\0323google/ads/goog" +
      "leads/v3/enums/simulation_type.proto\032\031go" +
      "ogle/api/resource.proto\032\036google/protobuf" +
      "/wrappers.proto\032\034google/api/annotations." +
      "proto\"\272\005\n\032AdGroupCriterionSimulation\022\025\n\r" +
      "resource_name\030\001 \001(\t\0220\n\013ad_group_id\030\002 \001(\013" +
      "2\033.google.protobuf.Int64Value\0221\n\014criteri" +
      "on_id\030\003 \001(\0132\033.google.protobuf.Int64Value" +
      "\022N\n\004type\030\004 \001(\0162@.google.ads.googleads.v3" +
      ".enums.SimulationTypeEnum.SimulationType" +
      "\022y\n\023modification_method\030\005 \001(\0162\\.google.a" +
      "ds.googleads.v3.enums.SimulationModifica" +
      "tionMethodEnum.SimulationModificationMet" +
      "hod\0220\n\nstart_date\030\006 \001(\0132\034.google.protobu" +
      "f.StringValue\022.\n\010end_date\030\007 \001(\0132\034.google" +
      ".protobuf.StringValue\022W\n\022cpc_bid_point_l" +
      "ist\030\010 \001(\01329.google.ads.googleads.v3.comm" +
      "on.CpcBidSimulationPointListH\000:\213\001\352A\207\001\n3g" +
      "oogleads.googleapis.com/AdGroupCriterion" +
      "Simulation\022Pcustomers/{customer}/adGroup" +
      "CriterionSimulations/{ad_group_criterion" +
      "_simulation}B\014\n\npoint_listB\214\002\n%com.googl" +
      "e.ads.googleads.v3.resourcesB\037AdGroupCri" +
      "terionSimulationProtoP\001ZJgoogle.golang.o" +
      "rg/genproto/googleapis/ads/googleads/v3/" +
      "resources;resources\242\002\003GAA\252\002!Google.Ads.G" +
      "oogleAds.V3.Resources\312\002!Google\\Ads\\Googl" +
      "eAds\\V3\\Resources\352\002%Google::Ads::GoogleA" +
      "ds::V3::Resourcesb\006proto3"
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
          com.google.ads.googleads.v3.common.SimulationProto.getDescriptor(),
          com.google.ads.googleads.v3.enums.SimulationModificationMethodProto.getDescriptor(),
          com.google.ads.googleads.v3.enums.SimulationTypeProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_resources_AdGroupCriterionSimulation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_AdGroupCriterionSimulation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_AdGroupCriterionSimulation_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroupId", "CriterionId", "Type", "ModificationMethod", "StartDate", "EndDate", "CpcBidPointList", "PointList", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.common.SimulationProto.getDescriptor();
    com.google.ads.googleads.v3.enums.SimulationModificationMethodProto.getDescriptor();
    com.google.ads.googleads.v3.enums.SimulationTypeProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
