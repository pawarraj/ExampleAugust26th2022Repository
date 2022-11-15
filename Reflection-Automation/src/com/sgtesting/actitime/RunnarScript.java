package com.sgtesting.actitime;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RunnarScript {

	public static void main(String[] args) {
		 excuatemethod();
	}
	
   private static void excuatemethod()
   {
	   FileInputStream fin=null;
	   Workbook wb=null;
	   Sheet sh=null;
	   Row row=null;
	   Cell cell=null;
	   try
	   {
		   fin=new FileInputStream(".\\Datafile\\method1.xlsx");
		   wb=new XSSFWorkbook(fin);
		   sh=wb.getSheet("Sheet1");
		   
		   int rc=sh.getLastRowNum();
		   int col=sh.getRow(1).getLastCellNum();
		   for(int r=1;r<rc;r++)
		   {
			   row=sh.getRow(r);
			  for(int c=0;c<col;c++)
			  {
				  cell=row.getCell(c);
				  cell.getStringCellValue();
				  switch(cell.getCellType())
				  {
				  case STRING:System.out.println(cell.getStringCellValue()); break;
				  }
				  Class.forName("com.sgtesting.actitime.ActiTimeLoginLogoat");
			  }
		   }
		  
	   }catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	   finally
	   {
		   try
		   {
			   fin.close();
			   wb.close();
			   
			   
		   }catch(Exception e)
		   {
			   e.printStackTrace();
		   }
	   }
	   
	   
	   
   }
}
