package twentytwomay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementenabled {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/deepa/OneDrive/Desktop/QSP/HTML/elementenables.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("a1"));
		boolean b=ele.isEnabled();
		if(b)
		{
			System.out.println("Element Enabled");	
		}
		else
		{
			System.out.println("Element Disabled");	
		}
		driver.close();
	}
}
