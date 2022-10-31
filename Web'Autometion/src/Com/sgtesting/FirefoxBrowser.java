package Com.sgtesting;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser 
{
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
			System.setProperty("webdriver.gecko.driver","C:\\ExampleAtomation\\Automation\\Web'Autometion\\Library\\drivers\\geckodriver.exe");
			oBrowser=new FirefoxDriver();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("https://www.facebook.com");	
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



