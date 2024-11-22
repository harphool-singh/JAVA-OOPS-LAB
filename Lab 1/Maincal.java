//a3
import java.util.Scanner;

interface NumberOperations 
{
    int sum(int a,int b,int c) ;
    double average(int a,int b, int c) ;
    int product(int a,int b, int c);
    int largest(int a, int b,int c) ;
    int smallest(int a,int b, int c);
}

abstract class AbstractOperations implements NumberOperations 
{
    @Override
    public int sum(int a,int b, int c)
      {
        return a + b+c ;
    }
    @Override
    public double average(int a, int b,int c)
         {
        return (a +b+ c)/3.0 ;
    }
    @Override
    public int product(int a,int b,int c) 
    {
        return a*b*c ;
    }

    @Override
    public int largest(int a,int b,  int c) {
        return Math.max(a, Math.max(b,c) );
    }
    @Override
    public int smallest(int a, int b, int c ) 
    {
        return Math.min(a, Math.min(b, c) );
    }

}

class NumberCalculator extends AbstractOperations 
{
    
}


public class Maincal 
{
    public static void main(String[] args) 
    {
        Scanner scanner =new Scanner(System.in) ;
        NumberCalculator calculator=new NumberCalculator() ;

        System.out.print("center  1st integer : ");
        int num1 = scanner.nextInt();
        System.out.print(" Enter  second integer : ") ;
        int num2 = scanner.nextInt();
        System.out.print("enter 3  integer ") ;
        int num3 = scanner.nextInt();

        int sum = calculator.sum(num1,num2,num3);
        double average = calculator.average(num1, num2, num3);
        int product = calculator.product(num1, num2, num3);
        int largest = calculator.largest(num1, num2, num3);
        int smallest = calculator.smallest(num1, num2, num3);

        System.out.println(" Sum " +sum) ;
        System.out.println("a verage "+ average ) ;
        System.out.println("Product: " + product );
        System.out.println(" largest " + largest);
        System.out.println("Ssmallest " +smallest);

        scanner.close();
    }
}
