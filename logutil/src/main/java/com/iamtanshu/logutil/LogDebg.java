package com.iamtanshu.logutil;

import android.util.Log;

public class LogDebg {
    private static final String TAG = "FIRST_MODULE_APP";

    public static void d(String messege){
        Log.d(TAG, messege);
    }
}
