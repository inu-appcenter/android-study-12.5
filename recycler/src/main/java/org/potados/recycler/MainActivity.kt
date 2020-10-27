package org.potados.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setView()
    }

    private fun setView() {
        val item = listOf(
            "lorem",
            "ipsum",
            "dolor",
            "amit",
            "aaaaaaa",
            "bbbbbbbb",
            "cccccccc",
            "lorem",
            "ipsum",
            "dolor",
            "amit",
            "aaaaaaa",
            "bbbbbbbb",
            "cccccccc",
            "lorem",
            "ipsum",
            "dolor",
            "amit",
            "aaaaaaa",
            "bbbbbbbb",
            "cccccccc",
            "lorem",
            "ipsum",
            "dolor",
            "amit",
            "aaaaaaa",
            "bbbbbbbb",
            "cccccccc",
            "lorem",
            "ipsum",
            "dolor",
            "amit",
            "aaaaaaa",
            "bbbbbbbb",
            "cccccccc",
            "lorem",
            "ipsum",
            "dolor",
            "amit",
            "aaaaaaa",
            "bbbbbbbb",
            "cccccccc",
            "lorem",
            "ipsum",
            "dolor",
            "amit",
            "aaaaaaa",
            "bbbbbbbb",
            "cccccccc"
        )
        val adapter = ItemAdapter(item)

        recycler.adapter = adapter
    }
}