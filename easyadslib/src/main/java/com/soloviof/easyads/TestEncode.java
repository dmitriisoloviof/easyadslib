package com.soloviof.easyads;

class TestEncode {

    static String AD_SMART_BANNER_ID1 = "ca-app-pub-4480979039090502/1430730151";
    static String AD_SMART_BANNER_ID2 = "ca-app-pub-4480979039090502/5282059846";
    static String AD_SMART_BANNER_ID3 = "ca-app-pub-4480979039090502/3777406480";
    static String AD_SMART_BANNER_ID4 = "ca-app-pub-4480979039090502/7525079801";
    static String AD_SMART_BANNER_ID5 = "ca-app-pub-4480979039090502/6020426449";
    static String AD_INTERSTITIAL_ID = "ca-app-pub-4480979039090502/8455018099";
    static String AD_REWARDED_VIDEO_ID = "ca-app-pub-4480979039090502/2847468192";

    public static void test() throws Exception {
        String ban1 = Crypter.bytesToHex(new Crypter().encrypt(AD_SMART_BANNER_ID1));
        String ban2 = Crypter.bytesToHex(new Crypter().encrypt(AD_SMART_BANNER_ID2));
        String ban3 = Crypter.bytesToHex(new Crypter().encrypt(AD_SMART_BANNER_ID3));
        String ban4 = Crypter.bytesToHex(new Crypter().encrypt(AD_SMART_BANNER_ID4));
        String ban5 = Crypter.bytesToHex(new Crypter().encrypt(AD_SMART_BANNER_ID5));
        String bani = Crypter.bytesToHex(new Crypter().encrypt(AD_INTERSTITIAL_ID));
        String banv = Crypter.bytesToHex(new Crypter().encrypt(AD_REWARDED_VIDEO_ID));

        //values 1-5
        Logs.print("TestEncode", "", "1--> " + ban1 + " 2--> " + ban2 + " 3--> " + ban3 + " 4--> " + ban4 + " 5--> " + ban5);

        //values a-b
        Logs.print("TestEncode", "", "int--> " + bani + " v--> " + banv);
    }
}