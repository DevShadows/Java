import java.util.*;
class Pattern_36           
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,k;
        for(i=4;i>=1;i--)
        {
            for(k=4;k>=i;k--)
            System.out.print((char)(64+k));
            System.out.println();

        }
    }
}
   