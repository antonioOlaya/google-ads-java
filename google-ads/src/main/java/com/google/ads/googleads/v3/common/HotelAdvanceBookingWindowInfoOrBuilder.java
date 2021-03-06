// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/common/criteria.proto

package com.google.ads.googleads.v3.common;

public interface HotelAdvanceBookingWindowInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.common.HotelAdvanceBookingWindowInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Low end of the number of days prior to the stay.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value min_days = 1;</code>
   * @return Whether the minDays field is set.
   */
  boolean hasMinDays();
  /**
   * <pre>
   * Low end of the number of days prior to the stay.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value min_days = 1;</code>
   * @return The minDays.
   */
  com.google.protobuf.Int64Value getMinDays();
  /**
   * <pre>
   * Low end of the number of days prior to the stay.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value min_days = 1;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getMinDaysOrBuilder();

  /**
   * <pre>
   * High end of the number of days prior to the stay.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value max_days = 2;</code>
   * @return Whether the maxDays field is set.
   */
  boolean hasMaxDays();
  /**
   * <pre>
   * High end of the number of days prior to the stay.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value max_days = 2;</code>
   * @return The maxDays.
   */
  com.google.protobuf.Int64Value getMaxDays();
  /**
   * <pre>
   * High end of the number of days prior to the stay.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value max_days = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getMaxDaysOrBuilder();
}
