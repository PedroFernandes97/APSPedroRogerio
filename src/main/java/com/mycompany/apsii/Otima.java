
package com.mycompany.apsii;


public class Otima implements Avaliacao {
      @Override
    public void progredir(){
        System.out.println("Estágio acima da progressão");        
    }
    
    @Override
      public void promover(){
        System.out.println("Mereceu a promoção!");        
    }
}
