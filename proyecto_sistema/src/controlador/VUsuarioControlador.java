/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JOptionPane;
import modelo.usuario;
import modelo.usuarioDAO;
import vista.login;

/**
 *
 * @author spaul
 */
public class VUsuarioControlador implements InterfaceValidacion{
    
    private login login;
    private usuarioDAO usuarioDao;
    private usuario usuario;

    public VUsuarioControlador() {
        usuarioDao = new usuarioDAO();
        usuario = new usuario();
        login = new login(this);
        
    }

    @Override
    public void recibeUsuario(String texto){
        if(texto.length() > 1){
            usuario.setUsuario(texto);
        }
    }
    
    @Override
    public void recibeContrasenia(String texto){
        if(texto.length() > 1){
            usuario.setContrasenia(texto);
        }
    }
    
    @Override
    public void accionEntrar(){
        if(usuarioDao.getUsuario(usuario)){
            login.dispose();
            
        }else{
            JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrecta");
        }
    }
}
