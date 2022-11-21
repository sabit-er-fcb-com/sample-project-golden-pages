package com.sample.library.step_definitions;

import com.sample.library.pages.FirstCitizensHomePage;
import com.sample.library.utilities.ConfigurationReader;
import com.sample.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class OpeningACheckingsAccount {

    FirstCitizensHomePage firstCitizensHomePage = new FirstCitizensHomePage();

    @Given("the customer is on the first citizens page")
    public void the_customer_is_on_the_first_citizens_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("firstcitizenshomepage"));
    }
    @When("the customer clicks on the open an account box")
    public void the_customer_clicks_on_the_open_an_account_box() {
        firstCitizensHomePage.openAnAccountElement.click();
    }
    @And("clicks on the free checking link")
    public void clicks_on_the_free_checking_link() {
        firstCitizensHomePage.freeChecking.click();
    }
    @And("clicks on open free checking box")
    public void clicks_on_open_free_checking_box() {
        firstCitizensHomePage.openFreeChecking.click();
    }
}
