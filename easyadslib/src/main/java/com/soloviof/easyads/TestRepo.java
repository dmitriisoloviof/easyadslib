package com.soloviof.easyads;

public class TestRepo {

    static final int DEBUG_MODE = 3;
    static final int DEBUG_TEST_KEY = 0;

    static boolean isDebugModeEnabled(int debugState) {
        return debugState % TestRepo.DEBUG_MODE == TestRepo.DEBUG_TEST_KEY;
    }

    static String getDebugId(String id) {
        try {
            return new String(new Crypter().decrypt(id));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "unknown";
    }
}