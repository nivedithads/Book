package Stepdefinitions;

import java.io.IOException;

import org.testng.Assert;

import com.fasterxml.jackson.databind.JsonNode;

import Book.values.Kind;
import BookTests.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseTest{
	Kind kind;
	JsonNode jsonNode;
	
	@Given("Request to Google Books Api")
	public void request_to_google_books_api() throws IOException, InterruptedException {
		jsonNode = jsonNodeofUrl();

	}
	@When("Extract kind from the Response")
	public void extract_kind_from_the_response() {
		kind = new Kind(jsonNode);
	}
	@Then("^verify (.+) is same as extracted kind$")
	public void verify_books_is_same_as_extracted_kind(String  expectedKind ) throws IOException {
		String kindValue = kind.kindData().toString();
		//System.out.println(kindValue);
		Assert.assertEquals(kindValue, expectedKind);
	}

}
