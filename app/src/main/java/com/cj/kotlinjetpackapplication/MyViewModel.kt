package com.cj.kotlinjetpackapplication

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

class MyViewModel @ViewModelInject constructor(val repository: Repository):ViewModel() {
}