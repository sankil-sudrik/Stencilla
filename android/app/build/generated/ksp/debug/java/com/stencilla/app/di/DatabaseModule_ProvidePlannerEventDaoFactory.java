package com.stencilla.app.di;

import com.stencilla.app.data.local.db.PlannerEventDao;
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
public final class DatabaseModule_ProvidePlannerEventDaoFactory implements Factory<PlannerEventDao> {
  private final Provider<StencillaDatabase> dbProvider;

  public DatabaseModule_ProvidePlannerEventDaoFactory(Provider<StencillaDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public PlannerEventDao get() {
    return providePlannerEventDao(dbProvider.get());
  }

  public static DatabaseModule_ProvidePlannerEventDaoFactory create(
      Provider<StencillaDatabase> dbProvider) {
    return new DatabaseModule_ProvidePlannerEventDaoFactory(dbProvider);
  }

  public static PlannerEventDao providePlannerEventDao(StencillaDatabase db) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.providePlannerEventDao(db));
  }
}
