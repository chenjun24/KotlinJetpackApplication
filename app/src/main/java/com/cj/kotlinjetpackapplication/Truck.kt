package com.cj.kotlinjetpackapplication

import javax.inject.Inject

class Truck @Inject constructor(val driver: Driver){
    @BindGasEngine
    @Inject
    lateinit var gasEngine: Engine

    @BindElectricEngine
    @Inject
    lateinit var electricEngine: Engine
    fun deliver(){
        gasEngine.start()
        electricEngine.start()
        println("junchen truck is delivering cargo.driven by $driver ")
        gasEngine.shutDown()
        electricEngine.shutDown()
    }
}