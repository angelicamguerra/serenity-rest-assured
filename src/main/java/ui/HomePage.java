package ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class HomePage extends PageObject {

    public static final Target EMAIL_BOX = Target.the("Input when user types the word").located((By.id("login-email")));
    public static final Target PASSWORD_BOX = Target.the("Input when user types the word").located((By.id("login-password")));
    public static final Target NEXT_BUTTON = Target.the("Input when user types the word").located(By.xpath("//*[contains(@data-testid,'identity-form-submit-button')]"));
    public static final Target LOGIN_BUTTON = Target.the("Validate word found").located(By.xpath("//*[contains(@data-link-id,'globalnav_signin_link')]"));
    public static final Target YOU_BUTTON = Target.the("Validate word found").located(By.xpath("//*[contains(@data-track,'gnYouMainClick')]"));
}
