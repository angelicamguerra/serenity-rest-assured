/*package stepdefinitions;

import com.opencsv.CSVReader;
import cucumber.api.java.en.When;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.ReadCSVFile;
import models.Credentials;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.Login;
import ui.HomePage;


public class LoginSteps {
    @Managed(driver = "chrome")
    private WebDriver navigator;
    private Actor john = Actor.named("John");
    private HomePage homepage = new HomePage();
    private Credentials credential = new Credentials();

    private ReadCSVFile readCSVFile = new ReadCSVFile();



    @Given("user already has a Flickr account.")
    public void userAlreadyHasAFlickrAccount() {
        john.can(BrowseTheWeb.with(navigator));
        john.wasAbleTo(Open.browserOn(homepage));


    }
    @When("John types his credentials Email and Password")
    public void johnTypesHisCredentialsEmailAndPassword () {
        john.attemptsTo(
                Login.words(credential.getEmail(), credential.getPassword())

        );

        System.out.println( "Email: " + credential.getEmail() + " Password: " + credential.getPassword());
    }
    @Then("John gets a wrong message.")
    public void johnGetsAWrongMessage() {
        actor.should(seeThat(the(homePage.COMPARISON_ELEMENT), containsText("cheese") ));
    }

}*/