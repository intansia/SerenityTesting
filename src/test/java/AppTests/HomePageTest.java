package AppTests;

import Steps.HomePageSteps;
import Steps.LoginPageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class HomePageTest extends BaseTest{

    @Steps
    LoginPageSteps loginPageSteps;

    @Steps
   HomePageSteps homePageSteps;

    @Before
    public void setup(){
        loginPageSteps.isOnLoginPage();
        loginPageSteps.loginAsRegisteredUser();
    }


    @Test
    public void validateLogo(){
        homePageSteps.validateLogo();
    }

    @Test
    public void searchText(){
        String result = homePageSteps.doSearch("Dress","T-shirts > Faded Short Sleeve T-shirts");
        Assert.assertTrue(result.equals("Faded Short Sleeve T-shirts"));
    }
}
