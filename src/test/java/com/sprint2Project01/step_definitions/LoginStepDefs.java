package com.sprint2Project01.step_definitions;

import com.sprint2Project01.pages.LoginPage;
import com.sprint2Project01.utilities.ConfigurationReader;
import com.sprint2Project01.utilities.Driver;
import io.cucumber.java.en.Given;
public class LoginStepDefs {

    LoginPage login = new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));


    }
    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String string) {


    }
    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {
        login.login(username,password);



    }

}
