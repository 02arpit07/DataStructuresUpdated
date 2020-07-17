package LinkedList;

import java.util.Stack;

public class PalindromeofLL {
    Node head;
    public static void main(String[] args)
    {
        PalindromeofLL pl=new PalindromeofLL();
        pl.push(1);
        pl.push(2);
        pl.push(1);
        pl.push(2);

        pl.push(1);
        pl.push(2);
        //pl.push(1);
        pl.display();
        pl.checkPalin();

    }
    public void push(int data)
    {
        Node node=new Node(data);
        node.next=head;
        head=node;
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void checkPalin()
    {
        Node temp=head;
        boolean ispalin=true;
        Stack<Integer> st=new Stack<Integer>();
        while(temp!=null)
        {
            st.push(temp.data);
            temp=temp.next;
        }
        while(head!=null)
        {
            int i =st.pop();
            if(i==head.data)
            {
                ispalin=true;
            }
            else{
                ispalin=false;
                break;
            }
            head=head.next;

        }
        System.out.println(ispalin);
    }
}
