package co.com.ilana.projectPOM.page;

import co.com.ilana.projectPOM.model.DataRegister;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class PageRegister {

    //Model for a student.
    private final DataRegister dataRegister = new DataRegister();
    private WebDriver webDriver;

    //Filling the form, locator.
    private final By txtPracticeForm = By.xpath("//*[@class='main-header' and contains(text(),'Practice Form')]");
    private final By firstName = By.id("firstName");
    private final By lastName = By.id("lastName");
    private final By userEmail = By.id("userEmail");
    private final By male = By.xpath("//label[text()='Male']");
    private final By userNumber = By.id("userNumber");
    private final By dateOfBirthInput = By.id("dateOfBirthInput");
    private final By month = By.xpath("//option[. = '" + dataRegister.getDateOfBirthMonth() + "']");
    private final By year = By.xpath("//option[. = '" + dataRegister.getDateOfBirthYear() + "']");
    private final By day = By.cssSelector(".react-datepicker__day--" + dataRegister.getDateOfBirthDayInFormat() + ":nth-child(1)");
    private final By currentAddress = By.id("currentAddress");
    private final By submit = By.id("submit");
    private final By txtFormSendSuccess = By.id("example-modal-sizes-title-lg");


    public PageRegister(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private void clickOn(By locator) {
        webDriver.findElement(locator).click();
    }


    public void scrollTo(By locator) {
        JavascriptExecutor jse = (JavascriptExecutor) webDriver;
        jse.executeScript("arguments[0].scrollIntoView();", webDriver.findElement(locator));
    }

    public void fillPracticeForm() {
        WebElement validateFormIsPresent = webDriver.findElement(txtPracticeForm);
        assertEquals("Practice Form", validateFormIsPresent.getText());

        scrollTo(firstName);
        WebElement name = webDriver.findElement(firstName);
        name.sendKeys(dataRegister.getFirstName());

        scrollTo(lastName);
        WebElement lastname = webDriver.findElement(lastName);
        lastname.sendKeys(dataRegister.getLastName());

        scrollTo(userEmail);
        WebElement email = webDriver.findElement(userEmail);
        email.sendKeys(dataRegister.getEmail());

        scrollTo(male);
        clickOn(male);

        scrollTo(userNumber);
        WebElement mobil = webDriver.findElement(userNumber);
        mobil.sendKeys(dataRegister.getMobile());

        scrollTo(dateOfBirthInput);
        clickOn(dateOfBirthInput);
        clickOn(month);
        clickOn(year);
        clickOn(day);

        clickOn(currentAddress);
        WebElement sendForm = webDriver.findElement(submit);
        sendForm.submit();

    }

    public void validateFormSuccess() {
        WebElement validateFormIsPresent = webDriver.findElement(txtFormSendSuccess);
        assertEquals("Thanks for submitting the form", validateFormIsPresent.getText());
    }
}