package com.soloviof.easyads;

import android.content.Context;

public class AdUpdate {

    public static void updateData(Context context, AdObj adObj) {
        if (adObj != null) {
            if (adObj.isReset()) {
                AdsRepo.setResId(context, SpHelper.KEY_SP_SMART_BANNER_ID1, null);
                AdsRepo.setResId(context, SpHelper.KEY_SP_SMART_BANNER_ID2, null);
                AdsRepo.setResId(context, SpHelper.KEY_SP_SMART_BANNER_ID3, null);
                AdsRepo.setResId(context, SpHelper.KEY_SP_SMART_BANNER_ID4, null);
                AdsRepo.setResId(context, SpHelper.KEY_SP_SMART_BANNER_ID5, null);
                AdsRepo.setResId(context, SpHelper.KEY_SP_INTERSTITIAL_ID, null);
                AdsRepo.setResId(context, SpHelper.KEY_SP_REWARDED_VIDEO_ID, null);

            } else {
                if (adObj.getBn1() != null)
                    AdsRepo.setResId(context, SpHelper.KEY_SP_SMART_BANNER_ID1, adObj.getBn1());

                if (adObj.getBn2() != null)
                    AdsRepo.setResId(context, SpHelper.KEY_SP_SMART_BANNER_ID2, adObj.getBn2());

                if (adObj.getBn3() != null)
                    AdsRepo.setResId(context, SpHelper.KEY_SP_SMART_BANNER_ID3, adObj.getBn3());

                if (adObj.getBn4() != null)
                    AdsRepo.setResId(context, SpHelper.KEY_SP_SMART_BANNER_ID4, adObj.getBn4());

                if (adObj.getBn5() != null)
                    AdsRepo.setResId(context, SpHelper.KEY_SP_SMART_BANNER_ID5, adObj.getBn5());

                if (adObj.getIntr() != null)
                    AdsRepo.setResId(context, SpHelper.KEY_SP_INTERSTITIAL_ID, adObj.getIntr());

                if (adObj.getVid() != null)
                    AdsRepo.setResId(context, SpHelper.KEY_SP_REWARDED_VIDEO_ID, adObj.getVid());
            }
        }
    }
}
