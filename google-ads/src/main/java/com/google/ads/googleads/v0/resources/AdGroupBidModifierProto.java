// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/resources/ad_group_bid_modifier.proto

package com.google.ads.googleads.v0.resources;

public final class AdGroupBidModifierProto {
  private AdGroupBidModifierProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_AdGroupBidModifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_AdGroupBidModifier_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v0/resources/ad_g" +
      "roup_bid_modifier.proto\022!google.ads.goog" +
      "leads.v0.resources\032-google/ads/googleads" +
      "/v0/common/criteria.proto\0327google/ads/go" +
      "ogleads/v0/enums/bid_modifier_source.pro" +
      "to\032\036google/protobuf/wrappers.proto\"\354\006\n\022A" +
      "dGroupBidModifier\022\025\n\rresource_name\030\001 \001(\t" +
      "\022.\n\010ad_group\030\002 \001(\0132\034.google.protobuf.Str" +
      "ingValue\0221\n\014criterion_id\030\003 \001(\0132\033.google." +
      "protobuf.Int64Value\0222\n\014bid_modifier\030\004 \001(" +
      "\0132\034.google.protobuf.DoubleValue\0223\n\rbase_" +
      "ad_group\030\t \001(\0132\034.google.protobuf.StringV" +
      "alue\022c\n\023bid_modifier_source\030\n \001(\0162F.goog" +
      "le.ads.googleads.v0.enums.BidModifierSou" +
      "rceEnum.BidModifierSource\022_\n\031hotel_date_" +
      "selection_type\030\005 \001(\0132:.google.ads.google" +
      "ads.v0.common.HotelDateSelectionTypeInfo" +
      "H\000\022e\n\034hotel_advance_booking_window\030\006 \001(\013" +
      "2=.google.ads.googleads.v0.common.HotelA" +
      "dvanceBookingWindowInfoH\000\022U\n\024hotel_lengt" +
      "h_of_stay\030\007 \001(\01325.google.ads.googleads.v" +
      "0.common.HotelLengthOfStayInfoH\000\022Q\n\022hote" +
      "l_check_in_day\030\010 \001(\01323.google.ads.google" +
      "ads.v0.common.HotelCheckInDayInfoH\000\022<\n\006d" +
      "evice\030\013 \001(\0132*.google.ads.googleads.v0.co" +
      "mmon.DeviceInfoH\000\022Q\n\021preferred_content\030\014" +
      " \001(\01324.google.ads.googleads.v0.common.Pr" +
      "eferredContentInfoH\000B\013\n\tcriterionB\334\001\n%co" +
      "m.google.ads.googleads.v0.resourcesB\027AdG" +
      "roupBidModifierProtoP\001ZJgoogle.golang.or" +
      "g/genproto/googleapis/ads/googleads/v0/r" +
      "esources;resources\242\002\003GAA\252\002!Google.Ads.Go" +
      "ogleAds.V0.Resources\312\002!Google\\Ads\\Google" +
      "Ads\\V0\\Resourcesb\006proto3"
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
          com.google.ads.googleads.v0.common.CriteriaProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.BidModifierSourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_resources_AdGroupBidModifier_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_resources_AdGroupBidModifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_AdGroupBidModifier_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroup", "CriterionId", "BidModifier", "BaseAdGroup", "BidModifierSource", "HotelDateSelectionType", "HotelAdvanceBookingWindow", "HotelLengthOfStay", "HotelCheckInDay", "Device", "PreferredContent", "Criterion", });
    com.google.ads.googleads.v0.common.CriteriaProto.getDescriptor();
    com.google.ads.googleads.v0.enums.BidModifierSourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
