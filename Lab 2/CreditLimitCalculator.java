//a6
import java.util.Scanner;

public class CreditLimitCalculator 
{
    public static void main(String[] args)
     {
        Scanner scanner=new Scanner(System.in) ;
        System.out.println(" credit Limit Calculator " ) ;

        while(true)
         {  System.out.println(" enter account number (or -1 to quit): ");
            int accountNumber =scanner.nextInt();
            
            if (accountNumber== -1) 
            {
                break;
            }
            System.out.print(" enter beginning balance " ) ;
            double beginningBalance =scanner.nextDouble() ;
            System.out.print("enter total charges of the month " );
            double totalCharges =scanner.nextDouble();
            System.out.print("Enter total credits applied " );
            double totalCredits= scanner.nextDouble();
            System.out.print("enter credit limit ")  ;
            double creditLimit=scanner.nextDouble() ;

            double newBalance=beginningBalance +totalCharges-totalCredits ;
            System.out.printf( "account number %d%n",accountNumber);
            System.out.printf( "new balance: %.2f%n",newBalance ) ;

            if (newBalance>creditLimit)
               {
                System.out.println("credit limit exceeded ");
            } else 
            {
                System.out.println("Credit limit is within bounds" );
            }

        }

        scanner.close(); 
        System.out.println("\nProgram terminated.");
    }
}
