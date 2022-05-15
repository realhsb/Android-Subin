package com.example.layoutpractice


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.layoutpractice.databinding.ActivityMainBinding

// 메인화면
class MainActivity : AppCompatActivity() {

    val TAG : String = "로그"

    // 뷰가 생성되었을 때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // 그릴 xml 뷰 파일을 연결시킨다. 즉 설정한다. R = res = resource
        //setContentView(R.layout.activity_main)

        // 바인딩 초기화
        val binding = ActivityMainBinding.inflate(layoutInflater)

        // 레이아웃(root뷰) 표시
        setContentView(binding.root);

        // 뷰바인딩으로 버튼 접근
//        binding.loginBtn.setOnClickListener(View.OnClickListener {
//            onLoginButtonClicked()
//        })

        // 위의 함수를 람다식으로 표현
        binding.loginBtn.setOnClickListener {
            onLoginButtonClicked()
        }
    }

    fun onLoginButtonClicked(){
        Log.d(TAG, "onLoginButtonClicked: ")

        val intent = Intent(this, SecondActivity::class.java)

        //secondActivity 스택을 쌓아주는 것
        startActivity(intent)
    }
}