//a3
class  WashingMachine 
{
     private   boolean isOn;   
     private int  clothes;    
      private  boolean hasDetergent ;  

    public void switchOn() 
    {
        if(!isOn)
         {
            isOn =true;
            System.out.println("washing machine  now is ONn");
        } else {
            System.out.println(" waashing machine is already ON") ;
        }

    }

    public int acceptClothes(int noOfClothes) 
    {
        this.clothes =noOfClothes;
        System.out.println("Accepted "+ noOfClothes+  " clothes.");
        return clothes;

    }

        public void acceptDetergent() 
    {
        hasDetergent =  true;
        System.out.println("detrgent has been added  ");
    }

      public void switchOff()
       {
        if(isOn) {
            isOn =false;

            System.out.println("Washing machine  now OFf.");
        } else {
            System.out.println("W washing machine  already OFf.");

        }
    }

    public void startWashing() 
    {
        if(isOn && hasDetergent && clothes >0) 
        {
            System.out.println("washing process started for "   +clothes+ " clothes"  ) ;
        } else 
        {
            System.out.println("plsase ensure te washing machine is ON  ,  detergent is added,  clothes are accepted   ");
        }

    }


}

public class WashingMachineDemo 
              {
    public static void main(String[] args) 
    {
        WashingMachine wm =new WashingMachine()  ;
        wm.switchOn();

        wm.acceptClothes(5);  
         wm.acceptDetergent();
         wm.startWashing(); 
         wm.switchOff();
    }

}
