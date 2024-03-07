package com.example.a7minuateworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a7minuateworkout.databinding.ActivityHistoryBinding

class History : AppCompatActivity() {
    private var binding: ActivityHistoryBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHistoryBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setSupportActionBar(binding?.toolbarHistory)
        if (supportActionBar!=null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.title = "History"
        }
        binding?.toolbarHistory?.setNavigationOnClickListener {
            onBackPressed()
        }
    }
}