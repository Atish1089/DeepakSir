package org.Test.TestingScripts;

import org.Test.Base.BaseClass;
import org.testing.pages.HomePage;
import org.testing.pages.LoginPage;
import org.testing.pages.LogoutPage;
import org.testng.annotations.Test;

public class TC7 extends BaseClass {

	@Test
public void clickOnWatchLater() throws InterruptedException
{
	
	LoginPage login = new LoginPage(driver, pro);
	  HomePage hp = new HomePage(driver,pro);
	  LogoutPage lp = new LogoutPage(driver, pro);
	  login.signIn(pro.getProperty("emailAddress"),pro.getProperty("passwordAddress"));
      hp.clickOnHomePageTabs("Watch Later");
      lp.logoutAccountAllTabs("Sign out");
}


}