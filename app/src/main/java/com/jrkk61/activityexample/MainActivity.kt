package com.jrkk61.activityexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment = BlankFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.contaner, fragment)
        transaction.commit()

    }

}