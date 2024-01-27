package com.example.a7minuateworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a7minuateworkout.databinding.ActivityExerciseBinding
import com.example.a7minuateworkout.databinding.ActivityFinishBinding
import com.example.a7minuateworkout.databinding.ActivityMainBinding

class FinishActivity : AppCompatActivity() {
    private var binding : ActivityFinishBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFinishBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setSupportActionBar(binding?.toolBarFinish)
        binding?.toolBarFinish?.setNavigationOnClickListener {
            onBackPressed()
        }
        if (supportActionBar!=null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }

        binding?.btnFinish?.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}