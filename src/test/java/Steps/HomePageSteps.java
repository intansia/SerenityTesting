package Steps;

import UIPages.HomePage;
import net.thucydides.core.annotations.Step;

public class HomePageSteps {

    private HomePage homePage;

    @Step
    public void validateLogo(){
        homePage.isLogoExist();
    }

    @Step
    public String doSearch(String keyword, String productName){
        return homePage.doSearch(keyword,productName);
    }
}
