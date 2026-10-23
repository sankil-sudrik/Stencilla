package com.stencilla.app.ui.planner;

import com.stencilla.app.data.local.db.ClothingItemDao;
import com.stencilla.app.data.repository.PlannerRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class PlannerViewModel_Factory implements Factory<PlannerViewModel> {
  private final Provider<PlannerRepository> repoProvider;

  private final Provider<ClothingItemDao> clothingDaoProvider;

  public PlannerViewModel_Factory(Provider<PlannerRepository> repoProvider,
      Provider<ClothingItemDao> clothingDaoProvider) {
    this.repoProvider = repoProvider;
    this.clothingDaoProvider = clothingDaoProvider;
  }

  @Override
  public PlannerViewModel get() {
    return newInstance(repoProvider.get(), clothingDaoProvider.get());
  }

  public static PlannerViewModel_Factory create(Provider<PlannerRepository> repoProvider,
      Provider<ClothingItemDao> clothingDaoProvider) {
    return new PlannerViewModel_Factory(repoProvider, clothingDaoProvider);
  }

  public static PlannerViewModel newInstance(PlannerRepository repo, ClothingItemDao clothingDao) {
    return new PlannerViewModel(repo, clothingDao);
  }
}
