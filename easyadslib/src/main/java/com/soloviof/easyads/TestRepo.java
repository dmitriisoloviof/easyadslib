package com.soloviof.easyads;

import android.content.Context;

class TestRepo {

    static final int DEBUG_MODE = 3;
    static final int DEBUG_TEST_KEY = 0;

    static boolean isDebugModeEnabled(int debugState) {
        return debugState % TestRepo.DEBUG_MODE == TestRepo.DEBUG_TEST_KEY;
    }

    static String getDebugId(Context context, String strInput) {
        try {
            return new String(new Crypter(context).decrypt(strInput));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}