package com.android.gajju45.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.android.gajju45.viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        activityMainBinding.countTv.text = viewModel.getCurrentCount().toString()

        activityMainBinding.incremetnBtn.setOnClickListener {
            viewModel.updateCount()
            activityMainBinding.countTv.text = viewModel.getCurrentCount().toString()
        }

        activityMainBinding.decrementBtn.setOnClickListener{
            viewModel.decrement()
            activityMainBinding.countTv.text = viewModel.getCurrentCount().toString()

        }

    }
}