package com.stencilla.app.data.repository;

import com.stencilla.app.data.local.db.ClothingItemDao;
import com.stencilla.app.data.local.db.OutfitDao;
import com.stencilla.app.data.local.db.OutfitFeedbackDao;
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
public final class OutfitRepository_Factory implements Factory<OutfitRepository> {
  private final Provider<ApiService> apiProvider;

  private final Provider<OutfitDao> outfitDaoProvider;

  private final Provider<OutfitFeedbackDao> feedbackDaoProvider;

  private final Provider<ClothingItemDao> clothingDaoProvider;

  public OutfitRepository_Factory(Provider<ApiService> apiProvider,
      Provider<OutfitDao> outfitDaoProvider, Provider<OutfitFeedbackDao> feedbackDaoProvider,
      Provider<ClothingItemDao> clothingDaoProvider) {
    this.apiProvider = apiProvider;
    this.outfitDaoProvider = outfitDaoProvider;
    this.feedbackDaoProvider = feedbackDaoProvider;
    this.clothingDaoProvider = clothingDaoProvider;
  }

  @Override
  public OutfitRepository get() {
    return newInstance(apiProvider.get(), outfitDaoProvider.get(), feedbackDaoProvider.get(), clothingDaoProvider.get());
  }

  public static OutfitRepository_Factory create(Provider<ApiService> apiProvider,
      Provider<OutfitDao> outfitDaoProvider, Provider<OutfitFeedbackDao> feedbackDaoProvider,
      Provider<ClothingItemDao> clothingDaoProvider) {
    return new OutfitRepository_Factory(apiProvider, outfitDaoProvider, feedbackDaoProvider, clothingDaoProvider);
  }

  public static OutfitRepository newInstance(ApiService api, OutfitDao outfitDao,
      OutfitFeedbackDao feedbackDao, ClothingItemDao clothingDao) {
    return new OutfitRepository(api, outfitDao, feedbackDao, clothingDao);
  }
}
