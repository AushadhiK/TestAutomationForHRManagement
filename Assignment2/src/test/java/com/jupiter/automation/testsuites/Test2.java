package com.jupiter.automation.testsuites;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.framework.codebase.Initializer;
import com.jupiter.automation.pages.HomePage;

public class Test2 extends Initializer {
	 
	/**
     * @param url,username,password
     *
     * Description: Verify login function with valid admin user details
     */
	
	  @Test(dataProvider="Login_with_valid_admin_user_details")
	    public void Test2(String url,String username,String password) throws InterruptedException {
	        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
	        homePage.openGoogleWeb(url);
	        homePage.enterValidUserNameAndPasswordRegularUser(username,password);
	       homePage.verifyDashboardItems();
	  }
	  
	  @DataProvider(name="Login_with_valid_admin_user_details")
	    public Object[][] getDataFromDataproviderAdmin(){
	        return new Object[][]
	                {
	                        { "https://demo.actitime.com/","admin","manager"}
	                        
	                };
	    }
}
