package hellocucumber.steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import hellocucumber.selenium.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook {
    private ChromeDriver chrome;

    @Before("@web")
    public void beforeScenario() {
        this.chrome = new ChromeDriver();
    }

    @After("@web")
    public void afterScenario(Scenario scenario) {
        TakesScreenshot ts = (TakesScreenshot) chrome.getDriver();
        byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png");
        chrome.getDriver().close();
        chrome.getDriver().quit();
    }
}