package AppTests;

import Steps.ContactUsSteps;
import Steps.LoginPageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class ContactUsPageTest extends BaseTest{

    String expectedMessage = "Your message has been successfully sent to our team.";

    @Steps
    LoginPageSteps loginPageSteps;

    @Steps
   ContactUsSteps contactUsSteps;

    @Before
    public void setup(){
        loginPageSteps.isOnLoginPage();
        loginPageSteps.navigateToContactUs();
    }

    @Test
    public void fillContactUsPage(){
        String actualMessage = contactUsSteps.fillContactUsFormStep();
        System.out.println(actualMessage);
        Assert.assertTrue(actualMessage.equals(expectedMessage));
    }

}
