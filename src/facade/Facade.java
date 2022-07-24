package facade;

import subsistema1.crm.CRMService;
import subsistema2.cep.CepAPI;

public class Facade {

    public void migrarCliente(String nome, String cep) {

        String cidade = CepAPI.getInstancia().recuperarCidade(cep);
        String estado = CepAPI.getInstancia().recuperarEstado(cep);

        CRMService.gravarCliente(nome, cep, cidade, estado);
    }

}
