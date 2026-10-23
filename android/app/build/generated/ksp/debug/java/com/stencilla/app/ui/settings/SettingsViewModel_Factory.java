package com.stencilla.app.ui.settings;

import com.stencilla.app.data.repository.AuthRepository;
import com.stencilla.app.data.repository.SettingsRepository;
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
public final class SettingsViewModel_Factory implements Factory<SettingsViewModel> {
  private final Provider<SettingsRepository> settingsRepoProvider;

  private final Provider<AuthRepository> authRepoProvider;

  public SettingsViewModel_Factory(Provider<SettingsRepository> settingsRepoProvider,
      Provider<AuthRepository> authRepoProvider) {
    this.settingsRepoProvider = settingsRepoProvider;
    this.authRepoProvider = authRepoProvider;
  }

  @Override
  public SettingsViewModel get() {
    return newInstance(settingsRepoProvider.get(), authRepoProvider.get());
  }

  public static SettingsViewModel_Factory create(Provider<SettingsRepository> settingsRepoProvider,
      Provider<AuthRepository> authRepoProvider) {
    return new SettingsViewModel_Factory(settingsRepoProvider, authRepoProvider);
  }

  public static SettingsViewModel newInstance(SettingsRepository settingsRepo,
      AuthRepository authRepo) {
    return new SettingsViewModel(settingsRepo, authRepo);
  }
}
