package org.example.page;

import org.example.base.BasePage;
import org.openqa.selenium.WebDriver;

import static org.example.locator.HepsiBuradaLocators.*;

public class StepDefinitions extends BasePage {
    public StepDefinitions(WebDriver driver) {
        super(driver);
    }

    public StepDefinitions moveToLogin() {
        hoverElement(MYACCOUNT);
        return this;
    }

    public StepDefinitions clickLogin() {
        clickElement(LOGIN);
        return this;
    }

    public StepDefinitions sendUserName() {
        getSendKeyElement(USERNAME, "hiroli4856@loopsnow.com");
        return this;
    }

    public StepDefinitions sendPassword() {
        getSendKeyElement(PASSWORD, "HappyTesting123");
        return this;
    }

    public StepDefinitions loginButton() {
        clickElement(BTN_LOGIN);
        return this;
    }

    public StepDefinitions searchArea() {
        getSendKeyElement(SEARCH_AREA, "samsung");
        return this;
    }

    public StepDefinitions searchButton() {
        clickElement(SEARCH_BUTTON);
        return this;
    }

    public StepDefinitions checkSamsung() {
        checkVisible(FIND_SAMSUNG);
        return this;
    }

    public StepDefinitions scrollDown() {
        scrollElement("250");
        return this;
    }

    public StepDefinitions secondPage() {
        clickElement(PAGE_TWO);
        return this;
    }

    public StepDefinitions thirdProduct() {
        hoverElement(THIRD_PRODUCT);
        return this;
    }

    public StepDefinitions thirdProductFavorite() {
        clickElement(THIRD_PRODUCT_FAVORITE);
        return this;
    }

    public StepDefinitions favoriteButton() {
        clickElement(FAVORITE);
        return this;
    }

    public StepDefinitions checkProduct() {
        checkVisible(CHECK_FAVORITE_PRODUCT);
        return this;
    }

    public StepDefinitions hoverProduct() {
        hoverElement(CHECK_FAVORITE_PRODUCT);
        return this;
    }

    public StepDefinitions selectAll() {
        clickElement(SELECT_ALL);
        return this;
    }

    public StepDefinitions clearProduct() {
        clickElement(CLEAR_PRODUCT);
        return this;
    }

    public StepDefinitions clearButton() {
        clickElement(CLEAR_BUTTON);
        return this;
    }

    public StepDefinitions emptyList() {
        checkVisible(EMPTY_LIST);
        return this;
    }

}
