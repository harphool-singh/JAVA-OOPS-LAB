//a4
import java.util.Scanner;

public class CircleCalculator 
   {
    public static void main(String[] args) 
    {
        Scanner scanner =new Scanner(System.in) ;

        System.out.print("Enter  radius ofcircle integer : ") ;
        int radius= scanner.nextInt();
        double pi = Math.PI; 

        int diameter=2*radius;
        double circumference =2*pi*radius;
        double area= pi*radius*radius;

        System.out.println("diameter " +diameter );
        System.out.println("ciircumference" + circumference ) ;
        System.out.println("area: " +area);

        scanner.close();
    }
}
