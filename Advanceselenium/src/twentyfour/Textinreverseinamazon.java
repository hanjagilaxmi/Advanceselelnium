package twentyfour;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textinreverseinamazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		int count=links.size();
		System.out.println(count);
		for(int i=count-1;i>=0;i--)
		{
			WebElement w=links.get(i);
			String t=w.getText();
			System.out.println(t);
		}
		driver.close();
	}
}
