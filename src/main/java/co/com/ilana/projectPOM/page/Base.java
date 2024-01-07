package co.com.ilana.projectPOM.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {

    private static final String WINDOWS_CHROMEDRIVER_KEY = "webdriver.edge.driver";
    private static WebDriver webDriver;

    public static WebDriver edgeDriverConnection(String sourcePath, String url) {

        System.setProperty(WINDOWS_CHROMEDRIVER_KEY, sourcePath);
        webDriver = new EdgeDriver();
        webDriver.get(url);
        webDriver.manage().window().maximize();
        return webDriver;
    }
}