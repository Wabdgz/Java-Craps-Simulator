
package crapssimulator;
import java.util.*;
/**
 *
 * @author Walter Beardman wabdgz
 */
public class CrapsSimulator {
   
    
    static int playagain(){
        System.out.println("Would you like to continue playing?");
        System.out.printf("Enter 1 for YES or 0 for NO: ");
        int x = 0;
            
        try{
            Scanner choice = new Scanner(System.in);
            x = choice.nextInt();
        }
        catch(Exception e){
            System.out.println("==================================");
            System.out.println("Input must be 1 or 0.");
            System.out.println("Try Again.");
            System.out.println("==================================");
            playagain();
        }
        
        
        
       return x;
        
     }
   
    
    public static void main(String[] args) {
        GameMenu start = new GameMenu();
       
        System.out.println("------------------");
        System.out.println("Welcome to Craps!!");
        System.out.println("------------------");

        start.MenuDisplay();
        
                
    }//end of main
    
}//end of class
