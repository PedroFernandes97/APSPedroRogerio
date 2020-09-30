
package com.mycompany.apsii.FolhaPagamento;


public abstract class Pagamento {
    private void modoDeReceber(){
        System.out.println("Recebe dados do ModoDeReceber do servidor");
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
    }
    protected abstract void receberRelatorio();
}
