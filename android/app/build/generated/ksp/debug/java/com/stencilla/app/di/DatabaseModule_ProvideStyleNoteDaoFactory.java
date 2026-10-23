package com.stencilla.app.di;

import com.stencilla.app.data.local.db.StencillaDatabase;
import com.stencilla.app.data.local.db.StyleNoteDao;
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
public final class DatabaseModule_ProvideStyleNoteDaoFactory implements Factory<StyleNoteDao> {
  private final Provider<StencillaDatabase> dbProvider;

  public DatabaseModule_ProvideStyleNoteDaoFactory(Provider<StencillaDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public StyleNoteDao get() {
    return provideStyleNoteDao(dbProvider.get());
  }

  public static DatabaseModule_ProvideStyleNoteDaoFactory create(
      Provider<StencillaDatabase> dbProvider) {
    return new DatabaseModule_ProvideStyleNoteDaoFactory(dbProvider);
  }

  public static StyleNoteDao provideStyleNoteDao(StencillaDatabase db) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideStyleNoteDao(db));
  }
}
