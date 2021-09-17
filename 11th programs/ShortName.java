import java.util.Scanner;
public class ShortName
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
  String temp="";
  String Sname="";
  while(sc.hasNext())
  {
   temp=sc.next();
   char ch=temp.charAt(0);
   if(!(sc.hasNext()))
    {
        Sname=temp+","+Sname;
    }
   else
    Sname=Sname+ch+".";
  }
  System.out.println(Sname);
 }
 static void main()
 {
  ShortName obj=new ShortName();
  obj.input();
  obj.compute();
 }
}
