package com.stencilla.app.ui.verifier;

import com.stencilla.app.data.remote.ApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class OutfitVerifierViewModel_Factory implements Factory<OutfitVerifierViewModel> {
  private final Provider<ApiService> apiProvider;

  public OutfitVerifierViewModel_Factory(Provider<ApiService> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public OutfitVerifierViewModel get() {
    return newInstance(apiProvider.get());
  }

  public static OutfitVerifierViewModel_Factory create(Provider<ApiService> apiProvider) {
    return new OutfitVerifierViewModel_Factory(apiProvider);
  }

  public static OutfitVerifierViewModel newInstance(ApiService api) {
    return new OutfitVerifierViewModel(api);
  }
}
