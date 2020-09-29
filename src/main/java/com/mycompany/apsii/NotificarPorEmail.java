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
public class NotificarPorEmail implements NotificadorDeUsuarios {
    @Override
    public void notificarUsuario() {
         System.out.println("[Celular] Notificação enviada");
    }    
}
