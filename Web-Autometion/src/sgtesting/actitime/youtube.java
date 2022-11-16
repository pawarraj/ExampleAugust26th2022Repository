package sgtesting.actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube 
{
	public static  WebDriver oBrowser=null;

	public static void main(String[] args) 
	{
		launchbrowser();
		navigate();
		search();
		closeyoutube();
		

	}
	private static void launchbrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\ExampleAtomation\\Automation\\Web'Autometion\\Library\\drivers\\chromedriver.exe");
			oBrowser =new ChromeDriver();	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
		oBrowser.get("https://www.youtube.com/index");
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void search()
	{
		try
		{
			oBrowser.findElement(By.name("search_query")).sendKeys("sg software testing institute");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'guide-button\']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"endpoint\"]/tp-yt-paper-item")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"voice-search-button\"]/ytd-button-renderer/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("microphone")).click();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeyoutube()
	{
		try
		{
		oBrowser.close();	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	

}
