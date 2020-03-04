// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/common/frequency_cap.proto

package com.google.ads.googleads.v3.common;

public interface FrequencyCapKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.common.FrequencyCapKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The level on which the cap is to be applied (e.g. ad group ad, ad group).
   * The cap is applied to all the entities of this level.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.FrequencyCapLevelEnum.FrequencyCapLevel level = 1;</code>
   */
  int getLevelValue();
  /**
   * <pre>
   * The level on which the cap is to be applied (e.g. ad group ad, ad group).
   * The cap is applied to all the entities of this level.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.FrequencyCapLevelEnum.FrequencyCapLevel level = 1;</code>
   */
  com.google.ads.googleads.v3.enums.FrequencyCapLevelEnum.FrequencyCapLevel getLevel();

  /**
   * <pre>
   * The type of event that the cap applies to (e.g. impression).
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.FrequencyCapEventTypeEnum.FrequencyCapEventType event_type = 3;</code>
   */
  int getEventTypeValue();
  /**
   * <pre>
   * The type of event that the cap applies to (e.g. impression).
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.FrequencyCapEventTypeEnum.FrequencyCapEventType event_type = 3;</code>
   */
  com.google.ads.googleads.v3.enums.FrequencyCapEventTypeEnum.FrequencyCapEventType getEventType();

  /**
   * <pre>
   * Unit of time the cap is defined at (e.g. day, week).
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit time_unit = 2;</code>
   */
  int getTimeUnitValue();
  /**
   * <pre>
   * Unit of time the cap is defined at (e.g. day, week).
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit time_unit = 2;</code>
   */
  com.google.ads.googleads.v3.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit getTimeUnit();

  /**
   * <pre>
   * Number of time units the cap lasts.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value time_length = 4;</code>
   */
  boolean hasTimeLength();
  /**
   * <pre>
   * Number of time units the cap lasts.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value time_length = 4;</code>
   */
  com.google.protobuf.Int32Value getTimeLength();
  /**
   * <pre>
   * Number of time units the cap lasts.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value time_length = 4;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getTimeLengthOrBuilder();
}
