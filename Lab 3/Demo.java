//a2
abstract class Figure 
{
    protected double pi= 3.1420; 
    protected  double a;         
    protected double  v;          

    public abstract void calcArea() ;
    public abstract void calcVol() ;
    public abstract void dispArea() ;
    public abstract void dispVol();

}

class Cone extends Figure 
{
    private double n; 
    private double s; 

    public Cone(double radius,double slantHeight)
     {
        this.n =radius;
        this.s =slantHeight ;
    }
    @Override
    public void calcArea()
     {
        a = pi *n *s+pi*n *n; 
    }
    @Override
    public void calcVol() 
    {
        v = (pi*n*n *s)/3; 
    }
    @Override
    public void dispArea() {
        System.out.println("Cone Area " + a);
    }
    @Override
    public void dispVol() 
    {
        System.out.println("cone Volume: " + v);
    }
}

class Sphere extends Figure 
{
    private double n; 

    public Sphere(double radius)
     {
        this.n = radius;
    }

    @Override
    public void calcArea() {
        a =4 * pi* n*n;
    }
    @Override
    public void calcVol() 
    {
        v =(4/3.0) * pi*n *n* n; 
    }

    @Override
    public void dispArea() 
    {
        System.out.println("sphere Area " +a ) ;
    }
    @Override
    public void dispVol()
     {
        System.out.println(" sphere Volume " +v) ;
    }

}
class Cylinder extends Figure
 {
    private double n; 
    private double h; 

    public Cylinder(double radius,double height) 
    {
        this.n= radius;
        this.h=height ;
    }
    @Override
    public void calcArea() 
    {
        a = 2*pi *n*h+2*pi *n*n ; 
    }
    @Override
    public void calcVol()
    {
        v = pi*n*n* h; 
    }
    @Override
    public void dispArea() 
    {
        System.out.println("cylinder Area " +a) ;
    }
    @Override
    public void dispVol() 
    {
        System.out.println("C ylinder Volume= " +  v) ;
    }
}

public class Demo 
{
    public static void main(String[] args) 
    {
        Cone cone =new Cone(3, 5.8 );
        cone.calcArea();
        cone.calcVol();

        System.out.println("cone---");
        cone.dispArea();
        cone.dispVol();

        Sphere sphere= new Sphere(4);
        sphere.calcArea();
        sphere.calcVol();
        System.out.println("\nssphere  ");
        sphere.dispArea();
        sphere.dispVol();

        Cylinder cylinder= new Cylinder(3, 7);
        cylinder.calcArea();
        cylinder.calcVol();
        System.out.println("\nvylinder1") ;
        cylinder.dispArea();
        cylinder.dispVol();
    }
    
}
