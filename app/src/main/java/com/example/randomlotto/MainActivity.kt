package com.example.randomlotto

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*
import java.time.temporal.TemporalAdjusters.next
import java.util.*
import java.util.EnumSet.range
import java.util.stream.IntStream.range
import java.util.stream.LongStream.range


class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn.setOnClickListener{
            var intent = Intent(this, LottoNumber::class.java)
            startActivity(intent)
        }

        btn2.setOnClickListener {
            startActivity(Intent(this, Lotto_Activity::class.java))
        }
    }
}