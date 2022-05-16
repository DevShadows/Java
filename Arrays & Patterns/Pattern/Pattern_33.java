import java.util.*;
class Pattern_33           
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,k;
        for(i=68;i>=65;i--)
        {
            for(k=65;k<=i;k++)
            System.out.print((char)k);
            System.out.println();
        }
    }
}