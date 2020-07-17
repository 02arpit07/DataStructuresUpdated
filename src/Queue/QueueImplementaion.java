package Queue;

public class QueueImplementaion {
    private int size,front,rear;
    private int[] arr;
    private int capacity;
    private QueueImplementaion(int capacity)
    {
        this.capacity=capacity;
        front=size=0;
        rear=-1;
        arr=new int[capacity];
    }
    public static void main(String[] args)
    {
        QueueImplementaion q=new QueueImplementaion(10);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);
        q.enqueue(80);
        q.enqueue(90);
        q.enqueue(100);
        q.enqueue(110);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.front());
        System.out.println(q.rear());
        System.out.println(q.front());
        System.out.println(q.size());


    }
    void enqueue(int data)
    {
        if(isFull(this))
        {
            System.out.println("Queue is full");
            return;
        }
        rear=(rear+1)%capacity;
        arr[rear]=data;
        size++;
        System.out.println(data+" Enqueued to queue");
    }
    int dequeue()
    {
        int data=0;
        if(isEmpty(this))
        {
            System.out.println("QUEUE IS EMPTY");
            return -1;
        }

        else {
             data = arr[front];
            front++;
            size--;
        }
        return data;
    }
    boolean isFull(QueueImplementaion q)
    {
        if(size==capacity)
        {
            return true;
        }
        return false;

    }
    boolean isEmpty(QueueImplementaion q)
    {
        if(size==0)
        {
            return true;
        }
        return false;
    }
    int front()
    {
        if(isEmpty(this))
        {
            return Integer.MIN_VALUE;
        }
        return arr[front];
    }
    int rear()
    {
        if(isEmpty(this))
        {
            return Integer.MIN_VALUE;
        }
        return arr[rear];
    }
    int size()
    {
        return size;
    }
}
