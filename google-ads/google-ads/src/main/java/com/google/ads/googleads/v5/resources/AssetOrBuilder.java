// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/resources/asset.proto

package com.google.ads.googleads.v5.resources;

public interface AssetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v5.resources.Asset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the asset.
   * Asset resource names have the form:
   * `customers/{customer_id}/assets/{asset_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the asset.
   * Asset resource names have the form:
   * `customers/{customer_id}/assets/{asset_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the asset.
   * </pre>
   *
   * <code>int64 id = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the asset.
   * </pre>
   *
   * <code>int64 id = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Optional name of the asset.
   * </pre>
   *
   * <code>string name = 12;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Optional name of the asset.
   * </pre>
   *
   * <code>string name = 12;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Optional name of the asset.
   * </pre>
   *
   * <code>string name = 12;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. Type of the asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.enums.AssetTypeEnum.AssetType type = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Output only. Type of the asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.enums.AssetTypeEnum.AssetType type = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The type.
   */
  com.google.ads.googleads.v5.enums.AssetTypeEnum.AssetType getType();

  /**
   * <pre>
   * Immutable. A YouTube video asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.common.YoutubeVideoAsset youtube_video_asset = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the youtubeVideoAsset field is set.
   */
  boolean hasYoutubeVideoAsset();
  /**
   * <pre>
   * Immutable. A YouTube video asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.common.YoutubeVideoAsset youtube_video_asset = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The youtubeVideoAsset.
   */
  com.google.ads.googleads.v5.common.YoutubeVideoAsset getYoutubeVideoAsset();
  /**
   * <pre>
   * Immutable. A YouTube video asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.common.YoutubeVideoAsset youtube_video_asset = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v5.common.YoutubeVideoAssetOrBuilder getYoutubeVideoAssetOrBuilder();

  /**
   * <pre>
   * Immutable. A media bundle asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.common.MediaBundleAsset media_bundle_asset = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the mediaBundleAsset field is set.
   */
  boolean hasMediaBundleAsset();
  /**
   * <pre>
   * Immutable. A media bundle asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.common.MediaBundleAsset media_bundle_asset = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The mediaBundleAsset.
   */
  com.google.ads.googleads.v5.common.MediaBundleAsset getMediaBundleAsset();
  /**
   * <pre>
   * Immutable. A media bundle asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.common.MediaBundleAsset media_bundle_asset = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v5.common.MediaBundleAssetOrBuilder getMediaBundleAssetOrBuilder();

  /**
   * <pre>
   * Output only. An image asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.common.ImageAsset image_asset = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the imageAsset field is set.
   */
  boolean hasImageAsset();
  /**
   * <pre>
   * Output only. An image asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.common.ImageAsset image_asset = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The imageAsset.
   */
  com.google.ads.googleads.v5.common.ImageAsset getImageAsset();
  /**
   * <pre>
   * Output only. An image asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.common.ImageAsset image_asset = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v5.common.ImageAssetOrBuilder getImageAssetOrBuilder();

  /**
   * <pre>
   * Output only. A text asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.common.TextAsset text_asset = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the textAsset field is set.
   */
  boolean hasTextAsset();
  /**
   * <pre>
   * Output only. A text asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.common.TextAsset text_asset = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The textAsset.
   */
  com.google.ads.googleads.v5.common.TextAsset getTextAsset();
  /**
   * <pre>
   * Output only. A text asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.common.TextAsset text_asset = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v5.common.TextAssetOrBuilder getTextAssetOrBuilder();

  /**
   * <pre>
   * A book on google asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.common.BookOnGoogleAsset book_on_google_asset = 10;</code>
   * @return Whether the bookOnGoogleAsset field is set.
   */
  boolean hasBookOnGoogleAsset();
  /**
   * <pre>
   * A book on google asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.common.BookOnGoogleAsset book_on_google_asset = 10;</code>
   * @return The bookOnGoogleAsset.
   */
  com.google.ads.googleads.v5.common.BookOnGoogleAsset getBookOnGoogleAsset();
  /**
   * <pre>
   * A book on google asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.common.BookOnGoogleAsset book_on_google_asset = 10;</code>
   */
  com.google.ads.googleads.v5.common.BookOnGoogleAssetOrBuilder getBookOnGoogleAssetOrBuilder();

  public com.google.ads.googleads.v5.resources.Asset.AssetDataCase getAssetDataCase();
}