package com.EcxelPOI;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ColorNames 
{

	public static void main(String[] args) 
	{
		Writecontent();
	}
	private static void Writecontent()
	{
		//Write 20ColorNames in FirstSheet,10th Row of Excel File
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			wb= new XSSFWorkbook();
			sh=wb.createSheet("Sheet1");
			row=sh.createRow(9);
			for(int i=0;i<20;i++)
			{
				cell=row.createCell(i);	
				cell.setCellValue("color"+i);
			}
			fout=new FileOutputStream("D:\\EXCEL\\Assignment2.xlsx");
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

