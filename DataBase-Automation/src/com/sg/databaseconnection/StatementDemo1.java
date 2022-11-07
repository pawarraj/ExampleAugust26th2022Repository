package com.sg.databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class StatementDemo1 
{

	public static void main(String[] args) 
	{
		getRecordsFromDatabase();
		insertRecords();
	}
	private static void getRecordsFromDatabase()
	{
		Connection conn=null;
		try
		{
			Class.forName("oracle.jdbc.driver.oracledriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
			System.out.println("connection has successful!!!");
			Statement stmt=conn.createStatement();
			String strQuery="select * from dept2";
			ResultSet rs=stmt.executeQuery(strQuery);
			ResultSetMetaData rsmt=rs.getMetaData();
			String colname1=rsmt.getColumnName(1);
			String colname2=rsmt.getColumnName(2);
			String colname3=rsmt.getColumnName(3);
			System.out.printf("%-12s",colname1);
			System.out.printf("%-12s",colname2);
			System.out.printf("%-12s",colname3);
			System.out.printf("\n");
			while(rs.next())
			{
				String deptnumber=rs.getString("DEPTNO");
				String deptname=rs.getString("DNAME");
				String location=rs.getString("LOC");
				System.out.printf("%-12s",deptnumber);
				System.out.printf("%-12s",deptname);
				System.out.printf("%-12s",location);	
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				conn.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}


	private static void insertRecords()
	{
		Connection conn=null;
		try
		{
			Class.forName("oracle.jdbc.driver.oracledriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE\",\"system\",\"tiger");
			Statement stmt=conn.createStatement();
			String strQuery="insert into dept2 values(80,'insurance','banglore')";
			stmt.executeUpdate(strQuery);
			System.out.println("inserted the records successfuly");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				conn.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}














