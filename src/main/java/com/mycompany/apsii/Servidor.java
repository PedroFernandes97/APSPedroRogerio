
package com.mycompany.apsii;

import com.mycompany.apsii.apsii_U.AcessarPortal;
import com.mycompany.apsii.apsii_U.Facilitador;
import java.util.ArrayList;
import java.util.List;


public class Servidor {
    private ModoDeReceber recebe;
    private Avaliacao avaliado;
    private Facilitador acessoDireto;
    

    public Facilitador getAcessoDireto() {
        return acessoDireto;
    }

    public void setAcessoDireto(Facilitador acessoDireto) {
        this.acessoDireto = acessoDireto;
    }

    public AcessarPortal getAcesso() {
        return acesso;
    }

    public void setAcesso(AcessarPortal acesso) {
        this.acesso = acesso;
    }
    private AcessarPortal acesso;
    
    public void receber(){
        this.recebe.receber();
    }
    
    public void progredir(){
        this.avaliado.progredir();
    }
    
    public void promover(){
        this.avaliado.promover();
    }  
    
    public ModoDeReceber getRecebe() {
        return recebe;
    }

    public void setRecebe(ModoDeReceber recebe) {
        this.recebe = recebe;
    }
    
    public Avaliacao getAvaliado() {
        return avaliado;
    }

    public void setAvaliado(Avaliacao avaliado) {
        this.avaliado = avaliado;
    }
}
