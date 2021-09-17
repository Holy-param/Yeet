
import java.util.Scanner;
public class WordReverse
{
  String str="";
 void input()
 {
  Scanner sc=new Scanner(System.in);
  str=sc.nextLine();
 }
  void compute()
  {
  Scanner sc=new Scanner(str); 
  while(sc.hasNext())
  {
   String temp=sc.next();
   if(temp.length()<2)
    System.out.print(temp=" ");
   else if(temp.length()==2)
   {
    String temp2=""+temp.charAt(1)+temp.charAt(0);
    System.out.print(temp2+" ");
   }
   else if(temp.length()>2)
   {
    String temp2="";
    for(int a=temp.length()-1;a>=0;a--)
    {
     temp2=temp2+temp.charAt(a);
    }
    System.out.print(temp2+" ");
   }
   }
 }
 static void main()
 {
  WordReverse obj=new WordReverse();
  obj.input();
  obj.compute();
 }
}
