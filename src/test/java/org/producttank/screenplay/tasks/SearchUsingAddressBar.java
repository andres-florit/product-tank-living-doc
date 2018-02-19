package org.producttank.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchUsingAddressBar implements Task {

    @Step("{0} searches for #keywords in address bar")
    @Override
    public <T extends Actor> void performAs(T actor) {
        //actually browsers complete the url
        actor.attemptsTo(
                Open.url("http://www.google.com/search?q=" + keywords)
        );
    }

    private String keywords;

    public SearchUsingAddressBar(String keywords) {
        this.keywords = keywords;
    }

    public static Performable forKeywords(String keywords) {
        return instrumented(SearchUsingAddressBar.class, keywords);
    }
}
