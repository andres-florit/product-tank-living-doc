package org.producttank.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SearchForm {

    public static final Target QUERY = Target.the("Query input")
            .locatedBy("#lst-ib");
}
