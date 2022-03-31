/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Cliente;
import Model.Bolo;
import Model.Recheio;
import Model.Tamanho;
import Model.Usuario;
import java.util.ArrayList;


public class Banco {
    
    public static ArrayList<Usuario> usuario;
    public static ArrayList<Cliente> cliente;
    public static ArrayList<Bolo> bolo;
    public static ArrayList<Recheio> recheio;
    public static ArrayList<Tamanho> tamanho;

    
    public static void inicia(){
    
        //Instancia os Objetos
        usuario = new ArrayList<>();
        cliente = new ArrayList<>();
        bolo = new ArrayList<>();
        recheio = new ArrayList<>();
        tamanho = new ArrayList<>();
        
        //criando elementos
        
        Usuario usuario1 = new Usuario("lucas","lucas",1,"Lucas","lucasafonsodesouza@gmail.com");
        
         
        Cliente cliente1 = new Cliente("9811236", "Rua do Cordel,37,centro",1, "Enzo Afonso", "enzinho@gmail.com");
        Cliente cliente2 = new Cliente("9565656", "Rua EverGreen,37,centro",1, "Marcelo Dantas", "marcelinho@gmail.com");
        Cliente cliente3 = new Cliente("9546465", "Rua da China,396,centro",1, "Thaigo Gustavo", "thiagu@gmail.com");
        Cliente cliente4 = new Cliente("98656566", "Rua do Embaixador,37,centro",1, "Andressa Duarte", "duartedessa@gmail.com");
        Cliente cliente5 = new Cliente("94545555", "Rua do Final,37,centro",1, "Thais França", "francethais@gmail.com");
        Cliente cliente6 = new Cliente("948465456", "Rua  Comandante Porto,37,centro",1, "Marcela Alves", "marcela.alves@gmail.com");
        
        Recheio recheio1 = new Recheio(1,"Maracuja");
        Recheio recheio2 = new Recheio(2,"Chocolate");
        Recheio recheio3 = new Recheio(3,"Abacaxi");
        
        Tamanho tamanho1 = new Tamanho(1,"Micro");
        Tamanho tamanho2 = new Tamanho(2,"Pequeno");
        Tamanho tamanho3 = new Tamanho(3,"Médio");
        Tamanho tamanho4 = new Tamanho(4,"Grande");
        Tamanho tamanho5 = new Tamanho(5,"Enorme");
        Tamanho tamanho6 = new Tamanho(6,"BigMom");
        
        Bolo bolo1 = new Bolo(1, cliente1,tamanho2,recheio1,"20/10//2000");
        Bolo bolo2 = new Bolo(2, cliente1,tamanho5,recheio2,"20/03/2021");
        Bolo bolo3 = new Bolo(3, cliente3,tamanho6,recheio1,"20/03/2021");
        Bolo bolo4 = new Bolo(4, cliente4,tamanho1,recheio3,"20/03/2021");
        Bolo bolo5 = new Bolo(5, cliente5,tamanho3,recheio1,"20/03/2021");
        Bolo bolo6 = new Bolo(6, cliente6,tamanho4,recheio1,"20/03/2021");
        
        
        
        
        
        usuario.add(usuario1);
        
        
        cliente.add(cliente1);
        cliente.add(cliente2);
        cliente.add(cliente3);
        cliente.add(cliente4);
        cliente.add(cliente5);
        cliente.add(cliente6);
        
        recheio.add(recheio1);
        recheio.add(recheio2);
        recheio.add(recheio3);
        
        tamanho.add(tamanho1);
        tamanho.add(tamanho2);
        tamanho.add(tamanho3);
        tamanho.add(tamanho4);
        tamanho.add(tamanho5);
        tamanho.add(tamanho6);
        
        bolo.add(bolo1);
        bolo.add(bolo2);
        bolo.add(bolo3);
        bolo.add(bolo4);
        bolo.add(bolo5);
        bolo.add(bolo6);
        
        

    }

    
    
}
