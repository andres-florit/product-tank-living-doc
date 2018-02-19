package org.producttank.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.producttank.screenplay.questions.AllContentResults;
import org.producttank.screenplay.tasks.OpenApplication;
import org.producttank.screenplay.tasks.SearchInAddressBar;
import org.producttank.screenplay.tasks.SearchInMainPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SearchingContentStepDefinitions {

    private static Logger logger = LoggerFactory.getLogger(SearchingContentStepDefinitions.class);

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^an (.*) user$")
    public void a_user(String user) throws Exception {
        theActorCalled(user);
    }

    @Given("^a previous content search containing \"([^\"]*)\"$")
    @When("^he searches using the main page for content containing \"([^\"]*)\"$")
    public void he_searches_using_the_main_page_for_content_containing(String keywords) throws Exception {
        theActorInTheSpotlight().attemptsTo(
                OpenApplication.onTheMainPage(),
                SearchInMainPage.forKeywords(keywords)
        );
    }

    @When("^he searches using the browser address bar for content containing \"([^\"]*)\"$")
    public void he_searches_using_the_browser_address_bar_for_content_containing(String keywords) throws Exception {
        theActorInTheSpotlight().attemptsTo(
                SearchInAddressBar.forKeywords(keywords)
        );
    }

    @When("^he refines the search to \"([^\"]*)\"$")
    public void he_refines_the_search_to(String keywords) throws Exception {
        throw new PendingException();
    }

    @Then("^search results are shown$")
    public void search_results_are_shown() throws Exception {
        theActorInTheSpotlight().should(
                seeThat("results are displayed", AllContentResults.areDisplayed())
        );
    }

}
