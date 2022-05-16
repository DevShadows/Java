import java.util.*;
class Pattern_18
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        for(i=4;i>=1;i--)
        {
            for(j=i;j>=1;j--)
            System.out.print(j);
            System.out.println();
        }
    }
}