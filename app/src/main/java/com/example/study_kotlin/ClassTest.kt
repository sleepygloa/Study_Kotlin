package com.example.study_kotlin

class ClassTest (p : (Any) -> Unit) : TestClass(p){
    override fun doTest() {

        Test1().showInfo()
        Test1("PSW", 50).showInfo()

        Test2("나다").showInfo()
        Test2("PSW",50).showInfo()

        ChildClass("HI").sayHello()
    }

    class Test1{
        var sName : String = "Test1"
        var nAge : Int = 10

        constructor(){
            println(this.toString())
        }

        constructor(name : String, age : Int){
            sName = name
            nAge = age
        }

        fun showInfo() = println("${sName} : ${nAge}")
    }

    class Test2(name : String){
        var sName : String = "Test2"
        var nAge : Int = 10

        init{
            sName = name
        }

        constructor(name : String, age : Int) : this(name){
            sName = name
            nAge = age
        }

        fun showInfo() = println("${sName} : ${nAge}")
    }

    //상속을 시키기 위해서 open으로 정의함
    open class ParentClass (msg : String){
        var message = msg
        fun sayHello() = println(message)
    }

    class ChildClass (m : String) : ParentClass(m){

    }
}