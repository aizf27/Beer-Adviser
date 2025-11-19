package com.example.beeradviser

import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //绑定
        val  tvBeerClor=findViewById<TextView>(R.id.tvBeerColor)
        val mySpinner=findViewById<Spinner>(R.id.Spinner1)
        val button=findViewById<Button>(R.id.Button1)


        //设置点击事件改TextView值
        button.setOnClickListener {
            //获取
            val color =mySpinner.selectedItem.toString()
            //赋值
            tvBeerClor.text=color
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}