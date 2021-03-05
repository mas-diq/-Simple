package com.dicoding.navbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPengguna: Button = findViewById(R.id.pengguna)
        btnPengguna.setOnClickListener(this)

        val btnArtikel: Button = findViewById(R.id.artikel)
        btnArtikel.setOnClickListener(this)

        val btnIbu: Button = findViewById(R.id.ibu)
        btnIbu.setOnClickListener(this)

        val btnAnak: Button = findViewById(R.id.anak)
        btnAnak.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        when (v?.id) {
            R.id.pengguna -> {
                val movePengguna = Intent(this@MainActivity, PenggunaActivity::class.java)
                startActivity(movePengguna)
            }

            R.id.artikel -> {
                val moveArtikel = Intent(this@MainActivity, ArtikelActivity::class.java)
                startActivity(moveArtikel)
            }

            R.id.ibu -> {
                val moveIbu = Intent(this@MainActivity, IbuActivity::class.java)
                startActivity(moveIbu)
            }

            R.id.anak -> {
                val moveAnak = Intent(this@MainActivity, AnakActivity::class.java)
                startActivity(moveAnak)
            }
        }

    }
}