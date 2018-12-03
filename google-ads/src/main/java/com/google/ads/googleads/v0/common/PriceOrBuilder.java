// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/common/feed_common.proto

package com.google.ads.googleads.v0.common;

public interface PriceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v0.common.Price)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Three-character ISO 4217 currency code.
   * </pre>
   *
   * <code>.google.protobuf.StringValue currency_code = 1;</code>
   */
  boolean hasCurrencyCode();
  /**
   * <pre>
   * Three-character ISO 4217 currency code.
   * </pre>
   *
   * <code>.google.protobuf.StringValue currency_code = 1;</code>
   */
  com.google.protobuf.StringValue getCurrencyCode();
  /**
   * <pre>
   * Three-character ISO 4217 currency code.
   * </pre>
   *
   * <code>.google.protobuf.StringValue currency_code = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCurrencyCodeOrBuilder();

  /**
   * <pre>
   * Amount in micros. One million is equivalent to one unit.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value amount_micros = 2;</code>
   */
  boolean hasAmountMicros();
  /**
   * <pre>
   * Amount in micros. One million is equivalent to one unit.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value amount_micros = 2;</code>
   */
  com.google.protobuf.Int64Value getAmountMicros();
  /**
   * <pre>
   * Amount in micros. One million is equivalent to one unit.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value amount_micros = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getAmountMicrosOrBuilder();
}
