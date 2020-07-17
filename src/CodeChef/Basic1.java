package CodeChef;

import java.util.Scanner;

public class Basic1 {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        while(n--!=0)
        {
            int m =sc.nextInt();
            int[] arr=new int[m];
            for(int i=0;i<m;i++)
            {
                arr[i]=sc.nextInt();
            }
            int ShopKeeper=0;
            if(arr[0]==5) {
                 ShopKeeper = arr[0];
            }
            else{
                System.out.println("NO");
                continue;
            }
            int flag=0;
            for(int i=1;i<m;i++)
            {
                flag=0;
                if(arr[i]%5==0)
                {
                    if(ShopKeeper-arr[i]==5)
                    {
                        ShopKeeper=ShopKeeper+5;
                    }
                }
                else{
                    System.out.println("NO");
                    flag=1;
                    break;
                }
            }
            if(flag!=1)
            {
                System.out.println("YES");
            }
        }
    }
}
