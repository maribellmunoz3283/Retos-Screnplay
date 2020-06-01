package co.com.choucair.certification.demosite.tasks;

import co.com.choucair.certification.demosite.userinterface.DemoSiteHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {

    private DemoSiteHomePage demoSiteHomePage;

    public static OpenUp thePageDemoSite() { return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Open.browserOn(demoSiteHomePage));

    }
}

