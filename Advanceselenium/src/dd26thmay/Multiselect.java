package dd26thmay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/deepa/OneDrive/Desktop/QSP/HTML/dd.html");
		WebElement ele = driver.findElement(By.id("Vegeteria"));
		Select s=new Select(ele);
		boolean b=s.isMultiple();
		if(b)
		{
			System.out.println("multi select dd");
		}
		else
		{
			System.out.println("not multi select");
		}
		driver.close();
	}
}
