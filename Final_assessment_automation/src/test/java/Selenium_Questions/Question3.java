package Selenium_Questions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question3 {
	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	try {
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.nopcommerce.com/en/"); 
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	WebElement userIcon = driver.findElement(By.xpath("(//ul[@class='navigation-top-menu navigation-top-menu-user-actions'])/li[3]"));
	WebElement registerLink = driver.findElement(By.xpath("((//ul[@class='navigation-top-menu-sublist'])[6]/li)[2]"));
	
	Actions action = new Actions(driver);
	
	action.moveToElement(userIcon); 
	Thread.sleep(3000);
	action.click(registerLink).build().perform(); 
	Thread.sleep(3000);
	}
	catch (Exception ex) 
	{
		
		ex.printStackTrace();
	}

	
	}
}
