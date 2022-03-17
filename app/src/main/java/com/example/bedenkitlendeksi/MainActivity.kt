package com.example.bedenkitlendeksi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Btn = findViewById<Button>(R.id.hesaplaButon)
        var kilo =findViewById<EditText>(R.id.KiloEdit)
        var boy = findViewById<EditText>(R.id.BoyEdit)
        var sonuc = findViewById<TextView>(R.id.bkiSonuc)
        var bkiDurum = findViewById<TextView>(R.id.bkiDurum)
        Btn?.setOnClickListener(){
            var bkiSonuc:Double = kilo.text.toString().toDouble()/((boy.text.toString().toDouble()/100)*(boy.text.toString().toDouble()/100))
            sonuc.text=bkiSonuc.toString()
            if(bkiSonuc in 0.0..18.4){
                bkiDurum.text = "Zayıf"
            }
            else if (bkiSonuc in 18.5..24.9){
                bkiDurum.text = "Normal"

            }
            else if (bkiSonuc in 25.0..29.9){
                bkiDurum.text = "Fazla Kilolu"

            }
            else if (bkiSonuc in 30.0..34.9){
                bkiDurum.text = "Şişman(Birinci Derece Obez)"

            }
            else if (bkiSonuc in 35.0..44.9){
                bkiDurum.text = "Şişman(İkinci Derece Obez)"

            }

            else if (bkiSonuc>45){
                bkiDurum.setText("Aşırı şişman")
            }
            else{
                sonuc.text="Yanlış Değer Aralığı Girildi."
                bkiDurum.setText("Yanlış Değer Girildi.")
            }
        }
    }
}