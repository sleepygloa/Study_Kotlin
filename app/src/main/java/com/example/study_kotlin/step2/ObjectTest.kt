package com.example.study_kotlin.step2

import com.example.study_kotlin.TestClass

class ObjectTest ( p:(Any) -> Unit) : TestClass(p){
    override fun doTest() {
        //1. 클래스 전체를 싱글톤으로 사용할 때, 마치 java의 static class
        SingleTon.showMessage("싱글톤입니다.!")
        var obj = StaticTest()
        println(obj.msg)

        //2. companion object
        println(StaticTest.staticVar)
        StaticTest.staticFunc()

        //3. Android에서 자주사용됨
        var obj2 = object : fakeClikcHandler(){
            override fun onClick() {

                println("Click!!")
            }
        }

        obj2.onClick()

    }

    object SingleTon {
        var showMessage = { msg : String -> println(msg)}
    }

    class StaticTest {
        var msg : String = "일반객체로 생성하면 이 변수를 액세스 가능함"

        companion object{
            var staticVar = "StaticTest.staticVar"
            fun staticFunc() = println("StaticTest.staticFunc")
        }
    }

    //누간가 객체로 만들면 onClick을 반드시 구현해야한다.
    abstract class fakeClikcHandler{
        abstract fun onClick()
    }
}