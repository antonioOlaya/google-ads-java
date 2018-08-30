// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/resources/ad.proto

package com.google.ads.googleads.v0.resources;

public final class AdProto {
  private AdProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_Ad_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_Ad_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*google/ads/googleads/v0/resources/ad.p" +
      "roto\022!google.ads.googleads.v0.resources\032" +
      "2google/ads/googleads/v0/common/ad_type_" +
      "infos.proto\0325google/ads/googleads/v0/com" +
      "mon/custom_parameter.proto\032+google/ads/g" +
      "oogleads/v0/enums/ad_type.proto\032\036google/" +
      "protobuf/wrappers.proto\"\234\010\n\002Ad\022\'\n\002id\030\001 \001" +
      "(\0132\033.google.protobuf.Int64Value\0220\n\nfinal" +
      "_urls\030\002 \003(\0132\034.google.protobuf.StringValu" +
      "e\0227\n\021final_mobile_urls\030\020 \003(\0132\034.google.pr" +
      "otobuf.StringValue\022;\n\025tracking_url_templ" +
      "ate\030\014 \001(\0132\034.google.protobuf.StringValue\022" +
      "N\n\025url_custom_parameters\030\n \003(\0132/.google." +
      "ads.googleads.v0.common.CustomParameter\022" +
      "1\n\013display_url\030\004 \001(\0132\034.google.protobuf.S" +
      "tringValue\022>\n\004type\030\005 \001(\01620.google.ads.go" +
      "ogleads.v0.enums.AdTypeEnum.AdType\022=\n\007te" +
      "xt_ad\030\006 \001(\0132*.google.ads.googleads.v0.co" +
      "mmon.TextAdInfoH\000\022N\n\020expanded_text_ad\030\007 " +
      "\001(\01322.google.ads.googleads.v0.common.Exp" +
      "andedTextAdInfoH\000\022P\n\021dynamic_search_ad\030\010" +
      " \001(\01323.google.ads.googleads.v0.common.Dy" +
      "namicSearchAdInfoH\000\022X\n\025responsive_displa" +
      "y_ad\030\t \001(\01327.google.ads.googleads.v0.com" +
      "mon.ResponsiveDisplayAdInfoH\000\022F\n\014call_on" +
      "ly_ad\030\r \001(\0132..google.ads.googleads.v0.co" +
      "mmon.CallOnlyAdInfoH\000\022a\n\032expanded_dynami" +
      "c_search_ad\030\016 \001(\0132;.google.ads.googleads" +
      ".v0.common.ExpandedDynamicSearchAdInfoH\000" +
      "\022?\n\010hotel_ad\030\017 \001(\0132+.google.ads.googlead" +
      "s.v0.common.HotelAdInfoH\000\022P\n\021shopping_sm" +
      "art_ad\030\021 \001(\01323.google.ads.googleads.v0.c" +
      "ommon.ShoppingSmartAdInfoH\000B\t\n\007ad_dataB\314" +
      "\001\n%com.google.ads.googleads.v0.resources" +
      "B\007AdProtoP\001ZJgoogle.golang.org/genproto/" +
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
          com.google.ads.googleads.v0.common.AdTypeInfosProto.getDescriptor(),
          com.google.ads.googleads.v0.common.CustomParameterProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.AdTypeProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_resources_Ad_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_resources_Ad_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_Ad_descriptor,
        new java.lang.String[] { "Id", "FinalUrls", "FinalMobileUrls", "TrackingUrlTemplate", "UrlCustomParameters", "DisplayUrl", "Type", "TextAd", "ExpandedTextAd", "DynamicSearchAd", "ResponsiveDisplayAd", "CallOnlyAd", "ExpandedDynamicSearchAd", "HotelAd", "ShoppingSmartAd", "AdData", });
    com.google.ads.googleads.v0.common.AdTypeInfosProto.getDescriptor();
    com.google.ads.googleads.v0.common.CustomParameterProto.getDescriptor();
    com.google.ads.googleads.v0.enums.AdTypeProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
