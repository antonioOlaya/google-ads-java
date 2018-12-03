// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/resources/carrier_constant.proto

package com.google.ads.googleads.v0.resources;

public interface CarrierConstantOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v0.resources.CarrierConstant)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the carrier criterion.
   * Carrier criterion resource names have the form:
   * `carrierConstants/{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the carrier criterion.
   * Carrier criterion resource names have the form:
   * `carrierConstants/{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The ID of the carrier criterion.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2;</code>
   */
  boolean hasId();
  /**
   * <pre>
   * The ID of the carrier criterion.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2;</code>
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * The ID of the carrier criterion.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * The full name of the carrier in English.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 3;</code>
   */
  boolean hasName();
  /**
   * <pre>
   * The full name of the carrier in English.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 3;</code>
   */
  com.google.protobuf.StringValue getName();
  /**
   * <pre>
   * The full name of the carrier in English.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * The country code of the country where the carrier is located, e.g., "AR",
   * "FR", etc.
   * </pre>
   *
   * <code>.google.protobuf.StringValue country_code = 4;</code>
   */
  boolean hasCountryCode();
  /**
   * <pre>
   * The country code of the country where the carrier is located, e.g., "AR",
   * "FR", etc.
   * </pre>
   *
   * <code>.google.protobuf.StringValue country_code = 4;</code>
   */
  com.google.protobuf.StringValue getCountryCode();
  /**
   * <pre>
   * The country code of the country where the carrier is located, e.g., "AR",
   * "FR", etc.
   * </pre>
   *
   * <code>.google.protobuf.StringValue country_code = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCountryCodeOrBuilder();
}
