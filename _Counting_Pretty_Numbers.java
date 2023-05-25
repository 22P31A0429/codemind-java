import java.util.*;
public class sol
{
        
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r,c=0;
        for(int i=1;i<=n;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            for(int j=b;j>=a;j--)
            {
                r=j%10;
                if(r==2||r==3||r==9)
                {
                    c++;
                }
            }
            System.out.format("%d
",c);
            c=0;
        }
    }
}