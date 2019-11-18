package com.cbt.cucumber_step_defs;

import com.cbt.pages.DashBoardPage;
import com.cbt.serenity_steps.LoginSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinitions {

    @Steps
    LoginSteps login;

    DashBoardPage dashBoardPage;

    @Given("user opens the login page")
    public void user_opens_the_login_page() {
        login.goToLoginPage();

    }

    @When("the users logs in as a driver")
    public void the_users_logs_in_as_a_driver() {
        login.enterUsername("user1");
        login.enterPassword("UserUser123");
        login.clickLoginButton();
    }

    @Then("the dashboard should be visible")
    public void the_dashboard_should_be_visible() {
        dashBoardPage.logo.shouldBeVisible();
        dashBoardPage.logo.shouldContainOnlyText("FLEET MANAGEMENT");

    }

    @When("the users logs in as a sales manager")
    public void the_users_logs_in_as_a_sales_manager() {
        login.enterUsername("salesmanager116");
        login.enterPassword("UserUser123");
        login.clickLoginButton();
    }

    @When("the users logs in as a store manager")
    public void the_users_logs_in_as_a_store_manager() {
        login.enterUsername("storemanager61");
        login.enterPassword("UserUser123");
        login.clickLoginButton();
    }


}
