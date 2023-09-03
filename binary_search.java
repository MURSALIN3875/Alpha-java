import java.util.*;
public class binary_search
{
    public static int binary(int a[],int num)
    {
        int start=0,end=a.length-1,mid;
        while(start<=end)
        {
            mid=(start+end)/2;
            if(a[mid]==num)
                return 1;
             if(a[mid]<num)
                start=mid+1;
             if(a[mid]>num)
                end=mid-1;   
        }
        return -1;
    }
    public static void main(String arg[])
    {
         Scanner sc=new Scanner(System.in);
        int a[]={10,20,30,40,50};
        System.out.println("Enter No to search:-");
        int num=sc.nextInt();
        int k=binary(a,num);
        if(k==-1)
         System.out.println("Not Found");
        else
          System.out.println("Number Found");
    }
}