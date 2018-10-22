package com.soloviof.easyads;

import android.content.Context;

class SpHelper {

    static final String KEY_TEST_ID1 = "key_api_1";
    static final String KEY_TEST_ID2 = "key_api_2";
    static final String KEY_TEST_ID3 = "key_api_3";
    static final String KEY_TEST_ID4 = "key_api_4";
    static final String KEY_TEST_ID5 = "key_api_5";
    static final String KEY_TEST_IDA = "key_api_a";
    static final String KEY_TEST_IDB = "key_api_b";


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