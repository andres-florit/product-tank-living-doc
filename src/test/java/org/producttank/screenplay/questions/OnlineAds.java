package org.producttank.screenplay.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import org.producttank.screenplay.ui.ContentResults;

public class OnlineAds {

    public static Question<Boolean> areDisplayed() {
        return actor -> Visibility.of(ContentResults.ONLINE_ADS_RESULTS).viewedBy(actor).resolve();
    }
}
