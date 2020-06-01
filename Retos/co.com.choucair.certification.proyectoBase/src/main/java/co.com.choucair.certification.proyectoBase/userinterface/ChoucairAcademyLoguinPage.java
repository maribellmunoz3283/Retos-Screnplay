package co.com.choucair.certification.proyectoBase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


public class ChoucairAcademyLoguinPage extends PageObject {

    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login")
            .located(By.xpath("(//strong[contains(.,'Ingresar')])[1]"));
    public static final Target LOGIN_USER = Target.the("button that shows us the form to login")
            .located(By.id("username"));
    public static final Target LOGIN_PASSWORD = Target.the("button that shows us the form to login")
            .located(By.id("password"));
    public static final Target ACCES_BUTTON = Target.the("button that shows us the form to login")
            .located(By.xpath("//button[contains(.,'Acceder')]"));






    ////input[@id='password']
    ////input[@id='username']

}
