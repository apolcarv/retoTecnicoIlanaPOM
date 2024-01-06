package co.com.ilana.projectPOM.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class PageSlider {

    private WebDriver webDriver;

    private final By sliderLocator = By.xpath("//*[@id='sliderContainer']/div[1]/span/input");
    private final By sliderValue = By.xpath("//*[@id='sliderValue' and  @value='3']");

    public PageSlider(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void slider() throws InterruptedException {

        WebElement slider = webDriver.findElement(sliderLocator);
        int sliderWidth = slider.getSize().getWidth();
// Calcular la posición a la que se desea arrastrar el slider (puedes ajustar este valor)
        int posicionDeseada = -45;

// Calcular la posición final en píxeles
        int posicionFinal = (int) (sliderWidth * (posicionDeseada / 100.0));
//EntrytimeOut
      Thread.sleep(1000);
// Utilizar Actions para realizar la acción de arrastrar y soltar dejando en la posicion 3
        Actions actions = new Actions(webDriver);
        actions.dragAndDropBy(slider, posicionFinal, 0).build().perform();
//EntrytimeOut
        Thread.sleep(3000);
    }

    public void compareValues(){
        WebElement campoInput = webDriver.findElement(sliderValue);
        String valueField = campoInput.getAttribute("value");
        assertEquals("3", valueField);
    }
}
