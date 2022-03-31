/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Pichau
 */
 public class Recheio{
        public int id;
        public String recheio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public Recheio(int id, String recheio) {
        this.id = id;
        this.recheio = recheio;
    }
    
    @Override
    public String toString(){
        return getRecheio();
    }
    }
