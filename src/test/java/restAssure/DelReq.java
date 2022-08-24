package restAssure;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DelReq {



	RequestSpecification request;

	@Test
	public void api() {

		request = RestAssured.given();
		request.baseUri("//rahulshettyacademy.com");

	}

	@Test
	public void DeleteRequest() {
		
		Response res = request.delete("http://rahulshettyacademy.com/maps/api/place/delete/e0e0b0a5c5252a5ebd04b46309b0c013/json");

		int code = res.getStatusCode();

		// String status = res.jsonPath().getString("status");
		SoftAssert ass = new SoftAssert();
		ass.assertEquals(code, 200);

	}





}
