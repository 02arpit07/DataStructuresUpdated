package SortingAlgorithms;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args)
    {
        int[] arr = { 10, 13, 9, 15, 7, 13 };
        System.out.println("Elements before applying countingsort: " + Arrays.toString(arr));//written in this way just to avoid loops while practicing
        countSort(arr);
        System.out.println("Elements after applying countingsort: " + Arrays.toString(arr));

    }
    public static void countSort(int[] arr)
    {
        int length=arr.length;
        if(arr.length==0)
            return;
        //find max and min values
        int max= arr[0],min=arr[0];
        for(int i=1;i<length;i++)
        {
            if(arr[i]>max)
                max=arr[i];
            if(arr[i]<min)
                min=arr[i];
        }
        int range=max-min+1;
        int count[]=new int[range];
        for(int i=0;i<length;i++)
        {
            count[arr[i]-min]++;
        }
        for(int i=1;i<range;i++)
        {
            count[i]=count[i]+count[i-1];
        }
        //modify original array
        int j=0;
        for(int i=0;i<range;i++)
        {
          while(j<count[i])
          {
              arr[j]=min+i;
              j++;
          }
        }
    }
}
