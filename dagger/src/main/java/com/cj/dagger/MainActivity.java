package com.cj.dagger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    @Inject
    public User user;
    @Inject
    public Retrofit retrofit;
//
//    @Inject
//    public ApiService apiService;
    @Inject
    OkHttpClient okHttpClient;
    @Inject
    OkHttpClient okHttpClient1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerApplicationComponent.create().inject(this);
        Log.d("junchen", "onCreate: user--"+user);
        Log.d("junchen", "onCreate: okHttpClient--"+okHttpClient);
        Log.d("junchen", "onCreate: okHttpClient1--"+okHttpClient1);
        Log.d("junchen", "onCreate: retrofit--"+retrofit);
//        Log.d("junchen", "onCreate: apiService--"+apiService);
        startActivity(new Intent(this,SecondActivity.class));
    }
}