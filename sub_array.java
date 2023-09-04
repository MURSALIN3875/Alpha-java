public class sub_array
{
    public static void main(String arg[])
    {
        int a[]={2,4,6,8,10},i,j,k;
        for(i=0;i<a.length;i++)
        {
            for(j=i;j<a.length;j++)
            {
                for(k=i;k<=j;k++)
                {
                    System.out.print(" "+a[k]);
                }
                System.out.println();
            }
        }
    }
}