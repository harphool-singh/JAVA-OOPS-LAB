//a6
import java.util.Scanner;

class Student 
{  private String name;

    public String inputName(String name)
     {
        this.name =name;
        return this.name ;
    }

    public String average(int marks1,  int marks2,int marks3) 
    {
        double avg =(marks1+marks2 +marks3)/3.0; 
        return  (avg>50) ? "Passed" : "Failed";      
    }

}

public class StudentDemo
{
    public static void main(String[] args) 
    {
        Scanner scanner =  new Scanner(System.in) ;
        Student student =new Student();
         System.out.print("enter name of  student   ") ;
        String studentName =scanner.nextLine();
        student.inputName(studentName) ;

         System.out.println("enter marks for three examinations --  ");
        System.out.print("maarks 1     ");
         int marks1 =  scanner.nextInt();
         System.out.print("Mark 2 " );
         int marks2=scanner.nextInt();
         System.out.print("mark 3: ");
          int marks3 =scanner.nextInt() ;

        String result = student.average(marks1, marks2, marks3);
    
        System.out.println("Name -)" +   studentName);
        System.out.println("Result " +result);

        scanner.close();
    }
}
