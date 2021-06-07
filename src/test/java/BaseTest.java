import org.junit.Test;

public class BaseTest {
    @Test
    public void userLoginCase() {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        PageService pageService = new PageService();
        pageService.setup();
        pageService.baseUrlControl();
        pageService.loginClick();
        pageService.closeDriver();

    }

    @Test
    public void notUserLoginCase() {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        PageService pageService = new PageService();
        pageService.setup();
        pageService.baseUrlControl();
        pageService.setSearch("Samsung");
        pageService.closeDriver();

    }

}
