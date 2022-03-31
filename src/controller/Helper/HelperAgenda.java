/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Helper;

import Model.Bolo;
import Model.Cliente;
import Model.Recheio;
import Model.Tamanho;
import View.Agendamento;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pichau
 */
public class HelperAgenda implements IHelper{
    private final Agendamento view;

    public HelperAgenda(Agendamento view) {
        this.view = view;
    }
    
    
    public Recheio obterRecheio(){
        return (Recheio)view.getRecheios().getSelectedItem();
    }
    
     public Tamanho obterTamanho(){
        return (Tamanho)view.getTamanho().getSelectedItem();
    }
    
    
    public Cliente obterCliente(){
        return (Cliente)view.getClientes().getSelectedItem();
    }
 


    public void fazerTabela(ArrayList<Bolo> bolos) {
        DefaultTableModel tableModel = (DefaultTableModel) view.getTabela().getModel();
        tableModel.setNumRows(0);
        
        for (Bolo bolo : bolos) {
            tableModel.addRow(new Object[]{
                bolo.getCliente().getNome(),
                bolo.getRecheio().getRecheio(),
                bolo.getTamanho(),
                bolo.getData()
            });
            
        }            
        
    } 
    
    public void preencherClientes(ArrayList<Cliente> clientes) {
        DefaultComboBoxModel comboBoxModel;
        comboBoxModel = (DefaultComboBoxModel)view.getClientes().getModel();
        for(Cliente cliente : clientes) {
        
        comboBoxModel.addElement(cliente);
            
        }
    }
        
    public void preencherRecheios(ArrayList<Recheio> recheios){
        DefaultComboBoxModel comboBoxModel;
        comboBoxModel = (DefaultComboBoxModel)view.getRecheios().getModel();
        for(Recheio recheio : recheios) {
             
            comboBoxModel.addElement(recheio);
            
        }
        
    }
      public void preencherTamanhos(ArrayList<Tamanho> tamanhos){
        DefaultComboBoxModel comboBoxModel;
        comboBoxModel = (DefaultComboBoxModel)view.getTamanho().getModel();
        for(Tamanho tamanho : tamanhos) {
             
            comboBoxModel.addElement(tamanho);
            
        }
        
    }
    
        
    @Override
    public Bolo obterModelo() {
         Cliente cliente = obterCliente();
         Recheio recheio = obterRecheio();
         Tamanho tamanho = obterTamanho();
         String data = view.getData().getText();
         Bolo bolo = new Bolo(cliente,recheio,tamanho,data);
         return bolo;
              
    }

    }
    
    

