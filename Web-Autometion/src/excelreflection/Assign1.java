package excelreflection;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1
{
	public static WebDriver oBrowser=null;
	static
	{
		launchBrowser();
		Nagavite();
		Login();
		minimizeflyout();
		createuser();
		Deleteuser();
		handleAlert();
		logout();
		Closeapplication();
		
	}
	
		public static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\ExampleAutomation\\Automation\\Reflection-Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
    public static void Nagavite()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void Login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void minimizeflyout()
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
    public static void createuser()
	{
		try
		{
			String firstname[]= {"Rajendra","Ramesh","Rajesh"};
			String lastname[]= {"pawar","gowda","anand"};
			String email[]= {"demo@gmail.com","demo2@gmail.com","demo1@gmail.com"};
			String username[]= {"demouser","demouser1","demouser2"};
			for(int i=0;i<firstname.length;i++)
			{
				oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
				oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[1]")).click();
				Thread.sleep(5000);
				oBrowser.findElement(By.name("firstName")).sendKeys(firstname[i]);
				oBrowser.findElement(By.name("lastName")).sendKeys(lastname[i]);
				oBrowser.findElement(By.name("email")).sendKeys(email[i]);
				oBrowser.findElement(By.name("username")).sendKeys(username[i]);
				oBrowser.findElement(By.name("password")).sendKeys("raki@123");
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("raki@123");
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div")).click();
				Thread.sleep(2000);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void Deleteuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
			handleAlert();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static  void handleAlert()
	{
		Alert oAlert=oBrowser.switchTo().alert();
		String content=oAlert.getText();
		System.out.println(content);
		oAlert.accept();
	}
	public static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void Closeapplication()
	{
		try
		{
			oBrowser.quit();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}