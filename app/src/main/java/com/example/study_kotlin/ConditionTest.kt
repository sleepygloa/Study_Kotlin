package com.example.study_kotlin

class ConditionTest (p: (Any) -> Unit) : TestClass(p){
    override fun doTest() {
        ifTest(17.0f)
        loopTest(8)
        caseTest(3)

        var a = "ABCDE"
        val result = when(a){
            is String -> {true}
            else      -> {false}
        }
        println(result)
        println(if("AAA".length > 3) true else "짧아요")
    }
    fun loopTest(count : Int){
        for( i in 0.. count){
            println("i ->" +i)
        }
        //(0..count).forEach{println ("$it ->" +it}

        var i : Int = 0
        while (i < count) { i++; println("$i 입니다.")}
    }

    fun caseTest(o : Any?){
        when (o){
            "Test"      -> {println("문자:"+o)}
            is Float    -> {println("Float:"+o)}
            in (0..9)   -> {println("0부터 9까지 숫자:$o")}
            else        -> {println("???")}
        }
    }


    fun ifTest( a : Any?){
        if( a == "Test"){
            println(a)
        }else if (a is Float){
            println("Float")
        }else if (a in (0.. 9)){
            println("0-10까지 숫자 : $a")
        }else if(a == null){
            println("null")
        }
    }

}