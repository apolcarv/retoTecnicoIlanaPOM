package co.com.ilana.projectPOM.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class PagePopUpFormSuccess {
    private WebDriver webDriver;

    public PagePopUpFormSuccess(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private final By txtFormSendSuccess = By.id("example-modal-sizes-title-lg");

    public void validateFormSuccess() {
        WebElement validateFormIsPresent = webDriver.findElement(txtFormSendSuccess);
        assertEquals("Thanks for submitting the form", validateFormIsPresent.getText());
    }
}