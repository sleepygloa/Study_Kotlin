package com.example.study_kotlin.step1

import com.example.study_kotlin.TestClass

class FirstTest ( p : (Any) -> Unit) : TestClass(p){
    override fun doTest() {
        //super.doTest()
        println("HI");
    }
}