package com.example.study_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.study_kotlin.step1.LabelTest
import com.example.study_kotlin.step2.DataClassTest
import com.example.study_kotlin.step2.InterfaceAbstractTest
import com.example.study_kotlin.step2.ObjectTest
import com.example.study_kotlin.step2.PolyMorphTest
import com.example.study_kotlin.step3.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //우리가 만든 예제들을 이곳에서 실행 시킨다.
        //doTest(FirstTest(::WriteLn));
        //doTest(NumberTest(::WriteLn))
        //doTest(StringTest(::WriteLn))

        //doTest(FunctionTest(::WriteLn))
        //doTest(ConditionTest(::WriteLn))
        //doTest(CollectionTest(::WriteLn))
        //doTest(LabelTest(::WriteLn))
        //doTest(ExceptionTest(::WriteLn))
        //doTest(ClassTest(::WriteLn))
        //doTest(PolyMorphTest(::WriteLn))
        //doTest(InterfaceAbstractTest(::WriteLn))
        //doTest(DataClassTest(::WriteLn))
        //doTest(ObjectTest(::WriteLn))
        //doTest(LamdaTest(::WriteLn))
        //doTest(ExtTest(::WriteLn))
        //doTest(CloserTest(::WriteLn))
        //doTest(Ext2Test(::WriteLn))
        //doTest(DSLTest(::WriteLn))
        //doTest(CurryngTest(::WriteLn))
        //doTest(InfixTest(::WriteLn))
        //doTest(MultiReturnTest(::WriteLn))
        //doTest(InitTest(::WriteLn))
        doTest(PropertiesTest(::WriteLn))
    }

    private fun doTest(o : TestClass){
        o.doTest();
    }
    fun WriteLn(any : Any){
        txtMessage.text = "${txtMessage.text}${any.toString()}\n"
    }
}
