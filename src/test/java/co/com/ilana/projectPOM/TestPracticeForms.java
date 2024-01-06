package co.com.ilana.projectPOM;

import co.com.ilana.projectPOM.page.PageHome;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static co.com.ilana.projectPOM.page.Base.edgeDriverConnection;


public class TestPracticeForms {

    private static final String URL_BASE = "https://demoqa.com/";
    private WebDriver driver;
    private static final String PATH_WEBDRIVER = "C:/AutomationTest/retoTecnicoIlanaPOM/src/test/resources/webdriver/edge/msedgedriver.exe";


    @Before
    public void setUp(){
        driver = edgeDriverConnection(PATH_WEBDRIVER,URL_BASE);
    }

    @Test
    public void test(){
        //Example test webdriver
        PageHome pageHome = new PageHome(driver);
        pageHome.navigateToForm();

    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
