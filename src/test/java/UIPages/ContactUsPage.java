package UIPages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageObject {

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "message")
    WebElement message;

    @FindBy(id = "submitMessage")
    WebElement submitButton;

    By heading = By.id("id_contact");
    By file = By.id("fileUpload");
    By successMessage = By.cssSelector(".alert-success");

    public String fillContactUsPage(){
        email.sendKeys("test@yopmail.com");
        message.sendKeys("I want to return my bag");
        element(heading).selectByVisibleText("Webmaster");
        upload("/Users/Anita.Hutagaol/Downloads/KeyWays_Feature.jpg").to(find(file));
        submitButton.click();
        return element(successMessage).getText();
    }
}
