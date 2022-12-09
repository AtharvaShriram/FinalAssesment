package PO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PO_City {
	
public WebDriver ldriver;
	
	public PO_City(WebDriver ldriver)
	{
        PageFactory.initElements(ldriver, this);
    }

	@FindBy(xpath="//input[@id='useremail']")
    @CacheLookup
    WebElement emailinput;
	public void email1(String mail)
	{	
		emailinput.sendKeys(mail);
	}
	@FindBy(xpath="//input[@id='password']")
    @CacheLookup
    WebElement password;
	public void password1(String pass)
	{
		password.sendKeys(pass);
	}
	
	@FindBy(xpath="//button[@type='submit']")
    @CacheLookup
    WebElement submit;
	public void submit1()
	{
		submit.click();
	}
	public void valid(String mail,String pass)
	{
		email1(mail);
		password1(pass);
	}
	
	public void Clicklogin()
	{
		submit1();
	}
	
	@FindBy(xpath ="(//a[@class=\"sidebar-sub-toggle\"])[1]")
	@CacheLookup
	WebElement location;
	public void location1()
	{
		location.click();
	}
	
	@FindBy(xpath ="//a[@href=\"https://products.pisystindia.com/Ecommerce/admin/city\"]")
	@CacheLookup
	WebElement city;
	public void city1()
	{
		city.click();
	}
	
	@FindBy(xpath ="//a[@class='btn btn-success btn-flat m-b-10 m-l-5']")
	@CacheLookup
	WebElement addcity;
	public void addcity1()
	{
		addcity.click();
	}
	@FindBy(xpath ="//input[@id='city']")
	@CacheLookup
	WebElement entercity;
	public void entercity1(String City)
	{
		entercity.sendKeys(City);
	}
	
	@FindBy(xpath ="//button[@type='submit']")
	@CacheLookup
	WebElement enter;
	public void enter1()
	{
		enter.click();
	}
	
}
