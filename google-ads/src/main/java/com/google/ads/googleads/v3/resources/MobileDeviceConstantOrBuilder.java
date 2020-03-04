// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/mobile_device_constant.proto

package com.google.ads.googleads.v3.resources;

public interface MobileDeviceConstantOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.resources.MobileDeviceConstant)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the mobile device constant.
   * Mobile device constant resource names have the form:
   * `mobileDeviceConstants/{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the mobile device constant.
   * Mobile device constant resource names have the form:
   * `mobileDeviceConstants/{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The ID of the mobile device constant.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2;</code>
   */
  boolean hasId();
  /**
   * <pre>
   * The ID of the mobile device constant.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2;</code>
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * The ID of the mobile device constant.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * The name of the mobile device.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 3;</code>
   */
  boolean hasName();
  /**
   * <pre>
   * The name of the mobile device.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 3;</code>
   */
  com.google.protobuf.StringValue getName();
  /**
   * <pre>
   * The name of the mobile device.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * The manufacturer of the mobile device.
   * </pre>
   *
   * <code>.google.protobuf.StringValue manufacturer_name = 4;</code>
   */
  boolean hasManufacturerName();
  /**
   * <pre>
   * The manufacturer of the mobile device.
   * </pre>
   *
   * <code>.google.protobuf.StringValue manufacturer_name = 4;</code>
   */
  com.google.protobuf.StringValue getManufacturerName();
  /**
   * <pre>
   * The manufacturer of the mobile device.
   * </pre>
   *
   * <code>.google.protobuf.StringValue manufacturer_name = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getManufacturerNameOrBuilder();

  /**
   * <pre>
   * The operating system of the mobile device.
   * </pre>
   *
   * <code>.google.protobuf.StringValue operating_system_name = 5;</code>
   */
  boolean hasOperatingSystemName();
  /**
   * <pre>
   * The operating system of the mobile device.
   * </pre>
   *
   * <code>.google.protobuf.StringValue operating_system_name = 5;</code>
   */
  com.google.protobuf.StringValue getOperatingSystemName();
  /**
   * <pre>
   * The operating system of the mobile device.
   * </pre>
   *
   * <code>.google.protobuf.StringValue operating_system_name = 5;</code>
   */
  com.google.protobuf.StringValueOrBuilder getOperatingSystemNameOrBuilder();

  /**
   * <pre>
   * The type of mobile device.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.MobileDeviceTypeEnum.MobileDeviceType type = 6;</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * The type of mobile device.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.MobileDeviceTypeEnum.MobileDeviceType type = 6;</code>
   */
  com.google.ads.googleads.v3.enums.MobileDeviceTypeEnum.MobileDeviceType getType();
}
