package com.cj.kotlinjetpackapplication

import javax.inject.Inject

class GasEngine @Inject constructor():Engine {
    override fun start() {
        println("junchen gas engine start")
    }

    override fun shutDown() {
        println("junchen gas engine shutDown")
    }
}