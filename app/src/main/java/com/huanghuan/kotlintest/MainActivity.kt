package com.huanghuan.kotlintest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import org.jetbrains.anko.onClick
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var login_tv_tv_login: TextView

    var obj: Any = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        login_tv_tv_login = findViewById(R.id.login_tv_tv_login) as TextView
        initListener()
    }

    fun initListener(): Unit {
        login_tv_tv_login.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        })
        login_tv_tv_login.setOnClickListener(View.OnClickListener {

        })
        login_tv_tv_login.setOnClickListener { v ->
            if (v.isEnabled) v.isEnabled = false

        }
        login_tv_tv_login.setOnClickListener {
            if (it.isEnabled) it.isEnabled = false

        }
        login_tv_tv_login.onClick { }

        val sum: (Int, Int) -> Int = { x, y -> x + y }
        print(sum(1, 2))

        if (obj is String){
            print(obj.length)
        }
    }

}
