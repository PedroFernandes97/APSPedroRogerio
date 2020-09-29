
package com.mycompany.apsii;


public class Servidor {
    private ModoDeReceber recebe;
    
    public void ModoDeReceber(){
        this.recebe.receber();
    }

    public ModoDeReceber getRecebe() {
        return recebe;
    }

    public void setRecebe(ModoDeReceber recebe) {
        this.recebe = recebe;
    }
}
