package Selenium_Questions;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question4 {

		public static void main(String[] args) {
			try{
			
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.nopcommerce.com/en");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement usericon =driver.findElement(By.xpath("((//ul[@class = 'navigation-top-menu navigation-top-menu-user-actions'])/li)[3]"));
		WebElement register=driver.findElement(By.xpath("((//ul[@class='navigation-top-menu-sublist'])[6]/li)[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(usericon);
		Thread.sleep(1000);
		action.click(register).build().perform();
		
		WebElement firstname=driver.findElement(By.xpath("//input[@id ='FirstName']"));
		WebElement lastname=driver.findElement(By.xpath("(//input)[2]"));
		WebElement email=driver.findElement(By.xpath("(//input)[3]"));
		WebElement confirmmail=driver.findElement(By.id("ConfirmEmail"));
		WebElement username=driver.findElement(By.id("Username"));
		WebElement availabilty=driver.findElement(By.id("check-availability-button"));
		//WebElement country=driver.findElement(By.id("CountryId"));
		Select country = new Select(driver.findElement(By.xpath("//select[@name ='CountryId']")));
		WebElement timezone=driver.findElement(By.name("TimeZoneId"));
		WebElement checkbox=driver.findElement(By.xpath("//label[@for ='Newsletter']"));
		WebElement password=driver.findElement(By.id("Password"));
		WebElement confirmpassword=driver.findElement(By.id("ConfirmPassword"));
		WebElement mycompanyp=driver.findElement(By.id("Details_CompanyIndustryId"));
		WebElement plan=driver.findElement(By.xpath("//select[@id ='Details_NopCommerceIntendedUseId']"));
		WebElement mymainactivity =driver.findElement(By.id("Details_CompanyRoleId"));
		WebElement numberofppl =driver.findElement(By.id("Details_CompanySizeId"));
		WebElement register1=driver.findElement(By.xpath("//input[@id ='register-button']"));
		
		firstname.sendKeys("Aryan");
		Thread.sleep(1000);
		lastname.sendKeys("Shrram");
		Thread.sleep(1000);
		email.sendKeys("atharva.shriram.2000@gmail.com");
		Thread.sleep(2000);
		confirmmail.sendKeys("atharva.shriram.2000@gmail.com");
		Thread.sleep(2000);
		username.sendKeys("AryanSsss");
		Thread.sleep(2000);
		availabilty.click();
		Thread.sleep(2000);
		//country.sendKeys("India");
		country.selectByVisibleText("India");
		Thread.sleep(2000);
		timezone.sendKeys("(UTC-10:00) Hawaii");
		Thread.sleep(2000);
		if(checkbox.isEnabled()==true)
		{
			checkbox.click();
		}
		else
		{
			checkbox.click();
		}
		password.sendKeys("Shriram@2231");
		Thread.sleep(2000);
		
		confirmpassword.sendKeys("Shriram@2231");
		Thread.sleep(2000);
	
		mycompanyp.sendKeys("I am student");
		Thread.sleep(2000);
		
		register1.click();
		Thread.sleep(1000);
		
		 File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(screenshotFile, new File(".//ScreenShots/TestScreenShot.png"));
		
			}catch(Exception ex)
		{
				ex.printStackTrace();
			}
		
		}

	

	}


