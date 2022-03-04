package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[]args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
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
	
driver.findElement(By.xpath("//span[text()='Phone']")).click();
String title4 = driver.getTitle();
System.out.println("phone tab"+title4);

driver.findElement(By.name("phoneNumber")).sendKeys("9944899321");
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
String title5= driver.getTitle();
System.out.println("FInd Leads "+title5);	

Thread.sleep(2000);
WebElement leadid=driver.findElement(By.xpath("(//div[text()='Lead ID']/following::table/tbody/tr/td[1]/div/a)[1]"));
String getleadid= leadid.getText();
System.out.println(getleadid);

driver.findElement(By.xpath("(//div[text()='Lead ID']/following::table/tbody/tr/td[1]/div/a)[1]")).click();
driver.findElement(By.xpath("(//a[text()='Delete'])")).click();
String title7= driver.getTitle();
System.out.println(title7);

driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
Thread.sleep(1000);
driver.findElement(By.name("id")).sendKeys(getleadid);
Thread.sleep(2000);
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
Thread.sleep(2000);
driver.close();

	}
}