// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/errors/date_error.proto

package com.google.ads.googleads.v3.errors;

public final class DateErrorProto {
  private DateErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_errors_DateErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_errors_DateErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/google/ads/googleads/v3/errors/date_er" +
      "ror.proto\022\036google.ads.googleads.v3.error" +
      "s\032\034google/api/annotations.proto\"\277\003\n\rDate" +
      "ErrorEnum\"\255\003\n\tDateError\022\017\n\013UNSPECIFIED\020\000" +
      "\022\013\n\007UNKNOWN\020\001\022 \n\034INVALID_FIELD_VALUES_IN" +
      "_DATE\020\002\022%\n!INVALID_FIELD_VALUES_IN_DATE_" +
      "TIME\020\003\022\027\n\023INVALID_STRING_DATE\020\004\022#\n\037INVAL" +
      "ID_STRING_DATE_TIME_MICROS\020\006\022$\n INVALID_" +
      "STRING_DATE_TIME_SECONDS\020\013\0220\n,INVALID_ST" +
      "RING_DATE_TIME_SECONDS_WITH_OFFSET\020\014\022\035\n\031" +
      "EARLIER_THAN_MINIMUM_DATE\020\007\022\033\n\027LATER_THA" +
      "N_MAXIMUM_DATE\020\010\0223\n/DATE_RANGE_MINIMUM_D" +
      "ATE_LATER_THAN_MAXIMUM_DATE\020\t\0222\n.DATE_RA" +
      "NGE_MINIMUM_AND_MAXIMUM_DATES_BOTH_NULL\020" +
      "\nB\351\001\n\"com.google.ads.googleads.v3.errors" +
      "B\016DateErrorProtoP\001ZDgoogle.golang.org/ge" +
      "nproto/googleapis/ads/googleads/v3/error" +
      "s;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V3" +
      ".Errors\312\002\036Google\\Ads\\GoogleAds\\V3\\Errors" +
      "\352\002\"Google::Ads::GoogleAds::V3::Errorsb\006p" +
      "roto3"
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
    internal_static_google_ads_googleads_v3_errors_DateErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_errors_DateErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_errors_DateErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
