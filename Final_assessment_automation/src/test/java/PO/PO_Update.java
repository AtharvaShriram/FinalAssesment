package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_Update {

	WebDriver driver;
	public PO_Update(WebDriver driver)
	{
		this.driver = driver;
		
	}
	@FindBy(how=How.XPATH,using = "//input[@type='email']")
	WebElement email;
	
	@FindBy(how=How.XPATH,using = "//input[@type='password']")
	WebElement password;
	

	@FindBy(how=How.XPATH,using = "//button[@type='submit']")
	WebElement signin;
	
	
	//for login
	public void login(String loginmail,String loginpass)
	{	
		
	email.sendKeys(loginmail);
	password.sendKeys(loginpass);
	signin.click();
	
	}

			@FindBy(how=How.XPATH,using = "	(//a[@class='sidebar-sub-toggle'])[2]")
			WebElement product;
			public void productclick()
			{
				product.click();
				
			}
			
			@FindBy(how=How.XPATH,using = "//a[@href='https://products.pisystindia.com/Ecommerce/admin/category']")
			WebElement category;
			public void categoryclick()
			{
				category.click();
				
			}
			
	
	@FindBy(how=How.XPATH,using = "(//a[@class='ti-pencil-alt'])[1]")
	WebElement actionedit;
	public void actioneditclick()
	{
		actionedit.click();
	}
	@FindBy(how=How.XPATH,using = "//input[@id='category_name']")
	WebElement name;
	public void namevalid(String codevalid)
	{
		name.clear();
		name.sendKeys(codevalid);
	}
	public void nameinvalid(String codeinvalid)
	{
		name.clear();
		name.sendKeys(codeinvalid);
		
	}
	public void namenumber(String codenumber)
	{
		name.clear();
		name.sendKeys(codenumber);
		
	}
	public void namespecialcharacter(String codespecialcharacter)
	{
		name.clear();
		name.sendKeys(codespecialcharacter);
		
	}
	public void namelesschar(String codelesschar)
	{
		name.clear();
		name.sendKeys(codelesschar);
		
	}
	
	public void nameblank(String codeblank)
	{
		name.clear();
		name.sendKeys(codeblank);
		
	}
	public void namespace(String codespace)
	{
		name.clear();
		name.sendKeys(codespace);
		
	}
	public void namealphanumeric(String codealphanumeric)
	{
		name.clear();
		name.sendKeys(codealphanumeric);
		
	}
	@FindBy(how=How.XPATH,using = "//button[@type='submit']")
	WebElement submit;
	public void submitclick()
	{
		submit.click();
		
	}
	@FindBy(how=How.XPATH,using = "//input[@class=\"file-name input-flat\"]")
	WebElement pic;
	public void picclick()
	{
		pic.click();
		
	}
	public void picpathvalid(String valid)
	{
		pic.sendKeys(valid);
		
	}
	public void picpathinvalid(String invalid)
	{
		pic.sendKeys(invalid);
		
	}
	
	public void valid(String loginmail,String loginpass,String codevalid) throws InterruptedException
	{
		login(loginmail,loginpass);
		Thread.sleep(1000);
		
		productclick();
		Thread.sleep(1000);
		
		categoryclick();
		Thread.sleep(1000);
		
		actioneditclick();
		Thread.sleep(1000);
		
		namevalid(codevalid);
		Thread.sleep(1000);
		
		submitclick();
		Thread.sleep(1000);
		
	} 
	public void invalid(String loginmail,String loginpass,String codeinvalid) throws InterruptedException
	{
		login(loginmail,loginpass);
		Thread.sleep(1000);
		
		productclick();
		Thread.sleep(1000);
		
		categoryclick();
		Thread.sleep(1000);
		
		actioneditclick();
		Thread.sleep(1000);
		
		nameinvalid(codeinvalid);
		Thread.sleep(1000);
		
		submitclick();
		Thread.sleep(1000);
		
	} 
	public void number(String loginmail,String loginpass,String codenumber) throws InterruptedException
	{
		login(loginmail,loginpass);
		Thread.sleep(1000);
		
		productclick();
		Thread.sleep(1000);
		
		categoryclick();
		Thread.sleep(1000);
		
		actioneditclick();
		Thread.sleep(1000);
		
		namenumber(codenumber);
		Thread.sleep(1000);
		
		submitclick();
		Thread.sleep(1000);
		
	} 
	public void specialcharacter(String loginmail,String loginpass,String codespecialcharacter) throws InterruptedException
	{
		login(loginmail,loginpass);
		Thread.sleep(1000);
		
		productclick();
		Thread.sleep(1000);
		
		categoryclick();
		Thread.sleep(1000);
		
		actioneditclick();
		Thread.sleep(1000);
		
		namespecialcharacter(codespecialcharacter);
		Thread.sleep(1000);
		
		submitclick();
		Thread.sleep(1000);
		
	} 
	public void lesschar(String loginmail,String loginpass,String codelesschar) throws InterruptedException
	{
		login(loginmail,loginpass);
		Thread.sleep(1000);
		
		productclick();
		Thread.sleep(1000);
		
		categoryclick();
		Thread.sleep(1000);
		
		actioneditclick();
		Thread.sleep(1000);
		
		namelesschar(codelesschar);
		Thread.sleep(1000);
		
		submitclick();
		Thread.sleep(1000);
		
	} 
	public void blank(String loginmail,String loginpass,String codeblank) throws InterruptedException
	{
		login(loginmail,loginpass);
		Thread.sleep(1000);
		
		productclick();
		Thread.sleep(1000);
		
		categoryclick();
		Thread.sleep(1000);
		
		actioneditclick();
		Thread.sleep(1000);
		
	    nameblank(codeblank);
		Thread.sleep(1000);
		
		submitclick();
		Thread.sleep(1000);
		
	} 
	public void space(String loginmail,String loginpass,String codespace) throws InterruptedException
	{
		login(loginmail,loginpass);
		Thread.sleep(1000);
		
		productclick();
		Thread.sleep(1000);
		
		categoryclick();
		Thread.sleep(1000);
		
		actioneditclick();
		Thread.sleep(1000);
		
		namespace(codespace);
		Thread.sleep(1000);
		
		submitclick();
		Thread.sleep(1000);
		
	}
	
			@FindBy(how=How.XPATH,using = "(//a[@class='ti-image'])[1]")
			WebElement picclick;
			public void picclick1()
			{
				picclick.click();
				
			}
	public void picvalid(String loginmail,String loginpass,String valid) throws InterruptedException
	{
		login(loginmail,loginpass);
		Thread.sleep(1000);
		
		productclick();
		Thread.sleep(1000);
		
		categoryclick();
		Thread.sleep(1000);
		
		picclick1();
		Thread.sleep(1000);
		
		picpathvalid(valid);
		Thread.sleep(1000);
		
		submitclick();
		Thread.sleep(1000);
		
	}
	
	
}
