package co.com.choucair.certification.demosite.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/registrer_demo_site.feature",
        tags = "@RunnerTags",
        glue = {"co.com.choucair.certification.demosite.stepdefinitions", "co.com.choucair.certification.demosite.util"},
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}
