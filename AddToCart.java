

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart extends Login{
	
	public static void cartScenario() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//String winHandleBefore = driver.getWindowHandle();
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
		Thread.sleep(50000);
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		Thread.sleep(50000);
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		
		
		
	}

	public static void main(String[] args) {
		
		Login.setUp();
		Login.logInDetails();
		try {
			cartScenario();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Login.closeUp();
		

	}

}
