package com.jupiter.automation.pages;

import com.framework.codebase.CodeBase;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends CodeBase {
    WebDriver driver;

    @CacheLookup
    @FindBy(xpath = "//input[@id='username']")
    private WebElement txt_username;

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//input[@name='pwd']")
    private WebElement txt_pwd;

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//td[text()='Enter Time-Track']")
    private WebElement lbl_timetrack;

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//a[text()='Logout']")
    private WebElement btn_logout;
 
    @CacheLookup
    @FindBy(how = How.XPATH, using = "//span[@id='sortByTaskNameLink']/../following-sibling::td")
    private WebElement lbl_deadline;
  
  
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);   
    }

    public void openGoogleWeb(String url) {
        openUrl(url);
        
    }

    public void enterValidUserNameAndPasswordRegularUser(String username,String password) {
    	txt_username.sendKeys(username);
    	txt_pwd.sendKeys(password);
    }
    
   public void verifyDashboardItems() {
	 isDisplayed(lbl_timetrack);
	 isDisplayed(btn_logout);
	 isDisplayed(lbl_deadline);
   }
   
 
}
