package Stack;

import java.util.Stack;

//PROBLEM NAME -  SIMPLIFY DIRECTORY NAME.
//Given a string A representing an absolute path for a file (Unix-style).
//
//Return the string A after simplifying the absolute path.
//
//Note:
//
//Absolute path always begin with ’/’ ( root directory ).
//
//Path will not have whitespace characters.
//Test cases-----
//Input 1:
//    A = "/home/"
//Output 1:
//    "/home"
//
//Input 2:
//    A = "/a/./b/../../c/"
//Output 2:
//    "/c"
public class DirectoryNameSimplify {
    public static void main(String[] args)
    {
        String A="/home/";
        System.out.println(simplifyPath(A));
    }
    static String simplifyPath(String A)
    {
        Stack<String> st=new Stack<>();
        String[] arr=A.trim().split("/");
        for(String str:arr)
        {
            if(str.equals(".."))
            {
                if(!st.empty())
                {
                    st.pop();
                }
            }
            else if(!str.equals(".")&&!str.isEmpty())
            {
                st.push(str);
            }
        }
        StringBuilder sb=new StringBuilder("");
        while(!st.empty())
        {
            sb.insert(0,st.pop());
            sb.insert(0,'/');

        }
        return sb.length()!=0?sb.toString():"/";

    }
}
