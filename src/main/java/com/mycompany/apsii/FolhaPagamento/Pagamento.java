
package com.mycompany.apsii.FolhaPagamento;

import com.mycompany.apsii.Comunicador;
import java.util.ArrayList;
import java.util.List;


public abstract class Pagamento {
    private List<Comunicador> comunicadores = new ArrayList<>();
    private void modoDeReceber(){
        System.out.println("Recebe dados do ModoDeReceber do servidor");
    }
    
    public void setModoDeComunicacao(Comunicador comunicador){
        comunicadores.add(comunicador);
    }
    
    private void comunicar(){
        comunicadores.forEach((avaliador) -> {
        avaliador.comunicar();
        });
    }
    
    private void avaliar(){
        System.out.println("Recebe dados da Avaliação do servidor");
    }
    
    private void calcular(){
        System.out.println("Dados recebidos e processados");
    }
    public void rodarFolha(){
        modoDeReceber();
        avaliar();
        calcular();
        System.out.println("Relatorio gerado");
        receberRelatorio();
        comunicar();
    }
    protected abstract void receberRelatorio();
}
