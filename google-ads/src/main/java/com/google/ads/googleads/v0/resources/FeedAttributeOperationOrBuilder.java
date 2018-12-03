// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/resources/feed.proto

package com.google.ads.googleads.v0.resources;

public interface FeedAttributeOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v0.resources.FeedAttributeOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Type of list operation to perform.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.resources.FeedAttributeOperation.Operator operator = 1;</code>
   */
  int getOperatorValue();
  /**
   * <pre>
   * Type of list operation to perform.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.resources.FeedAttributeOperation.Operator operator = 1;</code>
   */
  com.google.ads.googleads.v0.resources.FeedAttributeOperation.Operator getOperator();

  /**
   * <pre>
   * The feed attribute being added to the list.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.resources.FeedAttribute value = 2;</code>
   */
  boolean hasValue();
  /**
   * <pre>
   * The feed attribute being added to the list.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.resources.FeedAttribute value = 2;</code>
   */
  com.google.ads.googleads.v0.resources.FeedAttribute getValue();
  /**
   * <pre>
   * The feed attribute being added to the list.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.resources.FeedAttribute value = 2;</code>
   */
  com.google.ads.googleads.v0.resources.FeedAttributeOrBuilder getValueOrBuilder();
}
