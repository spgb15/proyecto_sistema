/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.principal;


/**
 *
 * @author spaul
 */
public class main {
    private VUsuarioControlador vUsuario;
    
    public main(){
        vUsuario = new VUsuarioControlador();
        
    }
    
    public static void main(String[] args) {
        new main();
        principal princ = new principal();
        princ.iniciar();
    }
}
