// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/resources/language_constant.proto

package com.google.ads.googleads.v0.resources;

public final class LanguageConstantProto {
  private LanguageConstantProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_LanguageConstant_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_LanguageConstant_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v0/resources/lang" +
      "uage_constant.proto\022!google.ads.googlead" +
      "s.v0.resources\032\036google/protobuf/wrappers" +
      ".proto\"\252\001\n\020LanguageConstant\022\025\n\rresource_" +
      "name\030\001 \001(\t\022\'\n\002id\030\002 \001(\0132\033.google.protobuf" +
      ".Int64Value\022*\n\004code\030\003 \001(\0132\034.google.proto" +
      "buf.StringValue\022*\n\004name\030\004 \001(\0132\034.google.p" +
      "rotobuf.StringValueB\332\001\n%com.google.ads.g" +
      "oogleads.v0.resourcesB\025LanguageConstantP" +
      "rotoP\001ZJgoogle.golang.org/genproto/googl" +
      "eapis/ads/googleads/v0/resources;resourc" +
      "es\242\002\003GAA\252\002!Google.Ads.GoogleAds.V0.Resou" +
      "rces\312\002!Google\\Ads\\GoogleAds\\V0\\Resources" +
      "b\006proto3"
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
    internal_static_google_ads_googleads_v0_resources_LanguageConstant_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_resources_LanguageConstant_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_LanguageConstant_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Code", "Name", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
