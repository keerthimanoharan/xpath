package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Acme {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");	
driver.findElement(By.id("password")).sendKeys("leaf@12");
driver.findElement(By.xpath("//button[@type='submit']")).click();
String title= driver.getTitle();
System.out.println(title);
	
driver.findElement(By.xpath("//a[text()='Log Out']")).click();
String title1= driver.getTitle();
System.out.println(title1);

driver.close();

}
}