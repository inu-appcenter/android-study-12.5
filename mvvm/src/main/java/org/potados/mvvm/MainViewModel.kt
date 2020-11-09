package org.potados.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

// 뷰모델
class MainViewModel : ViewModel() {

    // 모델
    private val textRepository = TextRepository()

    private val _myText = MutableLiveData("Hello!")
    val myText: LiveData<String> = _myText

    fun onButtonClick() {
        _myText.value += textRepository.getText()
    }
}