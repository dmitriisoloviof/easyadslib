package com.soloviof.easyads;

import android.content.Context;

public class AdUpdate {

    public static void updateData(Context context, AdObj adObj) {
        if (adObj != null) {
            if (adObj.isReset()) {
                AdsRepo.setResId(context, SpHelper.KEY_TEST_APP, null);
                AdsRepo.setResId(context, SpHelper.KEY_TEST_ID1, null);
                AdsRepo.setResId(context, SpHelper.KEY_TEST_ID2, null);
                AdsRepo.setResId(context, SpHelper.KEY_TEST_ID3, null);
                AdsRepo.setResId(context, SpHelper.KEY_TEST_ID4, null);
                AdsRepo.setResId(context, SpHelper.KEY_TEST_ID5, null);
                AdsRepo.setResId(context, SpHelper.KEY_TEST_ID6, null);
                AdsRepo.setResId(context, SpHelper.KEY_TEST_IDA, null);
                AdsRepo.setResId(context, SpHelper.KEY_TEST_IDB, null);

            } else {
                if (adObj.getApp() != null)
                    AdsRepo.setResId(context, SpHelper.KEY_TEST_APP, adObj.getApp());

                if (adObj.getBn1() != null)
                    AdsRepo.setResId(context, SpHelper.KEY_TEST_ID1, adObj.getBn1());

                if (adObj.getBn2() != null)
                    AdsRepo.setResId(context, SpHelper.KEY_TEST_ID2, adObj.getBn2());

                if (adObj.getBn3() != null)
                    AdsRepo.setResId(context, SpHelper.KEY_TEST_ID3, adObj.getBn3());

                if (adObj.getBn4() != null)
                    AdsRepo.setResId(context, SpHelper.KEY_TEST_ID4, adObj.getBn4());

                if (adObj.getBn5() != null)
                    AdsRepo.setResId(context, SpHelper.KEY_TEST_ID5, adObj.getBn5());

                if (adObj.getBn6() != null)
                    AdsRepo.setResId(context, SpHelper.KEY_TEST_ID6, adObj.getBn6());

                if (adObj.getIntr() != null)
                    AdsRepo.setResId(context, SpHelper.KEY_TEST_IDA, adObj.getIntr());

                if (adObj.getVid() != null)
                    AdsRepo.setResId(context, SpHelper.KEY_TEST_IDB, adObj.getVid());
            }
        }
    }
}
