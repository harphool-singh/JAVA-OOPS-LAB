//a3
 class Book 
{
    
    int bookId ;
     String title;
     String author;
    double  price ;

    public Book(int bookId,String title,String author,   double price)
    { this.bookId =bookId;
        this.title  = title;
        this.author=  author;

        this.price =   price ;
    }

    public void displayBookDetails() 
    {
        System.out.println("Book idD =" + bookId);
        System.out.println("titel= " + title);
        System.out.println("Author-= " + author);
         System.out.println("Price:" + price);

    }
}

class Periodical extends Book 
{
    String period;

    public Periodical(int bookId,String title, String author,double price,  String period) 
    {
        super(bookId, title,author,  price);
         this.period = period ;

    }

    public void modifyPrice(double newPrice) 
    {
           this.price=newPrice;
    }
      public void modifyPeriod(String newPeriod) 
    {
        this.period =  newPeriod ;

    }
    @Override
    public void displayBookDetails() 
    {
        super.displayBookDetails(); 

          System.out.println("Period ; " + period);

    }

}

public class BookTest 
{
    public static void main(String[] args)
     {
        Periodical periodical =new Periodical(101,"Science Weekly","John Doe",   10.50, "Weekly");

        System.out.println("initiall perodic details ") ;
        periodical.displayBookDetails();
          periodical.modifyPrice(12.75 );
         periodical.modifyPeriod("monthelY" );

        System.out.println("\nUpdated peRodiCally Details ");
         periodical.displayBookDetails();
    }
    
}
