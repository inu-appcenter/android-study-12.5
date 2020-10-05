package org.potados.study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTimeButton()
    }

    private fun setTimeButton() {
        time_button.setOnClickListener {
            showMessage(getCurrentTime())
        }
    }

    private fun getCurrentTime(): String {
        return Calendar.getInstance().time.toString()
    }

    private fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}