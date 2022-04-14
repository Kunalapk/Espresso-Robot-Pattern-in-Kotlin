package com.kunalapk.espresso_robot_pattern_in_kotlin

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry.getInstrumentation
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class LoginTest : BaseTestRobot() {

    @get:Rule
    val mActivityTestRule: ActivityScenarioRule<MainActivity> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun loginMissingEmailPassword() {
        login {
            clickLogin()
            matchErrorText(string(R.string.missing_fields))
        }
    }

    @Test
    fun loginMissingEmail() {
        login {
            setEmail("12345678")
            clickLogin()
            matchErrorText(string(R.string.missing_fields))
        }
    }

    @Test
    fun loginMissingPassword() {
        login {
            setEmail("mail@example.com")
            clickLogin()
            matchErrorText(string(R.string.missing_fields))
        }
    }

    private fun string(res: Int): String {
        return getInstrumentation().targetContext.getString(res)
    }
}