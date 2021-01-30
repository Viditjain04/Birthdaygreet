package com.example.birthday_greet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_greeting_activity.*
import kotlinx.android.synthetic.main.activity_main.*

class greeting_activity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA="NAME_EXTRA"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting_activity)

        val name=intent.getStringExtra(NAME_EXTRA)
        Happy.text="Happy bday $name"
    }

}