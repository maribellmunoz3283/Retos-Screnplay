package co.com.choucair.certification.proyectoBase.tasks;

import co.com.choucair.certification.proyectoBase.userinterface.ChoucairAcademyLoguinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Loguin implements Task {


    public static Loguin onThePage() {

        return Tasks.instrumented(Loguin.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Click.on(ChoucairAcademyLoguinPage.LOGIN_BUTTON),
                Enter.theValue("mmunozz").into(ChoucairAcademyLoguinPage.LOGIN_USER),
                Enter.theValue("Medellin123*").into(ChoucairAcademyLoguinPage.LOGIN_PASSWORD),
                Click.on(ChoucairAcademyLoguinPage.ACCES_BUTTON));
        ;



    }
}
