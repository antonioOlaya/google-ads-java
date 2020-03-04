// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/ad_group_criterion_service.proto

package com.google.ads.googleads.v3.services;

public final class AdGroupCriterionServiceProto {
  private AdGroupCriterionServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_GetAdGroupCriterionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_GetAdGroupCriterionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateAdGroupCriteriaRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateAdGroupCriteriaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_AdGroupCriterionOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_AdGroupCriterionOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateAdGroupCriteriaResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateAdGroupCriteriaResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateAdGroupCriterionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateAdGroupCriterionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/ads/googleads/v3/services/ad_gr" +
      "oup_criterion_service.proto\022 google.ads." +
      "googleads.v3.services\032+google/ads/google" +
      "ads/v3/common/policy.proto\032:google/ads/g" +
      "oogleads/v3/resources/ad_group_criterion" +
      ".proto\032\034google/api/annotations.proto\032\027go" +
      "ogle/api/client.proto\032\037google/api/field_" +
      "behavior.proto\032 google/protobuf/field_ma" +
      "sk.proto\032\027google/rpc/status.proto\"8\n\032Get" +
      "AdGroupCriterionRequest\022\032\n\rresource_name" +
      "\030\001 \001(\tB\003\340A\002\"\276\001\n\034MutateAdGroupCriteriaReq" +
      "uest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022T\n\noperat" +
      "ions\030\002 \003(\0132;.google.ads.googleads.v3.ser" +
      "vices.AdGroupCriterionOperationB\003\340A\002\022\027\n\017" +
      "partial_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004" +
      " \001(\010\"\323\002\n\031AdGroupCriterionOperation\022/\n\013up" +
      "date_mask\030\004 \001(\0132\032.google.protobuf.FieldM" +
      "ask\022X\n\034exempt_policy_violation_keys\030\005 \003(" +
      "\01322.google.ads.googleads.v3.common.Polic" +
      "yViolationKey\022E\n\006create\030\001 \001(\01323.google.a" +
      "ds.googleads.v3.resources.AdGroupCriteri" +
      "onH\000\022E\n\006update\030\002 \001(\01323.google.ads.google" +
      "ads.v3.resources.AdGroupCriterionH\000\022\020\n\006r" +
      "emove\030\003 \001(\tH\000B\013\n\toperation\"\243\001\n\035MutateAdG" +
      "roupCriteriaResponse\0221\n\025partial_failure_" +
      "error\030\003 \001(\0132\022.google.rpc.Status\022O\n\007resul" +
      "ts\030\002 \003(\0132>.google.ads.googleads.v3.servi" +
      "ces.MutateAdGroupCriterionResult\"5\n\034Muta" +
      "teAdGroupCriterionResult\022\025\n\rresource_nam" +
      "e\030\001 \001(\t2\201\004\n\027AdGroupCriterionService\022\323\001\n\023" +
      "GetAdGroupCriterion\022<.google.ads.googlea" +
      "ds.v3.services.GetAdGroupCriterionReques" +
      "t\0323.google.ads.googleads.v3.resources.Ad" +
      "GroupCriterion\"I\202\323\344\223\0023\0221/v3/{resource_na" +
      "me=customers/*/adGroupCriteria/*}\332A\rreso" +
      "urce_name\022\362\001\n\025MutateAdGroupCriteria\022>.go" +
      "ogle.ads.googleads.v3.services.MutateAdG" +
      "roupCriteriaRequest\032?.google.ads.googlea" +
      "ds.v3.services.MutateAdGroupCriteriaResp" +
      "onse\"X\202\323\344\223\0029\"4/v3/customers/{customer_id" +
      "=*}/adGroupCriteria:mutate:\001*\332A\026customer" +
      "_id,operations\032\033\312A\030googleads.googleapis." +
      "comB\203\002\n$com.google.ads.googleads.v3.serv" +
      "icesB\034AdGroupCriterionServiceProtoP\001ZHgo" +
      "ogle.golang.org/genproto/googleapis/ads/" +
      "googleads/v3/services;services\242\002\003GAA\252\002 G" +
      "oogle.Ads.GoogleAds.V3.Services\312\002 Google" +
      "\\Ads\\GoogleAds\\V3\\Services\352\002$Google::Ads" +
      "::GoogleAds::V3::Servicesb\006proto3"
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
          com.google.ads.googleads.v3.common.PolicyProto.getDescriptor(),
          com.google.ads.googleads.v3.resources.AdGroupCriterionProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_services_GetAdGroupCriterionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_services_GetAdGroupCriterionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_GetAdGroupCriterionRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v3_services_MutateAdGroupCriteriaRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v3_services_MutateAdGroupCriteriaRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateAdGroupCriteriaRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v3_services_AdGroupCriterionOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v3_services_AdGroupCriterionOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_AdGroupCriterionOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "ExemptPolicyViolationKeys", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v3_services_MutateAdGroupCriteriaResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v3_services_MutateAdGroupCriteriaResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateAdGroupCriteriaResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v3_services_MutateAdGroupCriterionResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v3_services_MutateAdGroupCriterionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateAdGroupCriterionResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.common.PolicyProto.getDescriptor();
    com.google.ads.googleads.v3.resources.AdGroupCriterionProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
