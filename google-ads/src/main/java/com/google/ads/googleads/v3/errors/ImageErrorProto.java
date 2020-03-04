// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/errors/image_error.proto

package com.google.ads.googleads.v3.errors;

public final class ImageErrorProto {
  private ImageErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_errors_ImageErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_errors_ImageErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/ads/googleads/v3/errors/image_e" +
      "rror.proto\022\036google.ads.googleads.v3.erro" +
      "rs\032\034google/api/annotations.proto\"\252\010\n\016Ima" +
      "geErrorEnum\"\227\010\n\nImageError\022\017\n\013UNSPECIFIE" +
      "D\020\000\022\013\n\007UNKNOWN\020\001\022\021\n\rINVALID_IMAGE\020\002\022\021\n\rS" +
      "TORAGE_ERROR\020\003\022\017\n\013BAD_REQUEST\020\004\022\023\n\017UNEXP" +
      "ECTED_SIZE\020\005\022\030\n\024ANIMATED_NOT_ALLOWED\020\006\022\026" +
      "\n\022ANIMATION_TOO_LONG\020\007\022\020\n\014SERVER_ERROR\020\010" +
      "\022\031\n\025CMYK_JPEG_NOT_ALLOWED\020\t\022\025\n\021FLASH_NOT" +
      "_ALLOWED\020\n\022\032\n\026FLASH_WITHOUT_CLICKTAG\020\013\022&" +
      "\n\"FLASH_ERROR_AFTER_FIXING_CLICK_TAG\020\014\022\032" +
      "\n\026ANIMATED_VISUAL_EFFECT\020\r\022\017\n\013FLASH_ERRO" +
      "R\020\016\022\022\n\016LAYOUT_PROBLEM\020\017\022\036\n\032PROBLEM_READI" +
      "NG_IMAGE_FILE\020\020\022\027\n\023ERROR_STORING_IMAGE\020\021" +
      "\022\034\n\030ASPECT_RATIO_NOT_ALLOWED\020\022\022\035\n\031FLASH_" +
      "HAS_NETWORK_OBJECTS\020\023\022\035\n\031FLASH_HAS_NETWO" +
      "RK_METHODS\020\024\022\021\n\rFLASH_HAS_URL\020\025\022\034\n\030FLASH" +
      "_HAS_MOUSE_TRACKING\020\026\022\030\n\024FLASH_HAS_RANDO" +
      "M_NUM\020\027\022\026\n\022FLASH_SELF_TARGETS\020\030\022\033\n\027FLASH" +
      "_BAD_GETURL_TARGET\020\031\022\037\n\033FLASH_VERSION_NO" +
      "T_SUPPORTED\020\032\022&\n\"FLASH_WITHOUT_HARD_CODE" +
      "D_CLICK_URL\020\033\022\026\n\022INVALID_FLASH_FILE\020\034\022$\n" +
      " FAILED_TO_FIX_CLICK_TAG_IN_FLASH\020\035\022$\n F" +
      "LASH_ACCESSES_NETWORK_RESOURCES\020\036\022\032\n\026FLA" +
      "SH_EXTERNAL_JS_CALL\020\037\022\032\n\026FLASH_EXTERNAL_" +
      "FS_CALL\020 \022\022\n\016FILE_TOO_LARGE\020!\022\030\n\024IMAGE_D" +
      "ATA_TOO_LARGE\020\"\022\032\n\026IMAGE_PROCESSING_ERRO" +
      "R\020#\022\023\n\017IMAGE_TOO_SMALL\020$\022\021\n\rINVALID_INPU" +
      "T\020%\022\030\n\024PROBLEM_READING_FILE\020&\022\036\n\032IMAGE_C" +
      "ONSTRAINTS_VIOLATED\020\'B\352\001\n\"com.google.ads" +
      ".googleads.v3.errorsB\017ImageErrorProtoP\001Z" +
      "Dgoogle.golang.org/genproto/googleapis/a" +
      "ds/googleads/v3/errors;errors\242\002\003GAA\252\002\036Go" +
      "ogle.Ads.GoogleAds.V3.Errors\312\002\036Google\\Ad" +
      "s\\GoogleAds\\V3\\Errors\352\002\"Google::Ads::Goo" +
      "gleAds::V3::Errorsb\006proto3"
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
    internal_static_google_ads_googleads_v3_errors_ImageErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_errors_ImageErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_errors_ImageErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
