/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapertemuan2;

// claass oirangtua
public class Musuh { 
    String  nama; 
    int nyawa; 

    public Musuh(String nama, int nyawa) {
        this.nama = nama;
        this.nyawa = nyawa;
    }
    
     void serang() {
        System.out.println(nama + " menyerang");
    } 
    
}
