package stepDefinition;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import restAssure.getPost;



public class getpostStepDef {
	
	getPost gp;
	
	
	@Given("get Api request")
	public void get_Api_request() {
	   gp = new getPost();
	   gp.post();
	  
	}
	
	@When("provide input")
	public void provide_input() {
	   gp.validate();
	
	}
	
}
