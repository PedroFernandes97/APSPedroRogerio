
package com.mycompany.apsii;


public class Ruim implements Avaliacao{
    @Override
    public void progredir(){
        System.out.println("Não há progressão");        
    }
    
    @Override
      public void promover(){
        System.out.println("Não há promoção");        
    }
}
