package co.com.choucair.certification.demosite.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;


@DefaultUrl("http://demo.automationtesting.in/Register.html")

public class DemoSiteHomePage extends PageObject {

    public static final Target FIRST_NAME_BOX = Target.the("The box first name")
             .located(By.xpath("//input[@placeholder='First Name']"));

    public static final Target LAST_NAME_BOX = Target.the("The box last name")
            .located(By.xpath("//input[@placeholder='Last Name']"));

    public static final Target ADDRESS = Target.the("The box address")
            .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));

    public static final Target EMAIL= Target.the("The box email")
            .located(By.xpath("//*[@id=\"eid\"]/input"));

    public static final Target PHONE= Target.the("The box email")
            .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));

    public static final Target MALE_GENDER = Target .the("Male gender")
            .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));

    public static final Target FEMALE_GENDER = Target .the("Female gender")
            .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input"));

    public static  final Target HOBBIES_CRICKET = Target.the("hobbies cricket")
            .located(By.id("checkbox1"));

    public static  final Target HOBBIES_MOVIES = Target.the("hobbies movies")
            .located(By.id("checkbox2"));

    public static  final Target HOBBIES_HOCKEY = Target.the("hobbies hockey")
            .located(By.id("checkbox3"));

    public static  final Target CLICK = Target.the("Click en la lista de lenguajes")
            .located(By.id("msdd"));

    public static  final Target LISTLANGUAGE = Target.the("lista de lenguajes")
            .located(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//li"));

    public static final Target CLICKLANGUAGE = Target.the("Click lenguaje")
            .located(By.id("section"));

    public static final Target LISTKILLS = Target.the("Click Skills")
            .located(By.id("Skills"));

    public static final Target LISTCOUNTRY = Target.the("elegir pais")
            .located(By.id("countries"));

    public static final Target YEAR = Target.the("seleccionar año")
            .located(By.id("yearbox"));

    public static final Target MONTH = Target.the("selecionar mes")
            .located(By.xpath("//select[@placeholder='Month']"));

    public static final Target DAY = Target.the("selecionar dia")
            .located(By.id("daybox"));

    public static final Target PASSWORD= Target.the("The box email")
            .located(By.id("firstpassword"));

    public static final Target CONFIRM_PASSWORD= Target.the("The box email")
            .located(By.id("secondpassword"));

    public static final Target SEND = Target.the("Click Submit")
            .located(By.id("submitbtn"));

    public static final Target ANSWEREDIT = Target.the("Respuesta para el registro")
            .located(By.xpath("//b[contains(text(),'EDIT')]"));


}