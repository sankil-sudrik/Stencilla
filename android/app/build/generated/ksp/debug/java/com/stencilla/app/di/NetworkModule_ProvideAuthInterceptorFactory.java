package com.stencilla.app.di;

import com.stencilla.app.data.local.AuthStore;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.Interceptor;

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
public final class NetworkModule_ProvideAuthInterceptorFactory implements Factory<Interceptor> {
  private final Provider<AuthStore> authStoreProvider;

  public NetworkModule_ProvideAuthInterceptorFactory(Provider<AuthStore> authStoreProvider) {
    this.authStoreProvider = authStoreProvider;
  }

  @Override
  public Interceptor get() {
    return provideAuthInterceptor(authStoreProvider.get());
  }

  public static NetworkModule_ProvideAuthInterceptorFactory create(
      Provider<AuthStore> authStoreProvider) {
    return new NetworkModule_ProvideAuthInterceptorFactory(authStoreProvider);
  }

  public static Interceptor provideAuthInterceptor(AuthStore authStore) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideAuthInterceptor(authStore));
  }
}
