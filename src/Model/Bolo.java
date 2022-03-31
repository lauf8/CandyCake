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
public class Bolo {
    private int id;
    private Cliente cliente;
    private Tamanho tamanho;
    private Recheio recheio;
    private String data;

    public Bolo(int id, Cliente cliente, Tamanho tamanho, Recheio recheio, String data) {
        this.id = id;
        this.cliente = cliente;
        this.tamanho = tamanho;
        this.recheio = recheio;
        this.data = data;
    }
    
    public Bolo( Cliente cliente, Recheio recheio, Tamanho tamanho,String data) {
        this.cliente = cliente;
        this.recheio = recheio;
        this.tamanho = tamanho;
        this.data = data;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public Recheio getRecheio() {
        return recheio;
    }

    public void setRecheio(Recheio recheio) {
        this.recheio = recheio;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
