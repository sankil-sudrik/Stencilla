package com.stencilla.app.data.repository;

import com.stencilla.app.data.local.db.ClothingItemDao;
import com.stencilla.app.data.local.db.OutfitDao;
import com.stencilla.app.data.remote.ApiService;
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
public final class WardrobeAnalyticsRepository_Factory implements Factory<WardrobeAnalyticsRepository> {
  private final Provider<ApiService> apiProvider;

  private final Provider<ClothingItemDao> clothingDaoProvider;

  private final Provider<OutfitDao> outfitDaoProvider;

  public WardrobeAnalyticsRepository_Factory(Provider<ApiService> apiProvider,
      Provider<ClothingItemDao> clothingDaoProvider, Provider<OutfitDao> outfitDaoProvider) {
    this.apiProvider = apiProvider;
    this.clothingDaoProvider = clothingDaoProvider;
    this.outfitDaoProvider = outfitDaoProvider;
  }

  @Override
  public WardrobeAnalyticsRepository get() {
    return newInstance(apiProvider.get(), clothingDaoProvider.get(), outfitDaoProvider.get());
  }

  public static WardrobeAnalyticsRepository_Factory create(Provider<ApiService> apiProvider,
      Provider<ClothingItemDao> clothingDaoProvider, Provider<OutfitDao> outfitDaoProvider) {
    return new WardrobeAnalyticsRepository_Factory(apiProvider, clothingDaoProvider, outfitDaoProvider);
  }

  public static WardrobeAnalyticsRepository newInstance(ApiService api, ClothingItemDao clothingDao,
      OutfitDao outfitDao) {
    return new WardrobeAnalyticsRepository(api, clothingDao, outfitDao);
  }
}
