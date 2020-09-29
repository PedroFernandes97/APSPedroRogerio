
package com.mycompany.apsii;


public class Servidor {
    private ModoDeReceber recebe;
    private Avaliacao avaliado;
    
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
