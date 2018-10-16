package com.soloviof.easyads;

import android.util.Log;

class Logs {

    public static void print(String theClass, String theMethod, String theComment) {
        Log.d("!!! Logs !!!", "class: " + theClass + " meth : " + theMethod + " comm : " + theComment);
    }

}