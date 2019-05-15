package SeleniumPrograms;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearch {

	public static void main(String[] args) throws InterruptedException {
	


		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				
				driver.get("https://www.google.com/");
				driver.manage().window().maximize();
				driver.findElement(By.name("q")).sendKeys("java");
				Thread.sleep(200);
				//List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
             List<WebElement> list = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
			//	 List<WebElement> list = driver.findElements(By.xpath("//b"));
					
				System.out.println("size of list"+list.size());
				
				  for(int i=0;i<list.size()-1;i++)
			        {
			        System.out.println(list.get(i).getText());
			        
					if(list.get(i).getText().contains("javascript"))
			        {list.get(i).click();
			        //Thread.sleep(2000);
			        break;
			        }
			        
			        }
			

			        driver.close();

	

	}
}



