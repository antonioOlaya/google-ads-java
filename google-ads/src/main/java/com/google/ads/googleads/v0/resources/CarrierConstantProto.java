// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/resources/carrier_constant.proto

package com.google.ads.googleads.v0.resources;

public final class CarrierConstantProto {
  private CarrierConstantProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_CarrierConstant_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_CarrierConstant_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v0/resources/carr" +
      "ier_constant.proto\022!google.ads.googleads" +
      ".v0.resources\032\036google/protobuf/wrappers." +
      "proto\"\261\001\n\017CarrierConstant\022\025\n\rresource_na" +
      "me\030\001 \001(\t\022\'\n\002id\030\002 \001(\0132\033.google.protobuf.I" +
      "nt64Value\022*\n\004name\030\003 \001(\0132\034.google.protobu" +
      "f.StringValue\0222\n\014country_code\030\004 \001(\0132\034.go" +
      "ogle.protobuf.StringValueB\331\001\n%com.google" +
      ".ads.googleads.v0.resourcesB\024CarrierCons" +
      "tantProtoP\001ZJgoogle.golang.org/genproto/" +
      "googleapis/ads/googleads/v0/resources;re" +
      "sources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V0." +
      "Resources\312\002!Google\\Ads\\GoogleAds\\V0\\Reso" +
      "urcesb\006proto3"
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
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_resources_CarrierConstant_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_resources_CarrierConstant_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_CarrierConstant_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "CountryCode", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
