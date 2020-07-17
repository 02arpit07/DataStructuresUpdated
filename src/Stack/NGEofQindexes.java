package Stack;
//ONE OF THE BEST LOGIC I HAVE CREATED.
public class NGEofQindexes {
    public static void main(String[] args)
    {
        int arr[]= {3, 4, 2, 7, 5, 8, 10, 6};
        int[] query={3,6,1};
        for(int i=0;i<query.length;i++)
        {
            int max=-1;
            for(int j=query[i]+1;j<arr.length;j++)
            {
                if(arr[query[i]]<arr[j])
                {
                    max=arr[j];
                    break;
                }
            }
            System.out.println(arr[query[i]]+"  --  "+max);
        }
    }
}
