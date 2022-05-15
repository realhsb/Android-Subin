package com.example.constructor_practice

import android.util.Log

// 추가 생성자로 되어 있는 친구 클래스
class MyFriendWithMoreParams {
    
    val TAG : String = "로그"

    // 멤버 변수
    var name : String? = null
    var age : Int? = null
    var isMarried : Boolean? = null
    var nickname : String? = null

    // 기본생성자
    init {
        Log.d(TAG, "MyFriendWithMoreParams - init() called")
        this.name = ""
    }

    // 추가생성자
    constructor(name : String) : this(){
        Log.d(TAG, "MyFriendWithMoreParams - name 생성자() called")
        this.name = name
    }
}