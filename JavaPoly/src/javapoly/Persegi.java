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
public class Persegi extends BangurData {
    int s; 

    public Persegi(int s) {
        this.s = s;
    } 
    @Override //wajib
    double luas(){
       return s*s; 
       
    } @Override
    //pi hanya double 
    double keliling(){
       return 4*s; 
    }
    
}
