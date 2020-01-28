package com.example.study_kotlin

class CollectionTest (p: (Any)->Unit) : TestClass(p){
    override fun doTest() {
        var lst = listOf ( 1, "A", 12.00f, false, true)
        for (i in 0 .. lst.size -1){
            println(lst.get(i).toString())
        }
        println(">")

        var lstEditable = mutableListOf<String>()

        lstEditable.add("A")
        lstEditable.add("B")
        lstEditable.add("C")
        lstEditable.add("D")

        for(s in lstEditable){
            println(s)
        }

        println(">")

        lstEditable.removeAt(0)
        for(s in lstEditable){
            println(s)
        }

        var m = hashMapOf("A" to 1, "B" to 2)
        println(m["A"])
    }


}