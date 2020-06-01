package co.com.choucair.certification.demosite.tasks;

import co.com.choucair.certification.demosite.interactions.SelectLanguage;
import co.com.choucair.certification.demosite.model.DataTable;
import co.com.choucair.certification.demosite.userinterface.DemoSiteHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;

import java.util.List;

import static co.com.choucair.certification.demosite.userinterface.DemoSiteHomePage.*;
import static co.com.choucair.certification.demosite.util.Constant.*;

public class Register implements Task {

    private  List<DataTable> dataTable;

        public Register(List<DataTable> dataTable) {
            this.dataTable = dataTable;
        }

    public static Register user(List<DataTable> dataTable) {
            return Tasks.instrumented(Register.class,dataTable);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

           DataTable info = dataTable.get(0);

        actor.attemptsTo(Enter.theValue(dataTable.get(CERO).getFirstName()).into(DemoSiteHomePage.FIRST_NAME_BOX),
                Enter.theValue(info.getLastName()).into(DemoSiteHomePage.LAST_NAME_BOX),
                Enter.theValue(info.getAddress()).into(DemoSiteHomePage.ADDRESS),
                Enter.theValue(info.getEmailAddress()).into(DemoSiteHomePage.EMAIL),
                Enter.theValue(info.getPhone()).into(DemoSiteHomePage.PHONE),
                Check.whether(dataTable.get(CERO).getGender().trim().equals(MALE))
                        .andIfSo(Click.on(MALE_GENDER))
                        .otherwise(Click.on(FEMALE_GENDER)));

        if (dataTable.get(CERO).getHobbies().trim().equals(CRICKET)) {
            actor.attemptsTo(Click.on(HOBBIES_CRICKET));
        } else if (dataTable.get(CERO).getHobbies().trim().equals(MOVIES)) {
            actor.attemptsTo(Click.on(HOBBIES_MOVIES));
        } else {
            actor.attemptsTo(Click.on(HOBBIES_HOCKEY));
        }

        actor.attemptsTo(Click.on(CLICK),
            SelectLanguage.since(LISTLANGUAGE, dataTable.get(CERO).getLanguages(), COMA), Click.on(CLICKLANGUAGE),
            SelectFromOptions.byVisibleText(dataTable.get(CERO).getSkills()).from(LISTKILLS),
            SelectFromOptions.byVisibleText(dataTable.get(CERO).getCountry()).from(LISTCOUNTRY),
          //  Click.on(CLICKDOS), Enter.theValue(dataTable.get(CERO).getSelectCountry()).into(SELECTCOUNTRY),
            //Click.on(CLICKAREA),
            SelectFromOptions.byVisibleText(dataTable.get(CERO).getYear()).from(YEAR),
            SelectFromOptions.byVisibleText(dataTable.get(CERO).getMonth()).from(MONTH),
            SelectFromOptions.byVisibleText(dataTable.get(CERO).getDay()).from(DAY),
            Enter.theValue(dataTable.get(CERO).getPassword()).into(PASSWORD),
            Enter.theValue(dataTable.get(CERO).getConfirmPassword()).into(CONFIRM_PASSWORD),
            Click.on(SEND)
        );








    }
}
