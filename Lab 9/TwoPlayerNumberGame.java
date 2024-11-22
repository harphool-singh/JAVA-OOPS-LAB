//a4
import java.util.Random;
import java.util.Scanner;

public class TwoPlayerNumberGame 
  {

     public static void main(String[] args) 
       {
         Scanner scanner=new  Scanner( System.in) ;
        
        Random random =  new Random() ;
         System.out.print("plaYER 1 ,enter  number ( .,this not affect the game) = ");
         int player1Number =  scanner.nextInt() ;
        System.out.print("player 2 , enter  number (this not affect the game) =  ");
         int player2Number =scanner.nextInt();
         int player1Random = random.nextInt(100) +1;  
           int player2Random = random.nextInt(100)+1;  
        
        System.out.println("player 1 israndom number:. " + player1Random) ;
         System.out.println("  playeR 2 si random number-> " + player2Random);
        
        if (player1Random>player2Random) 
          {
            int points= player1Random-player2Random ;
             System.out.println("Player 1 jeet gaya! Points earned: "  +points);
        } else if (player2Random > player1Random) 
        {
            int points = player2Random - player1Random;
            System.out.println("Player 2 jeet gaya Points earned: "+ points);
        } else 
        {
            System.out.println("koi nahi jeet  No points earned .");
        }
        
        scanner.close();
    }
    
}
