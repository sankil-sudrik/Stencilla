package com.stencilla.app.data.repository;

import com.stencilla.app.data.local.db.ClothingItemDao;
import com.stencilla.app.data.remote.ApiService;
import com.stencilla.app.ml.OnDeviceLabeler;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation"
})
public final class WardrobeRepository_Factory implements Factory<WardrobeRepository> {
  private final Provider<ApiService> apiProvider;

  private final Provider<OnDeviceLabeler> onDeviceLabelerProvider;

  private final Provider<ClothingItemDao> daoProvider;

  public WardrobeRepository_Factory(Provider<ApiService> apiProvider,
      Provider<OnDeviceLabeler> onDeviceLabelerProvider, Provider<ClothingItemDao> daoProvider) {
    this.apiProvider = apiProvider;
    this.onDeviceLabelerProvider = onDeviceLabelerProvider;
    this.daoProvider = daoProvider;
  }

  @Override
  public WardrobeRepository get() {
    return newInstance(apiProvider.get(), onDeviceLabelerProvider.get(), daoProvider.get());
  }

  public static WardrobeRepository_Factory create(Provider<ApiService> apiProvider,
      Provider<OnDeviceLabeler> onDeviceLabelerProvider, Provider<ClothingItemDao> daoProvider) {
    return new WardrobeRepository_Factory(apiProvider, onDeviceLabelerProvider, daoProvider);
  }

  public static WardrobeRepository newInstance(ApiService api, OnDeviceLabeler onDeviceLabeler,
      ClothingItemDao dao) {
    return new WardrobeRepository(api, onDeviceLabeler, dao);
  }
}
