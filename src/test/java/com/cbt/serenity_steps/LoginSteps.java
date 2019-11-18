package com.cbt.serenity_steps;

import com.cbt.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps {


    LoginPage loginPage;

    @Step
    public void goToLoginPage(){
        loginPage.open();
    }

    @Step
    public void enterUsername(String username){
        loginPage.userNameElement.type(username);
    }

    @Step
    public void enterPassword(String password){
        loginPage.passwordElement.type(password);
    }

    @Step
    public void clickLoginButton(){
        loginPage.loginButtonElement.click();
    }

}
