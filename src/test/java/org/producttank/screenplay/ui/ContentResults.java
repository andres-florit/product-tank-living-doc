package org.producttank.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ContentResults {

    public static final Target ALL_CONTENT_RESULTS = Target.the("All content results")
            .locatedBy("//div[@id='ires']");

    public static final Target ONLINE_ADS_RESULTS = Target.the("Online ads results")
            .locatedBy("//div[@id='tads']");
}
