// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/common/ad_type_infos.proto

package com.google.ads.googleads.v0.common;

public final class AdTypeInfosProto {
  private AdTypeInfosProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_TextAdInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_TextAdInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_ExpandedTextAdInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_ExpandedTextAdInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_DynamicSearchAdInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_DynamicSearchAdInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_ResponsiveDisplayAdInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_ResponsiveDisplayAdInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_CallOnlyAdInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_CallOnlyAdInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_ExpandedDynamicSearchAdInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_ExpandedDynamicSearchAdInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_HotelAdInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_HotelAdInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_ShoppingSmartAdInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_ShoppingSmartAdInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_ShoppingProductAdInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_ShoppingProductAdInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_GmailAdInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_GmailAdInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_GmailTeaser_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_GmailTeaser_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_DisplayCallToAction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_DisplayCallToAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_ImageAdInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_ImageAdInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/ads/googleads/v0/common/ad_type" +
      "_infos.proto\022\036google.ads.googleads.v0.co" +
      "mmon\032Cgoogle/ads/googleads/v0/enums/call" +
      "_conversion_reporting_state.proto\032=googl" +
      "e/ads/googleads/v0/enums/display_ad_form" +
      "at_setting.proto\032-google/ads/googleads/v" +
      "0/enums/mime_type.proto\032\036google/protobuf" +
      "/wrappers.proto\"\244\001\n\nTextAdInfo\022.\n\010headli" +
      "ne\030\001 \001(\0132\034.google.protobuf.StringValue\0222" +
      "\n\014description1\030\002 \001(\0132\034.google.protobuf.S" +
      "tringValue\0222\n\014description2\030\003 \001(\0132\034.googl" +
      "e.protobuf.StringValue\"\367\002\n\022ExpandedTextA" +
      "dInfo\0224\n\016headline_part1\030\001 \001(\0132\034.google.p" +
      "rotobuf.StringValue\0224\n\016headline_part2\030\002 " +
      "\001(\0132\034.google.protobuf.StringValue\0224\n\016hea" +
      "dline_part3\030\006 \001(\0132\034.google.protobuf.Stri" +
      "ngValue\0221\n\013description\030\003 \001(\0132\034.google.pr" +
      "otobuf.StringValue\0222\n\014description2\030\007 \001(\013" +
      "2\034.google.protobuf.StringValue\022+\n\005path1\030" +
      "\004 \001(\0132\034.google.protobuf.StringValue\022+\n\005p" +
      "ath2\030\005 \001(\0132\034.google.protobuf.StringValue" +
      "\"}\n\023DynamicSearchAdInfo\0222\n\014description1\030" +
      "\001 \001(\0132\034.google.protobuf.StringValue\0222\n\014d" +
      "escription2\030\002 \001(\0132\034.google.protobuf.Stri" +
      "ngValue\"\367\006\n\027ResponsiveDisplayAdInfo\0224\n\016s" +
      "hort_headline\030\001 \001(\0132\034.google.protobuf.St" +
      "ringValue\0223\n\rlong_headline\030\002 \001(\0132\034.googl" +
      "e.protobuf.StringValue\0221\n\013description\030\003 " +
      "\001(\0132\034.google.protobuf.StringValue\0223\n\rbus" +
      "iness_name\030\004 \001(\0132\034.google.protobuf.Strin" +
      "gValue\0228\n\024allow_flexible_color\030\005 \001(\0132\032.g" +
      "oogle.protobuf.BoolValue\0222\n\014accent_color" +
      "\030\006 \001(\0132\034.google.protobuf.StringValue\0220\n\n" +
      "main_color\030\007 \001(\0132\034.google.protobuf.Strin" +
      "gValue\0229\n\023call_to_action_text\030\010 \001(\0132\034.go" +
      "ogle.protobuf.StringValue\0220\n\nlogo_image\030" +
      "\t \001(\0132\034.google.protobuf.StringValue\0227\n\021s" +
      "quare_logo_image\030\n \001(\0132\034.google.protobuf" +
      ".StringValue\0225\n\017marketing_image\030\013 \001(\0132\034." +
      "google.protobuf.StringValue\022<\n\026square_ma" +
      "rketing_image\030\014 \001(\0132\034.google.protobuf.St" +
      "ringValue\022h\n\016format_setting\030\r \001(\0162P.goog" +
      "le.ads.googleads.v0.enums.DisplayAdForma" +
      "tSettingEnum.DisplayAdFormatSetting\0222\n\014p" +
      "rice_prefix\030\016 \001(\0132\034.google.protobuf.Stri" +
      "ngValue\0220\n\npromo_text\030\017 \001(\0132\034.google.pro" +
      "tobuf.StringValue\"\205\005\n\016CallOnlyAdInfo\0222\n\014" +
      "country_code\030\001 \001(\0132\034.google.protobuf.Str" +
      "ingValue\0222\n\014phone_number\030\002 \001(\0132\034.google." +
      "protobuf.StringValue\0223\n\rbusiness_name\030\003 " +
      "\001(\0132\034.google.protobuf.StringValue\0222\n\014des" +
      "cription1\030\004 \001(\0132\034.google.protobuf.String" +
      "Value\0222\n\014description2\030\005 \001(\0132\034.google.pro" +
      "tobuf.StringValue\0220\n\014call_tracked\030\006 \001(\0132" +
      "\032.google.protobuf.BoolValue\022;\n\027disable_c" +
      "all_conversion\030\007 \001(\0132\032.google.protobuf.B" +
      "oolValue\022C\n\035phone_number_verification_ur" +
      "l\030\010 \001(\0132\034.google.protobuf.StringValue\0227\n" +
      "\021conversion_action\030\t \001(\0132\034.google.protob" +
      "uf.StringValue\022\200\001\n\032conversion_reporting_" +
      "state\030\n \001(\0162\\.google.ads.googleads.v0.en" +
      "ums.CallConversionReportingStateEnum.Cal" +
      "lConversionReportingState\"P\n\033ExpandedDyn" +
      "amicSearchAdInfo\0221\n\013description\030\001 \001(\0132\034." +
      "google.protobuf.StringValue\"\r\n\013HotelAdIn" +
      "fo\"\025\n\023ShoppingSmartAdInfo\"\027\n\025ShoppingPro" +
      "ductAdInfo\"\235\003\n\013GmailAdInfo\022;\n\006teaser\030\001 \001" +
      "(\0132+.google.ads.googleads.v0.common.Gmai" +
      "lTeaser\0222\n\014header_image\030\002 \001(\0132\034.google.p" +
      "rotobuf.StringValue\0225\n\017marketing_image\030\003" +
      " \001(\0132\034.google.protobuf.StringValue\022>\n\030ma" +
      "rketing_image_headline\030\004 \001(\0132\034.google.pr" +
      "otobuf.StringValue\022A\n\033marketing_image_de" +
      "scription\030\005 \001(\0132\034.google.protobuf.String" +
      "Value\022c\n&marketing_image_display_call_to" +
      "_action\030\006 \001(\01323.google.ads.googleads.v0." +
      "common.DisplayCallToAction\"\327\001\n\013GmailTeas" +
      "er\022.\n\010headline\030\001 \001(\0132\034.google.protobuf.S" +
      "tringValue\0221\n\013description\030\002 \001(\0132\034.google" +
      ".protobuf.StringValue\0223\n\rbusiness_name\030\003" +
      " \001(\0132\034.google.protobuf.StringValue\0220\n\nlo" +
      "go_image\030\004 \001(\0132\034.google.protobuf.StringV" +
      "alue\"s\n\023DisplayCallToAction\022*\n\004text\030\001 \001(" +
      "\0132\034.google.protobuf.StringValue\0220\n\ntext_" +
      "color\030\002 \001(\0132\034.google.protobuf.StringValu" +
      "e\"\260\004\n\013ImageAdInfo\0220\n\013pixel_width\030\004 \001(\0132\033" +
      ".google.protobuf.Int64Value\0221\n\014pixel_hei" +
      "ght\030\005 \001(\0132\033.google.protobuf.Int64Value\022/" +
      "\n\timage_url\030\006 \001(\0132\034.google.protobuf.Stri" +
      "ngValue\0228\n\023preview_pixel_width\030\007 \001(\0132\033.g" +
      "oogle.protobuf.Int64Value\0229\n\024preview_pix" +
      "el_height\030\010 \001(\0132\033.google.protobuf.Int64V" +
      "alue\0227\n\021preview_image_url\030\t \001(\0132\034.google" +
      ".protobuf.StringValue\022G\n\tmime_type\030\n \001(\016" +
      "24.google.ads.googleads.v0.enums.MimeTyp" +
      "eEnum.MimeType\022*\n\004name\030\013 \001(\0132\034.google.pr" +
      "otobuf.StringValue\0222\n\nmedia_file\030\001 \001(\0132\034" +
      ".google.protobuf.StringValueH\000\022+\n\004data\030\002" +
      " \001(\0132\033.google.protobuf.BytesValueH\000B\007\n\005i" +
      "mageB\306\001\n\"com.google.ads.googleads.v0.com" +
      "monB\020AdTypeInfosProtoP\001ZDgoogle.golang.o" +
      "rg/genproto/googleapis/ads/googleads/v0/" +
      "common;common\242\002\003GAA\252\002\036Google.Ads.GoogleA" +
      "ds.V0.Common\312\002\036Google\\Ads\\GoogleAds\\V0\\C" +
      "ommonb\006proto3"
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
          com.google.ads.googleads.v0.enums.CallConversionReportingStateProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.DisplayAdFormatSettingProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.MimeTypeProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_common_TextAdInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_common_TextAdInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_TextAdInfo_descriptor,
        new java.lang.String[] { "Headline", "Description1", "Description2", });
    internal_static_google_ads_googleads_v0_common_ExpandedTextAdInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v0_common_ExpandedTextAdInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_ExpandedTextAdInfo_descriptor,
        new java.lang.String[] { "HeadlinePart1", "HeadlinePart2", "HeadlinePart3", "Description", "Description2", "Path1", "Path2", });
    internal_static_google_ads_googleads_v0_common_DynamicSearchAdInfo_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v0_common_DynamicSearchAdInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_DynamicSearchAdInfo_descriptor,
        new java.lang.String[] { "Description1", "Description2", });
    internal_static_google_ads_googleads_v0_common_ResponsiveDisplayAdInfo_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v0_common_ResponsiveDisplayAdInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_ResponsiveDisplayAdInfo_descriptor,
        new java.lang.String[] { "ShortHeadline", "LongHeadline", "Description", "BusinessName", "AllowFlexibleColor", "AccentColor", "MainColor", "CallToActionText", "LogoImage", "SquareLogoImage", "MarketingImage", "SquareMarketingImage", "FormatSetting", "PricePrefix", "PromoText", });
    internal_static_google_ads_googleads_v0_common_CallOnlyAdInfo_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v0_common_CallOnlyAdInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_CallOnlyAdInfo_descriptor,
        new java.lang.String[] { "CountryCode", "PhoneNumber", "BusinessName", "Description1", "Description2", "CallTracked", "DisableCallConversion", "PhoneNumberVerificationUrl", "ConversionAction", "ConversionReportingState", });
    internal_static_google_ads_googleads_v0_common_ExpandedDynamicSearchAdInfo_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v0_common_ExpandedDynamicSearchAdInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_ExpandedDynamicSearchAdInfo_descriptor,
        new java.lang.String[] { "Description", });
    internal_static_google_ads_googleads_v0_common_HotelAdInfo_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v0_common_HotelAdInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_HotelAdInfo_descriptor,
        new java.lang.String[] { });
    internal_static_google_ads_googleads_v0_common_ShoppingSmartAdInfo_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v0_common_ShoppingSmartAdInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_ShoppingSmartAdInfo_descriptor,
        new java.lang.String[] { });
    internal_static_google_ads_googleads_v0_common_ShoppingProductAdInfo_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_ads_googleads_v0_common_ShoppingProductAdInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_ShoppingProductAdInfo_descriptor,
        new java.lang.String[] { });
    internal_static_google_ads_googleads_v0_common_GmailAdInfo_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_ads_googleads_v0_common_GmailAdInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_GmailAdInfo_descriptor,
        new java.lang.String[] { "Teaser", "HeaderImage", "MarketingImage", "MarketingImageHeadline", "MarketingImageDescription", "MarketingImageDisplayCallToAction", });
    internal_static_google_ads_googleads_v0_common_GmailTeaser_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_ads_googleads_v0_common_GmailTeaser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_GmailTeaser_descriptor,
        new java.lang.String[] { "Headline", "Description", "BusinessName", "LogoImage", });
    internal_static_google_ads_googleads_v0_common_DisplayCallToAction_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_ads_googleads_v0_common_DisplayCallToAction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_DisplayCallToAction_descriptor,
        new java.lang.String[] { "Text", "TextColor", });
    internal_static_google_ads_googleads_v0_common_ImageAdInfo_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_ads_googleads_v0_common_ImageAdInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_ImageAdInfo_descriptor,
        new java.lang.String[] { "PixelWidth", "PixelHeight", "ImageUrl", "PreviewPixelWidth", "PreviewPixelHeight", "PreviewImageUrl", "MimeType", "Name", "MediaFile", "Data", "Image", });
    com.google.ads.googleads.v0.enums.CallConversionReportingStateProto.getDescriptor();
    com.google.ads.googleads.v0.enums.DisplayAdFormatSettingProto.getDescriptor();
    com.google.ads.googleads.v0.enums.MimeTypeProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
