package com.soloviof.easyads;

import android.content.Context;

import java.io.InputStream;
import java.util.Properties;

public class AdsRepo {

    public static String getAppId(Context appCtx, int i, String strResId) {
        return getVal(appCtx, i, SpHelper.KEY_TEST_APP, R.string.lib_key_crashalitics_rep_api_app, strResId);
    }

    public static String getBannerId1(Context appCtx, int i, String streResId) {
        return getVal(appCtx, i, SpHelper.KEY_TEST_ID1, R.string.lib_key_crashalitics_rep_api_1, streResId);
    }

    public static String getBannerId2(Context appCtx, int i, String streResId) {
        return getVal(appCtx, i, SpHelper.KEY_TEST_ID2, R.string.lib_key_crashalitics_rep_api_2, streResId);
    }

    public static String getBannerId3(Context appCtx, int i, String streResId) {
        return getVal(appCtx, i, SpHelper.KEY_TEST_ID3, R.string.lib_key_crashalitics_rep_api_3, streResId);
    }

    public static String getBannerId4(Context appCtx, int i, String streResId) {
        return getVal(appCtx, i, SpHelper.KEY_TEST_ID4, R.string.lib_key_crashalitics_rep_api_4, streResId);
    }

    public static String getBannerId5(Context appCtx, int i, String streResId) {
        return getVal(appCtx, i, SpHelper.KEY_TEST_ID5, R.string.lib_key_crashalitics_rep_api_5, streResId);
    }

    public static String getBannerId6(Context appCtx, int i, String streResId) {
        return getVal(appCtx, i, SpHelper.KEY_TEST_ID6, R.string.lib_key_crashalitics_rep_api_6, streResId);
    }

    public static String getBannerInterstitial(Context appCtx, int i, String streResId) {
        return getVal(appCtx, i, SpHelper.KEY_TEST_IDA, R.string.lib_key_crashalitics_rep_api_a, streResId);

    }

    public static String getBannerRewardedVideo(Context appCtx, int i, String streResId) {
        return getVal(appCtx, i, SpHelper.KEY_TEST_IDB, R.string.lib_key_crashalitics_rep_api_b, streResId);
    }


    static void setResId(Context context, String key, String val) {
        SpHelper.setSPStr(context, key, val);
    }


    private static String getVal(Context appCtx, int i, String lStrId, int lResId, String strResId) {
        String str = SpHelper.getSPStr(appCtx, lStrId);
        if (!isEmptyOrNull(str)) return str;

        if (TestRepo.isDebugModeEnabled(i)) {
            String propVal = getPropVal(appCtx, lStrId);
            if (propVal != null) str = TestRepo.getDebugId(appCtx, getPropVal(appCtx, lStrId));
            if (!isEmptyOrNull(str)) return str;

            str = TestRepo.getDebugId(appCtx, appCtx.getResources().getString(lResId));
            if (!isEmptyOrNull(str)) return str;
        }

        return strResId;
    }

    public static String getPropVal(Context context, String id) {
        try {
            Properties properties = new Properties();
            InputStream inputStream = context.getAssets().open(context.getResources().getString(R.string.test3));
            properties.load(inputStream);

            return properties.getProperty(id);

        } catch (Exception e) {
            System.out.print(e.getMessage());
        }

        return null;
    }

    public static boolean isEmptyOrNull(String str) {
        if (str == null) {
            return true;
        } else if (str.length() == 0) {
            return true;
        } else return str.trim().length() == 0;
    }


}