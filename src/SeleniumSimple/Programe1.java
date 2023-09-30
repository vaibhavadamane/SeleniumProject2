package SeleniumSimple;

//we use to get,close,maximaize,quit method in selenium....

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Programe1 {

	public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.firefoxdriver().setup();
//	ChromeOptions o = new ChromeOptions();
//	o.addArguments("--remote-allow-orgins=*");
    WebDriver driver = new FirefoxDriver();
	driver.get("https://www.imdb.com/title/tt13664684/");
	Thread.sleep(5000);
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.get("https://www.facebook.com/");
	Thread.sleep(5000);
	driver.get("https://www.facebook.com/watch/?ref=tab");
	Thread.sleep(5000);
	driver.close();
	Thread.sleep(5000);
	driver.quit();
	}
		
	}

