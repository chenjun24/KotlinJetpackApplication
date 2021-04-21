package com.cj.kotlinjetpackapplication

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class Man @Inject constructor(@ApplicationContext val context:Context) {
}