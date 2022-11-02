package TestQuetions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart 
{
	public static WebDriver oBrowser=null;

	public static void main(String[] args) 

	{
		launchBrowser();
		navigate();
		loginUsernamep();

	}
	private static void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\ExampleAtomation\\Automation\\Web'Autometion\\Library\\drivers\\chromedriver.exe");
		oBrowser =new ChromeDriver();

	}
	private static void navigate()
	{

		try 
		{
			oBrowser.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	private static void loginUsernamep()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
			oBrowser.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.className("oxd-userdropdown-name")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[1]/a")).click();
			Thread.sleep(5000);
			String a=oBrowser.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-about-title']")).getText();
			String a1=oBrowser.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/p")).getText();
			System.out.println(a+a1);




		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}


