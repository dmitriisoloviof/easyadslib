package com.soloviof.easyads;

import android.content.Context;

class SpHelper {

    static final String KEY_SP_SMART_BANNER_ID1 = "KEY_SP_SMART_BANNER_ID1";
    static final String KEY_SP_SMART_BANNER_ID2 = "KEY_SP_SMART_BANNER_ID2";
    static final String KEY_SP_SMART_BANNER_ID3 = "KEY_SP_SMART_BANNER_ID3";
    static final String KEY_SP_SMART_BANNER_ID4 = "KEY_SP_SMART_BANNER_ID4";
    static final String KEY_SP_SMART_BANNER_ID5 = "KEY_SP_SMART_BANNER_ID5";
    static final String KEY_SP_INTERSTITIAL_ID = "KEY_SP_INTERSTITIAL_ID";
    static final String KEY_SP_REWARDED_VIDEO_ID = "KEY_SP_REWARDED_VIDEO_ID";


    static void setSPStr(Context ctx, String key, String string) {
        ctx.getSharedPreferences("SpHelper", Context.MODE_PRIVATE).edit().putString(key, string).apply();
    }

    static String getSPStr(Context ctx, String key) {
        return ctx.getSharedPreferences("SpHelper", Context.MODE_PRIVATE).getString(key, null);
    }

    public static void deleteSp(Context ctx, String key) {
        ctx.getSharedPreferences("SpHelper", Context.MODE_PRIVATE).edit().remove(key).apply();
    }
}