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
public class CadastroBuilder {
    String nome;
    String cpf;
    String cnpj;
    String endereco;
    
    public CadastroBuilder setNome(String nome){
        this.nome = nome;
        return this;
    }
    
    public CadastroBuilder setCPF(String cpf){
        this.cpf = cpf;
        return this;
    }
    
    public CadastroBuilder setCNPJ(String cnpj){
        this.cnpj = cnpj;
        return this;
    }
    
    public CadastroBuilder setEndereco(String endereco){
        this.endereco = endereco;
        return this;
    }
    
    public Cadastro build(){
        System.out.println("(Builder) Novo cadastro...");
        System.out.println("Nome: "+nome);
        if(cpf != null) System.out.println("CPF: "+cpf);
        if(cnpj != null) System.out.println("CNPJ: "+cnpj);
        System.out.println("Endereco: "+endereco);
        System.out.println();
        return new Cadastro(this);
    }
}
