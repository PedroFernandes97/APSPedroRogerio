
package com.mycompany.apsii.apsii_U;


public class AcessarPortal {
    
    public void processo(){
         Cadastro novoCadastro = new CadastroBuilder()
                 .setNome("Rogerio")
                 .setCPF("123.456.789-00")
                 .setEndereco("Rua dos bobos")
                 .build();                
         System.out.println("receber codigo de desbloqueio no email");
         System.out.println("desbloquear");
         System.out.println("cadatrar senha");
      
    }
}
