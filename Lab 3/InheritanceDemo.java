//a1
class Figure
 {
    protected double r;  
    protected double a;   
    protected double v;  

    public void dispArea() 
    {
        System.out.println("Area " +a);
    }
    public void dispVolume() 
    {
        System.out.println(" Volume " + v);
    }

}
class Cone extends Figure 
{
    private double h;   
    private double s;  
    public Cone(double radius,double height,double slantHeight)
     {
        this.r =radius;
        this.h =height ;
        this.s=slantHeight ;
    }

    public double getHeight() 
    {
        return h;
    }
    public double getSlantHeight()
     {
        return s;
    }
    public void calcArea() 
    {
        a = Math.PI *r*s+ Math.PI*r * r; 
    }
    public void calcVolume()
     {
        v = (Math.PI * r*r*h)/3; 
    }
}


public class InheritanceDemo
 {
    public static void main(String[] args) 
    {
        
        Cone cone = new Cone(3.0, 5.0, 5.8);
        cone.calcArea();
        cone.calcVolume();

        System.out.println("Cone Dimensions ");
        System.out.println("Radius " +cone.r);
        System.out.println("Height "+ cone.getHeight());    
        System.out.println("Slant Height " +cone.getSlantHeight()); 

        System.out.println("\nccalculated Results:");
        cone.dispArea();   
        cone.dispVolume();  
    }
}
