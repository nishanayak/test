package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://www.testandquiz.com/selenium/testing.html");
	driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
	
	//handle alert click on ok
	driver.switchTo().alert().accept(); 
	
	
    driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")).click();
    //handle alert -- click on cancle

    driver.switchTo().alert().dismiss();

    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")).click();

    //handle alert -- click on accept
    
    driver.switchTo().alert().accept();





	}

}
