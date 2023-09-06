package com.example.miprimeraapp

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.Rule
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)

class MainActivityUITest {

    @get:Rule
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testButtonClick() {
        Espresso.onView(withId(R.id.editText1)).perform(typeText("Texto1"), closeSoftKeyboard())
        Espresso.onView(withId(R.id.editText2)).perform(typeText("Texto2"), closeSoftKeyboard())
        Espresso.onView(withId(R.id.compareButton)).perform(click())
        Espresso.onView(withId(R.id.resultTextView)).check(matches(withText("Las palabras son diferentes")))
    }
}