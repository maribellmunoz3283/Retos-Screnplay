package co.com.choucair.certification.proyectoBase.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Search implements Task {

    private String course;

    public Search(String course) {
        this.course = course;
    }

    public static Search the(String course) {return Tasks.instrumented(Search.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
