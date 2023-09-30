package UITesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Programe2 
{

//	identify the size and postion of the element on webpage
	
	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions o = new ChromeOptions();
		o.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(o);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		
//		Identify the postion of the log in button
//	    Point location = login.getLocation();
//	    System.out.println(location);
//	    int locationx = login.getLocation().x;
//	    System.out.println(locationx);
//	    int locationy = login.getLocation().getY();
//	    System.out.println(locationy);
	    
//	    identify the size of the login button
//	    Dimension size = login.getSize();
//	    System.out.println(size);
//	    System.out.println("Height of the login button element = " +size.getHeight());
//	    System.out.println("Width of the login button element = " +size.getWidth());
		
//		Here we have one method which can get the both size as well as location of the element
		Rectangle locationsize = login.getRect();
		System.out.println(locationsize.getPoint());
		System.out.println(locationsize.getDimension());
		System.out.println("X Value of element = " + locationsize.getX());
		System.out.println("Y Value of element = " + locationsize.getY());
		System.out.println("Height of the element = " + locationsize.getHeight());
		System.out.println("Width of the element = " +locationsize.width);
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
