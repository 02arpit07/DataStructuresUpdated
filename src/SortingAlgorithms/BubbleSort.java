package SortingAlgorithms;

public class BubbleSort {
    public static void main(String[] args)
    {
        int[] arr={1,3,2,3,5,4,2,4,5,7,833,6,7,54,2,55,6774,3,5566,3,-3,2,77,1,2043};
        int length=arr.length;
        for(int i=0;i<length;i++)
        {
            int flag=0;
            for(int j=0;j<length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0)
            {
                break;
            }
        }
        for(int i=0;i<length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
