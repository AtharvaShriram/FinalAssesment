package ApiQuestion;

import static io.restassured.RestAssured.given;

import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Question10 {
	 ResponseSpecification res; 
	    RequestSpecification req_spec;
	    String str=" ";
	    JSONObject obj1;
	    
	    @BeforeClass
	    public void setSpecification() {
	    	InputStream detail=null;
	    	
	        res = RestAssured.expect();
	        res.statusLine("HTTP/1.1 200 OK");
	        res.contentType(ContentType.JSON);
	    	
	      String path = "data/api.json";
	      detail = getClass().getClassLoader().getResourceAsStream(path);
	      JSONTokener tokener = new JSONTokener(detail);
	      obj1 =new JSONObject(tokener);
	       
	    }
	    
	    @Test(description="Valid credentials",priority=1)
	    public void loginuser() {
	    	
	        HashMap<String,String> params = new HashMap<String, String>();
	        String nmValue = obj1.getJSONObject("Valid").getString("username");
	      String passValue = obj1.getJSONObject("Valid").getString("password");
	      System.out.println(nmValue);
	      params.put("username", nmValue);
	      params.put("password", passValue);
	        RestAssured.baseURI="https://arcadia.pisystindia.com/";
	        Response resp = given().when().contentType("application/json").body(params).post("api/login").then().contentType(ContentType.JSON).extract().response();
	        System.out.println("output is"+resp.asPrettyString());
	        LinkedHashMap<String,Object> payload= resp.body().jsonPath().get("payload");
	        System.out.println(payload.toString());
	        
	    }
	    
	    @Test(description="Invalid credentials",priority=1)
	    public void loginuser1() {
	    	
	        HashMap<String,String> params = new HashMap<String, String>();
	        String nmValue = obj1.getJSONObject("invalid").getString("username");
	      String passValue = obj1.getJSONObject("invalid").getString("password");
	      System.out.println(nmValue);
	      params.put("username", nmValue);
	      params.put("password", passValue);
	        RestAssured.baseURI="https://arcadia.pisystindia.com/";
	        Response resp = given().when().contentType("application/json").body(params).post("api/login").then().contentType(ContentType.JSON).extract().response();
	        System.out.println("output is"+resp.asPrettyString());
	        LinkedHashMap<String,Object> payload= resp.body().jsonPath().get("payload");
	        System.out.println(payload.toString());
	        
	    }
	    
	    
	    
	    
	    
}
