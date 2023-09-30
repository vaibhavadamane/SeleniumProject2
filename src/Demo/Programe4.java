package Demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Programe4
{
public static void main(String[] args) throws Exception 
{
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    
//    Iframe
//    driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width_css");
//    driver.manage().window().maximize();
//    WebElement frame = driver.findElement(By.xpath("//iframe[@name='iframeResult']"));
//    driver.switchTo().frame(frame);
//    try {
//    WebElement sent = driver.findElement(By.xpath("//p[text()='You can also use the CSS height and width properties to specify the size of the iframe:']"));
//    String text = sent.getText();
//    System.out.println(text);
//    }
//    catch(Exception e)
//    {
//    	System.out.println(e);
//    }
    
//    Alert Poppup
//      driver.get("https://demo.automationtesting.in/Alerts.html");
//      driver.manage().window().maximize();
//      WebElement alert1 = driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]"));
//      alert1.click();
//      WebElement button = driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')]"));
//      button.click();
//      driver.switchTo().alert().sendKeys("I Am Don");
//      driver.switchTo().alert().dismiss();
    
//    Child Browser
    
//    driver.get("https://skpatro.github.io/demo/links/");
//    driver.manage().window().maximize();
//    WebElement button = driver.findElement(By.xpath("//input[@name='NewWindow']"));
//    button.click();
//    Set<String> windows = driver.getWindowHandles();
//    Iterator<String> itr = windows.iterator();
//    String str[] = new String[2];
//    for(int i=0;i<windows.size();i++)
//    {
//    	str[i]=itr.next();
//    }
//   for(String value:str)
//   {
//	   System.out.println(value);
//   }
//    driver.switchTo().window(str[1]);
//    driver.manage().window().maximize();
//    Thread.sleep(5000);
//    WebElement img = driver.findElement(By.xpath("//img[@decoding='async']"));
//    System.out.println(img.isDisplayed());
//    driver.close();
//    
//    driver.switchTo().window(str[0]);
//    Thread.sleep(5000);
//    driver.close();
    
//    File upload
//     driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
//     driver.manage().window().maximize();
//    WebElement tab = driver.findElement(By.xpath("//input[@name='note']"));
//    WebElement button = driver.findElement(By.xpath("//input[@value='Press']"));
//    tab.sendKeys("C:\\Users\\hp\\OneDrive\\Desktop\\Vaibhav Resumes");
//    button.click();
//    Thread.sleep(5000);
//    driver.close();
//    
    
    
    
    
    
    
    
    
    
}
}
