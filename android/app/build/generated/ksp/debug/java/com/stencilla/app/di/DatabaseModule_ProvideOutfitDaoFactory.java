package com.stencilla.app.di;

import com.stencilla.app.data.local.db.OutfitDao;
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
public final class DatabaseModule_ProvideOutfitDaoFactory implements Factory<OutfitDao> {
  private final Provider<StencillaDatabase> dbProvider;

  public DatabaseModule_ProvideOutfitDaoFactory(Provider<StencillaDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public OutfitDao get() {
    return provideOutfitDao(dbProvider.get());
  }

  public static DatabaseModule_ProvideOutfitDaoFactory create(
      Provider<StencillaDatabase> dbProvider) {
    return new DatabaseModule_ProvideOutfitDaoFactory(dbProvider);
  }

  public static OutfitDao provideOutfitDao(StencillaDatabase db) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideOutfitDao(db));
  }
}
