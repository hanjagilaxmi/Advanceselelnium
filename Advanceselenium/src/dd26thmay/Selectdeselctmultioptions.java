package dd26thmay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectdeselctmultioptions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/deepa/OneDrive/Desktop/QSP/HTML/dd.html");
		WebElement ele = driver.findElement(By.id("Vegeteria"));
		Select s=new Select(ele);
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByValue("c");
		Thread.sleep(1000);
		s.selectByVisibleText("Kunda");
		Thread.sleep(1000);
		s.deselectAll();
		driver.close();
	}
	
}
