import java.io.*;
public class file1
{
   public static void main(String arg[])throws Exception
   {
     FileInputStream f1=new FileInputStream("abc.txt");
     int k;
      while((k=f1.read())!=-1)
      {
        System.out.print((char)k);
      }
   }
}