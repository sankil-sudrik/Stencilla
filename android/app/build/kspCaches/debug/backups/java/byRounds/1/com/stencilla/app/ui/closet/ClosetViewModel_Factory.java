package com.stencilla.app.ui.closet;

import com.stencilla.app.data.local.db.ClothingItemDao;
import com.stencilla.app.data.repository.WardrobeAnalyticsRepository;
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
public final class ClosetViewModel_Factory implements Factory<ClosetViewModel> {
  private final Provider<ClothingItemDao> clothingDaoProvider;

  private final Provider<WardrobeAnalyticsRepository> analyticsRepoProvider;

  public ClosetViewModel_Factory(Provider<ClothingItemDao> clothingDaoProvider,
      Provider<WardrobeAnalyticsRepository> analyticsRepoProvider) {
    this.clothingDaoProvider = clothingDaoProvider;
    this.analyticsRepoProvider = analyticsRepoProvider;
  }

  @Override
  public ClosetViewModel get() {
    return newInstance(clothingDaoProvider.get(), analyticsRepoProvider.get());
  }

  public static ClosetViewModel_Factory create(Provider<ClothingItemDao> clothingDaoProvider,
      Provider<WardrobeAnalyticsRepository> analyticsRepoProvider) {
    return new ClosetViewModel_Factory(clothingDaoProvider, analyticsRepoProvider);
  }

  public static ClosetViewModel newInstance(ClothingItemDao clothingDao,
      WardrobeAnalyticsRepository analyticsRepo) {
    return new ClosetViewModel(clothingDao, analyticsRepo);
  }
}
