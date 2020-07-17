package Stack;

public class ArrayImplementation {
    public static void main(String[] args)
    {
        ArrayImplementation st=new ArrayImplementation();
        st.push(1);
        st.push(2);
        st.push(3);
        st.show();
        System.out.println();
        System.out.println(st.pop());
        st.show();
        System.out.println(st.peek());
        st.show();


    }
    int[] stack=new int[5];
    int top=0;
    public void push(int data)
    {
        stack[top]=data;
        top++;
    }
    public void show()
    {
        for(int n:stack)
        {
            System.out.print(n+" ");
        }
    }

    public int pop()
    {
        int data=stack[top-1];
        stack[top-1]=0;
        top--;
        return data;
    }

    public int peek()
    {
        int data=stack[top-1];
        return data;
    }

    public int size()
    {
        return top;
    }

    public boolean isEmpty()
    {
        return top<=0;
    }
}
