package com.example.study_kotlin.step2

import com.example.study_kotlin.TestClass
import java.sql.Struct

class PolyMorphTest (p : (Any) -> Unit) : TestClass(p){
    override fun doTest() {
        //super.doTest()
        var obj1 = baseClass()
        obj1.f1()

        var obj2 = childClass()
        obj2.f1()
        obj2.f2()
        obj2.f2("문자열 파라메터")
        obj2.f2("문자열 파라메터", 100)

        //연산자 오버로딩 예제
        var s = Student("박모씨")
        (0..99).forEach { s++ }
        s.printMe()

        var s2 = Student("김모씨")
        s2.nScore = 50

        println{"두 학생의 점수는 ${s + s2}"}
    }

    open class baseClass{
        open var name = "base"
        open fun f1() = println(this.toString())

        private fun onlyMyFunc() = println("클래스 내부에서만 사용")

        constructor(){
            onlyMyFunc()
        }
    }

    class childClass : baseClass(){

        // 오버라이드
        override var name = ""
        override fun f1() = println(this.toString() + " 재정의함.")

        //오버로딩
        fun f2() = println("f2")
        fun f2(s : String) = println("f2:$s")
        fun f2(s : String, num : Int) = println("f2: $s, $num ")
    }

    class Student(s : String){
        var name : String = s
        var nScore : Int = 0

        // +
        operator fun plus (student : Student) : Int{
            return student.nScore + this.nScore
        }

        //++
        operator fun inc() : Student{
            this.nScore++
            return this
        }

        fun printMe() = println("${name}는 점수가 $nScore")

    }
}