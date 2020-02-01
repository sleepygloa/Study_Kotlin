package com.example.study_kotlin.step1

import com.example.study_kotlin.TestClass
import java.util.*

class StringTest( p : (Any) -> Unit) : TestClass(p){
    override fun doTest() {
        var sName = "박모씨"
        println(sName + " - The Gamer")

        var sLine = """
1
        2
        3
        4
        5
        5
        6
        7
        8

        """
        kotlin.io.println(sLine)

        var sFormatter ="$sName <-- sName의 값"
        println(sFormatter)

        var sBash = "${"지금 시각은 -" + Date() }"
        println(sBash)
    }
}