package SortingAlgorithms;

public class MergeSort {
    int[] arr;
    int[] tempMergeArr;
    int length;
    public static void main(String[] args)
    {
        int[] inputArr={48,36,13,52,19,94,21};
        MergeSort ms=new MergeSort();
        for(int i:inputArr)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("After Sorting");
        ms.sort(inputArr);


        for(int i:inputArr)
        {
            System.out.print(i+" ");
        }
    }
     void sort(int[] inputArr)
    {
        this.arr=inputArr;
        this.length=inputArr.length;
        tempMergeArr=new int[length];
        divideArray(0,length-1);

    }
    void divideArray(int low,int high)
    {
        if(low<high)
        {
            int mid=low+(high-low)/2;

            divideArray(low,mid);

            divideArray(mid+1,high);

            mergeArr(low,mid,high);
        }
    }
    void mergeArr(int low,int mid,int high)
    {
        for(int i=low;i<=high;i++)
        {
            tempMergeArr[i]=arr[i];
        }

        int i=low;
        int j=mid+1;
        int k=low;

        while(i<=mid && j<=high)
        {
            if(tempMergeArr[i]<=tempMergeArr[j])
            {
                arr[k]=tempMergeArr[i];
                i++;
            }
            else{
                arr[k]=tempMergeArr[j];
                j++;
            }
            k++;
        }
        while(i<=mid)
        {
            arr[k]=tempMergeArr[i];
            i++;
            k++;
        }
    }
}
