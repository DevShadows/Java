import java.util.*;
class Pattern_5 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
         int i,j,p=1;
         for(i=1;i<=4;i++)
         {
             for(j=1;j<=i;j++)
             System.out.print(p++);
             System.out.println();
            }
        }
    }