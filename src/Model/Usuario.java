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
public class Usuario extends Sapiens {
    private String password;
    private String user;

    


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Usuario(String password, String user, int id, String nome, String email) {
        super(id, nome, email);
        this.password = password;
        this.user = user;
    }


   


    
}
