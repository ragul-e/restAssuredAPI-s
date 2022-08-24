package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import restAssure.DelReq;



public class delReqStepDef {

	DelReq del;
	// Delete Place ID


	@Given("Delete Api request")
	public void delete_api_request() {
		del = new DelReq();
		del.api();

	}

	@When("Delete placeid")
	public void Delete_placeid() {
		del.DeleteRequest();

	}

}
