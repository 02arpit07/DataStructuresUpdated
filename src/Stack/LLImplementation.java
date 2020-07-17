package Stack;
//Keep in mind always delete and insert from start in linkedlist when implementing stack
public class LLImplementation {
    private class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    Node head;
    public void push(int data)
    {
        Node node=new Node(data);
        node.next=head;
        head=node;
    }
    public int pop()
    {
        int value=head.data;
        head=head.next;
        return value;
    }
    public int peek()
    {
        int value=head.data;
        return value;
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args)
    {
        LLImplementation lls=new LLImplementation();
        lls.push(2);
        lls.push(3);
        lls.push(4);
        lls.display();
        System.out.println();
        System.out.println("pop"+lls.pop());
        lls.display();
        System.out.println();
        System.out.println("peek"+lls.peek());
        lls.display();
    }

}
