package TestCase;

import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PO.PO_AddCoupon;
import PO.PO_Update;
import Utility.BrowserManager;

public class Update_TC {
	
	WebDriver driver;
	JSONObject testng;
	
	@BeforeClass
	public void beforeClass()throws Exception{
		InputStream details = null;
		try {
			String fileName = "data/testng.json";
			details = getClass().getClassLoader().getResourceAsStream(fileName);
			JSONTokener tokener = new JSONTokener(details);
			
			testng = new JSONObject(tokener);
			System.out.println("Data is "+testng.toString());
				
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@BeforeMethod 
	@Parameters({"browser","url"})
	public void setup(String browser, String url) throws InterruptedException {
		driver = BrowserManager.getDriver(browser); 
		Thread.sleep(500);
		driver.get(url);
		Thread.sleep(500);
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		Thread.sleep(500);
		}
	@Test(priority = 1)
	public void valid_1()
	{
		try {
			
		String loginmail = testng.getJSONObject("login").getString("email2");
		String loginpass = testng.getJSONObject("login").getString("password");
		String codevalid = testng.getJSONObject("Question5").getString("codevalid");
		PO_Update obj = PageFactory.initElements(driver, PO_Update.class);
		obj.valid(loginmail,loginpass,codevalid);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 2)
	public void invalid_1()
	{
		try {
			
		String loginmail = testng.getJSONObject("login").getString("email2");
		String loginpass = testng.getJSONObject("login").getString("password");
		String codeinvalid = testng.getJSONObject("Question5").getString("codeinvalid");
		PO_Update obj = PageFactory.initElements(driver, PO_Update.class);
		obj.invalid(loginmail,loginpass,codeinvalid);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 3)
	public void number_1()
	{
		try {
			
		String loginmail = testng.getJSONObject("login").getString("email2");
		String loginpass = testng.getJSONObject("login").getString("password");
		String codenumber = testng.getJSONObject("Question5").getString("codenumber");
		PO_Update obj = PageFactory.initElements(driver, PO_Update.class);
		obj.number(loginmail,loginpass,codenumber);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 4)
	public void specialcharacter_1()
	{
		try {
			
		String loginmail = testng.getJSONObject("login").getString("email2");
		String loginpass = testng.getJSONObject("login").getString("password");
		String codespecialcharacter = testng.getJSONObject("Question5").getString("codespecialcharacter");
		PO_Update obj = PageFactory.initElements(driver, PO_Update.class);
		obj.specialcharacter(loginmail,loginpass,codespecialcharacter);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 5)
	public void lesschar_1()
	{
		try {
			
		String loginmail = testng.getJSONObject("login").getString("email2");
		String loginpass = testng.getJSONObject("login").getString("password");
		String codelesschar = testng.getJSONObject("Question5").getString("codelesschar");
		PO_Update obj = PageFactory.initElements(driver, PO_Update.class);
		obj.lesschar(loginmail,loginpass,codelesschar);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 6)
	public void blank_1()
	{
		try {
			
		String loginmail = testng.getJSONObject("login").getString("email2");
		String loginpass = testng.getJSONObject("login").getString("password");
		String codeblank = testng.getJSONObject("Question5").getString("codeblank");
		PO_Update obj = PageFactory.initElements(driver, PO_Update.class);
		obj.blank(loginmail,loginpass,codeblank);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 7)
	public void pic_valid()
	{
		try {
			
		String loginmail = testng.getJSONObject("login").getString("email2");
		String loginpass = testng.getJSONObject("login").getString("password");
		String valid = testng.getJSONObject("pic").getString("valid");
		PO_Update obj = PageFactory.initElements(driver, PO_Update.class);
		obj.picvalid(loginmail,loginpass,valid);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
		
	}

}
