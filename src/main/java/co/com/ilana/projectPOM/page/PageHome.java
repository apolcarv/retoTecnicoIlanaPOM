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
    private final By elements = By.xpath("//*[h5='Elements']");
    private final By widgets = By.xpath("//*[h5='Widgets']");
    private final By practiceFormElement = By.xpath("//span[text() = 'Practice Form']");
    private final By btnElement = By.xpath("//span[text() = 'Links']");
    private final By btnWidgets = By.xpath("//span[text() = 'Slider']");

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

    public void navigateToElements() {
        scrollTo(elements);
        clickOn(elements);
        clickOn(btnElement);
    }

    public void navigateToWidgets() {
        scrollTo(widgets);
        clickOn(widgets);

        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,3304)");

        clickOn(btnWidgets);
    }
}