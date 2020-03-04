// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/campaign_draft_service.proto

package com.google.ads.googleads.v3.services;

public interface ListCampaignDraftAsyncErrorsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.services.ListCampaignDraftAsyncErrorsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Details of the errors when performing the asynchronous operation.
   * </pre>
   *
   * <code>repeated .google.rpc.Status errors = 1;</code>
   */
  java.util.List<com.google.rpc.Status> 
      getErrorsList();
  /**
   * <pre>
   * Details of the errors when performing the asynchronous operation.
   * </pre>
   *
   * <code>repeated .google.rpc.Status errors = 1;</code>
   */
  com.google.rpc.Status getErrors(int index);
  /**
   * <pre>
   * Details of the errors when performing the asynchronous operation.
   * </pre>
   *
   * <code>repeated .google.rpc.Status errors = 1;</code>
   */
  int getErrorsCount();
  /**
   * <pre>
   * Details of the errors when performing the asynchronous operation.
   * </pre>
   *
   * <code>repeated .google.rpc.Status errors = 1;</code>
   */
  java.util.List<? extends com.google.rpc.StatusOrBuilder> 
      getErrorsOrBuilderList();
  /**
   * <pre>
   * Details of the errors when performing the asynchronous operation.
   * </pre>
   *
   * <code>repeated .google.rpc.Status errors = 1;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorsOrBuilder(
      int index);

  /**
   * <pre>
   * Pagination token used to retrieve the next page of results.
   * Pass the content of this string as the `page_token` attribute of
   * the next request. `next_page_token` is not returned for the last
   * page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Pagination token used to retrieve the next page of results.
   * Pass the content of this string as the `page_token` attribute of
   * the next request. `next_page_token` is not returned for the last
   * page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
