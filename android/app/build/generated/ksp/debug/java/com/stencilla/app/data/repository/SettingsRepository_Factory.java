package com.stencilla.app.data.repository;

import android.content.Context;
import com.stencilla.app.data.remote.ApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class SettingsRepository_Factory implements Factory<SettingsRepository> {
  private final Provider<Context> contextProvider;

  private final Provider<ApiService> apiProvider;

  public SettingsRepository_Factory(Provider<Context> contextProvider,
      Provider<ApiService> apiProvider) {
    this.contextProvider = contextProvider;
    this.apiProvider = apiProvider;
  }

  @Override
  public SettingsRepository get() {
    return newInstance(contextProvider.get(), apiProvider.get());
  }

  public static SettingsRepository_Factory create(Provider<Context> contextProvider,
      Provider<ApiService> apiProvider) {
    return new SettingsRepository_Factory(contextProvider, apiProvider);
  }

  public static SettingsRepository newInstance(Context context, ApiService api) {
    return new SettingsRepository(context, api);
  }
}
