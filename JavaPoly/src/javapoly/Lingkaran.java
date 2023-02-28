/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoly;

/**
 *
 * @author Lab Informatika
 */
public class Lingkaran extends BangurData { 
    int jari;  

    public Lingkaran(int jari) {
        this.jari = jari; 
        
    }
    @Override //wajib
    double luas(){
       return Math.PI*jari*jari; 
       
    } @Override
    //pi hanya double 
    double keliling(){
       return 2*Math.PI*jari; 
    }
}
