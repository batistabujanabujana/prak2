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
public class Square extends Shape{  
    private float sisi; 

    public Square(float sisi) {
        this.sisi = sisi;
    }
    

    @Override 
            //menghitung luas getarea
    float getArea() {
       return sisi*sisi; 
    }
    
}
