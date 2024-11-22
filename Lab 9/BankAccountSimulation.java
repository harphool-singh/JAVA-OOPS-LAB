//a7
import java.util.Random;

class BankAccount 
  {
    private double balance;
    public BankAccount(double initialBalance) 
    {

        this.balance =initialBalance ;
    }

    public synchronized void deposit( double  amount ) 
    {
    balance +=amount ;
          System.out.println("deposit Rs."+amount  +" | Current Balance : Rs." +balance ) ;

    }

    public synchronized void withdraw( double amount )
     {
         if(balance>=amount) 
        {
            balance -=amount;
            System.out.println("wiDrawl Rs." +amount+  " | current balence-> Rs." + balance);
           } else
           {
              System.out.println("Insufficient funds to withdraw Rs." + amount);
        }

    }


    public synchronized double getBalance()
     {
        return balance;
    }

}


class FatherThread extends Thread 
{
     private  BankAccount  account;
    private Random  random= new Random() ;
    public FatherThread( BankAccount   account)
     {
        this.account= account ;

    }
    @Override
   public void run() 
      {
        while(true) 
        {    double depositAmount =random.nextInt(200)+ 1 ; 
            account.deposit(depositAmount);

            try {
                  Thread.sleep(500) ;
            } catch(InterruptedException e) 
            {
                
                 e.printStackTrace(); 
            }
            if(account.getBalance()>  2000)
             {
                break;
            }

        }

    }


}

class SonThread extends Thread
     {
     private BankAccount account;
   private Random random =new Random();

     public SonThread(BankAccount  account) 
     {
         this.account= account;
       }
    @Override
    public void run() 
    {
        while(true)
         {
            if  ( account.getBalance()>2000)
             { 
                  double withdrawalAmount =random.nextInt(150) + 1;
                 account.withdraw(withdrawalAmount) ;

                try {
                    Thread.sleep(300);
                } catch(InterruptedException  e) 
                  {
                      e.printStackTrace() ;
                  }

                   if(account.getBalance() < 500)
                 {
                      break;
                }
            } 

        }
    }
}

public class BankAccountSimulation 
{
    public static void main(String[] args)
     {
        BankAccount account =new BankAccount(600) ;
         FatherThread father =  new FatherThread( account);
          SonThread son   =new SonThread( account ) ;
        father.start();
        son.start();
        try {
             father.join();
              son.join();
        } catch(InterruptedException e) 
    {
             e.printStackTrace();
}
}
}
