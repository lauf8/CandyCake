/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Cadastro;
import View.Login;
import View.Principal;
import controller.Helper.HelperLogin;

/**
 *
 * @author Pichau
 */
public class LoginControll  {
    private final Login view;
    private HelperLogin helper;
    public LoginControll(Login view) {
        this.view = view;
        this.helper = new HelperLogin(view);
    } 
    
   
    
    public void entrarSistema(){
       Usuario login = helper.obterModelo();
       UsuarioDAO bancoentrar = new UsuarioDAO();
       Usuario usuarioAutenticado = bancoentrar.selectPorNomeESenha(login);
       if(usuarioAutenticado != null){
          Principal menu = new Principal();
          menu.setVisible(true);
          this.view.dispose();
           
       }else{
           view.mostrarMensagem("Usuario ou senha invalida");
           
       }
        
    }
    
}
