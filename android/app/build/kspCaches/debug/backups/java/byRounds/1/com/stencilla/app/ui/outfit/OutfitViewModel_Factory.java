package com.stencilla.app.ui.outfit;

import com.stencilla.app.data.repository.ContextRepository;
import com.stencilla.app.data.repository.OutfitRepository;
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
public final class OutfitViewModel_Factory implements Factory<OutfitViewModel> {
  private final Provider<OutfitRepository> outfitRepositoryProvider;

  private final Provider<WardrobeRepository> wardrobeRepositoryProvider;

  private final Provider<ContextRepository> contextRepositoryProvider;

  public OutfitViewModel_Factory(Provider<OutfitRepository> outfitRepositoryProvider,
      Provider<WardrobeRepository> wardrobeRepositoryProvider,
      Provider<ContextRepository> contextRepositoryProvider) {
    this.outfitRepositoryProvider = outfitRepositoryProvider;
    this.wardrobeRepositoryProvider = wardrobeRepositoryProvider;
    this.contextRepositoryProvider = contextRepositoryProvider;
  }

  @Override
  public OutfitViewModel get() {
    return newInstance(outfitRepositoryProvider.get(), wardrobeRepositoryProvider.get(), contextRepositoryProvider.get());
  }

  public static OutfitViewModel_Factory create(Provider<OutfitRepository> outfitRepositoryProvider,
      Provider<WardrobeRepository> wardrobeRepositoryProvider,
      Provider<ContextRepository> contextRepositoryProvider) {
    return new OutfitViewModel_Factory(outfitRepositoryProvider, wardrobeRepositoryProvider, contextRepositoryProvider);
  }

  public static OutfitViewModel newInstance(OutfitRepository outfitRepository,
      WardrobeRepository wardrobeRepository, ContextRepository contextRepository) {
    return new OutfitViewModel(outfitRepository, wardrobeRepository, contextRepository);
  }
}
