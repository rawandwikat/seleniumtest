package rawan11;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.*;
import org.junit.Test;
public class test4 {
	static WebDriver driver;
	
	@Test
	public void test() {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
        
	     driver = new FirefoxDriver();

	    driver.get("http:\\www.facebook.com");


	    WebElement element1 = driver.findElement(By.id("email"));
	    element1.sendKeys("your");

	    WebElement element2 = driver.findElement(By.id("pass"));
	    element2.sendKeys("your");

	    WebElement element3 = driver.findElement(By.id("u_0_6"));
	    element3.click();

	    System.out.println("Login");
	/*	driver=new ChromeDriver();
		 System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
		driver.get("http\\facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("hyhs_70@yahoo.com");
		driver.findElement(By.xpath(".//*[@id='pass]")).sendKeys("p@ssw00rd");
		driver.findElement(By.xpath(".//*[@id='u_0_e']")).click();*/
	}

}
