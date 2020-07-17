package CodeChef;

import java.util.Scanner;

public class Basic2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int dnum=sc.nextInt();
        String str="";
        String bnum="";
        while(dnum!=0)
        {
            str=str+(dnum%2);
            dnum=dnum/2;
        }
        for(int i=str.length()-1;i>=0;i--)
        {
            bnum=bnum+str.charAt(i);
        }
        System.out.println(bnum);
        int result=0;
        int count=0;
        for(int i=0;i<bnum.length();i++)
        {
            if(bnum.charAt(i)=='0')
            {
                count++;
            }
            else {
                if(count>result)
                {
                    result=count;
                    count=0;
                }
                else {
                    continue;
                }
            }
        }
        System.out.println(result);

    }
}
