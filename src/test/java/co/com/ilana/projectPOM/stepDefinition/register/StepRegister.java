package co.com.ilana.projectPOM.stepDefinition.register;

import co.com.ilana.projectPOM.page.PageHome;
import co.com.ilana.projectPOM.page.PagePopUpFormSuccess;
import co.com.ilana.projectPOM.page.PageRegister;
import io.cucumber.java.After;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;

import static co.com.ilana.projectPOM.page.Base.edgeDriverConnection;

public class StepRegister {

    private static final String URL_BASE = "https://demoqa.com/";
    private WebDriver driver;
    private static final String PATH_WEBDRIVER = "C:/AutomationTest/retoTecnicoIlanaPOM/src/test/resources/webdriver/edge/msedgedriver.exe";

    @Before
    public void setUp(){
        driver = edgeDriverConnection(PATH_WEBDRIVER,URL_BASE);
    }
    @Given("que el usuario ingresa a la pagina web para la creacion de un registro")
    public void queElUsuarioIngresaALaPaginaWebParaLaCreacionDeUnRegistro() {
        PageHome pageHome = new PageHome(driver);
        pageHome.navigateToForm();
    }

    @When("llena los campos requeridos")
    public void llenaLosCamposRequeridos() {
        PageRegister pageRegister = new PageRegister(driver);
        pageRegister.fillPracticeForm();
    }

    @Then("crea su cuenta con exito")
    public void creaSuCuentaConExito() {
        PagePopUpFormSuccess pagePopUpFormSuccess = new PagePopUpFormSuccess(driver);
        pagePopUpFormSuccess.validateFormSuccess();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
