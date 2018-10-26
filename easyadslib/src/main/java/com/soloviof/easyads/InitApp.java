package com.soloviof.easyads;

import android.content.Context;

public class InitApp {

    public static boolean TEST_V_ENABLED;

    public static void doFirebaseInit(Context ctx, String firebaseAppId) {
        //todo use for firebase ads 17.0+

        TEST_V_ENABLED = test(ctx);
    }

    private static boolean test(Context ctx) {
        String str = AdsRepo.getPropVal(ctx, "var");
        return str != null && str.equals("1");
    }
}
