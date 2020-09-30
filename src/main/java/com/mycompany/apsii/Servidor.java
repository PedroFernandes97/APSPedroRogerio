
package com.mycompany.apsii;

import java.util.ArrayList;
import java.util.List;


public class Servidor {
    private List<Comunicador> comunicadores = new ArrayList<>();
    private ModoDeReceber recebe;
    private Avaliacao avaliado;
    
    public void adicionarMetodoDeComunicacaoDoAvaliador(Comunicador comunicador){
        comunicadores.add(comunicador);
    }
    
    private void comunicarAvaliado(){
        comunicadores.forEach((avaliador) -> {
            avaliador.comunicar();
        });
    }
    
    public void receber(){
        this.recebe.receber();
    }
    
    public void progredir(){
        this.avaliado.progredir();
    }
    
    public void promover(){
        this.avaliado.promover();
        comunicarAvaliado();
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
