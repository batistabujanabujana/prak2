/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapertemuan2;

/**
 *
 * @author Lab Informatika
 */
public class Zombie extends Musuh{  
    
    public Zombie(String nama, int nyawa) {
        super(nama, nyawa);
    }
    void darah() { 
        System.out.println("punya nyawa " + nyawa); 
        
    } 
    
    
}
