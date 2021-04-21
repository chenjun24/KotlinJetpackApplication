package com.cj.kotlinjetpackapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.cj.kotlinjetpackapplication.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import retrofit2.Retrofit
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var truck:Truck
    @Inject
    lateinit var retrofit: Retrofit
    @Inject
    lateinit var person: Person

    @Inject
    lateinit var man: Man

    @Inject
    lateinit var women: Women

    @Inject
    lateinit var animal: Animal

    @Inject
    lateinit var goods: Goods
    val viewModel:MyViewModel by lazy { ViewModelProvider(this).get(MyViewModel::class.java) }
    private val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        truck.deliver()
    }

    fun click(view: View) {
        binding.tv.text = "hahaha"
    }
}