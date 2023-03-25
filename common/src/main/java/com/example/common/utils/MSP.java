package com.example.common.utils;

// Need also import gradle:         implementation 'com.google.code.gson:gson:2.8.2'

/*

    MSP V4
   <<<<    Initial:    >>>>
        Put in Application class:
        PreferencesHelper.initHelper(this);
        PreferencesHelper.initHelper(this, "CustomName");
        *Will use app name as of Preferences file name PreferencesHelper.initHelper(this);
        *Will use CustomName as the name of SharePreferences file PreferencesHelper.initHelper(this, "CustomName");

   <<<<    Using:    >>>>
       SET VALUE:
       PreferencesHelper.getInstance().setValue(KEY_BOOLEAN, true);
       PreferencesHelper.getInstance().setValue(KEY_DOUBLE, 123.123);
       PreferencesHelper.getInstance().setValue(KEY_FLOAT, 234.234f);
       PreferencesHelper.getInstance().setValue(KEY_INT, 345);
       PreferencesHelper.getInstance().setValue(KEY_LONG, Long.MAX_VALUE);
       PreferencesHelper.getInstance().setValue(KEY_STRING, "Khang");
       UserModel userModel = new UserModel("KhangTran", 27);
       PreferencesHelper.getInstance().setValue(KEY_OBJECT, userModel);

       GET VALUE:
       boolean booleanValue = PreferencesHelper.getInstance().getBooleanValue(KEY_BOOLEAN, false);
       double doubleValue = PreferencesHelper.getInstance().getDoubleValue(KEY_DOUBLE, Double.MIN_VALUE);
       float floatValue = PreferencesHelper.getInstance().getFloatValue(KEY_FLOAT, Float.MIN_VALUE);
       int intValue = PreferencesHelper.getInstance().getIntValue(KEY_INT, Integer.MIN_VALUE);
       long longValue = PreferencesHelper.getInstance().getLongValue(KEY_LONG, Long.MIN_VALUE);
       String stringValue = PreferencesHelper.getInstance().getStringValue(KEY_STRING, "Empty");
       UserModel userModel = PreferencesHelper.getInstance().getObjectValue(KEY_OBJECT, UserModel.class);
 */

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.internal.Primitives;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.HashMap;

public class MSP {

    private static MSP instance;
    private SharedPreferences prefs;

    public static MSP getInstance() {
        return instance;
    }

    private MSP(Context context) {
        prefs = context.getApplicationContext().getSharedPreferences("APP_SP_DB", Context.MODE_PRIVATE);
    }


    public static MSP initHelper(Context context) {
        if (instance == null)
            instance = new MSP(context);
        return instance;
    }


    public void putInt(String KEY, int value) {
        prefs.edit().putInt(KEY, value).apply();
    }

    public void putFloat(String KEY, float value) {
        prefs.edit().putFloat(KEY, value).apply();
    }

    public int getInt(String KEY, int defValue) {
        return prefs.getInt(KEY, defValue);
    }

    public float getFloat(String KEY, float defValue) {
        return prefs.getFloat(KEY, defValue);
    }


}