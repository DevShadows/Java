import java.util.*;
class Pattern_9
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        for(i=1;i<=4;i++)
        {
            for(j=4;j>=i;j--)
            System.out.print(i);
            System.out.println();
        }
    }
}
        