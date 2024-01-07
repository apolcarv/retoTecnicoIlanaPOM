package co.com.ilana.projectPOM.page;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PageElements {

    private WebDriver webDriver;

    public PageElements(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private final By locatorHome = By.id("simpleLink");
    private final By locatorHomeFzcia = By.id("dynamicLink");
    private final By locatorCreated = By.id("created");
    private final By locatorNoContent = By.id("no-content");
    private final By locatorMoved = By.id("moved");
    private final By locatorBadRequest = By.id("bad-request");
    private final By locatorUnauthorized = By.id("unauthorized");
    private final By locatorForbidden = By.id("forbidden");
    private final By locatorInvalidUrl = By.id("invalid-url");
    private final By txtResponse = By.id("linkResponse");

    private void clickOn(By locator) {
        webDriver.findElement(locator).click();
    }

    public void scrollTo(By locator) {
        JavascriptExecutor jse = (JavascriptExecutor) webDriver;
        jse.executeScript("arguments[0].scrollIntoView();", webDriver.findElement(locator));
    }

    public void openLink() throws InterruptedException {
        Thread.sleep(1000);
        clickOn(locatorHome);
        assertEquals("DEMOQA", webDriver.getTitle());
        webDriver.switchTo().window(webDriver.getWindowHandles().toArray()[0].toString());
        clickOn(locatorHomeFzcia);
        assertEquals("DEMOQA", webDriver.getTitle());
        webDriver.switchTo().window(webDriver.getWindowHandles().toArray()[2].toString());
        webDriver.close();
        webDriver.switchTo().window(webDriver.getWindowHandles().toArray()[1].toString());
        webDriver.close();
        webDriver.switchTo().window(webDriver.getWindowHandles().toArray()[0].toString());

    }

    public void openLinkStatic() throws InterruptedException {
        scrollTo(locatorCreated);

        clickOn(locatorCreated);
        Thread.sleep(1000);
        WebElement txtCreated = webDriver.findElement(txtResponse);
        String valueCreate = txtCreated.getText();
        assertEquals("Link has responded with staus 201 and status text Created", valueCreate);

        clickOn(locatorNoContent);
        Thread.sleep(1000);
        WebElement txtNoContent = webDriver.findElement(txtResponse);
        String valueNoContent = txtNoContent.getText();
        assertEquals("Link has responded with staus 204 and status text No Content", valueNoContent);

        clickOn(locatorMoved);
        Thread.sleep(1000);
        WebElement txtMoved = webDriver.findElement(txtResponse);
        String valueMoved = txtMoved.getText();
        assertEquals("Link has responded with staus 301 and status text Moved Permanently", valueMoved);

        clickOn(locatorBadRequest);
        Thread.sleep(1000);
        WebElement txtBadRequest = webDriver.findElement(txtResponse);
        String valueBadRequest = txtBadRequest.getText();
        assertEquals("Link has responded with staus 400 and status text Bad Request", valueBadRequest);

        clickOn(locatorUnauthorized);
        Thread.sleep(1000);
        WebElement txtUnauthorized = webDriver.findElement(txtResponse);
        String valueUnauthorized = txtUnauthorized.getText();
        assertEquals("Link has responded with staus 401 and status text Unauthorized", valueUnauthorized);

        clickOn(locatorForbidden);
        Thread.sleep(1000);
        WebElement txtForbidden = webDriver.findElement(txtResponse);
        String valueForbidden = txtForbidden.getText();
        assertEquals("Link has responded with staus 403 and status text Forbidden", valueForbidden);

        clickOn(locatorInvalidUrl);
        Thread.sleep(1000);
        WebElement txtInvalidUrl = webDriver.findElement(txtResponse);
        String valueInvalidUrl = txtInvalidUrl.getText();
        assertEquals("Link has responded with staus 404 and status text Not Found", valueInvalidUrl);
    }

    public void linkAlphabet() throws InterruptedException {
        scrollTo(locatorCreated);
        // Agregar elementos a la lista segun el orden que se encuentra en la pagina
        List<String> stringList = new ArrayList<>();
        stringList.add("Created");
        stringList.add("No Content");
        stringList.add("Moved");
        stringList.add("Bad Request");
        stringList.add("Unauthorized");
        stringList.add("Forbidden");
        stringList.add("Not Found");

        // Ordenar los textos de los enlaces alfabéticamente
        Collections.sort(stringList);

        for (int i = 0; i < 6; i++) {
            // Buscar el primer enlace con el texto ordenado
            String firstTextLink = stringList.get(i);
            WebElement primerEnlace = webDriver.findElement(By.xpath("//a[contains(text(), '" + firstTextLink + "')]"));
            // Hacer clic en el primer enlace
            primerEnlace.click();
            Thread.sleep(1000);
        }
    }
}