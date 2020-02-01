package com.example.study_kotlin.step1

import com.example.study_kotlin.TestClass

class ExceptionTest (p : (Any)->Unit) : TestClass(p){
    override fun doTest() {
        var divNumber = 0
        try{
            707 /divNumber
        }catch(e : Exception){
            println(e)
        }finally {
            println("Last")
        }

        var addNumber : Int? = null
        //var sum = addNumber + 100
        if(addNumber != null){
            var sum = addNumber + 100
        }

        //var sum = addNumber!! + 100
        var sum = addNumber?.let{
            it+100
        }
    }
}