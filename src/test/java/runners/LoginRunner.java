package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.junit.Test;
import org.junit.runner.RunWith;
import tasks.CreateGallery;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;


@RunWith(SerenityRunner.class)
/*@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "/stepdefinitions",
        tags = "",
        snippets = SnippetType.CAMELCASE
)*/
public class LoginRunner {
    @Test
    public void userAlreadyHasAFlickrAccount() {
        Actor john = Actor.named("John")
                .whoCan(CallAnApi.at("https://api.flickr.com/services/rest"));

        john.attemptsTo(
                new CreateGallery()
        );

        john.should(
                seeThatResponse("the correct id must be returned",
                        response -> response.statusCode(200)
                                .body("galleries.user_id", equalTo("194539726@N04"))
                ));
    }
}


/* Response response = RestAssured
                .given()
                .formParam("grant_type","authorization_code")
                //.formParam("state", )
                .formParam("response_type", "token")
                .formParam("redirect_url", "https://api.spotify.com/v1/playlists/5sCxWoj1NVpwIBUiXpql8X/tracks?uris=spotify:track:5ArNGisLzrNOIVwWajRRdt")
                //.formParam("auth_url","https://accounts.spotify.com/authorize")
                //.formParam("access_token_url","https://accounts.spotify.com/api/token")
                .formParam("client_id","2c686c3778d547cf804f922b46d67670")
                .formParam("client_secret","4ffb74e28cf648aa9d7af7410ad58f35")
                .post("https://accounts.spotify.com/authorize");


        System.out.println("El token es : " + response.getBody().asString());*/
















