package co.com.ilana.projectPOM.stepDefinition.carrusel;

import co.com.ilana.projectPOM.page.PageHome;
import co.com.ilana.projectPOM.page.PageSlider;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static co.com.ilana.projectPOM.page.Base.edgeDriverConnection;

public class StepCarrusel {

    private static final String URL_BASE = "https://demoqa.com/";
    private WebDriver driver;
    private static final String PATH_WEBDRIVER =
            "C:/AutomationTest/retoTecnicoIlanaPOM/src/test/resources/webdriver/edge/msedgedriver.exe";

    @Before
    public void setUp() {
        driver = edgeDriverConnection(PATH_WEBDRIVER, URL_BASE);
    }

    @Given("que el usuario ingresa a la pagina web para validar la funcion carrusel")
    public void thatTheUserEntersTheWebPageToValidateTheCarouselFunction() {
        PageHome pageHome = new PageHome(driver);
        pageHome.navigateToWidgets();
    }

    @When("navega hasta la posicion tres")
    public void navigateToPositionThree() throws InterruptedException {
        PageSlider pageSlider = new PageSlider(driver);
        pageSlider.slider();
    }

    @Then("verifica que el numero mostrado sea tres")
    public void verifyThatTheNumberDisplayedIs() {
        PageSlider pageSlider = new PageSlider(driver);
        pageSlider.compareValues();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}