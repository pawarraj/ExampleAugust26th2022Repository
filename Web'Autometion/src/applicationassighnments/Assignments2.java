package applicationassighnments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments2 
{
	public static WebDriver oBrowser=null;

	public static void main(String[] args) 
	{
		launchbrowser();
		navigation();
		login();
		minimize();
		openuser();
		adduser();
		modify();
		deleteuser();
		logout();
		closeapp();

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
	private static void navigation()
	{
		try
		{
		oBrowser.get("http://localhost/login.do");
		Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
		oBrowser.findElement(By.id("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(3000);
		oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
		Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimize()
	{
	 try
	 {
		oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		Thread.sleep(3000);
	 }catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	}
	private static void openuser()
	{
		try
		{
		oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
		Thread.sleep(3000);
		oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void adduser()
	{
		try
		{
			oBrowser.findElement(By.name("firstName")).sendKeys("Rajendra");
			oBrowser.findElement(By.name("lastName")).sendKeys("Pawar");
			oBrowser.findElement(By.name("email")).sendKeys("rpawar588@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("name");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("9591");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("9591");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.className("userNameSpan")).click();
			Thread.sleep(3000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modify()
	{
		try 
		{
			oBrowser.findElement(By.name("firstName")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Rajesh");
			oBrowser.findElement(By.name("lastName")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys("kumbar");
			oBrowser.findElement(By.name("email")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).sendKeys("rajesh588@gmail.com");
			oBrowser.findElement(By.name("username")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).sendKeys("kumbar");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("1234");
			oBrowser.findElement(By.name("passwordCopy")).clear();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("1234");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser()
	{
		try
		{
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("userDataLightBox_deleteBtn")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
		oBrowser.findElement(By.linkText("logout")).click();
		Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeapp()
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
	

	
	


