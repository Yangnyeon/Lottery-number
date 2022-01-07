package com.example.randomlotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import kotlinx.android.synthetic.main.activity_lotto_number.*
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class LottoNumber : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lotto_number)



        val instance = Calendar.getInstance()
        val yearr = instance.get(Calendar.YEAR).toString() + "년 "
        val monthh = (instance.get(Calendar.MONTH) + 1).toString() + "월 "
        val datee = instance.get(Calendar.DATE).toString() + "일 "

        year.setText(yearr)
        month.setText(monthh)
        date.setText(datee)

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

        var refresh = findViewById<SwipeRefreshLayout>(R.id.refresh)
        refresh.setOnRefreshListener {

            lottonumber2.setText("")
            refresh.isRefreshing = false

        }


    }
}