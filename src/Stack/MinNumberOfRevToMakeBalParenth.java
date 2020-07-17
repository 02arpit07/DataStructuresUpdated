package Stack;

import java.util.Stack;

public class MinNumberOfRevToMakeBalParenth {
    public static void main(String[] args)
    {
        String expr = "}}{{";

        System.out.println(countMinReversals(expr));
    }
    public static int countMinReversals(String expr)
    {
        if(expr.length()%2!=0)
        {
            return -1;//we cannot make it balanced even after reversals.
        }
        Stack<Character> st=new Stack<>();
        for(int i=0;i<expr.length();i++)
        {
            char ch=expr.charAt(i);
            if(ch=='}'&&!st.empty())
            {
                if(st.peek()=='{')
                {
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
            else{
                st.push(ch);
            }

        }
        int remlength=st.size();
        int n =0;
        while(!st.empty()&&st.peek()=='{')
        {
            n++;
            st.pop();
        }
        return ((remlength/2)+n%2);
    }
}
