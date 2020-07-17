package SortingAlgorithms;

public class InsertionSort {
    public static void main(String[] args)
    {
        int[] arr={3,2,39,8,3,7,5,13,3};
        int leng=arr.length;
        int j,temp;
        for(int i=1;i<leng;i++)
        {
            temp=arr[i];//temp=arr[1]
            j=i;//j=1
            while(j>0 && arr[j-1]>temp)//change arr[j-1]<temp. to arrange in descneding
            {
                arr[j]=arr[j-1];//arr[1]=arr[0]
                j--;//j=1 becomes 0
            }
            arr[j]=temp;//arr[0]=arr[1]
        }
        for(int i=0;i<leng;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
