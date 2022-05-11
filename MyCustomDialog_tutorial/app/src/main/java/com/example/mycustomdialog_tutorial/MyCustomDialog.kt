package com.example.mycustomdialog_tutorial

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.mycustomdialog_tutorial.databinding.CustomDialogBinding

class MyCustomDialog(context: Context,
                     myCustomDialogInterface : MyCustomDialogInterface)
                    : Dialog(context), View.OnClickListener { // context와 myCustomDialogInterface는 생성자, Dialog는 상속
    val TAG : String = "로그"
    val binding = CustomDialogBinding.inflate(layoutInflater)

    private var myCustomDialogInterface : MyCustomDialogInterface? = null

    // 인터페이스 연결
    init {
        this.myCustomDialogInterface = myCustomDialogInterface
    }

    override fun onCreate(saveIntstanceState : Bundle?) {
        super.onCreate(saveIntstanceState)

        //val binding = CustomDialogBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d(TAG, "MyCustomDialog - onCreate() called")
        // 배경 투명
        window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        // 좋아요 버튼이 클릭되었을 때
//        binding.likeBtn.setOnClickListener {
//            Log.d(TAG, "MyCustomDialog - 좋아요 버튼 클릭!")
//            this.myCustomDialogInterface?.onLikeBtnClicked()
//        }

        // View.OnClickListener 를 implement 받고 있기 때문에, 매개변수로 this로 넣어줌
        binding.likeBtn.setOnClickListener(this)
        binding.subscribeBtn.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
        when(view){
            //좋아요 버튼이 클릭 되었을 때
            binding.likeBtn -> {
                Log.d(TAG, "MyCustomDialog - 좋아요 버튼 클릭! ")

                this.myCustomDialogInterface?.onLikeBtnClicked()
            }
            binding.subscribeBtn -> {
                Log.d(TAG, "MyCustomDialog - 구독 버튼 클릭! ")

                this.myCustomDialogInterface?.onSubscribeBtnClicked()

            }
        }
    }
}