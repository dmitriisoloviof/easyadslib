package com.soloviof.easyads.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.soloviof.easyads.AdsRepo;
import com.soloviof.easyads.InitApp;
import com.soloviof.easyads.TestEncode;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

}
