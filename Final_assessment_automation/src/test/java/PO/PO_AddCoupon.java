package PO;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_AddCoupon {
	
	WebDriver driver;
	public PO_AddCoupon(WebDriver driver)
	{
		this.driver = driver;
		
	}
	@FindBy(how=How.XPATH,using = "//input[@type='email']")
	WebElement email;
	
	@FindBy(how=How.XPATH,using = "//input[@type='password']")
	WebElement password;
	
	@FindBy(how=How.XPATH,using = "//button[@type='submit']")
	WebElement signin;
	
	@FindBy(how=How.XPATH,using = "//button[@type='submit']")
	WebElement submit;
	public void submitclick()
	{
		submit.click();
		
	}
	
	
	//for login
	public void login(String loginmail,String loginpass)
	{	
		
	email.sendKeys(loginmail);
	password.sendKeys(loginpass);
	signin.click();
	
	}
	
	@FindBy(how=How.XPATH,using = "//a[@href='https://xlogist.pisystindia.com/mainhub/promocode']")
	WebElement coupon;
	public void couponclick()
	{
		coupon.click();
		
	}
	
	@FindBy(how=How.XPATH,using = "//a[@class='btn btn-success btn-flat m-b-10 m-l-5']")
	WebElement addcoupon;
	public void addcouponclick()
	{
		addcoupon.click();
		
	}
	
	@FindBy(how=How.XPATH,using = "//input[@id='coupon_name']")
	WebElement couponcode;
	public void couponvalid(String codevalid)
	{
		couponcode.sendKeys(codevalid);
		
	}
	
	public void couponinvalid(String codeinvalid)
	{
		couponcode.sendKeys(codeinvalid);
		
	}
	
	public void couponnumber(String codenumber)
	{
		couponcode.sendKeys(codenumber);
		
	}
	
	public void couponspecialcharacter(String codespecialcharacter)
	{
		couponcode.sendKeys(codespecialcharacter);
		
	}
	
	public void couponlesschar(String codelesschar)
	{
		couponcode.sendKeys(codelesschar);
		
	}
	
	public void couponblank(String codeblank)
	{
		couponcode.sendKeys(codeblank);
		
	}
	
	public void couponspace(String codespace)
	{
		couponcode.sendKeys(codespace);
		
	}
	public void couponalphanumeric(String codealphanumeric)
	{
		couponcode.sendKeys(codealphanumeric);
		
	}
	
	public void valid(String loginmail,String loginpass,String codevalid) throws InterruptedException
	{
		login(loginmail,loginpass);
		Thread.sleep(1000);
		
		couponclick();
		Thread.sleep(1000);
		
		addcouponclick();
		Thread.sleep(1000);
		
		couponvalid(codevalid);
		Thread.sleep(1000);
		submitclick();
		Thread.sleep(1000);
		
	} 
	
	public void invalid(String loginmail,String loginpass,String codeinvalid) throws InterruptedException
	{
		login(loginmail,loginpass);
		Thread.sleep(1000);
		
		couponclick();
		Thread.sleep(1000);
		
		addcouponclick();
		Thread.sleep(1000);
		
		couponinvalid(codeinvalid);
		Thread.sleep(1000);
		submitclick();
		Thread.sleep(1000);
		
	} 
	
	public void number(String loginmail,String loginpass,String codenumber) throws InterruptedException
	{
		login(loginmail,loginpass);
		Thread.sleep(1000);
		
		couponclick();
		Thread.sleep(1000);
		
		addcouponclick();
		Thread.sleep(1000);
		
		couponnumber(codenumber);
		Thread.sleep(1000);
		submitclick();
		Thread.sleep(1000);
		
	} 
	
	public void specialcharacter(String loginmail,String loginpass,String codespecialcharacter) throws InterruptedException
	{
		login(loginmail,loginpass);
		Thread.sleep(1000);
		
		couponclick();
		Thread.sleep(1000);
		
		addcouponclick();
		Thread.sleep(1000);
		
		couponspecialcharacter(codespecialcharacter);
		Thread.sleep(1000);
		submitclick();
		Thread.sleep(1000);
		
	} 
	public void lesschar(String loginmail,String loginpass,String codelesschar) throws InterruptedException
	{
		login(loginmail,loginpass);
		Thread.sleep(1000);
		
		couponclick();
		Thread.sleep(1000);
		
		addcouponclick();
		Thread.sleep(1000);
		
		couponlesschar(codelesschar);
		Thread.sleep(1000);
		submitclick();
		Thread.sleep(1000);
		
	} 
	public void blank(String loginmail,String loginpass,String codeblank) throws InterruptedException
	{
		login(loginmail,loginpass);
		Thread.sleep(1000);
		
		couponclick();
		Thread.sleep(1000);
		
		addcouponclick();
		Thread.sleep(1000);
		
		couponblank(codeblank);
		Thread.sleep(1000);
		submitclick();
		Thread.sleep(1000);
		
	} 
	public void space(String loginmail,String loginpass,String codespace) throws InterruptedException
	{
		login(loginmail,loginpass);
		Thread.sleep(1000);
		
		couponclick();
		Thread.sleep(1000);
		
		addcouponclick();
		Thread.sleep(1000);
		
		couponspace(codespace);
		Thread.sleep(1000);
		submitclick();
		Thread.sleep(1000);
		
	} 
	public void alphanumeric(String loginmail,String loginpass,String codealphanumeric) throws InterruptedException
	{
		login(loginmail,loginpass);
		Thread.sleep(1000);
		
		couponclick();
		Thread.sleep(1000);
		
		addcouponclick();
		Thread.sleep(1000);
		
		couponalphanumeric(codealphanumeric);
		Thread.sleep(1000);
		submitclick();
		Thread.sleep(1000);
		
	} 
}
