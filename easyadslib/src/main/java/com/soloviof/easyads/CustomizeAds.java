package com.soloviof.easyads;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;


public class CustomizeAds {

    public static void setupAddBanner(Activity activity, LinearLayout linearLayout, String addUnitId, String bannerName) {
        try {
            AdView mAdView = new AdView(activity);
            mAdView.setAdSize(AdSize.SMART_BANNER);

            if (((LinearLayout) linearLayout).getChildCount() > 0)
                ((LinearLayout) linearLayout).removeAllViews();

            linearLayout.addView(mAdView);

            mAdView.setAdUnitId(addUnitId);
            AdRequest adRequest = new AdRequest.Builder()
//                    .addTestDevice("E12688B5C2D1F97C06F2E1794615BDFB")
                    .build();

            if (mAdView.getAdSize() != null || mAdView.getAdUnitId() != null) {
                Logs.print("CustomizeAds", "setupAddBanner", "setup ok id: " + addUnitId);
                mAdView.loadAd(adRequest);
                mAdView.setAdListener(new AdMobListener(addUnitId, bannerName));
            }

        } catch (Throwable ex) {
            Logs.print("CustomizeAds", "setupAddBanner", "ERROR --> " + ex.getMessage());
        }
    }

    public static RewardedVideoAd prepareRewardedVideoAd(Context activityCtx, int i, String strResId, RewardedVideoAd rewardedVideoAd, RewardedVideoAdListener rewardedVideoAdListener) {
        if (rewardedVideoAd == null) {
            Logs.print("CustomizeAds", "prepareRewardedVideoAd", "initialize");
            rewardedVideoAd = MobileAds.getRewardedVideoAdInstance(activityCtx);
            rewardedVideoAd.setRewardedVideoAdListener(rewardedVideoAdListener);

        } else {
            Logs.print("CustomizeAds", "prepareRewardedVideoAd", "no initialize");
        }

        if (!rewardedVideoAd.isLoaded()) {
            Logs.print("CustomizeAds", "prepareRewardedVideoAd", "prepare --> " + AdsRepo.getBannerRewardedVideo(activityCtx, i, strResId));
            rewardedVideoAd.loadAd(AdsRepo.getBannerRewardedVideo(activityCtx, i, strResId), new AdRequest.Builder().build());

        } else {
            Logs.print("CustomizeAds", "prepareRewardedVideoAd", "no prepare");
        }

        return rewardedVideoAd;
    }

    public static void tryShowRewardedVideoAdNow(RewardedVideoAd rewardedVideoAd) {
        if (rewardedVideoAd != null && rewardedVideoAd.isLoaded()) {
            Logs.print("CustomizeAds", "tryShowRewardedVideoAdNow", "show");
            rewardedVideoAd.show();

        } else {
            Logs.print("CustomizeAds", "tryShowRewardedVideoAdNow", "can't show");
        }
    }
}