package com.cbt.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends PageObject {

    @FindBy(css = ".logo")
    public WebElementFacade logo;

}
