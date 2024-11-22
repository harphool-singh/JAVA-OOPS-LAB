//a1
class MyThread extends Thread 
     {
    @Override
    public void run() 
    {
    
        System.out.println("thread is running " +Thread.currentThread().getName() ) ;
    }

}

public class ThreadExample 
{
        public static void main(String[] args)
     {   MyThread thread1 =new MyThread() ;
        thread1.start(); 
        System.out.println("maiin thread is running >- " +   Thread.currentThread().getName());

        MyThread thread2 = new MyThread();
        thread2.start();

        
    }
}
