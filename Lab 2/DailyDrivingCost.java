//a1
import java.util.Scanner;

public class DailyDrivingCost 
   {
    public static void main(String[] args) 
     {
        Scanner scanner=new Scanner(System.in);

        System.out.print(" enter  total miles driven per day :") ;
        double milesDriven=scanner.nextDouble() ;
        System.out.print(" enter cost per gallon of gasoline  ");
        double costPerGallon=scanner.nextDouble() ;
        System.out.print(" nter average fee per day " ) ;
        double averageFees = scanner.nextDouble();

        System.out.print("3nter  total tolls per day : ") ;
        double tolls =scanner.nextDouble();

        System.out.print("enter  average miles per gallon of  car ");
        double milesPerGallon =scanner.nextDouble();

        double gallonsConsumed =milesDriven/ milesPerGallon;  // Calculate  cost of gasoline per day
        double gasolineCost= gallonsConsumed*costPerGallon;

        double dailyCost = gasolineCost + averageFees + tolls;

        System.out.println("daily Driving Cost") ;
        System.out.println("gasoline cost"+ String.format("%.2f",gasolineCost));
        System.out.println(" average fees" +String.format("%.2f", averageFees ) );
        System.out.println("Tolls " + String.format("%.2f",tolls));
        System.out.println(" total daily driving cost $" + String.format("%.2f", dailyCost));

        System.out.print(" enter number of people in  carpool ") ;
        int carpoolPeople = scanner.nextInt();
        
        if(carpoolPeople >1) 
        {
            double carpoolSavings=dailyCost/carpoolPeople;
            System.out.println("estimated daily cost with carpooling for each person" + String.format("%.2f", carpoolSavings));
        } else 
        {
            System.out.println("No savings with a carpool (you are driving alone) " ) ;
        }

        scanner.close();
    }
}
