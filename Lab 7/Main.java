//a5
   class Debuggable
 {
    public void debug()
     {

         System.out.println(" debuggging information ; general debug information for this class  ") ;
    }

      public void printDetails()
     {
        System.out.println("printing details for debuggging ");

    }

    }

  class Employee extends Debuggable
   {
    private int  employeeId ;
    private  String name;

    public Employee(int employeeId,String name) 
    { this.employeeId =employeeId;
        this.name =  name;

    }

    @Override
    public void printDetails() 
    {
        System.out.println("empLOyee ID-> " +employeeId);
        System.out.println(" empLOyee Name : "+name ) ;

    }
}

class Product extends Debuggable 
{  private int productId ;
    private String productName ;

    public Product(int productId,  String productName)
     {
        this.productId =productId;
         this.productName=productName ;
    }
    @Override
    public void printDetails() 
    {
        System.out.println("prduct id: " + productId);
         System.out.println("Product name- " + productName);
    }

}

public class Main 
{
    public static void main(String[] args) 
    {
        Employee employee  = new Employee(1, "John die ");
        Product product =new Product(101," laptop "); 
         employee.printDetails();
         product.printDetails();

         employee.debug();
        product.debug();

    }
    
}
