//a2
class InvalidHexadecimalException extends Exception 
{
    public InvalidHexadecimalException(String message)
           {
        super(message);
    }

}

public class HexadecimalChecker 
{
    public static boolean isHexadecimal(String input) throws InvalidHexadecimalException
     {
        String hexPattern = "^[0-9a-fA-F]+$";

        if (!input.matches(hexPattern) ) 
        {
            throw new InvalidHexadecimalException(" input \"" +input +"\" is not  valid hhexadecimal number  ") ;
        }

        return true;

    }

    public static void main(String[] args) 
    {
        String testInput = "1A3F";  // yaha par or bhi example la shakata ha

        try {
            if(isHexadecimal(testInput)) {

                System.out.println(" input \"" +testInput +"\" is  valid hexadecimal number    ");
            }
        } catch (InvalidHexadecimalException e) 
        {
            System.out.println("error" + e.getMessage()) ;
        } finally 
        {
            
            System.out.println("ending  program byy ggurdf");
        }


        
    }
}
