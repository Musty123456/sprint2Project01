package com.sprint2Project01.pages;


import com.sprint2Project01.utilities.ConfigurationReader;
import com.sprint2Project01.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement username;



    @FindBy(name="USER_PASSWORD")
    public WebElement password;

  @FindBy(xpath = "//input[@class='login-btn']")
  public WebElement loginBtn;


    public void login(String userNameStr, String passwordStr) {
        this.username.sendKeys(userNameStr);
        this.password.sendKeys(passwordStr);
        this.loginBtn.click();
        // verification that we logged
    }

}