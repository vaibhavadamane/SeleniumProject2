package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Eclipse Workplace\\Automation\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://vctcpune.com/");
		driver.close();

	}

}
