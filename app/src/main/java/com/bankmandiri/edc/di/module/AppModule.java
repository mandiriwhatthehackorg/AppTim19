package com.bankmandiri.edc.di.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.bankmandiri.edc.di.scope.ApplicationContext;
import com.bankmandiri.edc.util.Constant;
import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private final Application mApplication;

    public AppModule(Application app) {
        mApplication = app;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }


    @Provides
    SharedPreferences provideSharedPrefs() {
        return mApplication.getSharedPreferences(Constant.SP_NAME, Context.MODE_PRIVATE);
    }

}
