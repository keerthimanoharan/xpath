package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[]args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		String title3 = driver.getTitle();
		System.out.println(title3);
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("keerthi");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String title4 = driver.getTitle();
		System.out.println(title4);
		

WebElement Leadid=driver.findElement(By.xpath("(//div[contains(text(),'Lead ID')]/following::table/tbody/tr/td[3]/div/a)[1]"));
String getleadid= Leadid.getText();
System.out.println(getleadid);
Thread.sleep(2000);
driver.findElement(By.xpath("(//div[contains(text(),'Lead ID')]/following::table/tbody/tr/td[3]/div/a)[1]")).click();
		
driver.findElement(By.xpath("//a[text()='Edit']")).click();
driver.findElement(By.id("updateLeadForm_companyName")).clear();

driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Institute");
driver.findElement(By.className("smallSubmit")).click();
Thread.sleep(2000);
		
driver.close();		
		
	}
}
