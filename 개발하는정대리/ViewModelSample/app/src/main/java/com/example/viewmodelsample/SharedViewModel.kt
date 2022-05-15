package com.example.viewmodelsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class SharedViewModel : ViewModel() {
    val count = MutableLiveData<Int>().apply { value = 0 }
}

class MasterFragment : Fragment(){
    private lateinit var viewModel : SharedViewModel

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        activity?.run {
            viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(SharedViewModel::class.java)
        }
    }

    class DetailFragment : Fragment() {
        private lateinit var viewModel : SharedViewModel

        override fun onCreate(savedInstanceState: Bundle?){
            super.onCreate(savedInstanceState)
            activity?.run {
                viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(SharedViewModel::class.java)
            }
        }
    }
}