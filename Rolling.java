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
public class Rolling extends GameMenu{
   
    
    
    @Override
    public void MenuDisplay(){
        System.out.println("--------------------");
        System.out.println("Play");
        System.out.println("--------------------");
        System.out.println("Press Enter for the Come Out roll.");
        Scanner enter = new Scanner(System.in);
        enter.nextLine();
        
        int comeout = Roll();
        
        System.out.println("--------------------");
        System.out.println("You rolled" +" "+ comeout);
        System.out.println("--------------------");

   
        int result = ComeResult(comeout);
        
        switch(result){
            case 1:
                Lose();
                break;
                
            case 2:
                Win();
                break;
                
            case 3:
                PointRoller rolling = new PointRoller(comeout);
            
                rolling.MenuDisplay();
                break;
            
                
                
        }
        
        
        
    }//end of Menu Display
    
    
    public int Roll(){
        Die d = new Die();
        
        int roll1 = d.Roll();
        
        stats.setFreq(roll1);
        
        return roll1;
    }
    
    
    
    public int ComeResult(int roll){
        
        if (roll == 2 || roll == 3 || roll==12){
            return 1;
        }
        
        if (roll == 7 || roll == 11){
            return 2;
        }
        else{
            return 3;
        }
    }
    
    public void Win(){
        System.out.println("*****************");
        System.out.println("You Won!!");
        System.out.println("*****************");
        stats.setRecord("Wins");
        
    }
    
    public void Lose(){
        System.out.println("*****************");
        System.out.println("You Lose...");
        System.out.println("*****************");
        stats.setRecord("Losses");
    }
    
}// end of class
