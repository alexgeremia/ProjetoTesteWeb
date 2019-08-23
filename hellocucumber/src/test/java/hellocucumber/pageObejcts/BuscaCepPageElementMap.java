package hellocucumber.pageObejcts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuscaCepPageElementMap {

    @FindBy(xpath = "//*[@id=\"Geral\"]/div/div/span[2]/label/input")
    WebElement informaCep;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div/div[2]/div[2]/div[2]/table/tbody/tr[2]/td[1]")
    WebElement informaNomeRua;

    @FindBy(xpath = "//*[@id=\"Geral\"]/div/div/div[6]/input")
    WebElement buscar;
}
