
package com.mycompany.apsii;
import com.mycompany.apsii.FolhaPagamento.Pagamento;
import com.mycompany.apsii.FolhaPagamento.RelatorioPagamentoRH;
import com.mycompany.apsii.FolhaPagamento.RelatorioPagamentoContabilidade;
import com.mycompany.apsii.apsii_U.Facilitador;
import com.mycompany.apsii.apsii_U.LoginServidor;


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
        LoginServidor login = LoginServidor.getInstancia();
        LoginServidor login1 = LoginServidor.getInstancia();
        
    }
    
}
