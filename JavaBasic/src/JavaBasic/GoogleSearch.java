package JavaBasic;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("python");
        
        List<WebElement> list= driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::span[text()='python']"));
    
        
       
	}

}
