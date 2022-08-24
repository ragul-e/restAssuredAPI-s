package restAssure;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getReq {



	RequestSpecification request;
	@Test
	public void post() {
		
		 request= RestAssured.given();
		request.baseUri("https://rahulshettyacademy.com");
		
	}
	@Test
	public void validate() {
		request.header("Content-Type","application/json");
		
		
		Response res = request.queryParam("Key","place_id").get("http://rahulshettyacademy.com/maps/api/place/get/json?");
		System.out.println( "name:"+res.asString());
		int code =res.getStatusCode();
		
		//String status = res.jsonPath().getString("status");
		SoftAssert ass = new SoftAssert();
		ass.assertEquals(code,200);

	}






}
