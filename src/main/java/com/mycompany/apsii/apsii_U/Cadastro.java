/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.apsii.apsii_U;

/**
 *
 * @author pedfe
 */
public class Cadastro {
    String nome;
    String cpf;
    String cnpj;
    String endereco;
    
    public Cadastro(String nome, String endereco, String cpf, String cnpj){
        this.nome = nome;
        this.cnpj = cpf;
        this.cpf = cnpj;
        this.endereco = endereco;
    }
    
    public Cadastro(CadastroBuilder builder){
        this.nome = builder.nome;
        this.cpf = builder.cpf;
        this.cnpj = builder.cnpj;
        this.endereco = builder.endereco;
    }
}
