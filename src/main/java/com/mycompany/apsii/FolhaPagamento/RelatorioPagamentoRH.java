
package com.mycompany.apsii.FolhaPagamento;


public class RelatorioPagamentoRH extends Pagamento{
    @Override
    public void receberRelatorio(){
        System.out.println("Relatorio recebido no RH");
    }
}
