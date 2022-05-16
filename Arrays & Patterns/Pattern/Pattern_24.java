import java.util.*;
class Pattern_24
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j,k;
        for(i=4;i>=1;i--)
        {
            for(j=i;j>=1;j--)
            System.out.print(" ");
            for(k=i;k<=4;k++)
            System.out.print(k);
            System.out.println();
        }
    }
}