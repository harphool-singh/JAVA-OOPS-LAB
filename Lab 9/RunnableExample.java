//a2
 class MyRunnable implements Runnable
    {
    @Override
    public void run() 
    {
        System.out.println("  thred is running  "+   Thread.currentThread().getName()  );
        
    }
     public MyRunnable() 
    {
         Thread thread= new Thread(this) ;
        
        thread.start();

    }

}

public class RunnableExample 
 {
      public static void main(String[] args) 
    {
          new MyRunnable();

        System.out.println("mainn thread is running :" +  Thread.currentThread().getName()  );
    }

}
