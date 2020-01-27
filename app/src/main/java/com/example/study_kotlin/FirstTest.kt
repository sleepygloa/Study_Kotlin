package com.example.study_kotlin

class FirstTest ( p : (Any) -> Unit) : TestClass(p){
    override fun doTest() {
        //super.doTest()
        println("HI");
    }
}