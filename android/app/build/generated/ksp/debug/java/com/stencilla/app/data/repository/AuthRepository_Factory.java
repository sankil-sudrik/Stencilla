package com.stencilla.app.data.repository;

import com.stencilla.app.data.local.AuthStore;
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
public final class AuthRepository_Factory implements Factory<AuthRepository> {
  private final Provider<AuthStore> authStoreProvider;

  private final Provider<ApiService> apiProvider;

  public AuthRepository_Factory(Provider<AuthStore> authStoreProvider,
      Provider<ApiService> apiProvider) {
    this.authStoreProvider = authStoreProvider;
    this.apiProvider = apiProvider;
  }

  @Override
  public AuthRepository get() {
    return newInstance(authStoreProvider.get(), apiProvider.get());
  }

  public static AuthRepository_Factory create(Provider<AuthStore> authStoreProvider,
      Provider<ApiService> apiProvider) {
    return new AuthRepository_Factory(authStoreProvider, apiProvider);
  }

  public static AuthRepository newInstance(AuthStore authStore, ApiService api) {
    return new AuthRepository(authStore, api);
  }
}
