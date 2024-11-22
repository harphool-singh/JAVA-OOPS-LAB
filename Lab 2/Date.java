//a4
public class Date 
    {
    private int month;
    private int day;
    private int year;

   
    public Date(int month, int day, int year)
     {
        this.month=month;
        this.day= day;
        this.year =year ;
    }
    public int getMonth() 
    {
        return month;
    }
    public void setMonth(int month) 
    {
        this.month= month ;
    }
    public int getDay() 
    {
        return day ;
    }

    public void setDay(int day)
     {
        this.day=day;
    }
    public int getYear()
     {
        return year ;
    }
    public void setYear(int year)
     {
        this.year=year ;
    }
    public void displayDate() 
    {
        System.out.println(month +"/" +day+ "/"+ year) ;
    }

    public static void main(String[] args) 
    {
        Date date1 =new Date(11,22,2024); 
        Date date2= new Date(12,25,2023); 
        System.out.println("iinitial dates ") ;
        System.out.print("date 1");
        date1.displayDate();
        System.out.print("date 2 ");
        date2.displayDate() ;

        date1.setMonth(1 );
        date1.setDay( 1);
        date1.setYear(2025 ) ;
        date2.setMonth(2 );
        date2.setDay( 14);
        date2.setYear(2023) ;
        System.out.println("\n modified dates ") ;
        System.out.print(" date 1: ");
        date1.displayDate() ;
        System.out.print(" date 2: ");
        date2.displayDate() ;

    }

}
