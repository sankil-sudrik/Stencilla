package com.stencilla.app.ui.today;

import com.stencilla.app.data.local.db.ClothingItemDao;
import com.stencilla.app.data.repository.ContextRepository;
import com.stencilla.app.data.repository.OutfitRepository;
import com.stencilla.app.data.repository.PlannerRepository;
import com.stencilla.app.data.repository.ProfileRepository;
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
public final class TodayViewModel_Factory implements Factory<TodayViewModel> {
  private final Provider<ContextRepository> contextRepoProvider;

  private final Provider<OutfitRepository> outfitRepoProvider;

  private final Provider<PlannerRepository> plannerRepoProvider;

  private final Provider<ProfileRepository> profileRepoProvider;

  private final Provider<ClothingItemDao> clothingDaoProvider;

  public TodayViewModel_Factory(Provider<ContextRepository> contextRepoProvider,
      Provider<OutfitRepository> outfitRepoProvider,
      Provider<PlannerRepository> plannerRepoProvider,
      Provider<ProfileRepository> profileRepoProvider,
      Provider<ClothingItemDao> clothingDaoProvider) {
    this.contextRepoProvider = contextRepoProvider;
    this.outfitRepoProvider = outfitRepoProvider;
    this.plannerRepoProvider = plannerRepoProvider;
    this.profileRepoProvider = profileRepoProvider;
    this.clothingDaoProvider = clothingDaoProvider;
  }

  @Override
  public TodayViewModel get() {
    return newInstance(contextRepoProvider.get(), outfitRepoProvider.get(), plannerRepoProvider.get(), profileRepoProvider.get(), clothingDaoProvider.get());
  }

  public static TodayViewModel_Factory create(Provider<ContextRepository> contextRepoProvider,
      Provider<OutfitRepository> outfitRepoProvider,
      Provider<PlannerRepository> plannerRepoProvider,
      Provider<ProfileRepository> profileRepoProvider,
      Provider<ClothingItemDao> clothingDaoProvider) {
    return new TodayViewModel_Factory(contextRepoProvider, outfitRepoProvider, plannerRepoProvider, profileRepoProvider, clothingDaoProvider);
  }

  public static TodayViewModel newInstance(ContextRepository contextRepo,
      OutfitRepository outfitRepo, PlannerRepository plannerRepo, ProfileRepository profileRepo,
      ClothingItemDao clothingDao) {
    return new TodayViewModel(contextRepo, outfitRepo, plannerRepo, profileRepo, clothingDao);
  }
}
