package com.EcxelPOI;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CityName 
{

	public static void main(String[] args) 
	{
		Writecontent();

	}
	private static void Writecontent()
	{
		//Write 20CityNames in 5th Column of an Excel File
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet("Flowers");
			String s[]= {"Gulbarga","vijaypur","Hyderabad","Raichur","Delhi","kochi","SHivamogga","Tumakuru","Thrissur","Thiruvanathpur","Madurai","Kochi","Hassan","Dharwad","Mandya","Udupi","Dindigul"};

			for(int i=0;i<s.length;i++)
			{
				row=sh.createRow(i);
				cell=row.createCell(5);

				cell.setCellValue(s[i]);
			}

			fout=new FileOutputStream("D:\\EXCEL\\Assignment3.xlsx");
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
