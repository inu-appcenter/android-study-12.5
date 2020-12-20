package org.potados.view_binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.potados.view_binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // binding.myTextView
    }
}