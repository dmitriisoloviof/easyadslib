package com.soloviof.easyads;


import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;


public class AdMobListener extends AdListener {

    private String mAdBannerId;
    private String mBannerName;
    private InterstitialAd mInterstitialAd;


    public AdMobListener(String adBannerId, String bannerName) {
        this.mAdBannerId = adBannerId;
        this.mBannerName = bannerName;
    }

    public AdMobListener(String adBannerId, String bannerName, InterstitialAd interstitialAd) {
        this.mAdBannerId = adBannerId;
        this.mInterstitialAd = interstitialAd;
        this.mBannerName = bannerName;
    }

    @Override
    public void onAdLoaded() {
        super.onAdLoaded();
        Logs.print("AdMobListener", "onAdLoaded", "id: " + mAdBannerId + " name --> " + mBannerName);
    }

    @Override
    public void onAdOpened() {
        Logs.print("AdMobListener", "onAdOpened", "id: " + mAdBannerId + " name --> " + mBannerName);
        super.onAdOpened();
    }

    @Override
    public void onAdClosed() {
        Logs.print("AdMobListener", "onAdClosed", "id: " + mAdBannerId + " name --> " + mBannerName);
        requestNewInterstitial();
    }

    @Override
    public void onAdLeftApplication() {
        Logs.print("AdMobListener", "onAdLeftApplication", "id: " + mAdBannerId + " name --> " + mBannerName);
        super.onAdLeftApplication();
    }

    @Override
    public void onAdFailedToLoad(int errorCode) {
        switch (errorCode) {
            case AdRequest.ERROR_CODE_INTERNAL_ERROR: {
                Logs.print("AdMobListener", "onAdFailedToLoad - ERROR_CODE_INTERNAL_ERROR", "id: " + mAdBannerId + " name --> " + mBannerName);
                break;
            }

            case AdRequest.ERROR_CODE_INVALID_REQUEST: {
                Logs.print("AdMobListener", "onAdFailedToLoad - ERROR_CODE_INVALID_REQUEST", "id: " + mAdBannerId + " name --> " + mBannerName);
                break;
            }

            case AdRequest.ERROR_CODE_NETWORK_ERROR: {
                Logs.print("AdMobListener", "onAdFailedToLoad - ERROR_CODE_NETWORK_ERROR", "id: " + mAdBannerId + " name --> " + mBannerName);
                break;
            }

            case AdRequest.ERROR_CODE_NO_FILL: {
                Logs.print("AdMobListener", "onAdFailedToLoad - ERROR_CODE_NO_FILL", "id: " + mAdBannerId + " name --> " + mBannerName);
                break;
            }

            default: {
                Logs.print("AdMobListener", "onAdFailedToLoad - undefined error", "id: " + mAdBannerId + " name --> " + mBannerName);
                break;
            }
        }
        super.onAdFailedToLoad(errorCode);
    }


    //interstitials
    public void requestNewInterstitial() {
        Logs.print("AdMobListener", "requestNewInterstitial", "id --> " + mAdBannerId);
        AdRequest adRequest = new AdRequest.Builder()
//                .addTestDevice("E12688B5C2D1F97C06F2E1794615BDFB")
                .build();

        if (mInterstitialAd != null)
            mInterstitialAd.loadAd(adRequest);
    }
}