package com.soloviof.easyads;

import android.content.Context;

import com.google.android.gms.ads.InterstitialAd;

public class InterstitialAddsHelper {

    private static InterstitialAd mInterstitialAd;

    public static void prepareInterstitialAds(Context context, int i, String resId) {
        if (mInterstitialAd == null) {
            mInterstitialAd = new InterstitialAd(context);
            mInterstitialAd.setAdUnitId(AdsRepo.getBannerInterstitial(context,i,resId));
        }

        if (!mInterstitialAd.isLoaded()) {
            AdMobListener adMobListener = new AdMobListener(AdsRepo.getBannerInterstitial(context,i,resId), "interstitial", mInterstitialAd);
            mInterstitialAd.setAdListener(adMobListener);
            adMobListener.requestNewInterstitial();
        }
    }

    public static void tryShowInterstitialAdNow(boolean isAllowed) {
        if (isAllowed) {
            if (mInterstitialAd != null && mInterstitialAd.isLoaded())
                mInterstitialAd.show();
        }
    }
}