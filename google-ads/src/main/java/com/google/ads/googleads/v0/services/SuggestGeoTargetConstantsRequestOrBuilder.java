// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/services/geo_target_constant_service.proto

package com.google.ads.googleads.v0.services;

public interface SuggestGeoTargetConstantsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v0.services.SuggestGeoTargetConstantsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If possible, returned geo targets are translated using this locale. If not,
   * en is used by default. This is also used as a hint for returned geo
   * targets.
   * </pre>
   *
   * <code>.google.protobuf.StringValue locale = 3;</code>
   */
  boolean hasLocale();
  /**
   * <pre>
   * If possible, returned geo targets are translated using this locale. If not,
   * en is used by default. This is also used as a hint for returned geo
   * targets.
   * </pre>
   *
   * <code>.google.protobuf.StringValue locale = 3;</code>
   */
  com.google.protobuf.StringValue getLocale();
  /**
   * <pre>
   * If possible, returned geo targets are translated using this locale. If not,
   * en is used by default. This is also used as a hint for returned geo
   * targets.
   * </pre>
   *
   * <code>.google.protobuf.StringValue locale = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getLocaleOrBuilder();

  /**
   * <pre>
   * Returned geo targets are restricted to this country code.
   * </pre>
   *
   * <code>.google.protobuf.StringValue country_code = 5;</code>
   */
  boolean hasCountryCode();
  /**
   * <pre>
   * Returned geo targets are restricted to this country code.
   * </pre>
   *
   * <code>.google.protobuf.StringValue country_code = 5;</code>
   */
  com.google.protobuf.StringValue getCountryCode();
  /**
   * <pre>
   * Returned geo targets are restricted to this country code.
   * </pre>
   *
   * <code>.google.protobuf.StringValue country_code = 5;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCountryCodeOrBuilder();

  /**
   * <pre>
   * The location names to search by. At most 25 names can be set.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.services.SuggestGeoTargetConstantsRequest.LocationNames location_names = 1;</code>
   */
  boolean hasLocationNames();
  /**
   * <pre>
   * The location names to search by. At most 25 names can be set.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.services.SuggestGeoTargetConstantsRequest.LocationNames location_names = 1;</code>
   */
  com.google.ads.googleads.v0.services.SuggestGeoTargetConstantsRequest.LocationNames getLocationNames();
  /**
   * <pre>
   * The location names to search by. At most 25 names can be set.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.services.SuggestGeoTargetConstantsRequest.LocationNames location_names = 1;</code>
   */
  com.google.ads.googleads.v0.services.SuggestGeoTargetConstantsRequest.LocationNamesOrBuilder getLocationNamesOrBuilder();

  /**
   * <pre>
   * The geo target constant resource names to filter by.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.services.SuggestGeoTargetConstantsRequest.GeoTargets geo_targets = 2;</code>
   */
  boolean hasGeoTargets();
  /**
   * <pre>
   * The geo target constant resource names to filter by.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.services.SuggestGeoTargetConstantsRequest.GeoTargets geo_targets = 2;</code>
   */
  com.google.ads.googleads.v0.services.SuggestGeoTargetConstantsRequest.GeoTargets getGeoTargets();
  /**
   * <pre>
   * The geo target constant resource names to filter by.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.services.SuggestGeoTargetConstantsRequest.GeoTargets geo_targets = 2;</code>
   */
  com.google.ads.googleads.v0.services.SuggestGeoTargetConstantsRequest.GeoTargetsOrBuilder getGeoTargetsOrBuilder();

  public com.google.ads.googleads.v0.services.SuggestGeoTargetConstantsRequest.QueryCase getQueryCase();
}
