package ApiQuestion;

import static io.restassured.RestAssured.given;
import org.json.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


public class Question9 {
	

	ResponseSpecification res; 
    RequestSpecification req_spec;
    String str=" ";
    JSONObject obj1;
    
    @BeforeClass
    public void setSpecification() {
        res = RestAssured.expect();
        res.statusLine("HTTP/1.1 200 OK");
        res.contentType(ContentType.JSON);
       }
    
    
    @Test(description="getting General Settings,testcase 1 with valid url",priority=1)
    public void GeneralSettingvalid()
    {
    RestAssured.baseURI ="https://arcadia.pisystindia.com/";
    Response resp=given().header("Authorization",str).when().get("api/generalSetting").then().contentType(ContentType.JSON).extract().response();
    System.out.println("op is"+resp.asPrettyString());
    }    
    
    @Test(description="Testcase 2 with invalid url",priority=2)
    public void GeneralSettinginvalid()
    {
    RestAssured.baseURI ="https://arcadia.pisystindia.com/";
    Response resp=given().header("Authorization",str).when().get("SAJD J SD/generalSetting").then().contentType(ContentType.JSON).extract().response();
    System.out.println("op is"+resp.asPrettyString());
    }    
    
    
    
    
    
}
