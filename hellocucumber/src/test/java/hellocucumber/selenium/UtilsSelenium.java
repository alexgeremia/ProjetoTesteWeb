package hellocucumber.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilsSelenium {

    public static void waitVisibleElement(WebElement elemento) {
        WebDriverWait wait = new WebDriverWait(ChromeDriver.getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOf(elemento));
    }
}
