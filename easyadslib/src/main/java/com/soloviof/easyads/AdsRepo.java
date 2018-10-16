package com.soloviof.easyads;

import android.content.Context;

public class AdsRepo {


    public static String getBannerId1(Context appCtx, int i, String streResId) {
        if (TestRepo.isDebugModeEnabled(i))
            return TestRepo.getDebugId(appCtx.getResources().getString(R.string.lib_key_crashalitics_rep_api_1));

        String sp = SpHelper.getSPStr(appCtx, SpHelper.KEY_SP_SMART_BANNER_ID1);

        return sp != null ? sp : streResId;
    }

    public static String getBannerId2(Context appCtx, int i, String streResId) {
        if (TestRepo.isDebugModeEnabled(i))
            return TestRepo.getDebugId(appCtx.getResources().getString(R.string.lib_key_crashalitics_rep_api_2));

        String sp = SpHelper.getSPStr(appCtx, SpHelper.KEY_SP_SMART_BANNER_ID2);

        return sp != null ? sp : streResId;
    }

    public static String getBannerId3(Context appCtx, int i, String streResId) {
        if (TestRepo.isDebugModeEnabled(i))
            return TestRepo.getDebugId(appCtx.getResources().getString(R.string.lib_key_crashalitics_rep_api_3));


        String sp = SpHelper.getSPStr(appCtx, SpHelper.KEY_SP_SMART_BANNER_ID3);

        return sp != null ? sp : streResId;
    }

    public static String getBannerId4(Context appCtx, int i, String streResId) {
        if (TestRepo.isDebugModeEnabled(i))
            return TestRepo.getDebugId(appCtx.getResources().getString(R.string.lib_key_crashalitics_rep_api_4));

        String sp = SpHelper.getSPStr(appCtx, SpHelper.KEY_SP_SMART_BANNER_ID4);

        return sp != null ? sp : streResId;
    }

    public static String getBannerId5(Context appCtx, int i, String streResId) {
        if (TestRepo.isDebugModeEnabled(i))
            return TestRepo.getDebugId(appCtx.getResources().getString(R.string.lib_key_crashalitics_rep_api_5));

        String sp = SpHelper.getSPStr(appCtx, SpHelper.KEY_SP_SMART_BANNER_ID5);

        return sp != null ? sp : streResId;
    }

    public static String getBannerInterstitial(Context appCtx, int i, String streResId) {
        if (TestRepo.isDebugModeEnabled(i))
            return TestRepo.getDebugId(appCtx.getResources().getString(R.string.lib_key_crashalitics_rep_api_a));

        String sp = SpHelper.getSPStr(appCtx, SpHelper.KEY_SP_INTERSTITIAL_ID);

        return sp != null ? sp : streResId;
    }

    public static String getBannerRewardedVideo(Context appCtx, int i, String streResId) {
        if (TestRepo.isDebugModeEnabled(i))
            return TestRepo.getDebugId(appCtx.getResources().getString(R.string.lib_key_crashalitics_rep_api_b));

        String sp = SpHelper.getSPStr(appCtx, SpHelper.KEY_SP_REWARDED_VIDEO_ID);

        return sp != null ? sp : streResId;
    }


    public static void setResId(Context context, String key, String val) {
        SpHelper.setSPStr(context, key, val);
    }
}