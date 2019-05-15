package SeleniumPrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class RegisterMercuryPage {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String url = "http://newtours.demoaut.com/";
        String name = "Nisha";
        String pass = "Nawner@1212";
        driver.get(url);
//        WebElement username = driver.findElement(By.name("userName"));
//        username.clear();
//        username.sendKeys(name);
//        WebElement passw= driver.findElement(By.xpath("//input[@name='password']"));
//        username.clear();
//        passw.sendKeys(pass);
//        driver.findElement(By.name("login")).click();
        
        WebElement web=driver.findElement(By.partialLinkText("REGIS"));
        web.click();
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Nisha");
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Nayak");
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("nis@gmail.com");
        driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Warje");
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Pune");
        driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Maharastra");
        driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("672819");
        //Drop-Down
        
        String[] exp = {"ALBANIA","ALGERIA","AMERICAN SAMOA","ANDORRA ","ANGOLA","ANGUILLA","ANTARCTICA","ANTIGUA AND BARBUDA","ARGENTINA","ARMENIA"};
         WebElement  drpdown = driver.findElement(By.name("country"));
         Select select = new Select(drpdown);  
         List<WebElement> options = select.getOptions();
        
        //drpdown.selectByVisibleText("INDIA");
         //loop:
         for(WebElement we:options)  
         {  
          for (int i=0; i<exp.length; i++){
              if (we.getText().equals(exp[i])){
              System.out.println("Matched");
             } 
        
      // ((Select) drpdown).selectByIndex(12);
       driver.findElement(By.xpath("//input[@name='email']")).sendKeys("nishan");
       driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Nawner@123");
       driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Nawner@123");
       driver.findElement(By.xpath("//input[@name='register']")).click();
       String title=driver.getTitle();
        System.out.println(title);
       driver.close();
        

          }
         }
	}
}


