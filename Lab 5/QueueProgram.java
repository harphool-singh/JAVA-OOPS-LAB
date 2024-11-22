//a1
interface QueueImpl 
{
    void insert(int element);  
    void delete();            
    void display();           
}
class QueueOverflowException extends RuntimeException 
{
    public QueueOverflowException(String message) 
    {
        super(message);
    }
}
class QueueUnderflowException extends RuntimeException
 {
    public QueueUnderflowException(String message)
     {
        super(message);
    }
}

class QueueDemo implements QueueImpl 
{
    private int[] queue ; 
    private int front;  
    private int  rear;    
    private int   size ;   

    public QueueDemo() 
    {
        queue =new int[10] ;
        front = 0 ;
        rear= -1;
        size=0;
    }

    @Override
    public void insert(int element) 
    {
        if (size==10) 
        {
            throw new QueueOverflowException("qqueue 0verflow Cannot insert element " +element+ ", the queue is full.");
        }
        rear=(rear+1)%10;  /*Circular incrementfor rear*/
        queue[rear]=element;
        size++;
        System.out.println(" inserted "   + element);
    }

    @Override
    public void delete() 
    {
        if (size ==0)
         {
            throw new QueueUnderflowException(" queue underflow Cannot delete. queue is empty.");
        }
        System.out.println("Deleted: " + queue[front] );
        front =(front +1 ) %10; 
        size--;
    }

    @Override
    public void display() 
    {
        if (size ==0)
         {
            System.out.println(" queue is empty    ");
            return;
        }
        System.out.print("qeue Element    ");
        for(int i =0;i <size; i++)
         {
            System.out.print(queue[(front+i)%10]+ " "); // Display elementin correct order
        }
        System.out.println();
    }

}
public class QueueProgram 
{
    public static void main(String[] args) 
    {
        QueueDemo queue =new QueueDemo();

        try {
            queue.insert(10);
            queue.insert(20) ;
            queue.insert(30 );
            queue.display() ; // Outpt 10 20 30
            queue.delete();  
            queue.display() ; 
            queue.insert( 40);
            queue.insert(  50) ;
            queue.insert(60);
            queue.insert(  70) ;
             queue.insert(80  );
             queue.insert(90 );
             queue.insert(100);
             queue.insert(110  ); // Queue is now full
             queue.display();

            /* Try inserting when  queue is full*/
            queue.insert(120); // its will throw  QueueOverflowException 

        } catch (QueueOverflowException e) 
        {
            System.out.println(e.getMessage() );
        }

        try {
            
            queue.delete();
            queue.delete() ;
             queue.delete();
            queue.delete() ;
            queue.delete();
            queue.delete() ;
            queue.delete();
            queue.delete();
            queue.delete();
            queue.delete() ; // ab queue empty h

            queue.delete(); // ya ab  QueueUnderflowException dega 
        } catch (QueueUnderflowException e)
         {
            System.out.println(e.getMessage());
        }
    }
}
