
package com.mycompany.apsii.FolhaPagamento;


public class RelatorioPagamentoContabilidade extends Pagamento {
    @Override
    public void receberRelatorio(){
        System.out.println("Contabilizando folha de pagamento");
    }
}
