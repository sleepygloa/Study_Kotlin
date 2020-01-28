package com.example.study_kotlin

class FunctionTest( p : (Any) -> Unit) : TestClass(p){
    override fun doTest(){
        funByNoParam()
        funByParameter(31, " 숫자입니다.")
        println(funByReturn("Parameter"))
        println(funByInline(31, 10))

        funVar ("Function Variable 1")
        println( funcVarType("Function Variable 2"))

        HigherFunc({println("Higher Function")})
        HigherFunc(::funcVarType)
    }
    fun funByReturn( s: String) : Any?{
        return s
    }
    fun funByParameter ( i : Int, s : String){
        println (i.toString() + s)
    }
    fun funByInline(i : Int, i1 : Int) = i * i1
    fun funByNoParam(){
        println("funByNoParam")
    }
    fun HigherFunc( f : () -> Any? ){
        f()
    }
    var funVar = { s: String -> println (s) }
    var funcVarType : (String) -> Any? = ::funByReturn
}