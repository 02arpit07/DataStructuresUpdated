package Stack;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args)
    {
        String exp="a+b*(c^d-e)^(f+g*h)-i";
        String result=intopost(exp);
        System.out.println(result);
    }
    static String intopost(String exp)
    {
        String str = "";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<exp.length();i++)
        {
            char ch=exp.charAt(i);
            if(Character.isLetterOrDigit(ch))// letter or digit occurs
            {
                str=str+ch;
            }
            else if(ch=='(')// ( occurs
            {
                st.push(ch);
            }
            else if(ch==')')//  ) occurs
            {
                while(!st.isEmpty()&&st.peek()!='(')
                {
                    str=str+st.pop();
                }
                if(!st.isEmpty()&&st.peek()!='(')
                {
                    return "INVALID EXPRESSION";
                }
                else{
                    st.pop();
                }
            }
            else{//an operator occurs
                while(!st.isEmpty()&& Precedence(ch)<=Precedence(st.peek()))
                {
                    if(st.peek()=='(')
                    {
                        return "INVALID EXPRESSION";
                    }
                    str=str+st.pop();
                }
                st.push(ch);
            }
        }
        while(st.isEmpty()==false)
        {
            if(st.peek()=='(')
            {
                return "INVALID EXPRESSION";
            }
            str=str+st.pop();
        }
        return str;

    }
    //utility function to get precedence of operators
    static int Precedence(char ch)
    {
        switch(ch)
        {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

}
