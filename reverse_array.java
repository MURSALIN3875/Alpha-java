public class reverse_array
{
    public static void main(String arg[])
    {
        int a[]={10,20,30,40,50};
        int first=0,last=a.length-1,temp;

        while(first<last)
        {
            temp=a[first];
            a[first]=a[last];
            a[last]=temp;
            first++;
            last--;
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print("\t"+a[i]);
        }
    }
}