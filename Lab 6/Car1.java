//a4
abstract class Car 
{
    String model;

    public void displayModel() 
    {
        System.out.println("Car model " +  model) ;

    }
    public abstract void avg();
    public abstract void mode();

}

class Maruti extends Car 
{
    public Maruti(String model) 
    {
             this.model =model;
    }
      @Override
     public void avg() 
    {
        System.out.println(model + " averaage mileage =- 20 km/l");

    }
    @Override
    public void mode() 
    {
        System.out.println(model + " mode: manula" ) ;

    }

}

class Santro extends Car
 {
    public Santro(String model)
     {
        this.model=model;

    }

    @Override
    public void avg() 
    {
        System.out.println(model + "average mileage =- )  18 km  / l ");

    }

    @Override
    public void mode()
        {
        System.out.println(model + " mode->   Automatic");
    }
    
}


   public class Car1 
{/*Main class to demonstrate polymorphism*/
    public static void main(String[] args)
     {
        Car car1 =new Maruti("Maruti Suzuki Swift  ");
        Car car2=   new  Santro("Hyundai   Santro" ) ;

        car1.displayModel();
        car1.avg();
        car1.mode();
        System.out.println(); 
        car2.displayModel();
        car2.avg();
        car2.mode();
    }
    
}
