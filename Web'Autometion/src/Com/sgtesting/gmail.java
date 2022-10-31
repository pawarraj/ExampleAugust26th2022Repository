package Com.sgtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail 
{
	public static WebDriver oBrowser=null;

	public static void main(String[] args) 
	{
		launchbrowser();
		navigte();

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
	private static void navigte()
	{
		try
		{
		oBrowser.get("https://gmail.google.com");	
		Thread.sleep(2000);
		oBrowser.findElement(By.id("identifierId")).sendKeys("rpawar588@gmail.com");
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
