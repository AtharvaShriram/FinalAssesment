package Step_definationpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PO.PO_City;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Add_City_step_def {

	public WebDriver driver;
	public PO_City lp;
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() throws InterruptedException {
	   
		WebDriverManager.chromedriver().setup();
		Thread.sleep(2000);
		driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		lp = new PO_City(driver);
		
	}
	
	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	    
	}
	
	@When("User enters Emails as {string} and password as {string} and click on login")
	public void user_enters_username_as_and_accesscode_as(String mail, String pass) {
	    
	   try {
		lp.valid(mail,pass);
	    lp.Clicklogin();
	   }catch(Exception ex)
	   {
		   ex.printStackTrace();
	   }
	}
	
	@When("User clicks on Locations")
	public void locations() throws InterruptedException
	{
		lp.location1();
		Thread.sleep(1000);
	}
	@Then("User clicks on City")
	public void city() throws InterruptedException
	{
		lp.city1();
		Thread.sleep(1000);
	}
	@Then("User clicks on Add City")
	public void addcity() throws InterruptedException
	{
		lp.addcity1();
		Thread.sleep(1000);
	}
	@Then("User enters city as {string}")
	public void entercity(String city) throws InterruptedException
	{
		lp.entercity1(city);
		Thread.sleep(1000);
	}
	@Then("User clicks on add")
	public void add() throws InterruptedException
	{
		lp.enter1();
		Thread.sleep(1000);
	}
	
	@Then("close browser")
	public void close_browser() {
	 
		driver.close();
	
	}
	

	
}
