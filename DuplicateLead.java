package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	public static void main(String[]args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
String title = driver.getTitle();
System.out.println("click Login"+title);
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
String title2 = driver.getTitle();
System.out.println("leads"+title2);

driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
String title3 = driver.getTitle();
System.out.println("Find leads"+title3);

driver.findElement(By.xpath("//span[text()='Email']")).click();
String title4 = driver.getTitle();
System.out.println("click Email"+title4);

driver.findElement(By.name("emailAddress")).sendKeys("keetu@gmail.com");
					
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
Thread.sleep(2000);
String title5 = driver.getTitle();
System.out.println("click find leads"+title5);				

WebElement Leadid=driver.findElement(By.xpath("(//div[contains(text(),'Lead ID')]/following::table/tbody/tr/td[3]/div/a)[1]"));
String getleadid= Leadid.getText();
System.out.println(getleadid);
driver.findElement(By.xpath("(//div[contains(text(),'Lead ID')]/following::table/tbody/tr/td[3]/div/a)[1]")).click();

driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
Thread.sleep(4000);

driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

Thread.sleep(2000);
driver.close();



}
}