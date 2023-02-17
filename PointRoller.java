/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crapssimulator;
import java.util.*;
/**
 *
 * @author Walter Beardman wabdgz
 */
public class PointRoller extends Rolling{
    public int point;
   
    
    public PointRoller(int point){
        this.point = point;
    }
    
    
    @Override
    public void MenuDisplay(){
        
        System.out.println("--------------------");
        System.out.println("The point is " + point);
        System.out.println("--------------------");
        System.out.println("Press Enter to roll.");
        Scanner input = new Scanner(System.in);
        input.nextLine();
        
        int roll = PointRoll();
        
        if(roll == point){
            Win();
        }
        else{
            switch(roll){
            case 7:
                Lose();
                break;
                
            default:
                MenuDisplay();
                
        }
        }
        
        
        
                
    }
    
    
    public int PointRoll(){
        
        int roll = Roll();
        System.out.println("--------------------");
        System.out.println("You rolled" +" "+ roll);
        System.out.println("--------------------");
        
        return roll;
       
    }
    
}//end of class
