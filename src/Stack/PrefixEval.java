package Stack;

import java.util.Stack;

public class PrefixEval {
    public static void main(String[] args)
    {
        String exprsn = "+9*26";
        System.out.println(preFixEval(exprsn));
    }
    static int preFixEval(String str)
    {
        Stack<Integer> st=new Stack<>();
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            if(Character.isDigit(ch))
            {
                st.push(ch-'0');
            }
            else {
                int val1=st.pop();
                int val2=st.pop();
                switch (ch)
                {
                    case '+':
                        int res=val2+val1;
                        st.push(res);
                        break;
                    case '-' :
                        int res1=val2-val1;
                        st.push(res1);
                        break;
                    case '*':
                        int res2=val2*val1;
                        st.push(res2);
                        break;
                    case '/':
                        int res3=val2/val1;
                        st.push(res3);
                        break;

                }

            }
        }
        return st.pop();
    }
}
