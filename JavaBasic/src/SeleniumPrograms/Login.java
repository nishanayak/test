package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "http://newtours.demoaut.com/";
        String name = "Nisha";
        String pass = "Nawner@1212";
        
        driver.get(url);
        
        WebElement username = driver.findElement(By.name("userName"));
        username.clear();
        username.sendKeys(name);
        WebElement passw= driver.findElement(By.xpath("//input[@name='password']"));
        username.clear();
        passw.sendKeys(pass);
        driver.findElement(By.name("login")).click();
        
        driver.findElement(By.partialLinkText("REGIS")).click();
        
       driver.close();

	}

}
