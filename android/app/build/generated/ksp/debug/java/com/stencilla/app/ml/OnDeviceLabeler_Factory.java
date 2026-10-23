package com.stencilla.app.ml;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class OnDeviceLabeler_Factory implements Factory<OnDeviceLabeler> {
  @Override
  public OnDeviceLabeler get() {
    return newInstance();
  }

  public static OnDeviceLabeler_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static OnDeviceLabeler newInstance() {
    return new OnDeviceLabeler();
  }

  private static final class InstanceHolder {
    private static final OnDeviceLabeler_Factory INSTANCE = new OnDeviceLabeler_Factory();
  }
}
