package hellocucumber.pageObejcts;

import hellocucumber.selenium.UtilsSelenium;

public class BuscaCepPageActions extends  BuscaCepPageElementMap {

    public void informaCep(String cep) {
        UtilsSelenium.waitVisibleElement(informaCep);
        informaCep.sendKeys(cep);
        buscar.click();
    }

    public void mostraNomeRua(String rua){
        informaNomeRua.sendKeys(rua);
    }
}
