
package com.mycompany.apsii;


public class Aposentadoria implements ModoDeReceber {
    @Override
    public void receber(){
        System.out.println("Recebe com paridade");
    }
}
