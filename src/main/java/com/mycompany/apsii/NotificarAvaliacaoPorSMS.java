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

/**
 *
 * @author pedfe
 */
public class NotificarAvaliacaoPorSMS implements Avaliador {
    @Override
    public void notificarServidor() {
         System.out.println("[SMS]: Notificação enviada!");
    }    
}
