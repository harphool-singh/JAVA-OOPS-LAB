public class SquareAndCubeTable
 {
    public static void main(String[] args) 
        {
        System.out.println("number\tsquare\tCube") ;
        System.out.println("-------------------------") ;


        for(int i=0;i<=10;i++) 
        {
            int square =i*i;
            int cube =i*i*i;

            System.out.printf("%d\t%d\t%d%n", i,square, cube) ;
        }
        
    }

}
