package com.cj.kotlinjetpackapplication

import android.app.Service
import android.content.Intent
import android.os.IBinder
import dagger.hilt.android.AndroidEntryPoint
import retrofit2.Retrofit
import javax.inject.Inject

@AndroidEntryPoint
class MyService : Service() {
//    @Inject
//    lateinit var retrofit: Retrofit
    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }
}