package com.dicoding.navbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttomNavigationView = findViewById<BottomNavigationView>(R.id.buttom_navigation)
        val navController = findNavController(R.id.fragmentBeranda)
        buttomNavigationView.setupWithNavController(navController)
    }

    override fun onClick(v: View?) {

    }
}