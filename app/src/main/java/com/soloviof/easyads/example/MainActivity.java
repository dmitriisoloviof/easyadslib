package com.soloviof.easyads.example;

import android.os.Bundle;
import android.view.View;

import com.soloviof.easyads.InitApp;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view) {
        InitApp.doFirebaseInit(MainActivity.this, null);

    }

}