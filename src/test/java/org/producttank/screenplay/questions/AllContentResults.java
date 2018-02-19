package org.producttank.screenplay.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import org.producttank.screenplay.ui.ContentResults;

public class AllContentResults {

    public static Question<Boolean> areDisplayed() {
        return actor -> Visibility.of(ContentResults.ALL_CONTENT_RESULTS).viewedBy(actor).resolve();
        //return actor -> the(ContentResults.ONLINE_ADS_RESULTS).answeredBy(actor).isCurrentlyVisible();
    }
}
