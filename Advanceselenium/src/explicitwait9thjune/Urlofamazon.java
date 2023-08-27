package explicitwait9thjune;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Urlofamazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.urlContains("https://www.amazon.in/"));
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
	}
}
