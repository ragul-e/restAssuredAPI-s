package restAssure;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutRequest {


	RequestSpecification request;
	@Test
	public void post() {
		
		 request= RestAssured.given();
		request.baseUri("https://rahulshettyacademy.com");
		
	}
	@Test
	public void validate() {
		request.header("Content-Type","application/json");
		JSONObject requestBody = new JSONObject();
	
		requestBody.put("address","70 Summer walk, USA");
		
		requestBody.put("place_id","8d2573bdf6ceec0e474c5f388fa917fb");
		
		request.body(requestBody.toJSONString());
		Response res = request.queryParam("key","qaclick123").put("/maps/api/place/update/json");
		System.out.println( "name:"+res.asString());
		int code =res.getStatusCode();
		
		//String status = res.jsonPath().getString("status");
		SoftAssert ass = new SoftAssert();
		ass.assertEquals(code,201);

	}






}
