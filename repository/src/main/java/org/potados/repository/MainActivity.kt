package org.potados.repository

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val repository: TextRepository by lazy {
        TextRepository(this/* 나쁘지만어쩔수없는선택 */)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    private fun initView() {
        // 저장 버튼이 눌렸을 때: the_input에 작성된 텍스트 가져와서 저장.
        save_button.setOnClickListener {
            val text = the_input.text.toString() // 저장할 텍스트
            repository.saveText(text)
        }

        // 불러오기 버튼이 눌렸을 때: 저장된 텍스트 가져와서 the_text에 표시.
        load_button.setOnClickListener {
            val text = repository.loadText() // 불러온 텍스트
            the_text.text = text
        }
    }
}