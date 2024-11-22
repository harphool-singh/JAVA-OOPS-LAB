//a4
class Fruit 
{
    private String name;        
    private boolean isSingle;    
    private double price;       

    public Fruit(  String name,   boolean isSingle,double price) 
    {
        this.name =name;
        this.isSingle= isSingle;
        this.price   = price  ;
    }

    public void displayFruit() 
    {
        System.out.println("ffruit Name-- " + name);
        System.out.println("type= " + (isSingle ? "Single Fruit" : "Bunch Fruit") ) ;
        System.out.println("Price " + price ) ;
        System.out.println();
    }

}

public class FruitDemo
 {
    public static void main(String[] args)
     {
        Fruit apple =   new Fruit("Ap ple", true,   1.5);
        Fruit bananas   = new Fruit("Banana s",  false,  3.0);

        System.out.println("fruit 1 deetail");
        apple.displayFruit();
        System.out.println("fruit 2 deetail-0 ");
        bananas.displayFruit();
    }
    
}
