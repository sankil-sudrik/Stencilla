package com.stencilla.app.ui.onboarding;

import com.stencilla.app.data.repository.AuthRepository;
import com.stencilla.app.data.repository.ProfileRepository;
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
public final class ProfileViewModel_Factory implements Factory<ProfileViewModel> {
  private final Provider<ProfileRepository> profileRepositoryProvider;

  private final Provider<AuthRepository> authRepositoryProvider;

  public ProfileViewModel_Factory(Provider<ProfileRepository> profileRepositoryProvider,
      Provider<AuthRepository> authRepositoryProvider) {
    this.profileRepositoryProvider = profileRepositoryProvider;
    this.authRepositoryProvider = authRepositoryProvider;
  }

  @Override
  public ProfileViewModel get() {
    return newInstance(profileRepositoryProvider.get(), authRepositoryProvider.get());
  }

  public static ProfileViewModel_Factory create(
      Provider<ProfileRepository> profileRepositoryProvider,
      Provider<AuthRepository> authRepositoryProvider) {
    return new ProfileViewModel_Factory(profileRepositoryProvider, authRepositoryProvider);
  }

  public static ProfileViewModel newInstance(ProfileRepository profileRepository,
      AuthRepository authRepository) {
    return new ProfileViewModel(profileRepository, authRepository);
  }
}
