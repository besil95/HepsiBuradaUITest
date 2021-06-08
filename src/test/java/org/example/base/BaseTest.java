package org.example.base;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BaseTest {

    static WebDriver webDriver = null;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-notifications");
        options.addArguments("disable-popup-blocking");
        setWebdriver(new ChromeDriver(options));
        getWebDriver().navigate().to("https://www.hepsiburada.com/");
    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public static void setWebdriver(WebDriver webDriver) {
        BaseTest.webDriver = webDriver;
    }

    public void tearDown() {
        getWebDriver().quit();
    }
}
