package Com.sgtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookdemo 
{
	public static WebDriver oBrowser=null;

	public static void main(String[] args) 
	{
		launchbrowser();
		navigate();

	}
	private static void launchbrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\ExampleAtomation\\Automation\\Web'Autometion\\Library\\drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
		oBrowser.get("https://www.facebook.com/");	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
