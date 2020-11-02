package org.potados.repository

import android.content.Context

// 텍스트 저장과 인출을 담당하는 클래스
class TextRepository(private val context: Context) {

    private val wrapper = SharedPreferenceWrapper(context)

    fun saveText(text: String) {
        wrapper.putString("THE_TEXT", text)
    }

    fun loadText(): String {
        return wrapper.getString("THE_TEXT") ?: "{No data}"
    }
}