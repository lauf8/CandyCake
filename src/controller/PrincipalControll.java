/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import View.Agendamento;
import View.Cadastro;
import View.Principal;


/**
 *
 * @author Pichau
 */

    
 public class PrincipalControll {
     
     
    private final Principal view;
    private PrincipalControll helper1;

    public PrincipalControll(Principal view) {
        this.view = view;
        this.helper1 = helper1;
    }
    
    


    public void abrirCadastro(){
        Cadastro cadastro = new Cadastro();
        cadastro.setVisible(true);
    }
    
    public void abriBolo(){
        Agendamento agenda = new Agendamento();
        agenda.setVisible(true);
    }
 }


    
    
