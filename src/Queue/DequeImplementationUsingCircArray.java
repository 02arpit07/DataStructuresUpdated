package Queue;
//Deque should have following methods
/*
void insertfront()
void insertRear()
void deletefront()
void deleteRear()
int getfront()
int getrear()
boolean isFull()
booleanisEmpty()
 */
public class DequeImplementationUsingCircArray {
    //main method
    public static void main(String[] arhs)
    {
        DequeImplementationUsingCircArray d=new DequeImplementationUsingCircArray(10);
        d.insertAtFront(1);
        d.insertAtFront(2);
        d.insertAtrear(3);
        d.insertAtrear(4);
        d.deleteFront();
        d.deleteRear();
        System.out.println(d.getFront());
        System.out.println(d.getRear());

    }

    //global variables.
   static final int MAX=20;
   int[] arr;
   int front;
   int rear;
   int size;

   //constructor
   public DequeImplementationUsingCircArray(int size)
   {
       arr=new int[size];
       front=-1;
       rear=0;
       this.size=size;
   }

   //isfull method
   boolean isFull()
   {
       return ((rear==size-1&&front==0)||front==rear+1);
   }

   //isempty method
   boolean isEmpty()
   {
       return front==-1;
   }

   //insertAtfront method
   void insertAtFront(int key)
   {
       if(isFull())
       {
           System.out.println("OVERFLOW CONDITION");
           return;
       }
       if(front==-1)
       {
           rear=0;
           front=0;
       }
       else if(front==0)
       {
           front=size-1;
       }
       else{
           front=front-1;
       }
       arr[front]=key;

   }

   //insertAtRear
    void insertAtrear(int key)
    {
        if(isFull())
        {
            System.out.println("Overflow Condition");
        }
        if(front==-1)
        {
            front=0;
            rear=0;
        }
        else if(rear==size-1)
        {
            rear=0;
        }
        else{
            rear=rear+1;
        }
        arr[rear]=key;
    }
        //delete at front
    void deleteFront()
    {
        if(isEmpty())
        {
            System.out.println("Underflow Condition");
        }
        if(front==rear)
        {
            front=-1;
            rear=-1;
        }
        else{
            if(front==size-1)
            {
                front=0;
            }
            else{
                front=front+1;
            }
        }
    }
    //delete at rear
    void deleteRear()
    {
        if(isEmpty())
        {
            System.out.println("Underflow condition");
        }
        if(rear==front)
        {
            rear=-1;
            front=-1;
        }
        else if(rear==0)
        {
            rear=size-1;
        }
        else{
            rear=rear-1;
        }
    }
    //get front element
    int getFront()
    {
        if(isEmpty())
        {
            System.out.println("Underflow cndition");
            return -1;
        }
        return arr[front];
    }
    int getRear()
    {
        if(isEmpty())
        {
            System.out.println("Underflow condition\n");
            return -1;
        }
        return arr[rear];
    }
}
