package com.example.gmailcreatorai

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.graphics.Color
import android.view.Gravity
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(30, 30, 30, 30)
        layout.setBackgroundColor(Color.WHITE)

        val title = TextView(this)
        title.text = "Gmail Creator AI"
        title.textSize = 28f
        title.setTextColor(Color.BLACK)
        title.gravity = Gravity.CENTER

        val subtitle = TextView(this)
        subtitle.text = "Welcome to your new application!"
        subtitle.textSize = 16f
        subtitle.setTextColor(Color.GRAY)
        subtitle.gravity = Gravity.CENTER

        val button = Button(this)
        button.text = "Get Started"

        button.setOnClickListener {
            subtitle.text = "Welcome! App is working."
        }

        layout.addView(title)
        layout.addView(subtitle)
        layout.addView(button)

        setContentView(layout)
    }
}
