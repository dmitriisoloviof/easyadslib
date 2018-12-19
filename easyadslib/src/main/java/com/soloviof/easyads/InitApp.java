package com.soloviof.easyads;

import android.content.Context;

import com.google.android.gms.ads.MobileAds;

public class InitApp {

    public static boolean TEST_V_ENABLED;

    public static void doFirebaseInit(Context ctx, String firebaseAppId) {
        try {
            TEST_V_ENABLED = test(ctx);
            MobileAds.initialize(ctx, firebaseAppId);

        } catch (Throwable ex) {
            ex.printStackTrace();
        }
    }

    private static boolean test(Context ctx) {
        String str = AdsRepo.getPropVal(ctx, "var");
        return str != null && str.equals("1");
    }
}
