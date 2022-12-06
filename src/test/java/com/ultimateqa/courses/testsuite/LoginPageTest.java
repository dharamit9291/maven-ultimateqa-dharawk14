package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        loginPage.clickOnSigninLink();
        String expectedMessage = "Welcome Back!";
        Assert.assertEquals(loginPage.verifyWelcomeBackTextMessage(), expectedMessage, "User Not Logged In");
    }

    @Test
    public void verifyTheErrorMessage() {
        loginPage.clickOnSigninLink();
        loginPage.enterInvalidUserName("Prime123@Gmail.com");
        loginPage.enterInvalidPassword("Prime123");
        loginPage.clickOnSigninButton();
        String expectedMessage = "Invalid email or password.";
        Assert.assertEquals(loginPage.verifyInvalidCredentialMessage(), expectedMessage, "User Logged In");
    }
}
