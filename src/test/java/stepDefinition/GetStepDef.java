package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import restAssure.getPost;
import restAssure.getReq;

public class GetStepDef {

	
	getReq gr;
	
	
	@Given("get Api Getrequest")
	public void get_Api_Getrequest() {
	   gr = new getReq();
	   gr.post();
	  
	}
	
	@When("get_input")
	public void get_input() {
	   gr.validate();
	
	}
	


}
