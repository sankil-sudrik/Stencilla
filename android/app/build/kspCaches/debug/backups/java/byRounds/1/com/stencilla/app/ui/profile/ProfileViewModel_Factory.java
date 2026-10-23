package com.stencilla.app.ui.profile;

import com.stencilla.app.data.local.db.ClothingItemDao;
import com.stencilla.app.data.repository.ProfileRepository;
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
public final class ProfileViewModel_Factory implements Factory<ProfileViewModel> {
  private final Provider<ProfileRepository> apiProvider;

  private final Provider<WardrobeAnalyticsRepository> analyticsRepoProvider;

  private final Provider<ClothingItemDao> clothingDaoProvider;

  public ProfileViewModel_Factory(Provider<ProfileRepository> apiProvider,
      Provider<WardrobeAnalyticsRepository> analyticsRepoProvider,
      Provider<ClothingItemDao> clothingDaoProvider) {
    this.apiProvider = apiProvider;
    this.analyticsRepoProvider = analyticsRepoProvider;
    this.clothingDaoProvider = clothingDaoProvider;
  }

  @Override
  public ProfileViewModel get() {
    return newInstance(apiProvider.get(), analyticsRepoProvider.get(), clothingDaoProvider.get());
  }

  public static ProfileViewModel_Factory create(Provider<ProfileRepository> apiProvider,
      Provider<WardrobeAnalyticsRepository> analyticsRepoProvider,
      Provider<ClothingItemDao> clothingDaoProvider) {
    return new ProfileViewModel_Factory(apiProvider, analyticsRepoProvider, clothingDaoProvider);
  }

  public static ProfileViewModel newInstance(ProfileRepository api,
      WardrobeAnalyticsRepository analyticsRepo, ClothingItemDao clothingDao) {
    return new ProfileViewModel(api, analyticsRepo, clothingDao);
  }
}
