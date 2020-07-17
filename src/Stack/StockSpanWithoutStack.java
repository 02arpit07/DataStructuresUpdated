package Stack;

public class StockSpanWithoutStack {
    public static void main(String[] args)
    {
        int[] arr={100,80,60,70,60,75,85};
        int[] Stock=new int[arr.length];
        Stock=getStockSpan(arr,Stock);
        for(int i=0;i<Stock.length;i++)
        {
            System.out.print(Stock[i]+" ");
        }
    }

    static int[] getStockSpan(int[] arr,int[] Stock)
    {
        Stock[0]=1;
        for(int i=arr.length-1;i>=1;i--)
        {
            Stock[i]=1;
            for(int j=i-1;j>=1;j--)
            {
                if(arr[i]>=arr[j])
                {
                    Stock[i]++;
                }
                else{
                    break;
                }

            }
        }
        return Stock;
    }
}
