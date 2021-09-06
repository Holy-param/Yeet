
import java.util.Scanner;
public class fasinating
{
  double in;
  Scanner sc=new Scanner(System.in);
  void input()
  {
    in=sc.nextInt();
    String temp="";
    temp=String.valueOf(in);
    if(temp.length()<3)
    {
    System.exit(0);
    }
  }
  void compute()
  {
   String ans="";
   String temp2="";
   for(int a=1;a<4;a++)
   {
    temp2= temp2.valueOf(in*a);
    ans=ans+temp2;
     }
    int index=0;
   for(int c=1;c<10;c++)
   {
    String temp3=String.valueOf(c);
    index= ans.indexOf(temp3);
    if(index==-1)
    {
    System.out.println("this is not a fasinating no");
    System.exit(0);
    }
    }
    System.out.println("yep");
  }
  static void main()
  {
  fasinating obj=new fasinating();
  obj.input();
  obj.compute();
  }
}
