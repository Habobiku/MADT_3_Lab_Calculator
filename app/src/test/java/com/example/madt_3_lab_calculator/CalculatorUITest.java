package com.example.madt_3_lab_calculator;

import androidx.test.espresso.Espresso;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class CalculatorUITest {
    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testUIInteractions() {

        Espresso.onView(ViewMatchers.withId(R.id.plusorminusBTN)).perform(ViewActions.click());


        Espresso.onView(ViewMatchers.withId(R.id.clearBTN)).perform(ViewActions.click());


        Espresso.onView(ViewMatchers.withId(R.id.parenthesesBTN)).perform(ViewActions.click());


        Espresso.onView(ViewMatchers.withId(R.id.powerBTN)).perform(ViewActions.click());


        Espresso.onView(ViewMatchers.withId(R.id.divideBTN)).perform(ViewActions.click());


        Espresso.onView(ViewMatchers.withId(R.id.multiplyBTN)).perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.percentBTN)).perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.reciprocalBTN)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.oneBTN)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.twoBTN)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.threeBTN)).perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.pointBTN)).perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.plusBTN)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.fourBTN)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.equalsBTN)).perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.minusBTN)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.fiveBTN)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.pointBTN)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.sixBTN)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.equalsBTN)).perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.sevenBTN)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.multiplyBTN)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.eightBTN)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.equalsBTN)).perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.nineBTN)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.divideBTN)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.twoBTN)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.equalsBTN)).perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.percentBTN)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.reciprocalBTN)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.powerBTN)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.zeroBTN)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.equalsBTN)).perform(ViewActions.click());
    }
}
