package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTaps {
public static void main(String[] args) throws Exception {
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//input[@class='inputLogin'])[1]")).sendKeys("demosalesmanager");
	driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
	driver.findElement(By.xpath("(//input[@class='decorativeSubmit'])")).click();
	String title = driver.getTitle();
	System.out.println(title);
	driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();

	driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
	String title2 = driver.getTitle();
	System.out.println(title2);
	
	driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	String title3 = driver.getTitle();
	System.out.println(title3);
	
	driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("keerthana");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	String title4 = driver.getTitle();
	System.out.println(title4);
	
	Thread.sleep(3000);

	driver.findElement(By.xpath("//div[text()='Lead ID']/following::table[1]/tbody/tr/td[1]/div/a[text()='16551']")).click();
	String title5 = driver.getTitle();
	System.out.println(title5);
}
}
