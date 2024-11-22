//a2
import java.util.Scanner;

public class MovieTheater 
{

         public static double calculateTotalProfit(   int  attendees)
     {
        double ticketPrice =   5.0; 
        double fixedCost =20.0;  
        double costPerAttendee = 0.50; 

        double income = ticketPrice* attendees ;
        double totalCost=fixedCost   +    (costPerAttendee*attendees) ;
        double totalProfit =income-totalCost ;
        return totalProfit;


    }

    public static void main(String[] args) 
    {
        Scanner scanner =new Scanner( System.in ) ;
        System.out.print("entr number of attendees=   ");
        int attendees = scanner.nextInt();

        double profit =  calculateTotalProfit(attendees) ;
        System.out.printf(" total profit for  show is $%.2f%n",   profit);

        scanner.close();
    }

    
}
