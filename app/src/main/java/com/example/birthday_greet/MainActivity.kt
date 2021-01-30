package com.example.birthday_greet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun bdaygreet(view: View) {
        val name =usernameips.editableText.toString()
        val intent=Intent(this,greeting_activity::class.java)
        intent.putExtra(greeting_activity.NAME_EXTRA,name)
        startActivity(intent)

    }


}