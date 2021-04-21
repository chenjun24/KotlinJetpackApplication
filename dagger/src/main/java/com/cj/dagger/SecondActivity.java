package com.cj.dagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import okhttp3.OkHttpClient;

public class SecondActivity extends AppCompatActivity {
    @Inject
    OkHttpClient okHttpClient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        DaggerApplicationComponent.create().inject(this);
        Log.d("junchen", "1111111onCreate: okHttpClient--"+okHttpClient);
    }
}