package com.example.myapplication
// Inside PaymentActivity.kt

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment) // Define this layout

        // Get the passed data from the Intent
        val spinner1Selected = intent.getStringExtra("spinner1_selected")
        val spinner2Selected = intent.getStringExtra("spinner2_selected")
        val isMessiChecked = intent.getBooleanExtra("checkbox_state", false)

        // Find the TextViews and set the text to display the passed data
        findViewById<TextView>(R.id.spinner).text = spinner1Selected
        findViewById<TextView>(R.id.spinner2).text = spinner2Selected
        findViewById<TextView>(R.id.checkBox).text =
            if (isMessiChecked) "Messi is selected" else "Messi is not selected"
    }
}
