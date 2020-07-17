public class Recursion {
    public static void main(String[] args)
    {
        reduceByone(10);
    }
    public static  void reduceByone(int n)
    {
        if(n>0)
        {
            reduceByone(n-1);

        }
        System.out.println(n);

    }
}
