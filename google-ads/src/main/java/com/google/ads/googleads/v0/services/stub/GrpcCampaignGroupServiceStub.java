/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.ads.googleads.v0.services.stub;

import com.google.ads.googleads.v0.resources.CampaignGroup;
import com.google.ads.googleads.v0.services.GetCampaignGroupRequest;
import com.google.ads.googleads.v0.services.MutateCampaignGroupsRequest;
import com.google.ads.googleads.v0.services.MutateCampaignGroupsResponse;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * gRPC stub implementation for Google Ads API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class GrpcCampaignGroupServiceStub extends CampaignGroupServiceStub {

  private static final MethodDescriptor<GetCampaignGroupRequest, CampaignGroup>
      getCampaignGroupMethodDescriptor =
          MethodDescriptor.<GetCampaignGroupRequest, CampaignGroup>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v0.services.CampaignGroupService/GetCampaignGroup")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetCampaignGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(CampaignGroup.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<MutateCampaignGroupsRequest, MutateCampaignGroupsResponse>
      mutateCampaignGroupsMethodDescriptor =
          MethodDescriptor.<MutateCampaignGroupsRequest, MutateCampaignGroupsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v0.services.CampaignGroupService/MutateCampaignGroups")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateCampaignGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateCampaignGroupsResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetCampaignGroupRequest, CampaignGroup> getCampaignGroupCallable;
  private final UnaryCallable<MutateCampaignGroupsRequest, MutateCampaignGroupsResponse>
      mutateCampaignGroupsCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcCampaignGroupServiceStub create(CampaignGroupServiceStubSettings settings)
      throws IOException {
    return new GrpcCampaignGroupServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcCampaignGroupServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcCampaignGroupServiceStub(
        CampaignGroupServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcCampaignGroupServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcCampaignGroupServiceStub(
        CampaignGroupServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcCampaignGroupServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcCampaignGroupServiceStub(
      CampaignGroupServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcCampaignGroupServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcCampaignGroupServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcCampaignGroupServiceStub(
      CampaignGroupServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetCampaignGroupRequest, CampaignGroup> getCampaignGroupTransportSettings =
        GrpcCallSettings.<GetCampaignGroupRequest, CampaignGroup>newBuilder()
            .setMethodDescriptor(getCampaignGroupMethodDescriptor)
            .build();
    GrpcCallSettings<MutateCampaignGroupsRequest, MutateCampaignGroupsResponse>
        mutateCampaignGroupsTransportSettings =
            GrpcCallSettings.<MutateCampaignGroupsRequest, MutateCampaignGroupsResponse>newBuilder()
                .setMethodDescriptor(mutateCampaignGroupsMethodDescriptor)
                .build();

    this.getCampaignGroupCallable =
        callableFactory.createUnaryCallable(
            getCampaignGroupTransportSettings, settings.getCampaignGroupSettings(), clientContext);
    this.mutateCampaignGroupsCallable =
        callableFactory.createUnaryCallable(
            mutateCampaignGroupsTransportSettings,
            settings.mutateCampaignGroupsSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetCampaignGroupRequest, CampaignGroup> getCampaignGroupCallable() {
    return getCampaignGroupCallable;
  }

  public UnaryCallable<MutateCampaignGroupsRequest, MutateCampaignGroupsResponse>
      mutateCampaignGroupsCallable() {
    return mutateCampaignGroupsCallable;
  }

  @Override
  public final void close() {
    shutdown();
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
