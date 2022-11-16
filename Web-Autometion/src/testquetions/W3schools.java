package testquetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3schools 
{
	public static WebDriver oBrowser=null;
	

	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		noofLinks();

	}
		private static void launchBrowser()
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
		private static void navigate()
		{
			oBrowser.get("https://www.w3schools.com/");
		}
		private static void noofLinks()
		{
			try
			{
			oBrowser.findElement(By.id("navbtn_tutorials")).click();
			Thread.sleep(3000);
			List<WebElement> oele=oBrowser.findElements(By.xpath("//a[@class]"));
			System.out.println(oele.size());
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}


