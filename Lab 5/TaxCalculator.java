//a5
import java.util.Scanner;

class TaxCalculator 
{
    private static final double TAX_RATE  =0.15; 
    private static final double HOURLY_RATE  = 12.0  ; 

    
    public static double calculateTax(double  grossPay )
            {
        return grossPay*TAX_RATE ;
    }

    public static double calculateNetPay(int hoursWorked) 
    {
        double grossPay =   hoursWorked *HOURLY_RATE; 
        double tax   = calculateTax(grossPay );         
        return grossPay - tax;                      // Net pay after tax deduction
    }

    public static void main(String[] args) 
    {
        Scanner scanner =  new Scanner(System.in) ;

        System.out.print("enter  number ofhours worked= ");
        int hoursWorked =scanner.nextInt() ;

        double grossPay =hoursWorked*HOURLY_RATE ;
        double tax =calculateTax( grossPay );
        double netPay= calculateNetPay(hoursWorked) ;
        System.out.printf(" gross paY: %.2f%n",  grossPay);
        System.out.printf("taX deducted  %.2f%n",tax);
        System.out.printf("net Pay %.2f%n",netPay);

        scanner.close();
    }
}
