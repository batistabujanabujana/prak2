/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaexception;

import java.util.Scanner;

/**
 *
 * @author Lab Informatika
 */
public class CobaException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        int nilai =0; 
       Scanner input = new Scanner(System.in); 
//        System.out.print("Masukan nilai :"); 
//      nilai = input.nextInt(); 
//        System.out.println("Nilai : " + nilai); 
        try{ // Masukan nilai
            System.out.println(" Masukan nilai :"); 
             nilai = input.nextInt(); 
    }catch(Exception error){  
            System.out.println("Error =" + error.getMessage());
    }finally{ 
            System.out.println("Nilai :" + nilai);
            
        }
    }
    
}
