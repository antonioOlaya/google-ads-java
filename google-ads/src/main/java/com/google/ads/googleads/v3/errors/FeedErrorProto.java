// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/errors/feed_error.proto

package com.google.ads.googleads.v3.errors;

public final class FeedErrorProto {
  private FeedErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_errors_FeedErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_errors_FeedErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/google/ads/googleads/v3/errors/feed_er" +
      "ror.proto\022\036google.ads.googleads.v3.error" +
      "s\032\034google/api/annotations.proto\"\306\006\n\rFeed" +
      "ErrorEnum\"\264\006\n\tFeedError\022\017\n\013UNSPECIFIED\020\000" +
      "\022\013\n\007UNKNOWN\020\001\022\036\n\032ATTRIBUTE_NAMES_NOT_UNI" +
      "QUE\020\002\022/\n+ATTRIBUTES_DO_NOT_MATCH_EXISTIN" +
      "G_ATTRIBUTES\020\003\022.\n*CANNOT_SPECIFY_USER_OR" +
      "IGIN_FOR_SYSTEM_FEED\020\004\0224\n0CANNOT_SPECIFY" +
      "_GOOGLE_ORIGIN_FOR_NON_SYSTEM_FEED\020\005\0222\n." +
      "CANNOT_SPECIFY_FEED_ATTRIBUTES_FOR_SYSTE" +
      "M_FEED\020\006\0224\n0CANNOT_UPDATE_FEED_ATTRIBUTE" +
      "S_WITH_ORIGIN_GOOGLE\020\007\022\020\n\014FEED_REMOVED\020\010" +
      "\022\030\n\024INVALID_ORIGIN_VALUE\020\t\022\033\n\027FEED_ORIGI" +
      "N_IS_NOT_USER\020\n\022 \n\034INVALID_AUTH_TOKEN_FO" +
      "R_EMAIL\020\013\022\021\n\rINVALID_EMAIL\020\014\022\027\n\023DUPLICAT" +
      "E_FEED_NAME\020\r\022\025\n\021INVALID_FEED_NAME\020\016\022\026\n\022" +
      "MISSING_OAUTH_INFO\020\017\022.\n*NEW_ATTRIBUTE_CA" +
      "NNOT_BE_PART_OF_UNIQUE_KEY\020\020\022\027\n\023TOO_MANY" +
      "_ATTRIBUTES\020\021\022\034\n\030INVALID_BUSINESS_ACCOUN" +
      "T\020\022\0223\n/BUSINESS_ACCOUNT_CANNOT_ACCESS_LO" +
      "CATION_ACCOUNT\020\023\022\036\n\032INVALID_AFFILIATE_CH" +
      "AIN_ID\020\024\022\031\n\025DUPLICATE_SYSTEM_FEED\020\025\022\024\n\020G" +
      "MB_ACCESS_ERROR\020\026\0225\n1CANNOT_HAVE_LOCATIO" +
      "N_AND_AFFILIATE_LOCATION_FEEDS\020\027B\351\001\n\"com" +
      ".google.ads.googleads.v3.errorsB\016FeedErr" +
      "orProtoP\001ZDgoogle.golang.org/genproto/go" +
      "ogleapis/ads/googleads/v3/errors;errors\242" +
      "\002\003GAA\252\002\036Google.Ads.GoogleAds.V3.Errors\312\002" +
      "\036Google\\Ads\\GoogleAds\\V3\\Errors\352\002\"Google" +
      "::Ads::GoogleAds::V3::Errorsb\006proto3"
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
    internal_static_google_ads_googleads_v3_errors_FeedErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_errors_FeedErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_errors_FeedErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
