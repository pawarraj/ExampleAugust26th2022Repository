package excelreflection;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign3 
{
	public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{

		launchbrowser();
		navigate();
		login();
		minimize();
		CreateUser1();
		CreateUser2();
		CreateUser3();
		logout();
		login1();
		logout1();
		login2();
		logout2();
		login3();
		logout3();
		login11();
		logout11();
		login22();
		logout22();
		login33();
		logout33();
		login111();
		logout111();
		login222();
		logout222();
		login333();
		logout333();
		loginadmin();
		CreateUser11();
		logoutadmin();
		login1111();
		logout1111();
		login2222();
		logout2222();
		login3333();
		logout3333();
		loginadmin1();
		CreateUser111();
		CreateUser222();
		CreateUser333();
		logoutadmin1();
		closeapp();
	}
	private static void launchbrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\\\ExampleAtomation\\\\Automation\\\\Web'Autometion\\\\Library\\\\drivers\\\\chromedriver.exe");
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
			oBrowser.get("http://localhost/user/submit_tt.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
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
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void CreateUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Rakesh");
			oBrowser.findElement(By.name("middleName")).sendKeys("Anu");
			oBrowser.findElement(By.name("lastName")).sendKeys("anurakesh");
			oBrowser.findElement(By.name("email")).sendKeys("rakeshm9628@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("rakesh");
			oBrowser.findElement(By.name("password")).sendKeys("raki123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("raki123");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void CreateUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Guru");
			oBrowser.findElement(By.name("middleName")).sendKeys("B");
			oBrowser.findElement(By.name("lastName")).sendKeys("Raj");
			oBrowser.findElement(By.name("email")).sendKeys("gururaj@123");
			oBrowser.findElement(By.name("username")).sendKeys("guruyo");
			oBrowser.findElement(By.name("password")).sendKeys("1234");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("1234");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void CreateUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Raki");
			oBrowser.findElement(By.name("middleName")).sendKeys("M");
			oBrowser.findElement(By.name("lastName")).sendKeys("Muthu");
			oBrowser.findElement(By.name("email")).sendKeys("muthu@123");
			oBrowser.findElement(By.name("username")).sendKeys("MuthuRaki");
			oBrowser.findElement(By.name("password")).sendKeys("5678");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("5678");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void login1()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("Sadain");
			oBrowser.findElement(By.name("pwd")).sendKeys("vendesh123");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"SubmitTTButton\"]")).click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout1()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login2()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("guruyo");
			oBrowser.findElement(By.name("pwd")).sendKeys("1234");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"SubmitTTButton\"]")).click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout2()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void login3()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("MuthuRaki");
			oBrowser.findElement(By.name("pwd")).sendKeys("5678");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"SubmitTTButton\"]")).click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout3()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void login11()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("Sadain");
			oBrowser.findElement(By.name("pwd")).sendKeys("Sachin123");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[6]/table/tbody/tr/td[2]/div/table/tbody/tr[1]/td[1]/a")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userProfilePopup_changePassword\"]/div[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userProfilePopup_oldPasswordField\"]")).sendKeys("Sachin123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userProfilePopup_passwordField\"]")).sendKeys("2587");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userProfilePopup_passwordCopyField\"]")).sendKeys("2587");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userProfilePopup_commitBtn\"]")).click();
			Thread.sleep(1000); 


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout11()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		} 
	}
	private static void login22()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("guruyo");
			oBrowser.findElement(By.name("pwd")).sendKeys("1234");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[6]/table/tbody/tr/td[2]/div/table/tbody/tr[1]/td[1]/a")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userProfilePopup_changePassword\"]/div[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userProfilePopup_oldPasswordField\"]")).sendKeys("1234");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userProfilePopup_passwordField\"]")).sendKeys("4321");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userProfilePopup_passwordCopyField\"]")).sendKeys("4321");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userProfilePopup_commitBtn\"]")).click();
			Thread.sleep(1000); 
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void logout22()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		} 
	}
	private static void login33()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("MuthuRaki");
			oBrowser.findElement(By.name("pwd")).sendKeys("5678");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[6]/table/tbody/tr/td[2]/div/table/tbody/tr[1]/td[1]/a")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userProfilePopup_changePassword\"]/div[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userProfilePopup_oldPasswordField\"]")).sendKeys("5678");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userProfilePopup_passwordField\"]")).sendKeys("8765");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userProfilePopup_passwordCopyField\"]")).sendKeys("8765");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userProfilePopup_commitBtn\"]")).click();
			Thread.sleep(1000); 
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout33()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		} 
	}
	private static void login111()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("Sadain");
			oBrowser.findElement(By.name("pwd")).sendKeys("2587");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout111()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login222()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("guruyo");
			oBrowser.findElement(By.name("pwd")).sendKeys("4321");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout222()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login333()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("MuthuRaki");
			oBrowser.findElement(By.name("pwd")).sendKeys("8765");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout333()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginadmin()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void CreateUser11()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_passwordField\"]")).sendKeys("1111");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_passwordCopyField\"]")).sendKeys("1111");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(3000);

			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_passwordField\"]")).sendKeys("2222");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_passwordCopyField\"]")).sendKeys("2222");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(3000);

			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_passwordField\"]")).sendKeys("3333");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_passwordCopyField\"]")).sendKeys("3333");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutadmin()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void login1111()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("Sadain");
			oBrowser.findElement(By.name("pwd")).sendKeys("1111");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout1111()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login2222()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("MuthuRaki");
			oBrowser.findElement(By.name("pwd")).sendKeys("2222");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout2222()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login3333()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("guruyo");
			oBrowser.findElement(By.name("pwd")).sendKeys("3333");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout3333()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginadmin1()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void CreateUser111()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(3000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void CreateUser222()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(3000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void CreateUser333()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(3000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void logoutadmin1()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
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






