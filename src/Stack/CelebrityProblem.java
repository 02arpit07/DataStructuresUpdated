package Stack;

import java.util.Stack;

public class CelebrityProblem {
    static int[][] arr=   { {0, 0, 1, 0 },
                            { 0, 0, 1, 0 },
                            { 0, 0, 0, 0 },
                            { 0, 0, 1, 0 } };

    public static void main(String[] aa)
    {
        int n=4;
        int a=checkCeleb(n);
        if(a==-1)
        {
            System.out.println("NO CELEB");
        }
        else{
            System.out.println("Celeb "+a);
        }
    }

    static int checkCeleb(int n)
    {
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<n;i++)//sabhi log jo party me aye hai unhe stack me dlwa lo.
        {
            st.push(i);
        }
        while(st.size()>1)//tab tak chlegi loop jab tak stack ka size 1 se bada hai.
        {
            int a=st.pop();
            int b =st.pop();
            if(knowEachOther(a,b))// agar a janta hai b ko, toh a celebrity nahi ho skta
            {
                st.push(b);
            }
            else{// agar a nahi janta b ko , iska matlab hai b celebrity nahi ho skta.
                st.push(a);
            }
        }
        //now jo last mein remaining hoga banda usko nikal lo stack se.
        int c=st.pop();
        // ab agey hum check karenge ki yeh jo akhri bnda hai yeh celibrity hai ya nahi
        for(int i=0;i<n;i++)
        {
            if(i!=c&&(knowEachOther(c,i)||!knowEachOther(i,c)))//humne yaha is algo ko asani se solve krne ke lie assume kia tha ki koi banda apne ap ko nahi janta islie i!=c
            {//celeb bande ko nahi ja skta , lekin har bnda usse janta ho.
                return -1;
            }
        }
        return c;
    }

    static boolean knowEachOther(int a,int b)
    {
        if(arr[a][b]!=1)//if a does not know b
        {
            return false;
        }
        else{//if a know b
            return true;
        }
    }

}
