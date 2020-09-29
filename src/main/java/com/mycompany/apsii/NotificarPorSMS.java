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
public class NotificarPorSMS implements NotificadorDeUsuarios {
    @Override
    public void notificarUsuario() {
         System.out.println("[SMS] Notificação enviada!");
    }    
}
