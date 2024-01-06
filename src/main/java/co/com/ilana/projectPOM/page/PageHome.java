package co.com.ilana.projectPOM.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class PageHome {

    private WebDriver webDriver;
    //Browsing to the form.
    private final By cardForms = By.xpath("//*[@class='category-cards']");
    private final By forms = By.xpath("//*[h5='Forms']");
    private final By practiceFormElement = By.xpath("//span[text() = 'Practice Form']");

    public PageHome(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private void clickOn(By locator) {
        webDriver.findElement(locator).click();
    }

    public void scrollTo(By locator){
        JavascriptExecutor jse = (JavascriptExecutor)webDriver;
        jse.executeScript("arguments[0].scrollIntoView();",webDriver.findElement(locator));
    }

    public void navigateToForm() {
        assertEquals("DEMOQA",webDriver.getTitle());
        scrollTo(cardForms);
        clickOn(forms);
        clickOn(practiceFormElement);

    }
}