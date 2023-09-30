package PopupPrograme;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChildBrowser3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Workplace\\chromedriver_win32//chromedriver.exe");
       ChromeOptions o=new ChromeOptions();
	   o.addArguments("--remote-allow-origins=*");
	   WebDriver driver=new ChromeDriver(o);
	   driver.get("https://skpatro.github.io/demo/links/");
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
	
	   
	   Set<String> AllpageID = driver.getWindowHandles();
	  // System.out.println(AllpageID);
	   
	   // so above code will return id's of windows and to use them we need to set the order of id's by using Arraylist
	   
	   ArrayList<String>Id=new ArrayList<>(AllpageID);
       String MainWindow = Id.get(0);
	   String ChildWindow = Id.get(1);
	   Thread.sleep(2000);
	   driver.switchTo().window(ChildWindow);
	   
	   String text = driver.findElement(By.xpath("//span[text()='Watch free courses']")).getText();
	   System.out.println(text);
	   
	   
	}

}
