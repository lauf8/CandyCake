/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Helper;

import Model.Usuario;
import View.Login;
import View.Principal;
import controller.Helper.IHelper;
/**
 *
 * @author Pichau
 */
public class HelperLogin implements IHelper{  

    private final Login view1;

    public HelperLogin(Login view1) {
        this.view1 = view1;
    }

    public HelperLogin(Principal view) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
                
    @Override
    public  Usuario obterModelo(){       
        String user = view1.getUser().getText();//traz o texto do user
        String password = view1.getPassword().getText();//traz o texto da senha
        Usuario modelo = new Usuario(password,user,1,"Lucas","lucasafonsodesouza@gmail.com");
        return modelo;
         
    }

 
     
    }

