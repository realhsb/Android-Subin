package com.example.test8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.MotionEvent
import android.widget.CompoundButton
import com.example.test8.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)

        binding.checkBox.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener{
            override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
                Log.d("태그", "onCheckedChanged 체크박스 클릭")
            }
        })

        binding.button.setOnClickListener {
            Log.d("TAG", "클릭 이벤트")
        }
        binding.button.setOnLongClickListener {
            Log.d("TAG", "클릭 이벤트")
            true
        }
    }




    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {
            MotionEvent.ACTION_DOWN -> {
                Log.d("로그", "Touch down event x : ${event.x}, rawX : ${event.rawX}")

            }
        }
        return super.onTouchEvent(event)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        when(keyCode){
            KeyEvent.KEYCODE_BACK -> Log.d("로그", "BACK Button 키를 눌렀네요")
            KeyEvent.KEYCODE_VOLUME_UP -> Log.d("로그", "Volume Up 키를 눌렀네요")
            KeyEvent.KEYCODE_VOLUME_DOWN -> Log.d("로그", "Volume Down 키를 눌렀네요")
        }
        return super.onKeyDown(keyCode, event)
    }

    override fun onKeyUp(keyCode: Int, event: KeyEvent?): Boolean {
        Log.d("로그", "onKeyUp")
        return super.onKeyUp(keyCode, event)
    }


}