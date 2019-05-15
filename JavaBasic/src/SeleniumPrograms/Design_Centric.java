package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Design_Centric {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String url = "http://concept-board-dev.centricsoftware.com/";
        String username = "Administrator ";
        String passw = "C8PLMAdmin";
        driver.get(url);
        driver.findElement(By.xpath("//input[@placeholder='Enter Username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys(passw);
        driver.findElement(By.xpath("//span[text()='LOGIN']")).click();
        
        //Select season
       driver.findElement(By.xpath("//div[text()='Select Season']")).click();
       driver.findElement(By.xpath("//li[@data-value='cjtziw2t8014g0843bbctrc9j']")).click();
       
       //select cat1
       Thread.sleep(2000);
       driver.findElement(By.xpath("//div[text()='Select Category1']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//li[@data-value='cjtziw4v801ul0843jw38bg4o']")).click();
       
       //select cat2
       Thread.sleep(2000);
       driver.findElement(By.xpath("//div[text()='Select Category2']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//li[@data-value='cjtziw9v904xa0843z7yyup5x']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//span[text()='Get Started']")).click();
      String title = driver.getTitle();
      System.out.println(title);
      driver.close();
      
	}

}
