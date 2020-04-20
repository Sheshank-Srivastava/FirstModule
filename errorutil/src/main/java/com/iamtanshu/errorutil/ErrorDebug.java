package com.iamtanshu.errorutil;

import android.util.Log;

public class ErrorDebug {
    private static final String TAG = "FIRST_MODULE_APP_ERROR";

    public static void e(String messege){
        Log.e(TAG, messege);
    }
}
