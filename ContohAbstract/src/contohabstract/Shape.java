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
public abstract class Shape {
    String  color;  
    
public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    abstract float getArea(); 
    
}
