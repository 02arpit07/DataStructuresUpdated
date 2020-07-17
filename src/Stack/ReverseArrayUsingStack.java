package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseArrayUsingStack {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            st.push(arr[i]);
        }
        System.out.println("original array");
        for(int i=0;i<n;i++)
        {
          System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Reversed array");
        for(int i=0;i<n;i++)
        {
            System.out.print(st.pop()+" ");
        }
    }
}
