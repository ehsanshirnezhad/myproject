package com.my.ehsanapplication.di

import com.my.ehsanapplication.api.MielApi
import com.my.ehsanapplication.repository.GetHomeRepository
import com.my.ehsanapplication.repository.HomeRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(ViewModelComponent::class)
abstract class AppModule {

    @Binds
   abstract fun provideGetHomeRepository(homeRepositoryImpl: HomeRepositoryImpl) : GetHomeRepository
}