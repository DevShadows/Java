import java.util.*;
class Pattern_28
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j,k;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<i;j++)
            System.out.print(" ");
            for(k=4;k>=i;k--)
            System.out.print(k);
            System.out.println();
        }
    }
}




            