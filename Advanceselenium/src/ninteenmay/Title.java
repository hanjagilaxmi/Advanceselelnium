package ninteenmay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Facebook – log in or sign up"))
		{
			System.out.println("matching");
		}
		else
		{
			System.out.println("not matching");
		}
	}

}
