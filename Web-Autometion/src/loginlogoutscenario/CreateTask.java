package loginlogoutscenario;

//launchBrowser --> navigate --> Login --> Create Customer --> Create Project--> Create Tasks -->Delete Tasks --> delete Project-->delete Customer --> Logout --> CloseApplication

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateTask 
{
public static WebDriver oBrowser=null;
	
	@Test(priority = 1)
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\GitRepository\\CurrentWorkSpace\\ExampleAugust26th2022Repository\\Web-Autometion\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			Thread.sleep(2000);
			oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
   
	@Test(priority = 2)
	private static void navigate()
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
    
	@Test(priority = 3, dataProvider = "login")
	private static void login(String user,String pwd)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(user);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
			WebElement oLink=oBrowser.findElement(By.xpath("//a[contains(text(),'Administrator')]"));
			Assert.assertTrue(oLink.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority = 4)
	private static void minimizeFlyOutwindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(4000);
			WebElement oLink=oBrowser.findElement(By.xpath("//a[contains(text(),'Administrator')]"));
			Assert.assertTrue(oLink.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority = 5 , dataProvider="createuser")
	private static void createCustomer(String cname,String cdetails)
	{		
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[2]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys(cname);
			oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys(cdetails);
			oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(3000);	
			WebElement iLink=oBrowser.findElement(By.xpath("//a[text()='All Customers']"));
			Assert.assertTrue(iLink.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 6 ,dataProvider="projectData")
	private static void createProject(String pname)
	{

		try
		{
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='+ New Project']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys(pname);
			Thread.sleep(2000);		
			oBrowser.findElement(By.xpath("//span[text()='Create Project']")).click();
			Thread.sleep(3000);
			WebElement pLink=oBrowser.findElement(By.xpath("//div[text()='DELL Automation']"));
			Assert.assertTrue(pLink.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
