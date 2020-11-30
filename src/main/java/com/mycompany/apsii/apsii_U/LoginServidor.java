
package com.mycompany.apsii.apsii_U;


public class LoginServidor {
    public static LoginServidor instancia;
    
    private LoginServidor(){
        System.out.println("logando no Portal...");
    }

    public static LoginServidor getInstancia() {
        if(instancia == null){
            instancia = new LoginServidor();
        }
        return instancia;
    }

    public static void setInstancia(LoginServidor instancia) {
        LoginServidor.instancia = instancia;
    }
}
