import java.util.*;
public class solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str1;
        String str2;
        String str3;
        str1=sc.nextLine();
        str2=sc.nextLine();
        str3=str1.concat(str2);
        char ch[]=str3.toCharArray();
        Arrays.sort(ch);
        System.out.println(ch);
    }
}
