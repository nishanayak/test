package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsPoint {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		  
      String Url = "https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm";
      String name = "Nisha";
      String Lname = "Nayak";
      
      driver.get(Url);
      driver.findElement(By.name("firstname")).sendKeys(name);
      driver.findElement(By.name("lastname")).sendKeys(Lname);
      driver.findElement(By.xpath("//input[@name='sex'and @value='Female']")).click();
      driver.findElement(By.xpath("//input[@name='exp'and @value='1']")).click();
      driver.findElement(By.xpath("//input[@name='profession'and @value='Automation Tester']")).click();
      //List<WebElement> list=driver.findElements(By.xpath("//input[@type='text' ]"));
      //System.out.println("print the Size"+list.size());
      Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@name='profession'and @value='Automation Tester']")).click();
      
      WebElement upload = driver.findElement(By.xpath("//input[@name='photo']"));
      upload.click();
      upload.sendKeys("Pictures\\Nisha.jpg");
      
      //driver.close();
	}

}
