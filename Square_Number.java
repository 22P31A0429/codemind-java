import java.util.*;
public class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if((i*i)+(j*j)==n)
                c++;
            }
        }
        if(c!=0)
        System.out.println("True");
        else
        System.out.println("False");
    }
}
