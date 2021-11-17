package UIPages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    public void isLogoExist(){
        shouldBeVisible(By.className("logo"));
    }

    public String doSearch(String keyword, String productName){

      typeInto($("#search_query_top"),keyword);

        waitForTextToAppear(productName);
      clickOn($("//li[text()='"+productName+"']"));
      return find(By.tagName("h1")).getText();
    }
}
