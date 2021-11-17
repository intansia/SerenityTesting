package UIPages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage {

    //@DefaultUrl("https://ruangmom-sit.onelabs.dev")
    public class loginPage extends PageObject {

         public void doLogin(){
             $(".login").isPresent();
             $(".login").click();
             waitFor(5);
             $("#email").sendKeys("serenitytesting@yopmail.com");
             $("#passwd").sendKeys("testing123");
             $("#SubmitLogin").click();
         }

         public String loginLandingPage(){
             return $("div#center_column h1").getText();
         }

         public void clickContactUs(){
             $(By.linkText("Contact us")).click();
         }
    }
}
