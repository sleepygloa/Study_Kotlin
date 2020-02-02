package com.example.study_kotlin.javaInterlop

import android.content.Intent
import com.example.study_kotlin.MainActivity
import kotlinx.android.synthetic.main.activity_main.*

// 확장함수로 이벤트 핸들러를 등록

fun MainActivity.setClickHandler(){
    btnTest.setOnClickListener {
        var I = Intent(this, javaActivity::class.java)
        startActivity(I)
    }
}