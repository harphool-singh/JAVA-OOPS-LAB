//a2
class Vehicle 
{
    String brand;
    int wheels ;

    public Vehicle(String brand, int wheels)
     {
         this.brand =brand ;
        this.wheels=wheels;
    }

    public void displayDetails() 
    {
        System.out.println("Brand- " +   brand);
         System.out.println("Wheels -  " + wheels);
         
    }

    public void maxSpeed() 
    {
        System.out.println("  max speed of this  vehicle  not defined  ") ;

    }

}

class Car extends Vehicle  
        {
    int doors;

    public Car(String brand,  int wheels,int doors)
     {
        super(brand,  wheels); 
        this.doors =doors;

    }
    @Override
    public void maxSpeed() 
    {
        System.out.println("maaxx speed of " + brand + " Car ->> --  180   km/ h.") ;
        
    }
}

class Bicycle extends Vehicle 
{
    String type;
    
    public Bicycle( String brand,int wheels,String type ) 
    {
        super(brand,wheels);  
        this.type =type ;

    }
    @Override
    public void maxSpeed() 
    {
        System.out.println(" mex speed of " + brand + " Bicycle -)>  30 km /h.");
    }
     
}

class Scooter extends Vehicle 
{
    boolean electric;

    public Scooter(String brand,int wheels,    boolean electric)
    {  super(brand, wheels);  
        this.electric =electric ;

    }
    @Override
    public void maxSpeed()
     {
        if(electric)    {
            System.out.println("msx speed of " + brand + " electric Sccoter = 60 k m/h.");
        } else 
        {
            System.out.println("Max speed of " + brand + " Petrol Scooter >- 80  km /h.");
        }

    }
}

public class VehicleTest 
{
    public static void main(String[] args) 
    { Car car   = new Car("To00yota",  4, 4);
        Bicycle bicycle  = new Bicycle("Giant",  2,  "m0untain");
        Scooter scooter =   new Scooter( "VEspa",  2, true);

        System.out.println("Car details ");
        car.displayDetails();
        car.maxSpeed();
        System.out.println("bycile  details:");
        bicycle.displayDetails();
        bicycle.maxSpeed();
        System.out.println("sc00ter detail  ");
        scooter.displayDetails();
        scooter.maxSpeed();

    }

    
}

