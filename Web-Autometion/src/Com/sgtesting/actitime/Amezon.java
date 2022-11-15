package Com.sgtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amezon 
{
	public static WebDriver oBrowser=null;

	public static void main(String[] args) 
	{
		launchbrowser();
		openAmezon();
		login();
		closeapplication();
		open();



	}
	public static void launchbrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\ExampleAtomation\\Automation\\Web'Autometion\\Library\\drivers\\chromedriver.exe");
			oBrowser =new ChromeDriver();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void openAmezon()
	{
		try
		{
			oBrowser.get("https://www.amazon.in");
			Thread.sleep(2000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}	
	}
	public static void login()
	{
		try
		{
			oBrowser.findElement(By.className("nav-a  ")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	public static void open()
	{
		try
		{
		oBrowser.findElement(By.id("nav_cs_books")).click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void closeapplication()
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
