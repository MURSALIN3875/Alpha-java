import java.util.*;
public class trapping_water
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,waterlevel,trappedwater=0;
       
        System.out.println("Enter Limit:-");
        n=sc.nextInt();
         int a[]=new int[n];
         System.out.println("Enter Blocks height:-");
         for(i=0;i<n;i++)
         {
            a[i]=sc.nextInt();
         }
         int b[]=new int[n];
         int c[]=new int[n];

         for(i=0;i<n;i++)
         {
            if(i==0)
            {
                b[0]=a[0];
            }
            else
            {
               if(b[i-1]>a[i]) 
                  b[i]=b[i-1];
                else
                 b[i]=a[i];

            }
         }
         System.out.println("\n leftMaximum Boundry:-");
         for(i=0;i<n;i++)
         {
            System.out.print(" "+b[i]);
         }

         // Right max boundry
System.out.println();
          for(i=n-1;i>=0;i--)
         {
            if(i==n-1)
            {
                c[n-1]=a[n-1];
            }
            else
            {
               if(c[i+1]>a[i]) 
                  c[i]=c[i+1];
                else
                 c[i]=a[i];

            }
         }
         System.out.println("\n Right Maximum Boundry:-");
         for(i=0;i<n;i++)
         {
            System.out.print(" "+c[i]);
         }

         for(i=0;i<n;i++)
         {
            if(b[i]>c[i])
              waterlevel=c[i];
            else
              waterlevel=b[i];
         trappedwater +=waterlevel-a[i];

         }
         System.out.println("\n Trapped water is:-"+trappedwater);
    }
}