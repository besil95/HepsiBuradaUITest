import org.junit.Assert;
import org.openqa.selenium.By;

public class PageService {
    Elements elements;

    private static final String BASE_URL = "https://www.hepsiburada.com/";
    private static final String baseUrl = "https://www.hepsiburada.com/";
    private static final By btnMyAccount = By.id("myAccount");
    private static final By btnLogin = By.id("login");
    private static final By txtSearchArea = By.xpath("//input[@class='desktopOldAutosuggestTheme-input']");
    private static final By btnSearch = By.cssSelector("div.SearchBoxOld-buttonContainer");


    public PageService() {
        elements = new Elements();
    }

    public void setup() {
        elements.driverSetup();
        elements.goUrl(BASE_URL);
    }

    public void baseUrlControl() {
        Assert.assertEquals(elements.currentUrl(), baseUrl);
    }

    public void loginClick() {
        elements.clickElement(btnMyAccount);
        elements.implicitlyWaitElement(15);
        elements.clickElement(btnLogin);
    }


    public void setSearch(String search) {
        elements.getSendKeyElement(txtSearchArea, search);
        elements.sleep(1000);
        elements.clickElement(btnSearch);
    }


    public void closeDriver() {
        elements.closeDriver();
    }
}