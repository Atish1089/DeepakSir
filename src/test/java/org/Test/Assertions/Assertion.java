package org.Test.Assertions;

import org.openqa.selenium.WebElement;

public class Assertion {

  public static void textPresent(String exp, String actual) {
    if (exp.equals(actual)) {

      System.out.println("text is present");
    } else {
      System.out.println("text is not present ");
    }
  }
  public static void elementPresent(WebElement element) {
    if (element.isDisplayed()) {
      System.out.println("element is present");
    } else {
      System.out.println("element is not present ");
    }
  }

  public static void elementTextPresent(WebElement element, String text) {

    if (element.getText().equalsIgnoreCase(text)) {
      System.out.println("text is present");
    } else {
      System.out.println("text is not present");
    }
  }
}