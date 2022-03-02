package week2.day2;
 
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get(" https://en-gb.facebook.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
String title = driver.getTitle();
System.out.println(title);
driver.findElement(By.name("firstname")).sendKeys("keerthi");
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("manoharan");
driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9955844321");
driver.findElement(By.xpath("(//input[@type='password'])[2]"));

WebElement date = driver.findElement(By.xpath("//select[@name='birthday_day']"));
Select birth=new Select(date);
birth.selectByIndex(25);

WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
Select king=new Select(month);
king.selectByVisibleText("Aug");						

WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
Select queen=new Select(year);
queen.selectByValue("1996");						

driver.findElement(By.xpath("//label[text()='Female']")).click();
String title1 = driver.getTitle();
System.out.println(title1);

}
}