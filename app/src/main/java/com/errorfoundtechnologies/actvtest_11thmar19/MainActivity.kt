package com.errorfoundtechnologies.actvtest_11thmar19

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       var city = resources.getStringArray(R.array.city)
       var ourAdapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_single_choice, city )
       actv1.setAdapter(ourAdapter)
       actv1.threshold = 2

    }
}
