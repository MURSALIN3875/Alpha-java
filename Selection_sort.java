public class Selection_sort
{
    public static void selction(int a[])
    {
        for(int i=0;i<a.length-1;i++)
        {
            int minpos=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[minpos]>a[j])
                {
                    minpos=j;
                }
            }
            int temp=a[minpos];
            a[minpos]=a[i];
            a[i]=temp;
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String arg[])
    {
        int a[]={1,4,5,3,2};
        selction(a);
    }
}