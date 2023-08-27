package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Emptychrome {
	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		//spevify the which browser need to be launch
		String value="./Softwares/chromedriver.exe";
		//specify path of driver
		System.setProperty(key, value);
		ChromeDriver driver=new ChromeDriver();
	
	}

}
