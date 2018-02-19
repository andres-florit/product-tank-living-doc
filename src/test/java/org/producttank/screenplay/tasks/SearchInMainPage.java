package org.producttank.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import org.producttank.screenplay.ui.SearchForm;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchInMainPage implements Task {

    @Step("{0} searches for #keywords in page")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(keywords).into(SearchForm.QUERY),
                Hit.the(Keys.ENTER).into(SearchForm.QUERY)
        );
    }

    private String keywords;

    public SearchInMainPage(String keywords) {
        this.keywords = keywords;
    }

    public static Performable forKeywords(String keywords) {
        return instrumented(SearchInMainPage.class, keywords);
    }
}
