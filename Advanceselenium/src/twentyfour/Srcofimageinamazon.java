package twentyfour;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Srcofimageinamazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		List<WebElement> links=driver.findElements(By.xpath("//img"));
		int count=links.size();
		System.out.println(count);
		for(WebElement a:links)
		{
			String b=a.getAttribute("src");
			System.out.println(b);
		}
		driver.close();
	}
}
