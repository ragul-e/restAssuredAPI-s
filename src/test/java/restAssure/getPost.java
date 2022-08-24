package restAssure;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getPost {


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
		requestBody.put("accurarcy","50");
		requestBody.put("name","Frontline house");
		requestBody.put("phone_number","(+91) 987 986 3787");
		requestBody.put("address","29, side layout,cohen 09");
		requestBody.put("website","http://google.com");
		requestBody.put("language","French-IN");
		JSONArray arr = new JSONArray();
		arr.add("shoe park");
		arr.add("shoe");
		requestBody.put("type",arr);
		JSONObject childjson = new JSONObject();
		childjson.put("lat", -38.383494);
		childjson.put("lng",33.427362);
		requestBody.put("location", childjson);
		request.body(requestBody.toJSONString());
		Response res = request.queryParam("key","qaclick123").post("/maps/api/place/add/json");
		System.out.println( "name:"+res.asString());
		int code =res.getStatusCode();
		
		//String status = res.jsonPath().getString("status");
		SoftAssert ass = new SoftAssert();
		ass.assertEquals(code,200);

	}




}
