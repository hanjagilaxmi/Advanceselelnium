package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urlchrome {
	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		//spevify the which browser need to be launch
		String value="./Softwares/chromedriver.exe";
		//specify path of driver
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Google.com");
	}
}
