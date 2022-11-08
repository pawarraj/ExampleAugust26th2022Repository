package com.EcxelPOI;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assignments5 
{

	public static void main(String[] args) 
	{
		Write();
	}
	private static void Write()
	{
	//Write 20StateNames Diagonal of an Excel File
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet("States");
			String s[]= {"Karnataka","Telangana","goa","AndhraPradesh","tamilnadu","Kerala","Maharashtra","Gujurath","Rajasthan","Maharashtra","MadhyaPradesh","Chattisgarh","Bihar","Assam","Meghalaya","Tripura","Mizoram","Nagaland","Manipur","Sikkim"};
			
			for(int i=0;i<s.length;i++)
			{
				row=sh.createRow(i);
				cell=row.createCell(i);
				
				cell.setCellValue(s[i]);
			}
			
			fout=new FileOutputStream("D:\\EXCEL\\Assignment5.xlsx");
			wb.write(fout);		
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}



