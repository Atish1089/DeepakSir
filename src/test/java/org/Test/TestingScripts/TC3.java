package org.Test.TestingScripts;

import org.Test.Base.BaseClass;
import org.testing.pages.HomePage;
import org.testing.pages.LoginPage;
import org.testing.pages.LogoutPage;
import org.testng.annotations.Test;

public class TC3 extends BaseClass {
	@Test
  public void clickOnSubscription() throws InterruptedException {
		LoginPage login = new LoginPage(driver, pro);
		HomePage hp = new HomePage(driver, pro);
		LogoutPage logout= new LogoutPage(driver, pro);
		login.signIn(pro.getProperty("emailAddress"),pro.getProperty("passwordAddress"));
	    Thread.sleep(2000);
	    hp.clickOnHomePageTabs("Subscriptions");
	    logout.logoutAccountAllTabs("Sign out");

	}
}