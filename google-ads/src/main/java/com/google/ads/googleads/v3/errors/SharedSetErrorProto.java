// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/errors/shared_set_error.proto

package com.google.ads.googleads.v3.errors;

public final class SharedSetErrorProto {
  private SharedSetErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_errors_SharedSetErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_errors_SharedSetErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v3/errors/shared_" +
      "set_error.proto\022\036google.ads.googleads.v3" +
      ".errors\032\034google/api/annotations.proto\"\274\001" +
      "\n\022SharedSetErrorEnum\"\245\001\n\016SharedSetError\022" +
      "\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\0222\n.CUSTOME" +
      "R_CANNOT_CREATE_SHARED_SET_OF_THIS_TYPE\020" +
      "\002\022\022\n\016DUPLICATE_NAME\020\003\022\026\n\022SHARED_SET_REMO" +
      "VED\020\004\022\025\n\021SHARED_SET_IN_USE\020\005B\356\001\n\"com.goo" +
      "gle.ads.googleads.v3.errorsB\023SharedSetEr" +
      "rorProtoP\001ZDgoogle.golang.org/genproto/g" +
      "oogleapis/ads/googleads/v3/errors;errors" +
      "\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V3.Errors\312" +
      "\002\036Google\\Ads\\GoogleAds\\V3\\Errors\352\002\"Googl" +
      "e::Ads::GoogleAds::V3::Errorsb\006proto3"
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
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_errors_SharedSetErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_errors_SharedSetErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_errors_SharedSetErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
