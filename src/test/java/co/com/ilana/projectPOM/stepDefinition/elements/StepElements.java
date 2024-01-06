package co.com.ilana.projectPOM.stepDefinition.elements;

import io.cucumber.java.After;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.WebDriver;

public class StepElements {

    private WebDriver driver;

    @Dado("que el usuario ingresa a la pagina web para la verificacion de algunos enlaces")
    public void queElUsuarioIngresaALaPaginaWebParaLaVerificacionDeAlgunosEnlaces() {

    }

    @Cuando("interactua con cada uno de los elementos verificando que se carguen y visualicen las paginas correctamente")
    public void interactuaConCadaUnoDeLosElementosVerificandoQueSeCarguenYVisualicenLasPaginasCorrectamente() {

    }

    @Entonces("obtiene todos los enlaces cargados en el pagina y clickea en orden alfabetico")
    public void obtieneTodosLosEnlacesCargadosEnElPaginaYClickeaEnOrdenAlfabetico() {

    }

    @After
    public void tearDown(){
        driver.quit();
    }
}