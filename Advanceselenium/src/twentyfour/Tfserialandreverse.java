package twentyfour;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tfserialandreverse {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/deepa/OneDrive/Desktop/QSP/HTML/TFforeach.html");
		Thread.sleep(2000);
		List<WebElement> links=driver.findElements(By.xpath("//input"));
		int count=links.size();
		System.out.println(count);
		for(WebElement a:links)
		{
			a.sendKeys("LAXMI");	
		}
		Thread.sleep(2000);
		for(int i=count-1;i>=0;i--)
		{
			WebElement w1=links.get(i);
			w1.clear();
		}
		driver.close();
	}
}
