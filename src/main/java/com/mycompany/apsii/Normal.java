
package com.mycompany.apsii;


public class Normal implements Avaliacao{
      @Override
    public void progredir(){
        System.out.println("Há apenas a progressão");        
    }
    
    @Override
      public void promover(){
        System.out.println("Não dá ainda pra promoção");        
    }
}
