package rawan11;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class test {

	public static void main(String[] args) {
		//String expath = "D:\\Eclipse\\chromedriver_win32\\chromedriver.exe";

	    System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
         
	    WebDriver driver = new FirefoxDriver();

	    driver.get("http:\\www.facebook.com");


	    WebElement element1 = driver.findElement(By.id("email"));
	    element1.sendKeys("your");

	    WebElement element2 = driver.findElement(By.id("pass"));
	    element2.sendKeys("your");

	    WebElement element3 = driver.findElement(By.id("u_0_2"));
	    element3.click();

	    System.out.println("Login");




	    WebElement lstitem=driver.findElement(By.id("userNavigationLabel"));
	    lstitem.click();

	    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

	    driver.findElement(By.partialLinkText("Log Out")).click();

	    System.out.println("Log out");


	}

}






   