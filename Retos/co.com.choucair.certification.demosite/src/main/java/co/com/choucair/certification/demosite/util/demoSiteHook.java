package co.com.choucair.certification.demosite.util;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class demoSiteHook {


    @Before
    public void initialsetup () {
        OnStage.setTheStage(new OnlineCast());
    }
}
