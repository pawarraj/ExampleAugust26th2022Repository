package sgtesting.actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DEMO {

	public static WebDriver oBrowser=null;

	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		closeapplication();

	}

	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.edge.driver","C:\\ExampleAtomation\\Automation\\Web'Autometion\\Library\\drivers\\msedgedriver.exe");
			oBrowser =new EdgeDriver();

		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
						
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeapplication()
	{
		try
		{
			oBrowser.close();
		}catch (Exception e)
		{
			e.printStackTrace();

		}
	}
}

