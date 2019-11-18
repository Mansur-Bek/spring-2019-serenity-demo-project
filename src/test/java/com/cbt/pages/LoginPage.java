package com.cbt.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://qa1.vytrack.com")
public class LoginPage extends PageObject {

    @FindBy(id = "prependedInput")
    public WebElementFacade userNameElement;

    @FindBy(name = "_password")
    public WebElementFacade passwordElement;

    @FindBy(id = "_submit")
    public WebElementFacade loginButtonElement;


}
