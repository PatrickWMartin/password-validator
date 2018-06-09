package com.example.patrick.passsword_validator;


import android.support.test.espresso.ViewAssertion;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;

import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class EspressoTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void findButton() {
        onView(withId(R.id.validateButton));
    }
    @Test
    public void findInput(){
        onView(withId(R.id.passwordField));
    }
    @Test
    public void findStrengthText(){
        onView(withId(R.id.strengthText));
    }
    @Test
    public void strongPasswordTest(){
        onView(withId(R.id.passwordField)).perform(typeText("Thisshouldpass1"),closeSoftKeyboard());
        onView(withId(R.id.validateButton)).perform(click());
        onView(withId(R.id.strengthText)).check(matches(withText("Strong")));
    }


}