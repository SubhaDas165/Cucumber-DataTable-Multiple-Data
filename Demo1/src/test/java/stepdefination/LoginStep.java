package stepdefination;


import java.util.Iterator;
import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	

	@Given("User is on Login Page")
	public void user_is_on_login_page() {
	    System.out.println("User is on login page");
	}

	@When("User enter folowing user details")
	public void user_enter_folowing_user_details(DataTable dataTable) {
		List<List<String>> ul=dataTable.asLists(String.class);
		for (List<String> list : ul) {
			System.out.println(list);
		}
		
	}

	@Then("User Login Successfully")
	public void user_login_successfully() {
	  System.out.println("Login Successfully");
	}

}
