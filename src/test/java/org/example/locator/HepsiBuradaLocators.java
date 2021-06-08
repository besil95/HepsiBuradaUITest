package org.example.locator;

import org.openqa.selenium.By;

public class HepsiBuradaLocators {
    public static final String BASE_URL = "https://www.hepsiburada.com/";
    public static final String baseUrl = "https://www.hepsiburada.com/";
    public static final By MYACCOUNT = By.id("myAccount");
    public static final By LOGIN = By.id("login");
    public static final By USERNAME = By.id("txtUserName");
    public static final By PASSWORD = By.id("txtPassword");
    public static final By BTN_LOGIN = By.id("btnLogin");
    public static final By SEARCH_AREA = By.cssSelector("input.desktopOldAutosuggestTheme-input");
    public static final By SEARCH_BUTTON = By.cssSelector("div.SearchBoxOld-buttonContainer");
    public static final By FIND_SAMSUNG = By.xpath("//span[@class='static-suggestion-text' and text()='ürün bulduk.']");
    public static final By PAGE_TWO = By.className("page-2");
    public static final By THIRD_PRODUCT = By.xpath("(//div[@class='carousel-lazy-item'])[9]");
    public static final By THIRD_PRODUCT_FAVORITE = By.xpath("//div[@id='heartWrapper' and @data-position='3']");
    public static final By FAVORITE = By.xpath("//a[@title='Beğendiklerim']");
    public static final By CHECK_FAVORITE_PRODUCT = By.xpath("(//div[@class='product-item '])[1]");
    public static final By SELECT_ALL = By.id("StickActionHeader-SelectAll");
    public static final By CLEAR_PRODUCT = By.cssSelector("button#StickActionHeader-RemoveSelected");
    public static final By CLEAR_BUTTON = By.id("DeleteConfirmationModal-ActionButton");
    public static final By EMPTY_LIST = By.xpath("//span[text()=', listen şu an boş.']");
}
