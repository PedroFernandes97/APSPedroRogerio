
package com.mycompany.apsii;


public class Main {

   
    public static void main(String[] args) {
        Servidor s = new Servidor();
        s.setRecebe(new Trabalhar());
        s.setAvaliado(new Normal());
        s.receber();
        s.progredir();
        s.promover();
        
        
    }
    
}
