package co.com.ilana.projectPOM.stepDefinition.elements;

import co.com.ilana.projectPOM.page.PageElements;
import co.com.ilana.projectPOM.page.PageHome;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.WebDriver;

import static co.com.ilana.projectPOM.page.Base.edgeDriverConnection;

public class StepElements {

    private static final String URL_BASE = "https://demoqa.com/";
    private WebDriver driver;
    private static final String PATH_WEBDRIVER =
            "C:/AutomationTest/retoTecnicoIlanaPOM/src/test/resources/webdriver/edge/msedgedriver.exe";

    @Before
    public void setUp() {
        driver = edgeDriverConnection(PATH_WEBDRIVER, URL_BASE);
    }


    @Dado("que el usuario ingresa a la pagina web para la verificacion de algunos enlaces")
    public void thaTheUserentersthewebpageforverificationofsomelinks() {
        PageHome pageHome = new PageHome(driver);
        pageHome.navigateToElements();
    }

    @Cuando("interactua con cada uno de los elementos verificando que se carguen y visualicen las paginas correctamente")
    public void interactsWithEachOfTheElementsVerifyingThatTheyLoadAndDisplayThePagesCorrectly() throws InterruptedException {
        PageElements pageElements = new PageElements(driver);
        pageElements.openLink();
        pageElements.openLinkStatic();
    }

    @Entonces("obtiene todos los enlaces cargados en el pagina y clickea en orden alfabetico")
    public void getsAllLinksLoadedOnThePageAndClickInAlphabeticalOrder() throws InterruptedException {
        PageElements pageElements = new PageElements(driver);
        pageElements.linkAlphabet();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}