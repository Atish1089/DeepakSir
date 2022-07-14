package org.Test.TestingScripts;

import org.Test.Base.BaseClass;
import org.testing.pages.LoginPage;
import org.testing.pages.LogoutPage;
import org.testing.pages.VedioPage;
import org.testng.annotations.Test;

public class TC4 extends BaseClass {
	@Test
  public void playVedio() throws InterruptedException {
	LoginPage login = new LoginPage(driver, pro);
	VedioPage vp= new VedioPage(driver, pro);
	LogoutPage logout= new LogoutPage(driver, pro);
	login.signIn(pro.getProperty("emailAddress"), pro.getProperty("passwordAddress"));
    Thread.sleep(2000);
    vp.playVedio();
    logout.logoutAccountAllTabs("Sign out");
 }
 }