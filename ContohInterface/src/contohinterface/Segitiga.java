/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohinterface;

/**
 *
 * @author Lab Informatika
 */
public class Segitiga implements BangunDatar {
  int alas, tinggi; 

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
    double luas= (alas*tinggi)/2; 
    return(luas); 
    }
  
}
