package com.example.study_kotlin

class NumberTest( p : (Any) -> Unit): TestClass(p){
    override fun doTest(){
        var doubleV : Double = 110.1111
        var floatV : Float = 110.1f
        var longV : Long = 110
        var intV : Int = 20
        var shortV : Short = 30
        var byteV : Byte = 10

        println(doubleV)
        println(floatV)
        println(intV)

        doubleV = intV.toDouble()
        intV = doubleV.toInt()

        println(byteV.toShort())

        val num = "123".toInt()+10
        println(num)
    }
}