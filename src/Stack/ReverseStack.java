package Stack;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args)
    {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        Stack<Integer> st1= reverse(st);
        System.out.println(st1);
    }
    static Stack<Integer> reverse(Stack<Integer> st)
    {
        Stack<Integer> st1=new Stack<>();
        while(!st.isEmpty())
        {
            st1.push(st.pop());
        }
        return st1;
    }
}


