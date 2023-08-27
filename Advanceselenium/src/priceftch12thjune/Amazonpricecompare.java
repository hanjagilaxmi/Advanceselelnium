package priceftch12thjune;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonpricecompare 
{
	public static void main(String[] args)throws NumberFormatException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mi note 10");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement p1 = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div[1]/a/span/span[2]/span[2]"));
		String s = p1.getText();
		String a=s.replace(",","");
	    WebElement p2 = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div[2]/div/div/div[2]/div[1]/div/div[1]/div/a/span/span[2]/span[2]"));
	    String ss = p2.getText();
	    String b=ss.replace(",","");
	    int c=Integer.parseInt(a);
	    int d=Integer.parseInt(b);
	    if(c<d)
	    {
	    	driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div[1]/a/span/span[2]/span[2]")).click();
	    	System.out.println(c);
	    }
	    else if(c>d)
	    {
	    	driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div[2]/div/div/div[2]/div[1]/div/div[1]/div/a/span/span[2]/span[2]")).click();
	    	System.out.println(d);
	    }
	    driver.quit();
	}
}
