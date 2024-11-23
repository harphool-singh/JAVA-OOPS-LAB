//a1
import java.util.Scanner;

public class TextDemo
 {
    public static void main(String[] args) 
      {
         Scanner scanner= new Scanner(System.in);
        System.out.println("enter text " ) ;
        String input =scanner.nextLine();
         int firstIndex=input.indexOf("the");
         int lastIndex= input.lastIndexOf("the");
 

        if (firstIndex== -1 || lastIndex== -1 || firstIndex== lastIndex)
         {
            System.out.println(" string 'the' does not ocur multiple times in the input " ) ;
        } else 
        {
            String enclosedSubstring =input.substring(firstIndex +3,lastIndex);

            System.out.println(" enclosed characters between the first and last 'the' are:");
            System.out.println(enclosedSubstring);
        }

        scanner.close();
    }
    
}
