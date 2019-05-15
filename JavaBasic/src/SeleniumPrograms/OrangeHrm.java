package SeleniumPrograms;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://opensource-demo.orangehrmlive.com/";
        String name = "Admin";
        String pass = "admin123";	
        driver.get(url);
        driver.findElement(By.id("txtUsername")).sendKeys(name);
        driver.findElement(By.id("txtPassword")).sendKeys(pass);
        driver.findElement(By.id("btnLogin")).click();
        //click on the link admin
        driver.findElement(By.className("firstLevelMenu")).click();
        
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        String expectedTitle = "OrangeHRM";
        assertEquals(actualTitle, expectedTitle);
        //assertEquals(expectedTitle,actualTitle);
        
        driver.navigate().back();
       
      //click on the link PIM
       driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
       String  Results= driver.getTitle();
       System.out.println(Results);
       driver.navigate().back();
       
     //Click on Directory page
       String SearchName="AbhiNisha";
       driver.findElement(By.xpath("//b[contains(text(),'Directory')]")).click();
       driver.findElement(By.name("searchDirectory[emp_name][empName]")).sendKeys(SearchName);
       driver.findElement(By.id("searchBtn")).click();
       
       String expectedText ="No Records Found";
       Assert.assertEquals("No Records Found",expectedText);
       System.out.println(expectedText);
       
     //click on the link PIM
       driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
       driver.findElement(By.id("menu_pim_addEmployee")).click();
       
     //Add emp
       driver.findElement(By.xpath("//input[@class='formInputText' and @name='firstName']")).sendKeys("krishna");
       
       driver.findElement(By.xpath("//input[@class='formInputText' and @name='lastName']")).sendKeys("Nayak");
       
       driver.findElement(By.xpath("//input[@class='formInputText' and @name='employeeId']")).sendKeys("2073");
       
    WebElement upload =  driver.findElement(By.xpath("//input[@class='duplexBox' and @name='photofile']"));
       upload.click();
       Thread.sleep(2000);
       Runtime.getRuntime().exec("D:\\AutoitScripts\\AutoItFileupload1.exe");
       
       driver.findElement(By.id("btnSave")).click();
       
       
       String detailsTitle = driver.getTitle();
       System.out.println(detailsTitle);
       
       driver.navigate().refresh();
       
       Thread.sleep(200);
       
       String findname ="krishna Nayak";
       
       driver.findElement(By.xpath("//b[contains(text(),'Directory')]")).click();
       
       driver.findElement(By.name("searchDirectory[emp_name][empName]")).sendKeys(findname);
       Thread.sleep(200);
       driver.findElement(By.id("searchBtn")).click();
       
//       String actualTitle = driver.getTitle();
//       System.out.println(actualTitle);
//       String expectedTitle = "OrangeHRM";
//       assertEquals(actualTitle, expectedTitle);
       
       String expectedText1 ="Krishna Nayak";
       Assert.assertEquals("Krishna Nayak",expectedText);
       System.out.println(expectedText1);
       
       
       //driver.close();

	}

}
