package PageObjects;

import BaseClass.BaseClass;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import java.util.ArrayList;
import java.util.Locale;

public class HomePage extends BaseClass {

    private final BaseClass base;

    public HomePage(BaseClass base) {
        this.base = base;
    }

    By searchField = By.id("edit-search-block-form--2");
    By searchBtn = By.cssSelector("[id = block-search-form] .glyphicon-search");
    By searchResults = By.cssSelector("[class=title]");


    public void openHomePage() {
        base.driver.get(base.baseURL);
    }

    public void typeInSearchField(String text) {
        base.driver.findElement(searchField).sendKeys(text);
    }

    public void clickSearchBtn() {
        base.driver.findElement(searchBtn).click();
    }

    public void checkSearchResults(String text) {

        ArrayList resultsArray = new ArrayList();
        base.driver.findElements(searchResults).forEach(el ->
                resultsArray.add(el.getText().toLowerCase(Locale.ROOT))
        );
        resultsArray.forEach(title ->
                Assertions.assertTrue(title.toString().contains(text),
                        "'" +title +"'" + " " + "result does not contain" + " " +"'" + text + "'"));

        System.out.println(resultsArray);
    }


}
