import java.util.*;
class Pattern_6
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
         int i,j,p=9;
         for(i=1;i<=4;i++)
         //for(i=4;i<=1;i--)
         {
             for(j=4;j>=i;j--)
             System.out.print(p--);
             System.out.println();
            }
        }
    }