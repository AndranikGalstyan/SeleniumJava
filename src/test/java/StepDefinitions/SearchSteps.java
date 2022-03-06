package StepDefinitions;

import PageObjects.HomePage;
import BaseClass.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SearchSteps extends HomePage {

    public SearchSteps(BaseClass base) {
        super(base);
    }

    @Given("Home page is opened")
    public void openHomePage() {
        super.openHomePage();
    }

    @And("Type {string} in search field")
    public void typeInSearchField(String text) {
        super.typeInSearchField(text); }

    @When("Click on search icon")
    public void lickOnSearchIcon() {
        super.clickSearchBtn();
    }

    @Then("Assert that search result titles contain {string}")
    public void assertThanSearchResultTitlesContain(String text) {
        super.checkSearchResults(text);
    }
}

