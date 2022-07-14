package org.Runner;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class RunnerClass {

  public static void main(String[] args) throws BiffException, IOException {

    XmlSuite xs = new XmlSuite();
    xs.setName("Suite1");
    XmlTest xt = new XmlTest(xs);
    xt.setName("Test1");
    File f = new File("../YTFramework/testCases.xls");
    Workbook wb = Workbook.getWorkbook(f);
    Sheet sh = wb.getSheet(0);
    int row = sh.getRows();
    ArrayList < XmlClass > axc = new ArrayList < XmlClass > ();
    for (int i = 0; i < row; i++) {
      Cell c = sh.getCell(4, i);
      if (c.getContents().equals("Yes")) {
        Cell pkg = sh.getCell(2, i);
        Cell Class_Name = sh.getCell(3, i);
        String testName = pkg.getContents() + "." + Class_Name.getContents();
        XmlClass xc = new XmlClass(testName);
        axc.add(xc);
      }
    }
    System.out.println(axc.size());

    xt.setClasses(axc);

    ArrayList < XmlTest > axt = new ArrayList < XmlTest > ();

    axt.add(xt);

    xs.setTests(axt);

    ArrayList < XmlSuite > axs = new ArrayList < XmlSuite > ();
    axs.add(xs);

    TestNG tng = new TestNG();
    tng.setXmlSuites(axs);
    tng.run();
  }
}