package hellocucumber.steps;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import hellocucumber.pageObejcts.BuscaCepPageActions;

public class BuscarInformacoesDeEnderecoPeloCep {

    @Quando("digitar o cep {string}")
    public void digitarOCep(String cep){
        BuscaCepPageActions busca = new BuscaCepPageActions();
        busca.informaCep(cep);
    }

    @Então("deverá trazer o nome rua {string}")
    public void deveraTrazerONomeRua(String rua) {
        BuscaCepPageActions nomeRua = new BuscaCepPageActions();
        nomeRua.mostraNomeRua(rua);
    }
}
