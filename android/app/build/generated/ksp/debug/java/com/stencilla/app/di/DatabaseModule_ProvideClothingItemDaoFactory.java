package com.stencilla.app.di;

import com.stencilla.app.data.local.db.ClothingItemDao;
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
public final class DatabaseModule_ProvideClothingItemDaoFactory implements Factory<ClothingItemDao> {
  private final Provider<StencillaDatabase> dbProvider;

  public DatabaseModule_ProvideClothingItemDaoFactory(Provider<StencillaDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public ClothingItemDao get() {
    return provideClothingItemDao(dbProvider.get());
  }

  public static DatabaseModule_ProvideClothingItemDaoFactory create(
      Provider<StencillaDatabase> dbProvider) {
    return new DatabaseModule_ProvideClothingItemDaoFactory(dbProvider);
  }

  public static ClothingItemDao provideClothingItemDao(StencillaDatabase db) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideClothingItemDao(db));
  }
}
