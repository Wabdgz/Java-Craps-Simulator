
package crapssimulator;
import java.util.*;
/**
 *
 * @author walter beardman wabdgz
 */
public class GameMenu extends Menus{
   
    public int fchoice;
    private int choice;
    public Stats stats = new Stats();
    
    @Override
    public void MenuDisplay(){
        System.out.println("--------------------");
        System.out.println("Main Menu");
        System.out.println("--------------------");
        System.out.println("What would you like to do?");
        System.out.println("--------------------");
        
        System.out.println("1. Play.");
        System.out.println("2. Instructions.");
        System.out.println("3. Stats.");
        System.out.println("4. Exit Game.");
        System.out.println("--------------------");
        
        
        try{
            System.out.printf("Choose a number: ");
            Scanner sc = new Scanner(System.in);
            this.fchoice = sc.nextInt();
            
            
        }
       
        catch(Exception e){
            ErrorMessage();
            MenuDisplay();
            
        }
        
        
        boolean check = NumCheck(fchoice);
        
        if(check == false){
            ErrorMessage();
            MenuDisplay();
            
        }
        
        else{
            this.choice = fchoice;
            Delegate();
        }
        
        
        
           
    }
    
    
    public void Delegate(){
        switch(choice){
            case 1:
                Rolling game = new Rolling();
                game.MenuDisplay();
                MenuDisplay();
              break;
            
            case 2:
                Instructions();
                MenuDisplay();
                break;
                  
            case 3:
                stats.Show();
                MenuDisplay();
                break;
                
            case 4:
                
                Scanner out = new Scanner(System.in);
                stats.Show();
                System.out.println("Press Enter to exit.");
                out.nextLine();
                System.exit(0);
                
                break;
                
        }
    }
    
    public boolean NumCheck(int num){
        int check[] = {1,2,3,4};
        
        boolean result = false;
        
        for(int element : check){
                if (element == num){
                    result = true;}
                }
        return result;
    }
    
    public void ErrorMessage(){
        System.out.println("==================================");
        System.out.println("Input must be a number 1-4");
        System.out.println("Try Again.");
        System.out.println("==================================");
    }
  
    
    public void Instructions(){
        System.out.println("--------------------");
        System.out.println("Instructions");
        System.out.println("--------------------");
        System.out.println("The player will roll 2 dice that will add up to a number between 2 and 12.");
        System.out.println("On the Come Out roll(the first roll before a point is established)");
        System.out.println("a 2,3, or 12 is a loss.");
        System.out.println("A 7 or 11 is a win.");
        System.out.println("Any other number (4-10) becomes the point.");
        System.out.println("The plyer will continue rolling the dice until the point is rolled again");
        System.out.println("resulting in a win, or a 7 is rolled resulting in a loss.");
    }
}//end of class
