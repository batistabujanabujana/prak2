/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaencap;

/**
 *
 * @author Lab Informatika
 */
public class User {
    private String username; 
    private String password; 

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
//    Setter(set)= mengisi 
//    Getter (get)= mengambil

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

//    dihapus agar aman 

    public void setPassword(String password) {
        this.password = password;
    }
}
