public class Bubble_sort
{
    public static void bubble(int a[])
    {
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String arg[])
    {
        int a[]={10,4,12,2,9};
        bubble(a);
    }
}