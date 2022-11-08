 package com.jupiter.automation.testsuites;

import com.framework.codebase.Initializer;
import com.jupiter.automation.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Test1 extends Initializer {

    /**
     * @param url,username,password
     * test
     * Description: Verify login function with valid regular user details
     */
    @Test(dataProvider="Login_with_valid_regular_user_details")
    public void Test1(String url,String username,String password) throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.openGoogleWeb(url);
        homePage.enterValidUserNameAndPasswordRegularUser(username,password);
       homePage.verifyDashboardItems();
       
  }
    
    
    @DataProvider(name="Login_with_valid_regular_user_details")
    public Object[][] getDataFromDataprovider(){
        return new Object[][]
                {
                        { "https://demo.actitime.com/","trainee","trainee"}
                        
                };
    }

    
   
}
