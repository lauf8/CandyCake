/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Bolo;
import java.util.ArrayList;


public class BoloDAO {
    

    public void insert(Bolo bolo){
        Banco.bolo.add(bolo);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param bolo
     * @return 
     */
    public boolean update(Bolo bolo){
        
        for (int i = 0; i < Banco.bolo.size(); i++) {
            if(idSaoIguais(Banco.bolo.get(i),bolo)){
                Banco.bolo.set(i, bolo);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do servico passado
     * @return 
     */
    public boolean delete(Bolo bolo){
        for (Bolo servicoLista : Banco.bolo) {
            if(idSaoIguais(servicoLista,bolo)){
                Banco.bolo.remove(servicoLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os servicos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Bolo> selectAll(){
        return Banco.bolo;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param servico
     * @param servicoAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Bolo servico, Bolo servicoAComparar) {
        return servico.getId() ==  servicoAComparar.getId();
    }

    public void insert(ArrayList<Bolo> bolo) {
        
    }

}
