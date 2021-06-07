package com.example.ktempconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton


class MainActivity : AppCompatActivity() {

    lateinit var editText: EditText
    lateinit var celciosRadio: RadioButton
    lateinit var fahreinheitRadio: RadioButton
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById<EditText>(R.id.valorTemp)
        celciosRadio = findViewById<RadioButton>(R.id.celciesRadio)
        fahreinheitRadio = findViewById<RadioButton>(R.id.fahreinheitRadio)
        button = findViewById<Button>(R.id.converterButton)

        button.setOnClickListener {converter(it)}

    }

    fun converter(view: View) {
        var temp: Double = editText.text.toString().toDouble()

        if(celciosRadio.isChecked) {
            temp = (temp - 32) * 5/9
        }

        if(fahreinheitRadio.isChecked) {
            temp = temp * 9/5 + 32
        }

        editText.setText(temp.toString())
    }
}