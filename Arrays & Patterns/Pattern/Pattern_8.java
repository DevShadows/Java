import java.util.*;
class Pattern_8
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        for(i=4;i>=1;i--)
        {
            for(j=4;j>=i;j--)
            System.out.print(i);
            System.out.println();
        }
    }
}
        