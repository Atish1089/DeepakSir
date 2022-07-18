package org.Utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class FileHanling {
    static File excel = new File("../YouTubeProject_Deepak_Sir/test.xls");
    static File textFile= new File ("../YouTubeProject_Deepak_Sir/file3.txt");
//This method would read the data according to Row and Column number     
    public static void readDataFromSheet(int row, int collumn) throws BiffException, IOException {
        Workbook wb = Workbook.getWorkbook(excel);
        Sheet sh = wb.getSheet(0);
        
        int columnInSheet = sh.getColumns();
        int rowInSheet = sh.getRows();
        System.out.println(columnInSheet);
        System.out.println(rowInSheet);
        for (int a = 0; a <= rowInSheet; a++) {
            for (int j = 0; j <= columnInSheet; j++) {
                if (a == row && j == collumn)
                {
                    Cell c = sh.getCell(collumn, row);

                    System.out.println(c.getContents());
                }
            }
        }
    }
public static void readDataFromSheetForPerticulatRow(int row ) throws BiffException, IOException
{
    Workbook wb = Workbook.getWorkbook(excel);
    Sheet sh = wb.getSheet(0);
    int rowInSheet = sh.getRows();
    System.out.println(rowInSheet);	
    
    for (int a = 0; a <= rowInSheet; a++) {
        
    	if(a==row)
    	{
    	         Cell c= sh.getCell(row,a);
    	         System.out.println(c.getContents());
    	
    	}
    	
        }
    }

public static void readDataFromFileWithInARange(int initial, int end) throws IOException
{
  	FileReader fr = new FileReader(textFile);
  	BufferedReader br = new BufferedReader(fr);
  	String readData;
  	int line=0;
  	while ((readData = br.readLine())!= null)
  	{
  		line = line +1;
  		if (line>=initial && line<=end)
  		{
  			System.err.println(readData);
  			
  		}
  	}


}
public static void main(String[] args) throws BiffException, IOException {

	FileHanling.readDataFromSheetForPerticulatRow(3);
	//FileHanling.readDataFromFileWithInARange(3, 8);
}
}



