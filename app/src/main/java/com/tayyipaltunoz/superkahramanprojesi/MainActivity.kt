package com.tayyipaltunoz.superkahramanprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var numara = 5
    private var isim = ""
    private var yas: Int? = null
    private var meslek = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Scope - Kapsam
        numara = 6
    }

    fun superKahramanYap(view: View) {

        numara = 8

        isim = isimText.text.toString()
        yas = yasText.text.toString().toIntOrNull()
        meslek = meslekText.text.toString()

        if (yas == null) {
            sonucText.text = "Doğru değer giriniz"
        } else {
            val superKahraman = SuperKahraman(isim, yas!!, meslek)

            sonucText.text =
                "İsim: ${superKahraman.isim} Yaş: ${superKahraman.yas} Meslek: ${superKahraman.meslek}"

        }

    }
}