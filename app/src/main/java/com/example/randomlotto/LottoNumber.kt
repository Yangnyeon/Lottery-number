package com.example.randomlotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lotto_number.*
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class LottoNumber : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lotto_number)

        var random1 = Random()
        var numberarray = mutableSetOf<Int>()



        start.setOnClickListener {
            while (numberarray.size < 7) {
                var number = random1.nextInt(45) + 1
                numberarray.add(number)
            }

            var lotto = numberarray.sorted().toString()

            lottonumber.setText(lotto + "\n")
            lottonumber2.append(lotto + "\n" + "\n")

            numberarray.clear()
        }


    }
}