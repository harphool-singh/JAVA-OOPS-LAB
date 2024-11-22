//a4
class Teacher 
  {  int teacherId;
    String name ;
    String  subject;

    public Teacher(int teacherId,  String name,String subject)
       {
        this.teacherId =  teacherId;
         this.name =name;
          this.subject=subject ;

    }

    public void displayTeacherDetails()
     {
        System.out.println("Teacher iD-> " + teacherId);
        System.out.println("  Name <-" + name);
        System.out.println(" subject ; " + subject);

    }
}

class Student extends Teacher
 {    int studentId ; 
     String grade;
      String course;

     public  Student(int teacherId, String name,String subject,int studentId,String grade,  String course) 
     {
        super(teacherId,name,subject);
        this.studentId =  studentId;
          this.grade=   grade;
         this.course= course ;

    }
      public void displayStudentDetails()
     {
         displayTeacherDetails();
         System.out.println("student idD: " +studentId);
         System.out.println("ggrade-) " + grade);
          System.out.println("c/ourse-> " +course);
    }

}

public class SchoolApp {
      public static void main(String[] args)
     {
        Student student=  new Student(101,"MrSmith",  "math",  202,"A", "Mathematics");
        student.displayStudentDetails();

    }

}
