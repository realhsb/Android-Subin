package com.example.constructor_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val TAG : String =  "로그"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "MainActivity - onCreate: ")
        var myFriend = MyFriend()

        Log.d(TAG, "MainActivity - MyFriend.name : ${myFriend.name}")
        Log.d(TAG, "MainActivity - MyFriend.age : ${myFriend.age}")
        Log.d(TAG, "MainActivity - MyFriend.isMarried : ${myFriend.isMarried}")
        Log.d(TAG, "MainActivity - MyFriend.nickname : ${myFriend.nickname}")

        // 매개변수가 들어가는 생성자
        var myFriendChulsoo = MyFriendWithParams(name = "철수",
                                                age = 17,
                                                isMarried = false,
                                                nickname = "안철수")
        Log.d(TAG, "MainActivity - myFriendChulsoo.name : ${myFriendChulsoo.name}")
        Log.d(TAG, "MainActivity - myFriendChulsoo.age : ${myFriendChulsoo.age}")
        Log.d(TAG, "MainActivity - myFriendChulsoo.isMarried : ${myFriendChulsoo.isMarried}")
        Log.d(TAG, "MainActivity - myFriendChulsoo.nickname : ${myFriendChulsoo.nickname}")

        // 매개변수가 들어가는 생성자
        var myFriendYoungSoo = MyFriendWithParams(name = "영수",
            age = 20,
            isMarried = false,
            nickname = "국영수",
            address = "대한민국")

        // 매개변수가 들어가는 생성자
        var myFriendSoosan = MyFriendWithParams(name = "dfaa",
            age = 20,
            isMarried = false,
            nickname = "dfda")

        // 추가 생성자로 되어있는 친구 객체
        var myFriendJames = MyFriendWithMoreParams(name = "James")
        Log.d(TAG, "MainActivity - myFriendJames.name : ${myFriendJames.name}")
    }
}