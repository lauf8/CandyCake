/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Bolo;
import Model.Cliente;
import Model.DAO.BoloDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.RecheioDAO;
import Model.DAO.TamanhoDAO;
import Model.Recheio;
import Model.Tamanho;
import View.Agendamento;
import controller.Helper.HelperAgenda;
import java.util.ArrayList;

/**
 *
 * @author Pichau
 */
public class AgendaControll {
    private final Agendamento view;
    private final HelperAgenda helper;

    public AgendaControll(Agendamento view) {
        this.view = view;
        this.helper = new HelperAgenda(view);
    }
    
    public void atualizaTabela(){
        
       BoloDAO boloDAO = new BoloDAO();
        ArrayList<Bolo> bolos = boloDAO.selectAll();
        helper.fazerTabela(bolos);    
    }
    
    public void atualizaCliente(){
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        helper.preencherClientes(clientes);
        
    }
    
    public void atualizaRecheio(){
        RecheioDAO recheioDAO = new RecheioDAO();
        ArrayList<Recheio> recheios = recheioDAO.selectAll();
        helper.preencherRecheios(recheios);
        
    }
    
    public void atualizaTamanho(){
        TamanhoDAO tamanhoDAO = new TamanhoDAO();
        ArrayList<Tamanho> tamanhos = tamanhoDAO.selectAll();
        helper.preencherTamanhos(tamanhos);
        
    }
    
    public void agendar(){
        
        Bolo agendamento = helper.obterModelo();
        new BoloDAO().insert(agendamento);
        atualizaTabela();
        
    }

    
}
 