package Stack;

public class NextGreaterElemSimple {
    public static void main(String[] args)
    {
        int arr[]= {11, 13, 21, 3};
        int n = arr.length;
        printNGE(arr,n);
    }
    static void printNGE(int[] arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            int m=-1;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]<arr[j])
                {
                    m=arr[j];
                    break;
                }
            }
            System.out.println(arr[i]+"-------||"+m);
        }
    }
}
