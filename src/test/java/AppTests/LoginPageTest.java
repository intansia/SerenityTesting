package AppTests;

import Steps.LoginPageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class LoginPageTest extends BaseTest{

    @Steps
    LoginPageSteps loginPageSteps;

    @Test
    public void appLoginTest(){
        loginPageSteps.isOnLoginPage();
        loginPageSteps.loginAsRegisteredUser();
        loginPageSteps.checkIfLoginIsSuccess();
    }
}
