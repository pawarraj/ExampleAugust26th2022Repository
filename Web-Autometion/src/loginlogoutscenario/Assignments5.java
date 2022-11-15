package loginlogoutscenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignments5 
{
	public static WebDriver oBrowser=null;
	@Test(priority=1)
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
	@Test(priority=2)
	private static void navigation()
	{

		WebElement oEle=null;
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
			oEle=oBrowser.findElement(By.xpath("//td[text()='Please identify yourself']"));
			Assert.assertTrue(oEle.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=3,dataProvider="login")
	private static void login(String admin,String manager)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	private static void opentask()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.className("addNewButton")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5,dataProvider="createcustomer")
	private static void createcustomer(String rp)
	{
		try
		{
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Rajendra");
			Thread.sleep(3000);
			oBrowser.findElement(By.id("customerLightBox_commitBtn")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6,dataProvider="modifyuser")
	private static void modifyuser(String rpawar)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")).sendKeys("Rajendrapawar");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	private static void deletecustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=9)
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
	@DataProvider(name="login")
	public Object[][] getLoginData()
	{
		return new Object[][] {{"admin","manager"}};
	}
	@DataProvider(name="createuser")
	public Object[][] getcreateuser()
	{
		return new Object[][] {{"rpawar"}};
	}
	@DataProvider(name="modifyuser")
	public Object[][] getmodifyuser()
	{
		return new Object[][] {{"pawar"}};
	}

}









