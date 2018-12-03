// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/services/recommendation_service.proto

package com.google.ads.googleads.v0.services;

public final class RecommendationServiceProto {
  private RecommendationServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_GetRecommendationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_GetRecommendationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_ApplyRecommendationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_ApplyRecommendationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_ApplyRecommendationOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_ApplyRecommendationOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_ApplyRecommendationOperation_CampaignBudgetParameters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_ApplyRecommendationOperation_CampaignBudgetParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_ApplyRecommendationOperation_TextAdParameters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_ApplyRecommendationOperation_TextAdParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_ApplyRecommendationOperation_KeywordParameters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_ApplyRecommendationOperation_KeywordParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_ApplyRecommendationOperation_TargetCpaOptInParameters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_ApplyRecommendationOperation_TargetCpaOptInParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_ApplyRecommendationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_ApplyRecommendationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_ApplyRecommendationResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_ApplyRecommendationResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_DismissRecommendationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_DismissRecommendationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_DismissRecommendationRequest_DismissRecommendationOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_DismissRecommendationRequest_DismissRecommendationOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_DismissRecommendationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_DismissRecommendationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_DismissRecommendationResponse_DismissRecommendationResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_DismissRecommendationResponse_DismissRecommendationResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v0/services/recom" +
      "mendation_service.proto\022 google.ads.goog" +
      "leads.v0.services\0326google/ads/googleads/" +
      "v0/enums/keyword_match_type.proto\032*googl" +
      "e/ads/googleads/v0/resources/ad.proto\0326g" +
      "oogle/ads/googleads/v0/resources/recomme" +
      "ndation.proto\032\034google/api/annotations.pr" +
      "oto\032\036google/protobuf/wrappers.proto\032\027goo" +
      "gle/rpc/status.proto\"1\n\030GetRecommendatio" +
      "nRequest\022\025\n\rresource_name\030\001 \001(\t\"\236\001\n\032Appl" +
      "yRecommendationRequest\022\023\n\013customer_id\030\001 " +
      "\001(\t\022\027\n\017partial_failure\030\003 \001(\010\022R\n\noperatio" +
      "ns\030\002 \003(\0132>.google.ads.googleads.v0.servi" +
      "ces.ApplyRecommendationOperation\"\220\010\n\034App" +
      "lyRecommendationOperation\022\025\n\rresource_na" +
      "me\030\001 \001(\t\022r\n\017campaign_budget\030\002 \001(\0132W.goog" +
      "le.ads.googleads.v0.services.ApplyRecomm" +
      "endationOperation.CampaignBudgetParamete" +
      "rsH\000\022b\n\007text_ad\030\003 \001(\0132O.google.ads.googl" +
      "eads.v0.services.ApplyRecommendationOper" +
      "ation.TextAdParametersH\000\022c\n\007keyword\030\004 \001(" +
      "\0132P.google.ads.googleads.v0.services.App" +
      "lyRecommendationOperation.KeywordParamet" +
      "ersH\000\022t\n\021target_cpa_opt_in\030\005 \001(\0132W.googl" +
      "e.ads.googleads.v0.services.ApplyRecomme" +
      "ndationOperation.TargetCpaOptInParameter" +
      "sH\000\032Y\n\030CampaignBudgetParameters\022=\n\030new_b" +
      "udget_amount_micros\030\001 \001(\0132\033.google.proto" +
      "buf.Int64Value\032E\n\020TextAdParameters\0221\n\002ad" +
      "\030\001 \001(\0132%.google.ads.googleads.v0.resourc" +
      "es.Ad\032\322\001\n\021KeywordParameters\022.\n\010ad_group\030" +
      "\001 \001(\0132\034.google.protobuf.StringValue\022X\n\nm" +
      "atch_type\030\002 \001(\0162D.google.ads.googleads.v" +
      "0.enums.KeywordMatchTypeEnum.KeywordMatc" +
      "hType\0223\n\016cpc_bid_micros\030\003 \001(\0132\033.google.p" +
      "rotobuf.Int64Value\032\232\001\n\030TargetCpaOptInPar" +
      "ameters\0226\n\021target_cpa_micros\030\001 \001(\0132\033.goo" +
      "gle.protobuf.Int64Value\022F\n!new_campaign_" +
      "budget_amount_micros\030\002 \001(\0132\033.google.prot" +
      "obuf.Int64ValueB\022\n\020apply_parameters\"\236\001\n\033" +
      "ApplyRecommendationResponse\022L\n\007results\030\001" +
      " \003(\0132;.google.ads.googleads.v0.services." +
      "ApplyRecommendationResult\0221\n\025partial_fai" +
      "lure_error\030\002 \001(\0132\022.google.rpc.Status\"2\n\031" +
      "ApplyRecommendationResult\022\025\n\rresource_na" +
      "me\030\001 \001(\t\"\370\001\n\034DismissRecommendationReques" +
      "t\022\023\n\013customer_id\030\001 \001(\t\022\027\n\017partial_failur" +
      "e\030\002 \001(\010\022q\n\noperations\030\003 \003(\0132].google.ads" +
      ".googleads.v0.services.DismissRecommenda" +
      "tionRequest.DismissRecommendationOperati" +
      "on\0327\n\036DismissRecommendationOperation\022\025\n\r" +
      "resource_name\030\001 \001(\t\"\366\001\n\035DismissRecommend" +
      "ationResponse\022l\n\007results\030\001 \003(\0132[.google." +
      "ads.googleads.v0.services.DismissRecomme" +
      "ndationResponse.DismissRecommendationRes" +
      "ult\0221\n\025partial_failure_error\030\002 \001(\0132\022.goo" +
      "gle.rpc.Status\0324\n\033DismissRecommendationR" +
      "esult\022\025\n\rresource_name\030\001 \001(\t2\211\005\n\025Recomme" +
      "ndationService\022\275\001\n\021GetRecommendation\022:.g" +
      "oogle.ads.googleads.v0.services.GetRecom" +
      "mendationRequest\0321.google.ads.googleads." +
      "v0.resources.Recommendation\"9\202\323\344\223\0023\0221/v0" +
      "/{resource_name=customers/*/recommendati" +
      "ons/*}\022\322\001\n\023ApplyRecommendation\022<.google." +
      "ads.googleads.v0.services.ApplyRecommend" +
      "ationRequest\032=.google.ads.googleads.v0.s" +
      "ervices.ApplyRecommendationResponse\">\202\323\344" +
      "\223\0028\"3/v0/customers/{customer_id=*}/recom" +
      "mendations:apply:\001*\022\332\001\n\025DismissRecommend" +
      "ation\022>.google.ads.googleads.v0.services" +
      ".DismissRecommendationRequest\032?.google.a" +
      "ds.googleads.v0.services.DismissRecommen" +
      "dationResponse\"@\202\323\344\223\002:\"5/v0/customers/{c" +
      "ustomer_id=*}/recommendations:dismiss:\001*" +
      "B\332\001\n$com.google.ads.googleads.v0.service" +
      "sB\032RecommendationServiceProtoP\001ZHgoogle." +
      "golang.org/genproto/googleapis/ads/googl" +
      "eads/v0/services;services\242\002\003GAA\252\002 Google" +
      ".Ads.GoogleAds.V0.Services\312\002 Google\\Ads\\" +
      "GoogleAds\\V0\\Servicesb\006proto3"
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
          com.google.ads.googleads.v0.enums.KeywordMatchTypeProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.AdProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.RecommendationProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_services_GetRecommendationRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_services_GetRecommendationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_GetRecommendationRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v0_services_ApplyRecommendationRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v0_services_ApplyRecommendationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_ApplyRecommendationRequest_descriptor,
        new java.lang.String[] { "CustomerId", "PartialFailure", "Operations", });
    internal_static_google_ads_googleads_v0_services_ApplyRecommendationOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v0_services_ApplyRecommendationOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_ApplyRecommendationOperation_descriptor,
        new java.lang.String[] { "ResourceName", "CampaignBudget", "TextAd", "Keyword", "TargetCpaOptIn", "ApplyParameters", });
    internal_static_google_ads_googleads_v0_services_ApplyRecommendationOperation_CampaignBudgetParameters_descriptor =
      internal_static_google_ads_googleads_v0_services_ApplyRecommendationOperation_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v0_services_ApplyRecommendationOperation_CampaignBudgetParameters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_ApplyRecommendationOperation_CampaignBudgetParameters_descriptor,
        new java.lang.String[] { "NewBudgetAmountMicros", });
    internal_static_google_ads_googleads_v0_services_ApplyRecommendationOperation_TextAdParameters_descriptor =
      internal_static_google_ads_googleads_v0_services_ApplyRecommendationOperation_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v0_services_ApplyRecommendationOperation_TextAdParameters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_ApplyRecommendationOperation_TextAdParameters_descriptor,
        new java.lang.String[] { "Ad", });
    internal_static_google_ads_googleads_v0_services_ApplyRecommendationOperation_KeywordParameters_descriptor =
      internal_static_google_ads_googleads_v0_services_ApplyRecommendationOperation_descriptor.getNestedTypes().get(2);
    internal_static_google_ads_googleads_v0_services_ApplyRecommendationOperation_KeywordParameters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_ApplyRecommendationOperation_KeywordParameters_descriptor,
        new java.lang.String[] { "AdGroup", "MatchType", "CpcBidMicros", });
    internal_static_google_ads_googleads_v0_services_ApplyRecommendationOperation_TargetCpaOptInParameters_descriptor =
      internal_static_google_ads_googleads_v0_services_ApplyRecommendationOperation_descriptor.getNestedTypes().get(3);
    internal_static_google_ads_googleads_v0_services_ApplyRecommendationOperation_TargetCpaOptInParameters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_ApplyRecommendationOperation_TargetCpaOptInParameters_descriptor,
        new java.lang.String[] { "TargetCpaMicros", "NewCampaignBudgetAmountMicros", });
    internal_static_google_ads_googleads_v0_services_ApplyRecommendationResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v0_services_ApplyRecommendationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_ApplyRecommendationResponse_descriptor,
        new java.lang.String[] { "Results", "PartialFailureError", });
    internal_static_google_ads_googleads_v0_services_ApplyRecommendationResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v0_services_ApplyRecommendationResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_ApplyRecommendationResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v0_services_DismissRecommendationRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v0_services_DismissRecommendationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_DismissRecommendationRequest_descriptor,
        new java.lang.String[] { "CustomerId", "PartialFailure", "Operations", });
    internal_static_google_ads_googleads_v0_services_DismissRecommendationRequest_DismissRecommendationOperation_descriptor =
      internal_static_google_ads_googleads_v0_services_DismissRecommendationRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v0_services_DismissRecommendationRequest_DismissRecommendationOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_DismissRecommendationRequest_DismissRecommendationOperation_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v0_services_DismissRecommendationResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v0_services_DismissRecommendationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_DismissRecommendationResponse_descriptor,
        new java.lang.String[] { "Results", "PartialFailureError", });
    internal_static_google_ads_googleads_v0_services_DismissRecommendationResponse_DismissRecommendationResult_descriptor =
      internal_static_google_ads_googleads_v0_services_DismissRecommendationResponse_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v0_services_DismissRecommendationResponse_DismissRecommendationResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_DismissRecommendationResponse_DismissRecommendationResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v0.enums.KeywordMatchTypeProto.getDescriptor();
    com.google.ads.googleads.v0.resources.AdProto.getDescriptor();
    com.google.ads.googleads.v0.resources.RecommendationProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
