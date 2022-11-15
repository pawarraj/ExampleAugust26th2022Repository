package loginlogoutscenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignments6
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
			oEle=oBrowser.findElement(By.xpath("//td[text()='Please identify yourself']"));
			Assert.assertTrue(oEle.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=3,dataProvider="login")
	private static void login(String ad,String mn)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			
			WebElement oLink=oBrowser.findElement(By.xpath("//a[contains(text(),'Administrator')]"));
			Assert.assertTrue(oLink.isDisplayed());
			
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a")).click();
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4,dataProvider="adduser")
	private static void adduser(String project,String ram)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("buildingproject");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("projectPopup_newCustomerNameField")).sendKeys("Ram");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"projectPopup_sectionDetails\"]/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"createTasksHeaderBlock\"]/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"projectPopup_commitBtn\"]/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	private static void deleteproject()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	private static void logoutApplication()
	{
		try
		{
		oBrowser.findElement(By.id("logoutLink")).click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	private static void closeapp()
	{
		try
		{
		oBrowser.close();	
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@DataProvider(name="login")
	public Object[][] getLoginData()
	{
		return new Object[][] {{"admin","manager"}};
	}

	@DataProvider(name="adduser")
	public Object[][] getadduser()
	{
		return new Object[][] {{"pj","name"}};
	}
}
