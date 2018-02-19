package org.producttank.cucumber;

import cucumber.api.java.en.Then;
import org.producttank.screenplay.questions.OnlineAds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ShowOnlineAdsStepDefinitions {

    private static Logger logger = LoggerFactory.getLogger(ShowOnlineAdsStepDefinitions.class);

    @Then("^online ads are shown$")
    public void online_ads_are_shown() throws Exception {
        theActorInTheSpotlight().should(
                seeThat("online ads are displayed", OnlineAds.areDisplayed())
        );
    }

}
