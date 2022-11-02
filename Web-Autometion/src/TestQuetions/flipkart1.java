package TestQuetions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart1 
{
	public static WebDriver oBrowser=null;

	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		Flipkart();

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
		oBrowser.get("https://www.flipkart.com/");
		Thread.sleep(2000);
	} catch (Exception e)
		{
		e.printStackTrace();
		}
	}
	private static void Flipkart()
	{
		try
		{
			oBrowser.findElement(By.xpath("//button[text()='✕']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/div[1]/a/div[1]/div/img")).click();
			Thread.sleep(2000);
			WebElement oEle=oBrowser.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/span[3]"));
			Thread.sleep(2000);
			Actions o=new Actions(oBrowser);
			o.moveToElement(oEle).build().perform();
			Thread.sleep(2000);
			oBrowser.findElement(By.linkText("Formal Shirts")).click();
			Thread.sleep(2000);
			String a=oBrowser.findElement(By.xpath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[1]/div/div/h1")).getText();
			System.out.println(a);
			/*WebElement oEle=oBrowser.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/span[3]"));
			Actions mouse=new Actions(oBrowser);
			omouse.moveToElement(oEle).build().perform();
			oBrowser.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div/div[2]/a[4]")).click();
			Thread.sleep(2000);*/
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}



