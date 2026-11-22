
package com.carevix.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.view.ViewGroup
import android.widget.*

class MainActivity : Activity() {

    private val blue = Color.rgb(20, 110, 170)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(24, 32, 24, 24)
            setBackgroundColor(Color.rgb(245, 249, 252))
        }

        val title = TextView(this).apply {
            text = "Carevix"
            textSize = 32f
            setTextColor(blue)
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "Your AI Healthcare Companion"
            textSize = 16f
            gravity = Gravity.CENTER
            setTextColor(Color.DKGRAY)
        }

        layout.addView(title)
        layout.addView(subtitle)

        addButton(layout, "Find Nearby Hospitals")
        addButton(layout, "Find Doctors")
        addButton(layout, "Book Appointments")
        addButton(layout, "AI Health Assistant")
        addButton(layout, "Check Waiting Time")

        val footer = TextView(this).apply {
            text = "\nCarevix – Healthcare made easier."
            textSize = 13f
            gravity = Gravity.CENTER
        }

        layout.addView(footer)
        setContentView(layout)
    }

    private fun addButton(
        layout: LinearLayout,
        label: String
    ) {
        val button = Button(this).apply {
            text = label
            textSize = 15f
            setTextColor(Color.WHITE)
            setBackgroundColor(blue)
            setOnClickListener {
                Toast.makeText(
                    this@MainActivity,
                    "$label – Coming soon",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        val params = LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            60
        )
        params.setMargins(0, 18, 0, 0)
        layout.addView(button, params)
    }
}
