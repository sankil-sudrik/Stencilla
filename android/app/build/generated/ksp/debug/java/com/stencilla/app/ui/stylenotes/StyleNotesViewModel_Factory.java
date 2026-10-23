package com.stencilla.app.ui.stylenotes;

import com.stencilla.app.data.repository.StyleNotesRepository;
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
public final class StyleNotesViewModel_Factory implements Factory<StyleNotesViewModel> {
  private final Provider<StyleNotesRepository> repoProvider;

  public StyleNotesViewModel_Factory(Provider<StyleNotesRepository> repoProvider) {
    this.repoProvider = repoProvider;
  }

  @Override
  public StyleNotesViewModel get() {
    return newInstance(repoProvider.get());
  }

  public static StyleNotesViewModel_Factory create(Provider<StyleNotesRepository> repoProvider) {
    return new StyleNotesViewModel_Factory(repoProvider);
  }

  public static StyleNotesViewModel newInstance(StyleNotesRepository repo) {
    return new StyleNotesViewModel(repo);
  }
}
