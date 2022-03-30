
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.mobileautomationlesson_4_espresso_login.LoginPage


import com.example.mobileautomationlesson_4_espresso_login.ui.login.LoginActivity

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Rule
@RunWith(AndroidJUnit4::class)
class LoginTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(LoginActivity::class.java)

    @Test fun checkLoginButtonIsDisplayed() {
        LoginPage()
            .setUserName("vova")
            .checkLoginButtonIsDisable()
    }
}