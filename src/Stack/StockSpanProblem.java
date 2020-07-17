package Stack;

import java.util.Stack;

public class StockSpanProblem {
    public static void main(String[] args)
    {
        int[] arr={100,80,60,70,60,75,85};
        int n =arr.length;
        int[] Stock=new int[n];
           getStockSpan(arr,n,Stock);
        for(int i=0;i<Stock.length;i++)
        {
            System.out.print(Stock[i]+" ");
        }
    }
    static void  getStockSpan(int[] arr,int n,int[] Stock)
    {
        Stack<Integer> st=new Stack<>();
        Stock[0]=1;
        st.push(0);

        for(int i=1;i<n;i++)
        {
            Stock[i]=1;

            while(!st.empty()&&Stock[st.peek()]<=Stock[i])
            {
                st.pop();
            }
            Stock[i]=(st.empty())?(i+1):(i-st.peek());
            st.push(i);
        }
    }
}
