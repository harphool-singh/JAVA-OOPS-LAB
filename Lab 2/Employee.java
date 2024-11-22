//a3
public class Employee
 {
    private String firstName ;
    private String lastName ;
    private double monthlySalary; 

    public Employee(String firstName,String lastName,double monthlySalary) 
    { // Constructor to initialize the instance variables
        this.firstName=firstName ;
        this.lastName =lastName ;
        
        if (monthlySalary>0) 
        {
            this.monthlySalary=monthlySalary;
        } else
         {
            this.monthlySalary =0.0 ;

        }
    }

    public String getFirstName() 
    {
        return firstName ;
    }
    public void setFirstName(String firstName) {
        this.firstName =firstName;
    }

    
    public String getLastName() 
    {/*  Getters and setters for lastName*/
        return lastName ;
    } 
    public void setLastName(String lastName) 
    {
        this.lastName= lastName;
    }

    
    public double getMonthlySalary() 
    {
        return monthlySalary;
    }
    public void setMonthlySalary(double monthlySalary) 
    {
        if (monthlySalary>0) 
        {
            this.monthlySalary= monthlySalary;
        }
    }

    public double getYearlySalary() 
    {
        return monthlySalary*12 ;
    }

    public void applySalaryHike() 
    {
        this.monthlySalary =this.monthlySalary*1.10 ;
    }

    public static void main(String[] args) 
    {
        Employee employee1 =new Employee("John","Doe",3000.00 ) ;
        Employee employee2=new Employee("Jane","Smith",4000.00 ) ;
        
        System.out.println("employee 1 : " + employee1.getFirstName() +" "+ employee1.getLastName());
        System.out.println(" yearly Salary $" +employee1.getYearlySalary()) ;
        System.out.println(" employee 2 " + employee2.getFirstName() +" " +employee2.getLastName() );
        System.out.println(" yearly Salary: $" +employee2.getYearlySalary() ) ;
        
        employee1.applySalaryHike() ;
        employee2.applySalaryHike() ;
        
        System.out.println("\n after 10% salary hike ") ;

        System.out.println("employee 1 " + employee1.getFirstName() + " " +employee1.getLastName() )  ;
        System.out.println("yyearly Salary: " + employee1.getYearlySalary());
        System.out.println("Employee 2: " +employee2.getFirstName() +" " +employee2.getLastName()  ) ;
        System.out.println("yearly Salary" +employee2.getYearlySalary() );
    }
}
