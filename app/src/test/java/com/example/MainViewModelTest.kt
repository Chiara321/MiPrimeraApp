package com.example

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.miprimeraapp.MainViewModel
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)

class MainViewModelTest {

    @Test
    fun testCompareStrings() {
        val viewModel = MainViewModel()

        val result1 = viewModel.compareStrings("Texto", "Texto")
        assertTrue(result1)

        val result2 = viewModel.compareStrings("Texto1", "Texto2")
        assertFalse(result2)
    }
}

