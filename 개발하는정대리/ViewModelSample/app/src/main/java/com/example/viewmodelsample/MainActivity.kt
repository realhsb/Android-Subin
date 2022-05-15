package com.example.viewmodelsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private val TAG = "subin"

    private lateinit var viewModel: MainViewModel

    private lateinit var tv : TextView
    private lateinit var btn : Button
    private lateinit var finish : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //ViewModel 인스턴스 생성
        viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(
            MainViewModel::class.java)

        tv = findViewById(R.id.tv)
        btn = findViewById(R.id.btn)
        finish = findViewById(R.id.finish)
        btn.setOnClickListener {
            viewModel.count++
            showCount()
        }
        finish.setOnClickListener {
            finish()
        }
    }
    private fun showCount(){
        tv.text = "Count is ${viewModel.count}"
    }
}