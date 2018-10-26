package com.soloviof.easyads;

import android.util.Log;

class Logs {

    static void print(String theClass, String theMethod, String theComment) {
        if (InitApp.TEST_V_ENABLED)
            Log.d("Ads ==>", "cls: " + theClass + " mth : " + theMethod + " cm : " + theComment);
    }

}