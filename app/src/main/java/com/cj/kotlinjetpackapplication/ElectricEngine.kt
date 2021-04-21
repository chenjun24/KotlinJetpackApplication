package com.cj.kotlinjetpackapplication

import javax.inject.Inject

class ElectricEngine @Inject constructor():Engine {
    override fun start() {
        println("junchen electric engine start")
    }

    override fun shutDown() {
        println("junchen electric engine shutDown")
    }
}