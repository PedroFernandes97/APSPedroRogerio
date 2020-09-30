/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.apsii;

/**
 *
 * @author pedfe
 */
public class ComunicarAvaliadoPorSMS implements Comunicador {

    @Override
    public void comunicar() {
        System.out.println("Avaliado foi comunicado via mensagem de texto SMS.");
    }
}
