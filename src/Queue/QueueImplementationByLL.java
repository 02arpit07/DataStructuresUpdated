package Queue;

public class QueueImplementationByLL {
    static class QueueNode{
        int key;
        QueueNode next;
        QueueNode(int data)
        {
            this.key=data;
            this.next=null;
        }
    }
    QueueNode front, rear;
    public QueueImplementationByLL()
    {
        this.front=this.rear=null;
    }
    void enqueue(int data)
    {
        QueueNode q=new QueueNode(data);
        if(this.rear==null)
        {
            this.front=this.rear=q;
            return;

        }
        else{
            this.rear.next=q;
            this.rear=q;
        }
    }
    void dequeue()
    {
        if(this.front==null)
        {
            System.out.println("Cannot dequeue it as it is empty");
        }
        else{
            QueueNode temp=this.front;
            this.front=this.front.next;
            if(this.front==null)
            {
                this.front=this.rear=null;
            }
        }
    }
    public static  void main(String[] args)
    {
        QueueImplementationByLL q=new QueueImplementationByLL();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        System.out.println(q.front.key);
        System.out.println(q.rear.key);


    }

}
