/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapertemuan2;

import java.util.Scanner;

/**
 *
 * @author Lab Informatika
 */
public class JavaPertemuan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
        //cin   pertama
//        String nama;
//        Scanner input  = new  Scanner (System.in); 
//        System.out.println("Input Nama : "); 
//      
//        nama = input.nextLine(); 
////next();// tidak membaca spasi  
////        nextInt(); 
//System.out.println("Nama Saya = " + nama);   

//Pembuatan objek dan kelas kedua 
Zombie zombie = new  Zombie("Dimasa", 300); 
Slime slime = new Slime ("alex", 200); 
zombie.serang(); 
slime.serang();

    }
    
}
