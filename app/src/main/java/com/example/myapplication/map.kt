package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class map : AppCompatActivity() {
    private lateinit var but: Button
    private lateinit var put: ImageView
    private lateinit var put2: ImageView
    private lateinit var put3: ImageView
    private lateinit var put4: ImageView
    private lateinit var but2: Button
    private lateinit var but3: Button
    private lateinit var but4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        but = findViewById(R.id.button7)
        but2 = findViewById(R.id.button)
        but3 = findViewById(R.id.button2)
        but4 = findViewById(R.id.button4)

        put = findViewById(R.id.put)
        put2 = findViewById(R.id.put2)
        put3 = findViewById(R.id.put3)
        put4 = findViewById(R.id.put5)

        put.visibility=(View.INVISIBLE)
        put2.visibility=(View.INVISIBLE)
        put3.visibility=(View.INVISIBLE)
        put4.visibility=(View.INVISIBLE)

        but.setOnClickListener{
            put.visibility=(View.VISIBLE)
            put2.visibility=(View.INVISIBLE)
            put3.visibility=(View.INVISIBLE)
            put4.visibility=(View.INVISIBLE)}


        but2.setOnClickListener{
            put2.visibility=(View.VISIBLE)
            put3.visibility=(View.INVISIBLE)
            put.visibility=(View.INVISIBLE)
            put4.visibility=(View.INVISIBLE)}

        but3.setOnClickListener{
            put3.visibility=(View.VISIBLE)
            put.visibility=(View.INVISIBLE)
        put2.visibility=(View.INVISIBLE)
        put3.visibility=(View.INVISIBLE)}

        but4.setOnClickListener{
            put4.visibility=(View.VISIBLE)
            put.visibility=(View.INVISIBLE)
            put2.visibility=(View.INVISIBLE)
            put3.visibility=(View.INVISIBLE)
        }

    }
}