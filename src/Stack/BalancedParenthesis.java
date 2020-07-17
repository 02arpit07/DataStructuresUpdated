package Stack;
import java.util.*;
public class BalancedParenthesis {
    public static void main(String[] args)
    {
        char exp[] = {'{','(',')','}','[',']','(',')',')'};
        if(isBalanced(exp))
        {
            System.out.println("BALANCED");
        }
        else{
            System.out.println("NOT BALANCED");
        }
    }
    public static boolean isBalanced(char[] arr)
    {
        Stack st=new Stack();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='('||arr[i]=='{'||arr[i]=='[')
            {
                st.push(arr[i]);
            }
            if(arr[i]==')'||arr[i]=='}'||arr[i]==']')
            {
                if(st.isEmpty())
                {
                    return false;
                }
                //typecasted to char because an object type is returned by st.pop()
                else if(!isMatching(arr[i],(char)st.pop()))
                {
                    return false;
                }
            }
        }
        if(st.isEmpty())
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isMatching(char c1,char c2)
    {
        if(c1==']'&&c2=='[')
        {
            return true;
        }
        else if(c1=='}'&&c2=='{')
        {
            return true;
        }
        else if(c1==')'&&c2=='(')
        {
            return true;
        }
        else{
            return false;
        }
    }
}
