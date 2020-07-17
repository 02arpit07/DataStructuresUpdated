package Stack;

import java.util.Stack;

public class SortArrayUsingStack {
    public static void main(String[] args)
    {
        int[] arr={10,5,15,45};
        int n =arr.length;
        System.out.println("Before Sorting");

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sortArrayUsingS(arr,n);
        System.out.println("After Sorting");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void sortArrayUsingS(int[] arr,int n)
    {
        Stack<Integer> st1=new Stack<>();

        for(int i=0;i<n;i++)
        {
            st1.push(arr[i]);
        }
        Stack<Integer> st2= sortStack(st1);

        for(int i=0;i<n;i++)
        {
            arr[i]=st2.pop();
        }

    }
    static Stack<Integer> sortStack(Stack<Integer> st1)
    {
        Stack<Integer> st2 = new Stack<>();
        while(!st1.isEmpty())
        {
            int temp=st1.pop();

            while(!st2.isEmpty()&&st2.peek()<temp)
            {
                st1.push(st2.pop());

            }
            st2.push(temp);
        }
        return st2;
    }
}
