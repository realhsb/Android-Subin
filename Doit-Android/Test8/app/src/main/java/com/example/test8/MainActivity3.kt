package com.example.test8

import android.os.Bundle
import android.util.Log
import android.widget.CompoundButton
import androidx.appcompat.app.AppCompatActivity

class MyEventHandler : CompoundButton.OnCheckedChangeListener {
    override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
        Log.d("TAG", "onCheckedChanged 체크박스 클릭")
    }
}
class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?){
        super.onCreate(savedInstanceState)
        val binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.checkBox.setOnCheckedChangeListerner {
            compoundButton, b ->
            Log.d("TAG", "onCheckedChanged 체크박스 클릭")
        }
    }
}