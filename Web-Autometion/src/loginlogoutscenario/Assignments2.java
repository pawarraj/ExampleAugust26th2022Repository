package loginlogoutscenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignments2 
{
	public static WebDriver oBrowser=null;
	@Test(priority = 1)
	public static void launchbrowser()
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
	@Test(priority = 2)
	public static void navigation()
	{
		WebElement oEle=null;
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(3000);
			oEle=oBrowser.findElement(By.xpath("//td[text()='Please identify yourself']"));
			Assert.assertTrue(oEle.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 3,dataProvider="login")
	public static void login(String ad,String mn)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(ad);
			oBrowser.findElement(By.name("pwd")).sendKeys(mn);
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(3000);
			WebElement oLink=oBrowser.findElement(By.xpath("//a[contains(text(),'Administrator')]"));
			Assert.assertTrue(oLink.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 4)
	public static void minimize()
	{
		String expected;
		try
		{
			expected="Getting Started Shortcuts";
			WebElement oEle=oBrowser.findElement(By.xpath("//div[text()='Getting Started Shortcuts']"));
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(3000);
			String actual=oEle.getText();
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 5)
	public static void openuser()
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
	@Test(priority = 6,dataProvider="adduser")
	public static void adduser(String rj,String pw,String rp,String nm,String rp3212,String rp32121)
	{
		try
		{
			oBrowser.findElement(By.name("firstName")).sendKeys(rj);
			oBrowser.findElement(By.name("lastName")).sendKeys(pw);
			oBrowser.findElement(By.name("email")).sendKeys(rp);
			oBrowser.findElement(By.name("username")).sendKeys(nm);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys(rp32121);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(rp32121);
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
	@Test(priority = 7,dataProvider="modify")
	public static void modify(String r,String k,String ra,String ku,String b111,String b1111)
	{
		try 
		{
			oBrowser.findElement(By.name("firstName")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys(r);
			oBrowser.findElement(By.name("lastName")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys(k);
			oBrowser.findElement(By.name("email")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).sendKeys(ra);
			oBrowser.findElement(By.name("username")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).sendKeys(ku);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys(b1111);
			oBrowser.findElement(By.name("passwordCopy")).clear();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys(b1111);
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 8)
	public static void deleteuser()
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
	@Test(priority = 9)
	public static void logout()
	{
		String expected,actual;
		try
		{
			expected="actiTIME - Login";
			oBrowser.findElement(By.linkText("logout")).click();
			Thread.sleep(3000);
			actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 10)
	public static void closeapp()
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
	@DataProvider(name="adduser")
	public Object[][] getadduser()
	{
		return new Object[][] {{"a","b","c","abc@gmail.com","n","123","123"}};
	}
	@DataProvider(name="modify")
	public Object[][] getmodify()
	{
		return new Object[][] {{"p","o","i","abc@gmail.com","n","123","123"}};
	}
}






