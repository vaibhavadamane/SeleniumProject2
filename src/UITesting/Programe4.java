package UITesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Programe4 {
	
	//Hadndle the prise slider on makmytrip application

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions o = new ChromeOptions();
		o.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(o);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement popup = driver.findElement(By.xpath("//span[@class='ic_circularclose_grey']"));
		popup.click();
		WebElement search = driver.findElement(By.xpath("//a[text()='Search']"));
		search.click();
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
		WebElement popup2 = driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']"));
		popup2.click();
		WebElement slider = driver.findElement(By.xpath("//div[@class='rangeslider__handle']"));
		
		//intial position of the slider is 13,600
		Point location = slider.getRect().getPoint();
		Dimension dimension = slider.getRect().getDimension();
		System.out.println("Loacation = " + location + " " +  "Dimension = " + dimension);
		
		//Move to slider from 13,600 to 6,600
		Actions a = new Actions(driver);
		a.dragAndDropBy(slider, -200,0).build().perform();
        //After sliding the postion of the bar will be change
        Point newlocation = slider.getRect().getPoint();
        System.out.println("Positon of the slider after moving the slidbar = " + newlocation);
        //Test Case whthere the slider is work or not 
//        String priseFilter = driver.findElement(By.xpath("//li[text()='₹5,235 - ₹6,600']")).getText();
//        System.out.println(priseFilter);
        Thread.sleep(5000);
        driver.close();
		
	}

}
