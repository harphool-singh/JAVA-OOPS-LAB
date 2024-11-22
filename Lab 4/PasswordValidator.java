//a2
import java.util.Scanner;

class CheckPassword 
{
    private String password;

    private boolean hasLowerCase= false;
    private boolean hasDigit =false;
    private boolean noUpperCase= true  ;
    private boolean noSpecialChar= true;
    private boolean validLength =false ;

    CheckPassword(String password) 
    {
        this.password=password;
    }

    void validatePassword()
     {
        checkLength();
        checkCharacters();
        printValidationResult();
    }
    private void checkLength()
     {
        validLength =password.length()>=5 && password.length()<=12 ;
    }
s
    private void checkCharacters()
     {
        for(int i=0;i<password.length(); i++)
         {
            char currentChar=password.charAt(i);

            if(Character.isLowerCase(currentChar) ) 
            {
                hasLowerCase =true;
            } else if (Character.isDigit(currentChar))
             {
                hasDigit=true ;
            } else if(Character.isUpperCase( currentChar ) )
             {
                noUpperCase =false ;

            } else if(!Character.isLetterOrDigit(currentChar)) 
            {
                noSpecialChar =false ;
            }
        }
    }

    private void printValidationResult() 
    {
        if(hasLowerCase && hasDigit && noUpperCase && noSpecialChar && validLength)
         {
            System.out.println("correct Password ");
        } else {
            System.out.println("incorrect Password"  );
        }
    }

}

public class PasswordValidator 
{
    public static void main(String[] args) 
    {
        Scanner SC =new Scanner( System.in ) ;

        System.out.println("enter password=" );
        String userPassword =SC.nextLine();
        CheckPassword passwordChecker = new CheckPassword(userPassword);
        passwordChecker.validatePassword();
        
        SC.close();
    }
}
