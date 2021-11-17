package Steps;

import UIPages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginPageSteps {

    private LoginPage.loginPage loginPage;

    @Step
    public void isOnLoginPage(){
        loginPage.open();
    }

    @Step
    public void loginAsRegisteredUser(){
        loginPage.doLogin();
    }

    @Step
    public void checkIfLoginIsSuccess(){

       Assert.assertTrue(loginPage.loginLandingPage().equals("MY ACCOUNT"));
    }

    @Step
    public void navigateToContactUs(){
        loginPage.clickContactUs();
    }


}

