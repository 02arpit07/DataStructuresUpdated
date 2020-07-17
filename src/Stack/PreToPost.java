package Stack;

import java.util.Stack;
//ABC/-AK/L-*
public class PreToPost {
    public static void main(String args[])
    {
        String pre_exp = "*-A/BC-/AKL";
        System.out.println("Postfix : " + preToPost(pre_exp));
    }

    static boolean isOperator(char x)
    {
        switch (x)
        {
            case '+':
            case '-':
            case '/':
            case '*':
                return true;
        }
        return false;
    }

    static String preToPost(String exp)
    {

        Stack<String> s= new Stack<String>();
        int length = exp.length();

        for (int i = length - 1; i >= 0; i--)
        {

            if (isOperator(exp.charAt(i)))
            {

                String op1 = s.pop();
                String op2 = s.pop();

                String temp = op1 + op2 + exp.charAt(i);

                s.push(temp);
            }
            else
            {
                s.push( exp.charAt(i)+"");
            }
        }
        return s.peek();
    }

}
