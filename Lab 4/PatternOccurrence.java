//a5
import java.util.Scanner;

public class PatternOccurrence 
{
    public static int countPatternOccurrences(int a,int b,String pattern) 
    {
        int count=0 ;
        for (int i =a;i<=b;i++) 
        {
           String numberStr = String.valueOf(i); /*change current number to  string */
            if (numberStr.contains(pattern))  // Check if patternis substring of number
            {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) 
   {      Scanner scanner = new Scanner(System.in) ;        
        System.out.print("enter range (a b) = ") ;
        int a=scanner.nextInt() ;
        int b= scanner.nextInt() ;
        System.out.print("Enter pattern: ");
        String pattern =scanner.next() ;

        int occurrences =countPatternOccurrences(a,b, pattern );
        System.out.println("The pattern "+pattern+ " occurred " +occurrences +" times between" +a+ "and"+  b) ;
       
        scanner.close();
    }
}
