package Stack;
import java.util.*;
public class DynamicArrayImp {
    int capacity=2;
    int[] stack=new int[capacity];
    int top=0;
    public void push(int data)
    {
        if(top==capacity)
        {
            expand();
        }
        stack[top]=data;
        top++;
    }
    private void expand()
    {
        int length=top;
        int[] newstack=new int[capacity*2];
        System.arraycopy(stack,0,newstack,0,length);
        stack=newstack;
        capacity=capacity*2;

    }
    public int pop()
    {
        int data=0;
        if(top<=0)
        {
            System.out.println("Stack is empty");
        }
        else{
            top--;
             data=stack[top];
             stack[top]=0;
             shrink();
        }
        return data;
    }
    private void shrink()
    {
        int length=top;
        if(length<=(capacity/2)/2)
        {
            capacity=capacity/2;
        }
        int[] newstack=new int[capacity];
        System.arraycopy(stack,0,newstack,0,length);
        stack=newstack;
    }
    public void display()
    {
        for(int n:stack)
        {
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args)
    {
        DynamicArrayImp st=new DynamicArrayImp();
        st.pop();
        st.push(3);
       st.push(5);
      //  st.push(3);
        st.push(5);
       // st.push(3);
        st.display();
        System.out.println();
       System.out.println(st.pop());
       System.out.println();
        st.display();


    }
}
