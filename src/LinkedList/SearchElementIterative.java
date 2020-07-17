package LinkedList;

public class SearchElementIterative {
     Node head;
    public static void main(String[] args)
    {
        SearchElementIterative s=new SearchElementIterative();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        if(!s.Search(s.head,40))
        {
            System.out.println("False it is");
        }
        else{
            System.out.println("True it is");
        }
    }
    public void push(int data)
    {
        Node node=new Node(data);
        node.next=head;
        head=node;
    }
    public  boolean Search(Node head,int d)
    {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==d)
            {
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
}
