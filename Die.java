/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crapssimulator;

/**
 *
 * @author walter beardman wabdgz
 */
public class Die {
    int die1;
    int die2;
    int sum;
    
    public int Roll(){
        die1 = (int)(Math.random()*6+1);
        die2 = (int)(Math.random()*6+1);
        sum = die1 + die2;
        
        return sum;
    }
    
}
