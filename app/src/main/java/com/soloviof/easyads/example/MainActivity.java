package com.soloviof.easyads.example;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.soloviof.easyads.AdsRepo;
import com.soloviof.easyads.InitApp;
import com.soloviof.easyads.TestEncode;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                try {
                    TestEncode.test1(this);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;

            case R.id.btn2:
                String str = AdsRepo.getBannerId1(MainActivity.this, 1, "banner_id_1_app");
                Log.d("1111", "=> " + str);
                break;

            case R.id.btn3:
                InitApp.doFirebaseInit(MainActivity.this, null);
                break;
        }

    }
}