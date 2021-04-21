package com.cj.kotlinjetpackapplication

import android.app.Application
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
class ApplicationModule {
    @Provides
    fun providerMyApplication(application:Application):MyApplication{
        return application as MyApplication
    }

}