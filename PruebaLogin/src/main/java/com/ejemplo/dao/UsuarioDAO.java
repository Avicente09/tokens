/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.dao;

/**
 *
 * @author avicente09
 */
public class UsuarioDAO {

    public static boolean validar(String username, String password) {
        Boolean valorRetorno = false;
        if (username.equals("admin") && password.equals("202cb962ac59075b964b07152d234b70")) {
            valorRetorno = true;
        }
        return valorRetorno;
    }

}
