package com.cj.dagger;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = NetModule.class)
public interface ApplicationComponent {
    void inject(MainActivity activity);
    void inject(SecondActivity activity);
}
