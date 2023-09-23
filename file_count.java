import java.io.*;
public class file_count
{
    public static void main(String arg[])throws Exception
    {
        FileInputStream f1=new FileInputStream("abc.txt");
        int k;
        int w=0,l=0,c=0,d=0,s=0;
        while((k=f1.read())!=-1)
        {
            if(k==' ')
              w++;
            else if(k=='\n')
              l++;
            else if(Character.isLetter(k))
              c++;
            else if(Character.isDigit(k))
              d++; 
        }
        System.out.println("\n word:-"+w);
        System.out.println("\n Line:-"+l);
        System.out.println("\n Character:-"+c);
        System.out.println("\n Digit:-"+d);
        f1.close();
    }
}