package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By signiInLink = By.xpath("//a[@href='/users/sign_in']");
    By verifyWelcomeBackText = By.xpath("//h2[@class = 'page__heading']");

    By userNameField = By.id("user[email]");
    By userPasswordField = By.id("user[password]");
    By signInButton = By.xpath("//button[@type='submit']");
    By InvalidCredentialMessage = By.xpath("//li[contains(text(),'Invalid email or password.')]");

    public void clickOnSigninLink(){
        clickOnElement(signiInLink);
    }
    public void clickOnSigninButton(){
        clickOnElement(signInButton);
    }

    public String verifyWelcomeBackTextMessage(){
        return getTextFromElement(verifyWelcomeBackText);
    }

    public void enterInvalidUserName(String userName){
        sendTextToElement(userNameField, userName);
    }

    public void enterInvalidPassword(String password){
        sendTextToElement(userPasswordField, password);
    }

    public String verifyInvalidCredentialMessage(){
        return getTextFromElement(InvalidCredentialMessage);
    }

}
