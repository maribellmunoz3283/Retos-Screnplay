package co.com.choucair.certification.demosite.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;


public class SelectLanguage implements Interaction {

    private Target list;
    private String option;
    private String character;

    public SelectLanguage(Target list , String option, String character) {
        this.list = list ;
        this.option = option;
        this.character = character;
    }

    public static SelectLanguage since(Target list, String option, String character) {
        return new SelectLanguage(list, option, character);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String[] optionSeparator = option.split(""+character+"");


        List<WebElementFacade> listObjeto = list.resolveAllFor(actor);
        for (int i = 0; i < listObjeto.size(); i++) {
            for (int j = 0; j < optionSeparator.length; j++) {
                if (listObjeto.get(i).getText().trim().equals(optionSeparator[j])) {
                    listObjeto.get(i).click();
                    break;
                }
            }
        }
    }
}
