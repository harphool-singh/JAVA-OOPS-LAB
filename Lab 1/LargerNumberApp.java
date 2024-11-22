//a2
import java.util.Scanner;

public class LargerNumberApp 
 {
    public static void main(String[] args) 
    {
        Scanner scanner =new Scanner(System.in) ;

        System.out.print(" enter 1st number : ");
        int num1=scanner.nextInt() ;

        System.out.print("enter  2 number: ");
        int num2= scanner.nextInt();

        if(num1 > num2)
         {
            System.out.println(num1 +" is larger");
        } else if (num2 > num1)
         {
            System.out.println(num2+ " is larger");
        } else {
            System.out.println(" number are equal.") ;
        }

        scanner.close();
    }
    
}

