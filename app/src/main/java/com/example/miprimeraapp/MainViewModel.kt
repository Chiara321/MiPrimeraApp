package com.example.miprimeraapp

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    fun compareStrings(str1: String, str2: String): Boolean {
        return str1 == str2
    }
}
