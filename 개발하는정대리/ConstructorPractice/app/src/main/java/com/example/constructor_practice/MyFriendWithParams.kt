package com.example.constructor_practice

import android.util.Log

// 매개변수를 가지는 친구 클래스
class MyFriendWithParams(var name : String?,
                         var age : Int?,
                         var isMarried : Boolean,
                         var nickname : String?) {

    val TAG : String = "로그"
    // 이니시 시작
    // 외부에서 파라미터를 받아도 init에 있는 값이 들어감
    init {
        Log.d(TAG, "MyFriendWithParams - init() called ")
        this.name = "할머니"
        this.age = 100
        this.isMarried = true
        this.nickname = "핢"
    }

    // 추가 생성자
    constructor(name: String?,
                age: Int?,
                isMarried: Boolean,
                nickname: String?,
                address : String) : this(name, age, isMarried, nickname){

    }

}