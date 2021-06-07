import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class Elements {

    WebDriver driver;

    public Elements() {

        driver = new ChromeDriver();
    }

    public void driverSetup() {
        driver.manage().window().maximize();
    }

    public void goUrl(String url) {
        driver.get(url);
    }

    public String currentUrl() {
        return driver.getCurrentUrl();
    }

    public void clickElement(By by) {
        driver.findElement(by).click();
    }

    public void implicitlyWaitElement(int second) {
        driver.manage().timeouts().implicitlyWait(second, TimeUnit.SECONDS);
    }


    public void getSendKeyElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }


    public void sleep(int second) {
        try {
            Thread.sleep(second);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }


    public void closeDriver() {
        driver.quit();
    }

}