//package SeleniumPrograms;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Action;
//import org.openqa.selenium.interactions.Actions;
//
//public class DragAndDrop {
//
//	public static void main(String[] args) throws InterruptedException
//	{
//		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//		String url ="https://www.seleniumeasy.com/test/drag-and-drop-demo.html";
//		driver.get(url);
//		//driver.findElement(By.linkText("Others")).click();
//		 
//		WebElement from1 = driver.findElement(By.xpath("//span[text()='Draggable 1']"));
//		
//		WebElement to1 = driver.findElement(By.id("mydropzone"));
//		
//		//Actions action = new Actions(driver);
//		
//		//action.dragAndDrop(from1, to1).build().perform();
//		
//		Actions builder = new Actions(driver);
//
//		Actions dragAndDrop = builder.clickAndHold(from1);
//				Thread.sleep(2000);
//				dragAndDrop.moveToElement(to1)
//		   .release(to1)
//		   .build();
//
//		dragAndDrop.perform();
//		
//		
//		
//
//	}
//
//}

