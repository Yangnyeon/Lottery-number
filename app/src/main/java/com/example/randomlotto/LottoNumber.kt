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
        var numberarray = arrayListOf<Int>()

        var bonus = arrayListOf<Int>()


        start.setOnClickListener {
            while (numberarray.size < 6) {
                var number = random1.nextInt(45) + 1
                if(!numberarray.contains(number)) {
                    numberarray.add(number)
                }
            while (bonus.size < 1) {
                var bonusnumber = random1.nextInt(45) + 1
                if(!numberarray.contains(bonusnumber)) {
                    bonus.add(bonusnumber)
                }
            }
            }



            var lotto = numberarray.sorted().toString()
            var realbouns = bonus

            lottonumber.setText(lotto + "\n" + "보너스 번호 : " + realbouns)
            lottonumber2.append(lotto + "\n" + "보너스 번호 : " + realbouns + "\n" + "\n")

            numberarray.clear()
            realbouns.clear()
        }

        var refresh = findViewById<SwipeRefreshLayout>(R.id.refresh)
        refresh.setOnRefreshListener {

            lottonumber.setText("")
            lottonumber2.setText("")
            refresh.isRefreshing = false

        }


    }
}