import java.util.*;
class Reverse
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,s=0,i;
        System.out.print("Enter size");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter " + n + " numbers");
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
        
        for(i=n-1;i>=0;i--)
            System.out.print(arr[i] + " ");
        }
    }
