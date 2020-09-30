
package com.mycompany.apsii;
import com.mycompany.apsii.FolhaPagamento.Pagamento;
import com.mycompany.apsii.FolhaPagamento.RelatorioPagamentoRH;
import com.mycompany.apsii.FolhaPagamento.RelatorioPagamentoContabilidade;


public class Main {
   
    public static void main(String[] args) {
        Servidor s = new Servidor();
        Pagamento f = new RelatorioPagamentoContabilidade();
        f.setModoDeComunicacao(new ComunicarPorEmail());
        f.setModoDeComunicacao(new ComunicarPorSMS());
        s.setRecebe(new Trabalhar());
        s.setAvaliado(new Normal());
        s.receber();
        s.progredir();
        s.promover();
        f.rodarFolha();
        
    }
    
}
