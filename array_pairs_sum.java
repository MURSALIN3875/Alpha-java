public class array_pairs_sum
{
    public static void sum(int a[])
     {
       int num,sum=0;
       for(int i=0;i<a.length;i++)
       {
        num=a[i];
        for(int j=i+1;j<a.length;j++)
        {
            System.out.println("("+num+","+a[j]+")");
            sum=num+a[j];
            System.out.println("Sum:-"+sum);
        }
        System.out.println();
       }

     }    
   public static void main(String arg[])
    {
        int a[]={2,4,6,8,10};
        sum(a);
    }
}