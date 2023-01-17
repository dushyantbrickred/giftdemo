

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {
	
	public static void setUp() {
		
		//Setup Window
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gift\\Downloads\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		//Maximise Window
		driver.manage().window().maximize();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	//Login page details
	public static void logInDetails() {
		WebDriver driver = new ChromeDriver();
		WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
		userName.click();
		userName.sendKeys("problem_user");
		WebElement userPassword = driver.findElement(By.xpath("//input[@id='password']"));
		userPassword.click();
		userPassword.sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		System.out.println("Login clicked");
		
	}
	
	//Closes Browser
	public static void closeUp() {
		WebDriver driver = new ChromeDriver();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
		driver.quit();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setUp();
		logInDetails();
		closeUp();
		
		
		
		
		
	
		
		
	}

}
