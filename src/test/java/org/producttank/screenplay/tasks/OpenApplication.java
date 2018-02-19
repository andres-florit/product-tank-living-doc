package org.producttank.screenplay.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import org.producttank.screenplay.ui.MainPage;

public class OpenApplication {

    public static Task onTheMainPage() {
        return Task.where(
                "{0} opens Google main page",
                Open.browserOn().the(MainPage.class)
        );
    }
}
