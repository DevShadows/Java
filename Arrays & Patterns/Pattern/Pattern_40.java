import java.util.*;
class Pattern_40
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        for(i=68;i>=65;i--)
        {
            for(j=65;j<=i;j++)
            System.out.print((char)i);
            System.out.println();
        }
    }
}
        