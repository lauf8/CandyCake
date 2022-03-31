/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Tamanho;
import java.util.ArrayList;


public class TamanhoDAO {
    

    public void insert(Tamanho tamanho){
        Banco.tamanho.add(tamanho);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param tamanho
     * @return 
     */
    public boolean update(Tamanho tamanho){
        
        for (int i = 0; i < Banco.tamanho.size(); i++) {
            if(idSaoIguais(Banco.tamanho.get(i),tamanho)){
                Banco.tamanho.set(i, tamanho);
                return true;
            }
        }
        return false;      

    }
    
 
    public boolean delete(Tamanho tamanho){
        for (Tamanho tamanhoLista : Banco.tamanho) {
            if(idSaoIguais(tamanhoLista,tamanho)){
                Banco.tamanho.remove(tamanhoLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os servicos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Tamanho> selectAll(){
        return Banco.tamanho;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param servico
     * @param servicoAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Tamanho tamanho, Tamanho tamanhoAComparar) {
        return tamanho.getId() ==  tamanhoAComparar.getId();
    }


}
