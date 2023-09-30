package UITesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Programe3 
{
public static void main(String[] args) throws Exception
{
//     Handle the slider
	
	WebDriverManager.chromedriver().setup();
	ChromeOptions o = new ChromeOptions();
	o.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(o);
	driver.manage().window().maximize();
	driver.get("https://www.globalsqa.com/demo-site/sliders/");
	WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	driver.switchTo().frame(frame);
	
//	Handle the redslider
	WebElement redslider = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
//	To get intial postion of the redslider
	Point location = redslider.getRect().getPoint();
	System.out.println(location);
    Actions act = new Actions(driver);
    Thread.sleep(5000);
    act.dragAndDropBy(redslider, -100,0).build().perform();
//  Postion of the redslider after sliding
    Point aftersilding = redslider.getLocation();
    System.out.println(aftersilding);
	
	

	Thread.sleep(5000);
	driver.close();
}
}
