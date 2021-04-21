package com.cj.kotlinjetpackapplication

import android.content.Context
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject
import javax.inject.Singleton

class Person @Inject constructor(@ActivityContext val context:Context) {
}