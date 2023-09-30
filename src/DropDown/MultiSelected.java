package DropDown;
import java.util.List;

import org.openqa.selenium.By;
// Multiselective Drop Down 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//Handling the MultiSeledted box....

public class MultiSelected {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	    
	    driver.switchTo().frame("iframeResult");
	    WebElement carDropdown = driver.findElement(By.xpath("//select[@name='cars']"));
	    Select s = new Select(carDropdown);
	    
	    //Selected Method
	    s.selectByVisibleText("Volvo");
	    Thread.sleep(2000);
	    s.selectByVisibleText("Saab");
	    Thread.sleep(2000);
	    s.selectByVisibleText("Audi");
	    Thread.sleep(2000);
	   // s.selectByVisibleText("Opel");
	    
	    System.out.println("Is Car drop down is Multi selectiable = " +s.isMultiple());//true
	    
	    List<WebElement> allSelectedOPtions = s.getAllSelectedOptions();
	    
	    System.out.println("Total Options = " +allSelectedOPtions.size() );
	    
	    System.out.println("All Selected Option");
	    
	    for(int i=0;i<allSelectedOPtions.size();i++)
	    {
	    	System.out.println(allSelectedOPtions.get(i).getText());
	    }
	    
	  //Deselected Method
	    s.deselectByVisibleText("Saab");
	    Thread.sleep(2000);
	    s.deselectByValue("volvo");
	    Thread.sleep(2000);
	   // s.deselectByValue("audi");
//	    s.deselectAll();
	    
	    WebElement firstElement = s.getFirstSelectedOption();
	    System.out.println("First Element = " + firstElement.getText());
	    
	    Thread.sleep(3000);
	    driver.close();
	    
	}

}
