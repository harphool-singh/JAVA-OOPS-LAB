//a1
class Animal 
{
      String name ;

    
      public Animal( String name  ) 
    {
        this.name =name;
        System.out.println("animal constructor called      ") ;


    }
    public void sound() 
    {
        System.out.println("animal make  sound ") ;

    }
       public void display() 
    {
        System.out.println("Animal's nammee is " +name) ;
    }


}

class Dog extends Animal 
{
    String breed ;
 
     public Dog(String name,    String breed) 
        {
        super(name) ;
        this.breed   =  breed; 
        System.out.println("dogi constructor called"    );
    }

    @Override
    public void sound() 
    {
        super.sound(); 

        System.out.println("Dogess barks"  );

    }

    public void display() 
    {
        super.display(); 

        System.out.println("Dog's breedis " + breed);
    }

}

public class SuperThisExample 
{
    public static void main(String[] args)
     {
        Dog dog =new Dog("Buddy",   "golden,s reytive  " );

        dog.sound();
        dog.display() ;
    }

}
