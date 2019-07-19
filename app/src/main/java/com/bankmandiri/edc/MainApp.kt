package com.bankmandiri.edc

import android.content.Context
import com.bankmandiri.edc.di.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication


class MainApp : DaggerApplication() {

    private val appComponent = DaggerAppComponent.builder()
        .application(this)
        .build()

    companion object {
        private var instance: MainApp? = null
    }

    init {
        instance = this
    }

    fun getInstance(): MainApp? {
        return instance
    }

    fun getContext(): Context? {
        return instance
    }

    override fun onCreate() {
        instance = this
        super.onCreate()
        appComponent.inject(this)

    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return appComponent
    }

}