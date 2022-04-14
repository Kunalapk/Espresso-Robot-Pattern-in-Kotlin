package com.kunalapk.espresso_robot_pattern_in_kotlin

class LoginRobot : BaseTestRobot() {

    fun setEmail(email: String) = fillEditText(R.id.etEmail, email);

    fun setPassword(pass: String) = fillEditText(R.id.etPassword, pass)

    fun clickLogin() = clickButton(R.id.btnLogin)

    fun matchErrorText(err: String) = matchText(textView(android.R.id.message), err)

}