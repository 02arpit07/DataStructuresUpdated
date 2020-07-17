package ALGORITHMS;
//used recursion
//CRAMMED
//TRICK
//FTA
//FAT
//ATF
public class TowerOfHanoi {
    public static void main(String[] args)
    {
        int n=5;// total number of disks
        towerofhanoi(n,'A','C','B');
    }
    public static void towerofhanoi(int n,char from,char to,char aux)
    {
        if(n==1)
        {
            System.out.println("Move "+n+"from"+from+"to"+to);
            return;
        }
        towerofhanoi(n-1,from,aux,to);
        System.out.println("Move "+n+"from"+from+"to"+to);
        towerofhanoi(n-1,aux,to,from);
    }
}
