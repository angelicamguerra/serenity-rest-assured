package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.HomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login implements Task {
    private final String email;
    private final String password;


    public Login(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public static Performable words (String email, String password){
        return instrumented(Login.class, email, password);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.LOGIN_BUTTON),
                WaitUntil.the((HomePage.EMAIL_BOX),isVisible()),
                Enter.theValue(email).into(HomePage.EMAIL_BOX),
                Click.on(HomePage.NEXT_BUTTON),
                //WaitUntil.the((HomePage.PASSWORD_BOX),isVisible()),
                Enter.theValue(password).into(HomePage.PASSWORD_BOX)


        );

    }
}

















//homePage.LOGIN_BUTTON.waitUntilVisible(),
//WaitUntil.the(homePage.LOGIN_BUTTON), isVisible()).forNoMoreThan(10).seconds(),
//Enter.theValue(email).into(homePage.LOGIN_BUTTON)
//SelectFromOptions.byVisibleText(lang).from(homePage.LANG_SELECT),