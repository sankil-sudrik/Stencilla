package com.stencilla.app.ui.closet;

import com.stencilla.app.data.repository.WardrobeRepository;
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
public final class AddItemViewModel_Factory implements Factory<AddItemViewModel> {
  private final Provider<WardrobeRepository> wardrobeRepositoryProvider;

  public AddItemViewModel_Factory(Provider<WardrobeRepository> wardrobeRepositoryProvider) {
    this.wardrobeRepositoryProvider = wardrobeRepositoryProvider;
  }

  @Override
  public AddItemViewModel get() {
    return newInstance(wardrobeRepositoryProvider.get());
  }

  public static AddItemViewModel_Factory create(
      Provider<WardrobeRepository> wardrobeRepositoryProvider) {
    return new AddItemViewModel_Factory(wardrobeRepositoryProvider);
  }

  public static AddItemViewModel newInstance(WardrobeRepository wardrobeRepository) {
    return new AddItemViewModel(wardrobeRepository);
  }
}
