package Step_definationpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PO.PO_City;
import PO.PO_Country;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Add_Country_step_def {
	
	public WebDriver driver;
	public PO_Country lp;
	
	@Given("User Launches Chrome browser")
	public void user_launch_chrome_browser() throws InterruptedException {
	   
		WebDriverManager.chromedriver().setup();
		Thread.sleep(2000);
		driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		lp = new PO_Country(driver);
		
	}
	
	@When("User opened URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	    
	}
	
	@Then("User entered Emails as {string} and password as {string} and then clicks on login")
	public void user_enters_username_as_and_accesscode_as(String mail, String pass) {
	    
	   try {
		lp.valid(mail,pass);
	    lp.Clicklogin();
	   }catch(Exception ex)
	   {
		   ex.printStackTrace();
	   }
	}
	
	@Then("User clicked on Locations")
	public void locations() throws InterruptedException
	{
		lp.location1();
		Thread.sleep(1000);
	}
	@Then("User clicked on Country")
	public void city() throws InterruptedException
	{
		lp.country1();
		Thread.sleep(1000);
	}
	@Then("User clicked on Add Country")
	public void addcity() throws InterruptedException
	{
		lp.addcountry1();
		Thread.sleep(1000);
	}
	@Then("User entered country as {string}")
	public void entercity(String Country) throws InterruptedException
	{
		lp.entercountry1(Country);
		Thread.sleep(1000);
	}
	@Then("User clicked on add")
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
