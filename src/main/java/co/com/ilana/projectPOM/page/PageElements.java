package co.com.ilana.projectPOM.page;

import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class PageElements {

    private WebDriver webDriver;

    public PageElements(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void openBrowser() {
        assertEquals("DEMOQA",webDriver.getTitle());
    }
}
