package com.example.study_kotlin

open class TestClass(pFunc : (Any) -> Unit){


    //TestClass 를 상속 받았거나 그 안의 innerClass에서
    //println을 대처하기 위한 static 메소드
    companion object{
        var println : (Any) -> Unit = {}
    }

    init{
        println = pFunc
    }

    open fun doTest() {}
}