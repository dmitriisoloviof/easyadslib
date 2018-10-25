package com.soloviof.easyads;

import android.util.Log;

class Logs {

    static void print(String theClass, String theMethod, String theComment) {
        if (BuildConfig.DEBUG)
            Log.d("Ads ==>", "cls: " + theClass + " mth : " + theMethod + " cm : " + theComment);
    }

}