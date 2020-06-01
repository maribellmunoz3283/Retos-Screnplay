package co.com.choucair.certification.demosite.questions;

import co.com.choucair.certification.demosite.userinterface.DemoSiteHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheAnswer implements Question<String> {


    public static TheAnswer is() {
        return new TheAnswer();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(DemoSiteHomePage.ANSWEREDIT).viewedBy(actor).asString();
    }
}



