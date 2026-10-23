package com.stencilla.app.di;

import com.stencilla.app.data.local.db.OutfitFeedbackDao;
import com.stencilla.app.data.local.db.StencillaDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class DatabaseModule_ProvideOutfitFeedbackDaoFactory implements Factory<OutfitFeedbackDao> {
  private final Provider<StencillaDatabase> dbProvider;

  public DatabaseModule_ProvideOutfitFeedbackDaoFactory(Provider<StencillaDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public OutfitFeedbackDao get() {
    return provideOutfitFeedbackDao(dbProvider.get());
  }

  public static DatabaseModule_ProvideOutfitFeedbackDaoFactory create(
      Provider<StencillaDatabase> dbProvider) {
    return new DatabaseModule_ProvideOutfitFeedbackDaoFactory(dbProvider);
  }

  public static OutfitFeedbackDao provideOutfitFeedbackDao(StencillaDatabase db) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideOutfitFeedbackDao(db));
  }
}
