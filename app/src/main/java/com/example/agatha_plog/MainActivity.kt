package com.example.agatha_plog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.agatha_plog.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        //메인 바인딩
        setContentView(activityMainBinding.root)
        //뷰바인딩과 연결


    }
}