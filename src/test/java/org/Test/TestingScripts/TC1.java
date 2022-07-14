package org.Test.TestingScripts;

import java.io.IOException;


import org.Test.Base.BaseClass;
import org.Utilities.Logs4j;
import org.Utilities.ScreenShot;
import org.testing.pages.HomePage;
import org.testing.pages.LoginPage;
import org.testing.pages.LogoutPage;
import org.testng.annotations.Test;  



public class TC1 extends BaseClass {
	
	@Test
    public void trendingVedios() throws InterruptedException, IOException {
        LoginPage login = new LoginPage(driver, pro);
        LogoutPage logout = new LogoutPage(driver, pro);
        HomePage hp = new HomePage(driver, pro);
        login.signIn(pro.getProperty("emailAddress"),pro.getProperty("passwordAddress")); 
        Logs4j.loggs("TC1", "There is some another error");
        hp.clickOnHomePageTabs("Explore");
        ScreenShot.takeScreenShot(driver);
        hp.clickOnTrendingButton();
        logout.logoutAccountAllTabs("Sign out");
        
    }

}