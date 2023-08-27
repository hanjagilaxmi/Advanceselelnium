package dd26thmay;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountofnofoptionFB {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		WebElement ele = driver.findElement(By.id("month"));
		Select s=new Select(ele);
		List<WebElement> op = s.getOptions();
		int count=op.size();
		System.out.println(count);
		driver.close();
	}
}
