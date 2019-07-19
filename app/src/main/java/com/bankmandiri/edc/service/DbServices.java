package com.bankmandiri.edc.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.bankmandiri.edc.model.User;
import com.bankmandiri.edc.util.Constant;
import com.google.gson.Gson;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by dharmana on 3/27/18.
 */

public class DbServices {

    public Context mContext;

    public DbServices(Context ctx) {
        this.mContext = ctx;
    }

    public void setUser(User user) {

        logout();

        mContext.getSharedPreferences(Constant.SP_NAME, MODE_PRIVATE)
                .edit()
                .putString(Constant.SP_USER, new Gson().toJson(user))
                .putString(Constant.SP_TOKEN, user.getApiToken()).apply();
    }

    public User getUser() {
        String str = mContext.getSharedPreferences(Constant.SP_NAME, MODE_PRIVATE)
                .getString(Constant.SP_USER, null);
        try {
            return new Gson().fromJson(str, User.class);
        } catch (Exception e) {
            Log.e(Constant.TAG, str);
            return new User();
        }
    }

    public void logout() {

        mContext.getSharedPreferences(Constant.SP_NAME, MODE_PRIVATE)
                .edit().putString(Constant.SP_TOKEN, null).putString(Constant.SP_USER,null).apply();
    }

    public String findToken() {
         SharedPreferences sharedPreferences = mContext.getSharedPreferences(Constant.SP_NAME, 0);
         return sharedPreferences.getString(Constant.SP_TOKEN, null);
    }

    public String findBearerToken() {
        return "Bearer "+findToken();
    }

    public Boolean isLogged() {
        String str = mContext.getSharedPreferences(Constant.SP_NAME, MODE_PRIVATE)
                .getString(Constant.SP_TOKEN,null);

                return str!=null;
    }


}
