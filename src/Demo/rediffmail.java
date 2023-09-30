package Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rediffmail {
	
	public static String readexcel(int row,int col) throws Exception
	{
		FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\TestCase\\Demo.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = excel.getRow(row).getCell(col).getStringCellValue();
		return value;
	}

	public static void main(String[] args) throws Exception 
	{
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver = new ChromeDriver();
	   
//	   Parameteraiation	
//	   FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\TestCase\\TestCase2.xlsx");
//	   Sheet excel = WorkbookFactory.create(file).getSheet("Sheet3");
//	   for(int i=0;i<=excel.getLastRowNum();i++)
//	   {
//		   for(int j=0;j<excel.getRow(i).getLastCellNum();j++)
//		   {
//			   String value = excel.getRow(i).getCell(j).getStringCellValue();
//			   System.out.print(value + "\t");
//		   }
//		   System.out.println();
//	   }
	   
	   driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	   WebElement fullname = driver.findElement(By.xpath("//input[@maxlength='61']"));
	   WebElement redimail = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	   WebElement password = driver.findElement(By.xpath("//input[contains(@name,'passwd')]"));
	   WebElement repassword = driver.findElement(By.xpath("(//input[contains(@name,'passwd')])[2]"));
	   fullname.sendKeys(readexcel(0,0));
	   redimail.sendKeys(readexcel(1,0));
	   password.sendKeys(readexcel(2,0));
	   repassword.sendKeys(readexcel(3,0));
	   
	   
	   
       Thread.sleep(5000);
	   driver.close();
	   

}
}