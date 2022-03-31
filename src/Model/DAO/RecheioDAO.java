/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Recheio;
import java.util.ArrayList;


public class RecheioDAO {
    

    public void insert(Recheio recheio){
        Banco.recheio.add(recheio);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param recheio
     * @return 
     */
    public boolean update(Recheio recheio){
        
        for (int i = 0; i < Banco.recheio.size(); i++) {
            if(idSaoIguais(Banco.recheio.get(i),recheio)){
                Banco.recheio.set(i, recheio);
                return true;
            }
        }
        return false;      

    }
    
 
    public boolean delete(Recheio recheio){
        for (Recheio recheioLista : Banco.recheio) {
            if(idSaoIguais(recheioLista,recheio)){
                Banco.recheio.remove(recheioLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os servicos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Recheio> selectAll(){
        return Banco.recheio;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param servico
     * @param servicoAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Recheio recheio, Recheio recheioAComparar) {
        return recheio.getId() ==  recheioAComparar.getId();
    }


}
