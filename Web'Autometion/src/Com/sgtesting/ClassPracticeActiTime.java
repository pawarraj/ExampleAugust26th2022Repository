package Com.sgtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassPracticeActiTime 
{
	public static WebDriver oBrowser=null;

	public static void main(String[] args) 
	{

		openbrowser();
		openfacebook();
		closepopup();
		login();
		closeapplication();
	}
	private static void openbrowser() 
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
	private static void openfacebook()
	{
		oBrowser.get("https://www.flipkart.com/?ef_id=53d571ed39aa10d0d62812beeef88993:G:s&s_kwcid=AL!739!10!76484920232331!76485137405439&semcmpid=sem_F1167BY7_Brand_adcenter");
	}
	private static void closepopup() 
	{
		oBrowser.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.linkText("Login")).click();
			oBrowser.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("9591675872");
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[5]/button")).click();
			Thread.sleep(12000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void closeapplication()
	{
		try
		{
			oBrowser.close();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
