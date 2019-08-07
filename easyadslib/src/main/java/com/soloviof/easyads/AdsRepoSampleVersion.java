package com.soloviof.easyads;

import android.content.Context;

import static com.soloviof.easyads.AdsRepo.isEmptyOrNull;

public class AdsRepoSampleVersion {

    public static String getAppId(Context appCtx, String strResId) {
        return getVal(appCtx, SpHelper.KEY_TEST_APP, strResId);
    }

    public static String getBannerId1(Context appCtx, String streResId) {
        return getVal(appCtx, SpHelper.KEY_TEST_ID1, streResId);
    }

    public static String getBannerId2(Context appCtx, String streResId) {
        return getVal(appCtx, SpHelper.KEY_TEST_ID2, streResId);
    }

    public static String getBannerId3(Context appCtx, String streResId) {
        return getVal(appCtx, SpHelper.KEY_TEST_ID3, streResId);
    }

    public static String getBannerId4(Context appCtx, String streResId) {
        return getVal(appCtx, SpHelper.KEY_TEST_ID4, streResId);
    }

    public static String getBannerId5(Context appCtx, String streResId) {
        return getVal(appCtx, SpHelper.KEY_TEST_ID5, streResId);
    }

    public static String getBannerId6(Context appCtx, String streResId) {
        return getVal(appCtx, SpHelper.KEY_TEST_ID6, streResId);
    }

    public static String getBannerInterstitial(Context appCtx, String streResId) {
        return getVal(appCtx, SpHelper.KEY_TEST_IDA, streResId);

    }

    public static String getBannerRewardedVideo(Context appCtx, String streResId) {
        return getVal(appCtx, SpHelper.KEY_TEST_IDB, streResId);
    }


    private static String getVal(Context appCtx, String lStrId, String strResId) {
        String str = SpHelper.getSPStr(appCtx, lStrId);
        if (!isEmptyOrNull(str)) return str;

        return strResId;
    }
}