import java.util.*;
public class linear_search
{
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
        int a[]={10,20,30,40,50},f=0;
        System.out.println("Enter No to Search:-");
        int num=sc.nextInt();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==num)
            {
              f=1;
              break;
            }
        }   
        if(f==1)
          System.out.println("Number is found");
        else
          System.out.println("Not Found");     
    }
}