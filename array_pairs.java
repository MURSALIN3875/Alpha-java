public class array_pairs
{
    public static void main(String arg[])
    {
        int a[]={2,4,6,8,10};
        int i,j,num;
        for(i=0;i<a.length;i++)
        {
            num=a[i];
            for(j=i+1;j<a.length;j++)
            {
                System.out.print("("+num+","+a[j]+")");
              
            }
            System.out.println();
        }
    }
}