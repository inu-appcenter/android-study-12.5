package org.potados.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _myText = MutableLiveData("Hello!")
    val myText: LiveData<String> = _myText

    fun onButtonClick() {
        _myText.value += " yeah"
    }
}