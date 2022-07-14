package org.Test.TestingScripts;

import org.Test.Base.BaseClass;
import org.testing.pages.LoginPage;
import org.testing.pages.LogoutPage;
import org.testing.pages.VedioPage;
import org.testng.annotations.Test;

public class TC6 extends BaseClass {

public void commentOnVedio() throws InterruptedException
  {
	  LoginPage login = new LoginPage(driver, pro);
	  VedioPage vp = new VedioPage(driver,pro);
	  LogoutPage lp = new LogoutPage(driver, pro);
	  login.signIn(pro.getProperty("emailAddress"),pro.getProperty("passwordAddress"));
	  vp.playVedio();
	  vp.commentOnVedio();
	  lp.logoutAccountAllTabs("Sign out");
  }
}