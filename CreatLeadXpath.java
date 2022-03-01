package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatLeadXpath {

	public static void main(String[]args)
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

driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Keerthi");
driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Mano");
driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("keerthana");
driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("EEE");
driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("interested in testing");
driver.findElement(By.xpath("//input[@name='primaryEmail']")).sendKeys("keetu@gmail.com");

WebElement stateProvince=driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
Select state=new Select(stateProvince);
state.selectByVisibleText("New York");

driver.findElement(By.xpath("//input[@name='submitButton']")).click();
String title3 = driver.getTitle();
System.out.println(title3);
	}
}
