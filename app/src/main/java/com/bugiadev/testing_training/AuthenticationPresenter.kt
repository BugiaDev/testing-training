package com.bugiadev.testing_training

/**
 * Created by Kiko on 2019-11-12 for testing-training.
 */

class AuthenticationPresenter(
    private val Login: Login,
    private val Logout: Logout,
    private val view: view
){

}

interface view {
    fun hideLogInForm()
    fun hideLogOutForm()
    fun showLogInForm()
    fun showLogOutForm()
}