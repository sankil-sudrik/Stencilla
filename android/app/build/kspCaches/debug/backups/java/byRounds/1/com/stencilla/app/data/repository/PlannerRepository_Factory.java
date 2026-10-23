package com.stencilla.app.data.repository;

import com.stencilla.app.data.local.db.ClothingItemDao;
import com.stencilla.app.data.local.db.PlannerEventDao;
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
public final class PlannerRepository_Factory implements Factory<PlannerRepository> {
  private final Provider<ApiService> apiProvider;

  private final Provider<PlannerEventDao> daoProvider;

  private final Provider<ClothingItemDao> clothingDaoProvider;

  public PlannerRepository_Factory(Provider<ApiService> apiProvider,
      Provider<PlannerEventDao> daoProvider, Provider<ClothingItemDao> clothingDaoProvider) {
    this.apiProvider = apiProvider;
    this.daoProvider = daoProvider;
    this.clothingDaoProvider = clothingDaoProvider;
  }

  @Override
  public PlannerRepository get() {
    return newInstance(apiProvider.get(), daoProvider.get(), clothingDaoProvider.get());
  }

  public static PlannerRepository_Factory create(Provider<ApiService> apiProvider,
      Provider<PlannerEventDao> daoProvider, Provider<ClothingItemDao> clothingDaoProvider) {
    return new PlannerRepository_Factory(apiProvider, daoProvider, clothingDaoProvider);
  }

  public static PlannerRepository newInstance(ApiService api, PlannerEventDao dao,
      ClothingItemDao clothingDao) {
    return new PlannerRepository(api, dao, clothingDao);
  }
}
