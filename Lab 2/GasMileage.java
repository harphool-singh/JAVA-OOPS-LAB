//a5
import java.util.Scanner;

public class GasMileage 
        {
    public static void main(String[] args) 
    {
        Scanner scanner =new Scanner(System.in ) ;
        double totalMiles=0;    
        double totalGallons= 0 ;  
        while (true) 
        {// llop until sentinel value is entered
            System.out.print(" enter miles driven (-1 to quit): ");
            double miles=scanner.nextDouble();
            if (miles== -1) 
            {
                break;
            }

            System.out.print("enter gallons used: ");
            double gallons =scanner.nextDouble();
            if (gallons >0 )
             {
                double mpg = miles/gallons ;
                System.out.printf("miles per gallon for this trip: %.2f%n " ,mpg ) ;
                totalMiles += miles;
                totalGallons += gallons ;

                double combinedMpg =totalMiles/totalGallons ;
                System.out.printf("combined miles per gallon so far: %.2f%n%n", combinedMpg);
            } else 
            {
                System.out.println( " gallons used must be greater than 0. Please try again"  ) ;
            }

        }

        if (totalGallons >0)
         {
            System.out.printf("%nfinal Combined Miles per Gallon: %.2f%n",totalMiles/totalGallons );
        } else 
        {
            System.out.println("no data was entered");
        }

        scanner.close();
    }
}
