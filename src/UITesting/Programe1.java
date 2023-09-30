package UITesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Programe1

//Write a programe which is identify the color of the element 

{
public static void main(String[] args) throws Exception 
{
    WebDriverManager.chromedriver().setup();
	ChromeOptions o = new ChromeOptions();
	o.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(o);
	driver.get("https://www.facebook.com/");
	
//	identify the color of the facebook name
	WebElement logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
	String color = logo.getCssValue("color");
	System.out.println("color of the facebook logo = " + color);
	String hexValue = Color.fromString(color).asHex();
	System.out.println("HexValue of facebook = " +hexValue);
	
//	so here we get the original hex value of the element form developer and put condition to verify the color of the element
	String orignalhexvalue = "#1c1e21";
	if(hexValue.equals(orignalhexvalue))
	{
		System.out.println("The color verification of facebook element is Passed");
	}
	else
	{
		System.out.println("The color verification of facebook element is Failed");
	}
	
//	we can check the color of the "login button" button
	WebElement button = driver.findElement(By.xpath("//button[@name='login']"));
	String rgbavalue = button.getCssValue("background-color");
	System.out.println("color of the button = " + rgbavalue);
	String hexValue1 = Color.fromString(rgbavalue).asHex();
	System.out.println("HexValue of the button = " + hexValue1);
	
//	so here we get the original hex value of the element form developer and put condition to verify the color of the element
	String originalhexvalue = "#1877f2";
	if(hexValue1.equals(originalhexvalue))
	{
		System.out.println("The color verification of button element is Passed");
	}
	else
	{
		System.out.println("The color verification of button element is Failed");
	}
	
	Thread.sleep(5000);
	driver.close();
	
}
}
