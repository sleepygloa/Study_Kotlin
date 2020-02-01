package com.example.study_kotlin.step2

import com.example.study_kotlin.TestClass

class InterfaceAbstractTest(p : (Any) -> Unit) : TestClass(p){
    override fun doTest() {
        //super.doTest()

        var WhatYouWant = 2
        var inter : InterTest = if(WhatYouWant == 1) InterImp2() else InterImp()

        //넘겨진 값을 신경안쓰고 사용하는 곳
        interfaceTest(inter)

        //추상화
        var obj2 = TestAbstractImp()
        obj2.TestFunc()
        obj2.abstractFunc()

        //static
        println(TestAbstractImp.staticVar)
        TestAbstractImp.staticFunc()
    }


    fun interfaceTest(pInter : InterTest){
        pInter.TestFunc()
    }

    interface InterTest{
        fun TestFunc()
    }

    class InterImp : InterTest{
        override fun TestFunc() = println("InterImp InterTest")
    }

    class InterImp2 : InterTest{
        override fun TestFunc() = println("InterImp InterTest2")
    }

    abstract class TestAbstract{
        fun TestFunc() = println("abstract TestFunc")
        abstract fun abstractFunc()

    }
    class TestAbstractImp : TestAbstract() {
        override fun abstractFunc() = println("TestAbstractImp abstractfunc")

        //companion object {}  안에서 구현해야 static 가능
        companion object {
            var staticVar = "companioon staticVar"
            fun staticFunc() = println("companion staticFunc")
        }
    }
}