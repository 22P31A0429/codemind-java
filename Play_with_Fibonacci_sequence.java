import java.util.*;
public class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=0,n2=1,s=0;
        System.out.print(n1+" "+n2);
        for(int i=3;i<=n;i++)
        {
            s=n1+n2;
            n1=n2;
            n2=s;
            System.out.print(" "+s);
        }
    }
}