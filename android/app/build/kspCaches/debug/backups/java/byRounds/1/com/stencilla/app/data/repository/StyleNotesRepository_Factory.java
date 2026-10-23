package com.stencilla.app.data.repository;

import com.stencilla.app.data.local.db.StyleNoteDao;
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
public final class StyleNotesRepository_Factory implements Factory<StyleNotesRepository> {
  private final Provider<ApiService> apiProvider;

  private final Provider<StyleNoteDao> daoProvider;

  public StyleNotesRepository_Factory(Provider<ApiService> apiProvider,
      Provider<StyleNoteDao> daoProvider) {
    this.apiProvider = apiProvider;
    this.daoProvider = daoProvider;
  }

  @Override
  public StyleNotesRepository get() {
    return newInstance(apiProvider.get(), daoProvider.get());
  }

  public static StyleNotesRepository_Factory create(Provider<ApiService> apiProvider,
      Provider<StyleNoteDao> daoProvider) {
    return new StyleNotesRepository_Factory(apiProvider, daoProvider);
  }

  public static StyleNotesRepository newInstance(ApiService api, StyleNoteDao dao) {
    return new StyleNotesRepository(api, dao);
  }
}
