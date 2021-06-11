package caseStudy.SeleniumWebsite;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxOptions;
public class App
{
 @Test

 public static void main(String[] args) throws InterruptedException {


 System.setProperty("webdriver.gecko.driver","/home/edureka/Downloads/geckodriver");
 FirefoxOptions firefoxOptions = new FirefoxOptions();
 WebDriver driver = new FirefoxDriver(firefoxOptions);

 System.out.println("Testing User Authentication on the Login Page");


 driver.get("http://localhost:3001");

 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	/* driver.findElement(By.className("v-button")).click(); */
 driver.findElement(By.name("login")).sendKeys("devops");
 driver.findElement(By.name("password")).sendKeys("test");
 driver.findElement(By.name("click")).click();
 Thread.sleep(5000);
 driver.quit();
 }

}
