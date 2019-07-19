package com.bankmandiri.edc.di.module

import androidx.lifecycle.ViewModelProvider
import com.shotbarn.mobile.di.scope.AppViewModelFactory
import dagger.Binds
import dagger.Module

@Suppress("unused")
@Module
internal abstract class ViewModelModule {


    @Binds
    internal abstract fun bindViewModelFactory(factory: AppViewModelFactory): ViewModelProvider.Factory

}