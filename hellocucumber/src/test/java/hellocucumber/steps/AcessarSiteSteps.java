package hellocucumber.steps;

import cucumber.api.java.pt.Dado;
import hellocucumber.selenium.ChromeDriver;

public class AcessarSiteSteps {

    String url = "http://www.buscacep.correios.com.br/sistemas/buscacep/buscaCepEndereco.cfm";

    @Dado("acessei o site dos correios")
    public void acesseiOSiteDosCorreios() {
        ChromeDriver.getDriver().get(url);
    }
}
