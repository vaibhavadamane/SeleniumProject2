package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Programe5 {

	public static void main(String[] args) throws Exception 
	{
		
//	Multiple Webelement
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.infosys.com/");
		List<WebElement> links = driver.findElements(By.xpath("//a[contains(text(),'Infosys')]"));
		for(int i=0;i<links.size();i++)
		{
//			System.out.println(links.get(i).getText());
			String actual = links.get(i).getText();
			String excpted = "Infosys Science Foundation";
			if(actual.equals(excpted))
			{
				links.get(i).click();
				break;
			}
		}
		
		Thread.sleep(5000);
		driver.close();

	}

}
