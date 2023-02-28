/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohabstract;

/**
 *
 * @author Lab Informatika
 */
public class ContohAbstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
        Shape persegi = new Square(7); 
        persegi.setColor("Biru"); 
        System.out.println("luas persegi =" + persegi.getArea());  
        System.out.println("warna  persegi =" + persegi.getColor());
    }
    
}
