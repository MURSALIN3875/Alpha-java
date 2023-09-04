public class subarray_sum
{
    public static void main(String arg[])
    {
        int a[]={2,4,6,8,10};
        int currsum=0,maxsum=0;
        int i,j,k;
        for(i=0;i<a.length;i++)
        {
             int num=a[i];
            
            for(j=i;j<a.length;j++)
            {
                 currsum=0;
                for(k=i;k<=j;k++)
                {
                    currsum +=a[k];
                }
                System.out.println("Sum of subarray:-"+currsum);
            }
        }

    }
}