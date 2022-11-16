package sgtesting.actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart 
{
	public static WebDriver oBrowser=null;

	public static void main(String[] args) 
	{
		launchbrowser();
		naviagte();
		login();

	}
	private static void launchbrowser()
	{
		try
		{
		System.setProperty("webdriver.chrome.driver","C:\\ExampleAtomation\\Automation\\Web'Autometion\\Library\\drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void naviagte()
	{
		try
		{
		oBrowser.get("https://www.flipkart.com\r\n");
		Thread.sleep(2000);
				
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
		oBrowser.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("rpawar588@gmail.com");
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("9591675872");
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("9591675872");
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("9591675872");
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
		oBrowser.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[3]")).click();
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
