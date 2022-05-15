package com.example.lottieanimationtutorial

import android.animation.ValueAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.lottieanimationtutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    
    val TAG : String = "로그"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root);
        
        // 버튼에 리스너 달아주기 
        binding.likeBtn.setOnClickListener{
            Log.d(TAG, "onCreate: / 좋아요 버튼 클릭")

            // Custom animation speed or duration.
            // 애니메이션 커스텀
            // 0f = 0퍼센트, 1f = 1퍼센트
            // ofFloat (시작지점, 종료지점), setDuration(지속시간) 1000 = 1초
            val animator = ValueAnimator.ofFloat(0f, 0.1f).setDuration(1000)
            animator.addUpdateListener {

                // animation이 어디서 온 건지 모르겠음 에러남
                binding.likeBtn.progress(animation.getAnimatedValue() as Float)
            }
            animator.start()
        }
    }


}