package com.example.viewmodelsample

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val TAG = "subin"

    var count = 0

    init {
        Log.d(TAG, "ViewModel 생성")
    }

    override fun onCleared(){
        super.onCleared()
        Log.d(TAG, "ViewModel 종료")
    }
}