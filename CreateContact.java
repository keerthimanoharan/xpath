package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().fullscreen();
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
String title = driver.getTitle();
System.out.println(title);

driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
String title1 = driver.getTitle();
System.out.println(title1);

driver.findElement(By.xpath("//a[text()='Contacts']")).click();
String title2 = driver.getTitle();
System.out.println(title2);

driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
String title3 = driver.getTitle();
System.out.println(title3);

driver.findElement(By.id("firstNameField")).sendKeys("Keerthi");
driver.findElement(By.id("lastNameField")).sendKeys("manoharan");
driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("kee");
driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("mano");
driver.findElement(By.id("createContactForm_departmentName")).sendKeys("EEE");
driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("interested in testing");

driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("keetu@gmail.com");
WebElement stateProvince=driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
Select state=new Select(stateProvince);
state.selectByVisibleText("New York");

driver.findElement(By.xpath("//input[@name='submitButton']")).click();
String title4 = driver.getTitle();
System.out.println(title4);
driver.findElement(By.xpath("//a[text()='Edit']")).click();
String title5 = driver.getTitle();
System.out.println(title5);

WebElement Description=driver.findElement(By.name("description"));
Description.clear();
driver.findElement(By.name("importantNote")).sendKeys("testingshould b done automated");
driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
String title6 = driver.getTitle();
System.out.println(title6);
}
}
