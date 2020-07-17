package ALGORITHMS;
//it finds maximum contigou sum in an array where negativs are also present.
public class KadanesAlgo {
    public static void main(String[] args)
    {
        int[] arr={-2, -3, -4, -1, -2, -1, -5, -3};
        int maxSofar=Integer.MIN_VALUE;
        int maxEndinghere=0;
        for(int i=0;i<arr.length;i++)
        {
            maxEndinghere=maxEndinghere+arr[i];
            if(maxSofar<maxEndinghere)
            {
                maxSofar=maxEndinghere;
            }
            if(maxEndinghere<0)
            {
                maxEndinghere=0;
            }


        }
        System.out.println(maxSofar);
    }
}
