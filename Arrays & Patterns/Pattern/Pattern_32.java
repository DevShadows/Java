import java.util.*;
class Pattern_32
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,k;
        for(i=65;i<=68;i++)
        {
            for(k=i;k>=65;k--)
            System.out.print((char)k);
            System.out.println();
        }
    }
}