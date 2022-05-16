import java.util.*;
class Pattern_30
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j,k;
        for(i=1;i<=4;i++)
        {
            for(j=4;j>i;j--)
            System.out.print(" ");
            for(k=1;k<=2*i-1;k++)
            System.out.print("*");
            System.out.println();
        }
    }
}