package hellocucumber.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriver {

    private static WebDriver driver;

    public ChromeDriver() {
        setUp();
    }

    public void setUp() {
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
        WebDriverManager.chromedriver().version("76.0.3809.68").setup();
        driver = new org.openqa.selenium.chrome.ChromeDriver(options);
        setDriver(driver);
    }

    public static WebDriver getDriver() {
        return (WebDriver) driver;
    }

    private void setDriver(WebDriver driver) {
        ChromeDriver.driver = driver;
    }
}